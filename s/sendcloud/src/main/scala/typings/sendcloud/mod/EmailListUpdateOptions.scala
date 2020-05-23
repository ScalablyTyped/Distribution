package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailListUpdateOptions extends js.Object {
  var address: String
  var api_key: String
  var api_user: String
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var toAddress: js.UndefOr[String] = js.undefined
}

object EmailListUpdateOptions {
  @scala.inline
  def apply(
    address: String,
    api_key: String,
    api_user: String,
    description: String = null,
    name: String = null,
    toAddress: String = null
  ): EmailListUpdateOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (toAddress != null) __obj.updateDynamic("toAddress")(toAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateOptions]
  }
}

