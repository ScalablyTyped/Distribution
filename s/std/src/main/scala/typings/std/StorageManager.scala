package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageManager extends StObject {
  
  def estimate(): js.Promise[StorageEstimate]
  
  def persist(): js.Promise[scala.Boolean]
  
  def persisted(): js.Promise[scala.Boolean]
}
object StorageManager {
  
  inline def apply(
    estimate: () => js.Promise[StorageEstimate],
    persist: () => js.Promise[scala.Boolean],
    persisted: () => js.Promise[scala.Boolean]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = js.Any.fromFunction0(estimate), persist = js.Any.fromFunction0(persist), persisted = js.Any.fromFunction0(persisted))
    __obj.asInstanceOf[StorageManager]
  }
  
  extension [Self <: StorageManager](x: Self) {
    
    inline def setEstimate(value: () => js.Promise[StorageEstimate]): Self = StObject.set(x, "estimate", js.Any.fromFunction0(value))
    
    inline def setPersist(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    
    inline def setPersisted(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "persisted", js.Any.fromFunction0(value))
  }
}
