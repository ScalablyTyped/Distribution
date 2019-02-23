package typings
package atPulumiAwsLib.apigatewayUsagePlanKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanKeyState extends js.Object {
  /**
    * The identifier of the API key resource.
    */
  val keyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of a usage plan key.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The value of a usage plan key.
    */
  val value: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

