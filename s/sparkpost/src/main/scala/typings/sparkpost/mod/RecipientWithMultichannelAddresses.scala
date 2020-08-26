package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientWithMultichannelAddresses extends js.Object {
  /**
    * Address information for a recipient. At a minimum, address or multichannel_addresses is required.
    * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
    *
    */
  var address: js.UndefOr[Address | String] = js.native
  /**
    * Array of Multichannel Address objects for a recipient. At a minimum, address or multichannel_addresses is required.
    * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
    *
    */
  var multichannel_addresses: js.Array[MultichannelAddress] = js.native
}

object RecipientWithMultichannelAddresses {
  @scala.inline
  def apply(multichannel_addresses: js.Array[MultichannelAddress]): RecipientWithMultichannelAddresses = {
    val __obj = js.Dynamic.literal(multichannel_addresses = multichannel_addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientWithMultichannelAddresses]
  }
  @scala.inline
  implicit class RecipientWithMultichannelAddressesOps[Self <: RecipientWithMultichannelAddresses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMultichannel_addressesVarargs(value: MultichannelAddress*): Self = this.set("multichannel_addresses", js.Array(value :_*))
    @scala.inline
    def setMultichannel_addresses(value: js.Array[MultichannelAddress]): Self = this.set("multichannel_addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: Address | String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
  }
  
}

