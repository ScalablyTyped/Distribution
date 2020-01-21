package typings.pulumiAws.outputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPermissionCondition extends js.Object {
  /**
    * Key for the condition. Valid values: `aws:PrincipalOrgID`.
    */
  var key: String = js.native
  /**
    * Type of condition. Value values: `StringEquals`.
    */
  var `type`: String = js.native
  /**
    * Value for the key.
    */
  var value: String = js.native
}

object EventPermissionCondition {
  @scala.inline
  def apply(key: String, `type`: String, value: String): EventPermissionCondition = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPermissionCondition]
  }
}

