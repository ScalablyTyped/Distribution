package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticUpdater extends StObject {
  
  def optimisticUpdater(
    store: RecordSourceSelectorProxy[js.Object],
    // Actually SelectorData, but mixed is inconvenient to access deeply in
  // product code.
  data: js.Object
  ): Unit
  @JSName("optimisticUpdater")
  var optimisticUpdater_Original: SelectorStoreUpdater[js.Object]
  
  def updater(
    store: RecordSourceSelectorProxy[js.Object],
    // Actually SelectorData, but mixed is inconvenient to access deeply in
  // product code.
  data: js.Object
  ): Unit
  @JSName("updater")
  var updater_Original: SelectorStoreUpdater[js.Object]
}
object OptimisticUpdater {
  
  inline def apply(
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit
  ): OptimisticUpdater = {
    val __obj = js.Dynamic.literal(optimisticUpdater = js.Any.fromFunction2(optimisticUpdater), updater = js.Any.fromFunction2(updater))
    __obj.asInstanceOf[OptimisticUpdater]
  }
  
  extension [Self <: OptimisticUpdater](x: Self) {
    
    inline def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
  }
}
