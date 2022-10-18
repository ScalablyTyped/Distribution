package typings.reactRelay

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseSubscribeToInvalidationStateMod {
  
  @JSImport("react-relay/relay-hooks/useSubscribeToInvalidationState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribeToInvalidationState")(dataIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
