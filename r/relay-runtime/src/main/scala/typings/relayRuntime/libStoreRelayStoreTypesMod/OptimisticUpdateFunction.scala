package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticUpdateFunction
  extends StObject
     with OptimisticUpdate {
  
  def storeUpdater(store: RecordSourceProxy): Unit
}
object OptimisticUpdateFunction {
  
  inline def apply(storeUpdater: RecordSourceProxy => Unit): OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[OptimisticUpdateFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimisticUpdateFunction] (val x: Self) extends AnyVal {
    
    inline def setStoreUpdater(value: RecordSourceProxy => Unit): Self = StObject.set(x, "storeUpdater", js.Any.fromFunction1(value))
  }
}
