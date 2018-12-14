package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SCBrokerClusterServerOptions extends js.Object {
  var appBrokerControllerPath: js.UndefOr[java.lang.String] = js.undefined
  var brokerOptions: js.UndefOr[socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions] = js.undefined
  var brokers: js.Array[java.lang.String]
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var downgradeToUser: scala.Double | java.lang.String
  var expiryAccuracy: js.UndefOr[scala.Double] = js.undefined
  var inspect: js.UndefOr[scala.Boolean] = js.undefined
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var ipcAckTimeout: js.UndefOr[scala.Double] = js.undefined
  var processTermTimeout: js.UndefOr[scala.Double] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
}

