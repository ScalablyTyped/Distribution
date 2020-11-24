package typings.scBroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Run extends js.Object {
  
  var run: js.UndefOr[js.Function0[Unit]] = js.native
}
object Run {
  
  @scala.inline
  def apply(): Run = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Run]
  }
  
  @scala.inline
  implicit class RunOps[Self <: Run] (val x: Self) extends AnyVal {
    
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
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
}
