package typings
package atPulumiAwsLib.appsyncApiKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyArgs extends js.Object {
  /**
    * The ID of the associated AppSync API
    */
  val apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The API key description. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
    */
  val expires: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

