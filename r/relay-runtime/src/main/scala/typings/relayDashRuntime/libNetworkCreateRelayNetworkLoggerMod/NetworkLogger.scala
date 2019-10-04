package typings.relayDashRuntime.libNetworkCreateRelayNetworkLoggerMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkLogger extends js.Object {
  def wrapFetch(fetch: FetchFunction): FetchFunction = js.native
  def wrapFetch(fetch: FetchFunction, graphiQLPrinter: GraphiQLPrinter): FetchFunction = js.native
  def wrapSubscribe(subscribe: SubscribeFunction): SubscribeFunction = js.native
  def wrapSubscribe(subscribe: SubscribeFunction, graphiQLPrinter: GraphiQLPrinter): SubscribeFunction = js.native
}

