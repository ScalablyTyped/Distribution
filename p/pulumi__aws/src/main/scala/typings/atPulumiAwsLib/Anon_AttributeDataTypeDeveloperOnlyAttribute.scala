package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeDataTypeDeveloperOnlyAttribute extends js.Object {
  var attributeDataType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var developerOnlyAttribute: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var mutable: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var numberAttributeConstraints: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_MaxValueMinValue]] = js.undefined
  var required: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var stringAttributeConstraints: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_MaxLengthMinLength]] = js.undefined
}

object Anon_AttributeDataTypeDeveloperOnlyAttribute {
  @scala.inline
  def apply(
    attributeDataType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    developerOnlyAttribute: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    mutable: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    numberAttributeConstraints: atPulumiPulumiLib.outputMod.Input[Anon_MaxValueMinValue] = null,
    required: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    stringAttributeConstraints: atPulumiPulumiLib.outputMod.Input[Anon_MaxLengthMinLength] = null
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

