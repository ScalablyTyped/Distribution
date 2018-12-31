package typings
package atPulumiAwsLib.apigatewayUsagePlanKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanKeyArgs extends js.Object {
  /**
    * The identifier of the API key resource.
    */
  val keyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

