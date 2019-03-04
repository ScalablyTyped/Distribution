package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeDataType extends js.Object {
  var attributeDataType: java.lang.String
  var developerOnlyAttribute: js.UndefOr[scala.Boolean] = js.undefined
  var mutable: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var numberAttributeConstraints: js.UndefOr[Anon_MaxValue] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var stringAttributeConstraints: js.UndefOr[Anon_MaxLength] = js.undefined
}

object Anon_AttributeDataType {
  @scala.inline
  def apply(
    attributeDataType: java.lang.String,
    name: java.lang.String,
    developerOnlyAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    mutable: js.UndefOr[scala.Boolean] = js.undefined,
    numberAttributeConstraints: Anon_MaxValue = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    stringAttributeConstraints: Anon_MaxLength = null
  ): Anon_AttributeDataType = {
    val __obj = js.Dynamic.literal(attributeDataType = attributeDataType, name = name)
    if (!js.isUndefined(developerOnlyAttribute)) __obj.updateDynamic("developerOnlyAttribute")(developerOnlyAttribute)
    if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable)
    if (numberAttributeConstraints != null) __obj.updateDynamic("numberAttributeConstraints")(numberAttributeConstraints)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (stringAttributeConstraints != null) __obj.updateDynamic("stringAttributeConstraints")(stringAttributeConstraints)
    __obj.asInstanceOf[Anon_AttributeDataType]
  }
}

