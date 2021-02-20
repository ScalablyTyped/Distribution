package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageManager extends StObject {
  
  def estimate(): js.Promise[StorageEstimate] = js.native
  
  def persist(): js.Promise[scala.Boolean] = js.native
  
  def persisted(): js.Promise[scala.Boolean] = js.native
}
object StorageManager {
  
  @scala.inline
  def apply(
    estimate: () => js.Promise[StorageEstimate],
    persist: () => js.Promise[scala.Boolean],
    persisted: () => js.Promise[scala.Boolean]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = js.Any.fromFunction0(estimate), persist = js.Any.fromFunction0(persist), persisted = js.Any.fromFunction0(persisted))
    __obj.asInstanceOf[StorageManager]
  }
  
  @scala.inline
  implicit class StorageManagerMutableBuilder[Self <: StorageManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimate(value: () => js.Promise[StorageEstimate]): Self = StObject.set(x, "estimate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPersist(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPersisted(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "persisted", js.Any.fromFunction0(value))
  }
}
