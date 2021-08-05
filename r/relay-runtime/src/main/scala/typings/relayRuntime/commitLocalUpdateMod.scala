package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.StoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitLocalUpdateMod {
  
  @JSImport("relay-runtime/lib/mutations/commitLocalUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
