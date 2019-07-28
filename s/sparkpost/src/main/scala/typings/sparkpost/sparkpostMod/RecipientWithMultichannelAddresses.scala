package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientWithMultichannelAddresses extends js.Object {
  /**
    * Address information for a recipient. At a minimum, address or multichannel_addresses is required.
    * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
    *
    */
  var address: js.UndefOr[Address | String] = js.undefined
  /**
    * Array of Multichannel Address objects for a recipient. At a minimum, address or multichannel_addresses is required.
    * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
    *
    */
  var multichannel_addresses: js.Array[MultichannelAddress]
}

object RecipientWithMultichannelAddresses {
  @scala.inline
  def apply(multichannel_addresses: js.Array[MultichannelAddress], address: Address | String = null): RecipientWithMultichannelAddresses = {
    val __obj = js.Dynamic.literal(multichannel_addresses = multichannel_addresses)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientWithMultichannelAddresses]
  }
}

