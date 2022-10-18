package typings.relayRuntime

import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutationsCommitLocalUpdateMod {
  
  @JSImport("relay-runtime/lib/mutations/commitLocalUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
