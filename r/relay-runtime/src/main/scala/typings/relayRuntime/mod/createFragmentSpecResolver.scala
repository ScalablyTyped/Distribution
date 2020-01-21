package typings.relayRuntime.mod

import typings.relayRuntime.relayStoreTypesMod.FragmentMap
import typings.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typings.relayRuntime.relayStoreTypesMod.Props
import typings.relayRuntime.relayStoreTypesMod.RelayContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createFragmentSpecResolver")
@js.native
object createFragmentSpecResolver extends js.Object {
  def apply(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def apply(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
}

