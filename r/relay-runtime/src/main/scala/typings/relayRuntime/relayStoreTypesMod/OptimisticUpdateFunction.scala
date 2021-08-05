package typings.relayRuntime.relayStoreTypesMod

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
  
  extension [Self <: OptimisticUpdateFunction](x: Self) {
    
    inline def setStoreUpdater(value: RecordSourceProxy => Unit): Self = StObject.set(x, "storeUpdater", js.Any.fromFunction1(value))
  }
}
