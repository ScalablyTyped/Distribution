package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSchemaNumberAttributeConstraints extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var maxValue: js.UndefOr[String] = js.native
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var minValue: js.UndefOr[String] = js.native
}

object UserPoolSchemaNumberAttributeConstraints {
  @scala.inline
  def apply(maxValue: String = null, minValue: String = null): UserPoolSchemaNumberAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchemaNumberAttributeConstraints]
  }
}

