package typings.atPulumiAws.appsyncApiKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyState extends js.Object {
  /**
    * The ID of the associated AppSync API
    */
  val apiId: js.UndefOr[Input[String]] = js.undefined
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
    */
  val expires: js.UndefOr[Input[String]] = js.undefined
  /**
    * The API key
    */
  val key: js.UndefOr[Input[String]] = js.undefined
}

object ApiKeyState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    description: Input[String] = null,
    expires: Input[String] = null,
    key: Input[String] = null
  ): ApiKeyState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyState]
  }
}

