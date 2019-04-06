package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceleratorTypeInitialInstanceCount extends js.Object {
  var acceleratorType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var initialInstanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var initialVariantWeight: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var modelName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var variantName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AcceleratorTypeInitialInstanceCount {
  @scala.inline
  def apply(
    initialInstanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double],
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    modelName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    acceleratorType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    initialVariantWeight: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    variantName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AcceleratorTypeInitialInstanceCount = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (initialVariantWeight != null) __obj.updateDynamic("initialVariantWeight")(initialVariantWeight.asInstanceOf[js.Any])
    if (variantName != null) __obj.updateDynamic("variantName")(variantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceleratorTypeInitialInstanceCount]
  }
}

