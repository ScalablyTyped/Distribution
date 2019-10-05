package typings.atPulumiAws.typesOutputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPermissionCondition extends js.Object {
  /**
    * Key for the condition. Valid values: `aws:PrincipalOrgID`.
    */
  var key: String
  /**
    * Type of condition. Value values: `StringEquals`.
    */
  var `type`: String
  /**
    * Value for the key.
    */
  var value: String
}

object EventPermissionCondition {
  @scala.inline
  def apply(key: String, `type`: String, value: String): EventPermissionCondition = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventPermissionCondition]
  }
}

