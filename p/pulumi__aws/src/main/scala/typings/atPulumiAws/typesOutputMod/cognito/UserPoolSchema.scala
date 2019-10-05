package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolSchema extends js.Object {
  /**
    * The attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
    */
  var attributeDataType: String
  /**
    * Specifies whether the attribute type is developer only.
    */
  var developerOnlyAttribute: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the attribute can be changed once it has been created.
    */
  var mutable: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the attribute.
    */
  var name: String
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var numberAttributeConstraints: js.UndefOr[UserPoolSchemaNumberAttributeConstraints] = js.undefined
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * -Specifies the constraints for an attribute of the string type.
    */
  var stringAttributeConstraints: js.UndefOr[UserPoolSchemaStringAttributeConstraints] = js.undefined
}

object UserPoolSchema {
  @scala.inline
  def apply(
    attributeDataType: String,
    name: String,
    developerOnlyAttribute: js.UndefOr[Boolean] = js.undefined,
    mutable: js.UndefOr[Boolean] = js.undefined,
    numberAttributeConstraints: UserPoolSchemaNumberAttributeConstraints = null,
    required: js.UndefOr[Boolean] = js.undefined,
    stringAttributeConstraints: UserPoolSchemaStringAttributeConstraints = null
  ): UserPoolSchema = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType, name = name)
    if (!js.isUndefined(developerOnlyAttribute)) __obj.updateDynamic("developerOnlyAttribute")(developerOnlyAttribute)
    if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable)
    if (numberAttributeConstraints != null) __obj.updateDynamic("numberAttributeConstraints")(numberAttributeConstraints)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (stringAttributeConstraints != null) __obj.updateDynamic("stringAttributeConstraints")(stringAttributeConstraints)
    __obj.asInstanceOf[UserPoolSchema]
  }
}

