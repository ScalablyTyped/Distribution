package typings.reduxTestkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThunkTestkit extends js.Object {
  
  def execute(args: js.Any*): js.Any = js.native
}
object ThunkTestkit {
  
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any): ThunkTestkit = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[ThunkTestkit]
  }
  
  @scala.inline
  implicit class ThunkTestkitOps[Self <: ThunkTestkit] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: /* repeated */ js.Any => js.Any): Self = this.set("execute", js.Any.fromFunction1(value))
  }
}
