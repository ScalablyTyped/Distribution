package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClusterClientOptions extends js.Object {
  var brokers: js.Array[java.lang.String]
  var connectRetryErrorThreshold: scala.Double
  var pubSubBatchDuration: js.UndefOr[scala.Double] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
}

