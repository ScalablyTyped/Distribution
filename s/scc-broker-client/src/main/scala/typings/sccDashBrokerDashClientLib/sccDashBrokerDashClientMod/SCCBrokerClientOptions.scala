package typings
package sccDashBrokerDashClientLib.sccDashBrokerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCCBrokerClientOptions extends js.Object {
  var authKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.undefined
  var brokerRetryDelay: js.UndefOr[scala.Double] = js.undefined
  var clientPoolSize: js.UndefOr[scala.Double] = js.undefined
  var mappingEngine: js.UndefOr[
    sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.skeletonRendezvous | sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.simple | MappingEngine
  ] = js.undefined
  var noErrorLogging: js.UndefOr[scala.Boolean] = js.undefined
  var stateServerAckTimeout: js.UndefOr[scala.Double] = js.undefined
  var stateServerConnectTimeout: js.UndefOr[scala.Double] = js.undefined
  var stateServerHost: java.lang.String
  var stateServerPort: js.UndefOr[scala.Double] = js.undefined
  var stateServerReconnectRandomness: js.UndefOr[scala.Double] = js.undefined
}

