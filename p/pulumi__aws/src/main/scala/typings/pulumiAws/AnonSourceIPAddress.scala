package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceIPAddress extends js.Object {
  var sourceIPAddress: String = js.native
}

object AnonSourceIPAddress {
  @scala.inline
  def apply(sourceIPAddress: String): AnonSourceIPAddress = {
    val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSourceIPAddress]
  }
}

