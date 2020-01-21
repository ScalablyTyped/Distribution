package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientWithAddress extends js.Object {
  /** Address information for a recipient  At a minimum, address or multichannel_addresses is required. */
  var address: Address | String
}

object RecipientWithAddress {
  @scala.inline
  def apply(address: Address | String): RecipientWithAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecipientWithAddress]
  }
}

