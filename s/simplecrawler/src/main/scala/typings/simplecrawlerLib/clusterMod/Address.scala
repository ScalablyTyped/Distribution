package typings
package simplecrawlerLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: java.lang.String
  var addressType: scala.Double | simplecrawlerLib.simplecrawlerLibStrings.udp4 | simplecrawlerLib.simplecrawlerLibStrings.udp6
  var port: scala.Double
}

object Address {
  @scala.inline
  def apply(
    address: java.lang.String,
    addressType: scala.Double | simplecrawlerLib.simplecrawlerLibStrings.udp4 | simplecrawlerLib.simplecrawlerLibStrings.udp6,
    port: scala.Double
  ): Address = {
    val __obj = js.Dynamic.literal(address = address, addressType = addressType.asInstanceOf[js.Any], port = port)
  
    __obj.asInstanceOf[Address]
  }
}

