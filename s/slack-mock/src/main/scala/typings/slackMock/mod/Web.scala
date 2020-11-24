package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Web[T] extends js.Object {
  
  def addResponse(opts: WebOptions[T]): Unit = js.native
  
  var calls: js.Array[WebCall[T]] = js.native
  
  def reset(): Unit = js.native
}
object Web {
  
  @scala.inline
  def apply[T](addResponse: WebOptions[T] => Unit, calls: js.Array[WebCall[T]], reset: () => Unit): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Web[T]]
  }
  
  @scala.inline
  implicit class WebOps[Self <: Web[_], T] (val x: Self with Web[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddResponse(value: WebOptions[T] => Unit): Self = this.set("addResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallsVarargs(value: WebCall[T]*): Self = this.set("calls", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: js.Array[WebCall[T]]): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
