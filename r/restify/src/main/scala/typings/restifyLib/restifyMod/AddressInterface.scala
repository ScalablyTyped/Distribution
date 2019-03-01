package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInterface extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: scala.Double
}

object AddressInterface {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: scala.Double): AddressInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[AddressInterface]
  }
}

