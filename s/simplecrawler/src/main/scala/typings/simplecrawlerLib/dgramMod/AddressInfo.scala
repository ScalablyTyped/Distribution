package typings
package simplecrawlerLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInfo extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: scala.Double
}

object AddressInfo {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: scala.Double): AddressInfo = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port)
  
    __obj.asInstanceOf[AddressInfo]
  }
}

