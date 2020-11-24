package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// react-reconciler/ReactFiberRoot
// TODO: This should be lifted into the renderer.
@js.native
trait Batch extends js.Object {
  
  var _defer: Boolean = js.native
  
  var _expirationTime: ExpirationTime = js.native
  
  var _next: Batch | Null = js.native
  
  def _onComplete(): js.Any = js.native
}
object Batch {
  
  @scala.inline
  def apply(_defer: Boolean, _expirationTime: ExpirationTime, _onComplete: () => js.Any): Batch = {
    val __obj = js.Dynamic.literal(_defer = _defer.asInstanceOf[js.Any], _expirationTime = _expirationTime.asInstanceOf[js.Any], _onComplete = js.Any.fromFunction0(_onComplete))
    __obj.asInstanceOf[Batch]
  }
  
  @scala.inline
  implicit class BatchOps[Self <: Batch] (val x: Self) extends AnyVal {
    
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
    def set_defer(value: Boolean): Self = this.set("_defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expirationTime(value: ExpirationTime): Self = this.set("_expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onComplete(value: () => js.Any): Self = this.set("_onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_next(value: Batch): Self = this.set("_next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nextNull: Self = this.set("_next", null)
  }
}
