package typings.reactRelay

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSubscribeToInvalidationStateMod {
  
  @JSImport("react-relay/lib/relay-experimental/useSubscribeToInvalidationState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribeToInvalidationState")(dataIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
