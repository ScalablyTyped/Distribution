package typings.atPulumiAws.typesInputMod.cloudwatch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPermissionCondition extends js.Object {
  /**
    * Key for the condition. Valid values: `aws:PrincipalOrgID`.
    */
  var key: Input[String] = js.native
  /**
    * Type of condition. Value values: `StringEquals`.
    */
  var `type`: Input[String] = js.native
  /**
    * Value for the key.
    */
  var value: Input[String] = js.native
}

object EventPermissionCondition {
  @scala.inline
  def apply(key: Input[String], `type`: Input[String], value: Input[String]): EventPermissionCondition = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPermissionCondition]
  }
}

