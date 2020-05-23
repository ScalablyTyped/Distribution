package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  var allowedAccounts: js.UndefOr[js.Array[String]] = js.undefined
  var compatibleRuntimes: js.UndefOr[js.Array[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var licenseInfo: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: String
  var retain: js.UndefOr[Boolean] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    path: String,
    allowedAccounts: js.Array[String] = null,
    compatibleRuntimes: js.Array[String] = null,
    description: String = null,
    licenseInfo: String = null,
    name: String = null,
    retain: js.UndefOr[Boolean] = js.undefined
  ): Layer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (allowedAccounts != null) __obj.updateDynamic("allowedAccounts")(allowedAccounts.asInstanceOf[js.Any])
    if (compatibleRuntimes != null) __obj.updateDynamic("compatibleRuntimes")(compatibleRuntimes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (licenseInfo != null) __obj.updateDynamic("licenseInfo")(licenseInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

