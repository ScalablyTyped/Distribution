package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// react-reconciler/ReactFiberRoot
// TODO: This should be lifted into the renderer.
trait Batch extends StObject {
  
  var _defer: Boolean
  
  var _expirationTime: ExpirationTime
  
  var _next: Batch | Null
  
  def _onComplete(): js.Any
}
object Batch {
  
  @scala.inline
  def apply(_defer: Boolean, _expirationTime: ExpirationTime, _onComplete: () => js.Any): Batch = {
    val __obj = js.Dynamic.literal(_defer = _defer.asInstanceOf[js.Any], _expirationTime = _expirationTime.asInstanceOf[js.Any], _onComplete = js.Any.fromFunction0(_onComplete), _next = null)
    __obj.asInstanceOf[Batch]
  }
  
  @scala.inline
  implicit class BatchMutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_defer(value: Boolean): Self = StObject.set(x, "_defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expirationTime(value: ExpirationTime): Self = StObject.set(x, "_expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_next(value: Batch): Self = StObject.set(x, "_next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nextNull: Self = StObject.set(x, "_next", null)
    
    @scala.inline
    def set_onComplete(value: () => js.Any): Self = StObject.set(x, "_onComplete", js.Any.fromFunction0(value))
  }
}
