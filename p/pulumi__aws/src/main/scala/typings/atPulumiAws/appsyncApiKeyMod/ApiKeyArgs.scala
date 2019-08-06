package typings.atPulumiAws.appsyncApiKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyArgs extends js.Object {
  /**
    * The ID of the associated AppSync API
    */
  val apiId: Input[String]
  /**
    * The API key description. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
    */
  val expires: js.UndefOr[Input[String]] = js.undefined
}

object ApiKeyArgs {
  @scala.inline
  def apply(apiId: Input[String], description: Input[String] = null, expires: Input[String] = null): ApiKeyArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyArgs]
  }
}

