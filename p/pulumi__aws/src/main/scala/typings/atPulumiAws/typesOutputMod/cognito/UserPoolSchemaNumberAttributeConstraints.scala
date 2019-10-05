package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolSchemaNumberAttributeConstraints extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var maxValue: js.UndefOr[String] = js.undefined
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var minValue: js.UndefOr[String] = js.undefined
}

object UserPoolSchemaNumberAttributeConstraints {
  @scala.inline
  def apply(maxValue: String = null, minValue: String = null): UserPoolSchemaNumberAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    __obj.asInstanceOf[UserPoolSchemaNumberAttributeConstraints]
  }
}

