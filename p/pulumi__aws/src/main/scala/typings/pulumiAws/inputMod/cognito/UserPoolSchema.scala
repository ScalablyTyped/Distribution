package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSchema extends js.Object {
  /**
    * The attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
    */
  var attributeDataType: Input[String] = js.native
  /**
    * Specifies whether the attribute type is developer only.
    */
  var developerOnlyAttribute: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the attribute can be changed once it has been created.
    */
  var mutable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the attribute.
    */
  var name: Input[String] = js.native
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var numberAttributeConstraints: js.UndefOr[Input[UserPoolSchemaNumberAttributeConstraints]] = js.native
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var required: js.UndefOr[Input[Boolean]] = js.native
  /**
    * -Specifies the constraints for an attribute of the string type.
    */
  var stringAttributeConstraints: js.UndefOr[Input[UserPoolSchemaStringAttributeConstraints]] = js.native
}

object UserPoolSchema {
  @scala.inline
  def apply(
    attributeDataType: Input[String],
    name: Input[String],
    developerOnlyAttribute: Input[Boolean] = null,
    mutable: Input[Boolean] = null,
    numberAttributeConstraints: Input[UserPoolSchemaNumberAttributeConstraints] = null,
    required: Input[Boolean] = null,
    stringAttributeConstraints: Input[UserPoolSchemaStringAttributeConstraints] = null
  ): UserPoolSchema = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (developerOnlyAttribute != null) __obj.updateDynamic("developerOnlyAttribute")(developerOnlyAttribute.asInstanceOf[js.Any])
    if (mutable != null) __obj.updateDynamic("mutable")(mutable.asInstanceOf[js.Any])
    if (numberAttributeConstraints != null) __obj.updateDynamic("numberAttributeConstraints")(numberAttributeConstraints.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (stringAttributeConstraints != null) __obj.updateDynamic("stringAttributeConstraints")(stringAttributeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchema]
  }
}

