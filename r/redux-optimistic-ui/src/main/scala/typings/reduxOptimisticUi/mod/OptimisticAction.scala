package typings.reduxOptimisticUi.mod

import typings.reduxOptimisticUi.anon.Optimistic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticAction extends js.Object {
  
  var meta: Optimistic = js.native
}
object OptimisticAction {
  
  @scala.inline
  def apply(meta: Optimistic): OptimisticAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticAction]
  }
  
  @scala.inline
  implicit class OptimisticActionOps[Self <: OptimisticAction] (val x: Self) extends AnyVal {
    
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
    def setMeta(value: Optimistic): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
