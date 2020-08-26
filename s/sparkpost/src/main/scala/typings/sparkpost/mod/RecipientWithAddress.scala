package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientWithAddress extends js.Object {
  /** Address information for a recipient  At a minimum, address or multichannel_addresses is required. */
  var address: Address | String = js.native
}

object RecipientWithAddress {
  @scala.inline
  def apply(address: Address | String): RecipientWithAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientWithAddress]
  }
  @scala.inline
  implicit class RecipientWithAddressOps[Self <: RecipientWithAddress] (val x: Self) extends AnyVal {
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
    def setAddress(value: Address | String): Self = this.set("address", value.asInstanceOf[js.Any])
  }
  
}

