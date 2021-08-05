package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.FragmentMap
import typings.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typings.relayRuntime.relayStoreTypesMod.Props
import typings.relayRuntime.relayStoreTypesMod.RelayContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFragmentSpecResolverMod {
  
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
