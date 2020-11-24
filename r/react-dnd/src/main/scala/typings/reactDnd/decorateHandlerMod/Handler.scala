package typings.reactDnd.decorateHandlerMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler[Props] extends js.Object {
  
  def receiveProps(props: Props): Unit = js.native
  
  var ref: RefObject[_] = js.native
}
object Handler {
  
  @scala.inline
  def apply[Props](receiveProps: Props => Unit, ref: RefObject[_]): Handler[Props] = {
    val __obj = js.Dynamic.literal(receiveProps = js.Any.fromFunction1(receiveProps), ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler[Props]]
  }
  
  @scala.inline
  implicit class HandlerOps[Self <: Handler[_], Props] (val x: Self with Handler[Props]) extends AnyVal {
    
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
    def setReceiveProps(value: Props => Unit): Self = this.set("receiveProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: RefObject[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
}
