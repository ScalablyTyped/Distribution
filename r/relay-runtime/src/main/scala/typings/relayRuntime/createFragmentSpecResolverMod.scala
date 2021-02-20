package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.FragmentMap
import typings.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typings.relayRuntime.relayStoreTypesMod.Props
import typings.relayRuntime.relayStoreTypesMod.RelayContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFragmentSpecResolverMod {
  
  @JSImport("relay-runtime/lib/store/createFragmentSpecResolver", "createFragmentSpecResolver")
  @js.native
  def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  @JSImport("relay-runtime/lib/store/createFragmentSpecResolver", "createFragmentSpecResolver")
  @js.native
  def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
}
