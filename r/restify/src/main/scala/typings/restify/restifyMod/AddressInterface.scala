package typings.restify.restifyMod

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
    val __obj = js.Dynamic.literal(address = address, family = family, port = port)
  
    __obj.asInstanceOf[AddressInterface]
  }
}

