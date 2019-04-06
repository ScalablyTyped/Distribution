package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceleratorType extends js.Object {
  var acceleratorType: js.UndefOr[java.lang.String] = js.undefined
  var initialInstanceCount: scala.Double
  var initialVariantWeight: js.UndefOr[scala.Double] = js.undefined
  var instanceType: java.lang.String
  var modelName: java.lang.String
  var variantName: java.lang.String
}

object Anon_AcceleratorType {
  @scala.inline
  def apply(
    initialInstanceCount: scala.Double,
    instanceType: java.lang.String,
    modelName: java.lang.String,
    variantName: java.lang.String,
    acceleratorType: java.lang.String = null,
    initialVariantWeight: scala.Int | scala.Double = null
  ): Anon_AcceleratorType = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount, instanceType = instanceType, modelName = modelName, variantName = variantName)
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType)
    if (initialVariantWeight != null) __obj.updateDynamic("initialVariantWeight")(initialVariantWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceleratorType]
  }
}

