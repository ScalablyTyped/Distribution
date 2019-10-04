package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentMap
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentSpecResolver
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Props
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RelayContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/createFragmentSpecResolver", JSImport.Namespace)
@js.native
object libStoreCreateFragmentSpecResolverMod extends js.Object {
  def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
}

