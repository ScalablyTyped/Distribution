package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInterface extends js.Object {
  var address: String
  var family: String
  var port: Double
}

object AddressInterface {
  @scala.inline
  def apply(address: String, family: String, port: Double): AddressInterface = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInterface]
  }
}

