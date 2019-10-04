package typings.atPulumiAws.typesInputMod.cognitoNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolSchemaNumberAttributeConstraints extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var maxValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var minValue: js.UndefOr[Input[String]] = js.undefined
}

object UserPoolSchemaNumberAttributeConstraints {
  @scala.inline
  def apply(maxValue: Input[String] = null, minValue: Input[String] = null): UserPoolSchemaNumberAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchemaNumberAttributeConstraints]
  }
}

