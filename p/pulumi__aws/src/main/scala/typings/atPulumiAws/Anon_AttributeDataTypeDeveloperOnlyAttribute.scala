package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeDataTypeDeveloperOnlyAttribute extends js.Object {
  var attributeDataType: Input[String]
  var developerOnlyAttribute: js.UndefOr[Input[Boolean]] = js.undefined
  var mutable: js.UndefOr[Input[Boolean]] = js.undefined
  var name: Input[String]
  var numberAttributeConstraints: js.UndefOr[Input[Anon_MaxValueMinValue]] = js.undefined
  var required: js.UndefOr[Input[Boolean]] = js.undefined
  var stringAttributeConstraints: js.UndefOr[Input[Anon_MaxLengthMinLength]] = js.undefined
}

object Anon_AttributeDataTypeDeveloperOnlyAttribute {
  @scala.inline
  def apply(
    attributeDataType: Input[String],
    name: Input[String],
    developerOnlyAttribute: Input[Boolean] = null,
    mutable: Input[Boolean] = null,
    numberAttributeConstraints: Input[Anon_MaxValueMinValue] = null,
    required: Input[Boolean] = null,
    stringAttributeConstraints: Input[Anon_MaxLengthMinLength] = null
  ): Anon_AttributeDataTypeDeveloperOnlyAttribute = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (developerOnlyAttribute != null) __obj.updateDynamic("developerOnlyAttribute")(developerOnlyAttribute.asInstanceOf[js.Any])
    if (mutable != null) __obj.updateDynamic("mutable")(mutable.asInstanceOf[js.Any])
    if (numberAttributeConstraints != null) __obj.updateDynamic("numberAttributeConstraints")(numberAttributeConstraints.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (stringAttributeConstraints != null) __obj.updateDynamic("stringAttributeConstraints")(stringAttributeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributeDataTypeDeveloperOnlyAttribute]
  }
}

