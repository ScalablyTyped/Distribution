package typings.relayRuntime

import typings.relayRuntime.libStoreRelayStoreTypesMod.FragmentMap
import typings.relayRuntime.libStoreRelayStoreTypesMod.FragmentSpecResolver
import typings.relayRuntime.libStoreRelayStoreTypesMod.Props
import typings.relayRuntime.libStoreRelayStoreTypesMod.RelayContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreCreateFragmentSpecResolverMod {
  
  @JSImport("relay-runtime/lib/store/createFragmentSpecResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentSpecResolver")(context.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[FragmentSpecResolver]
  inline def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentSpecResolver")(context.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], props.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FragmentSpecResolver]
}
