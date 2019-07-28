package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNonKeyAttributesProjectionTypeRangeKey extends js.Object {
  var name: Input[String]
  var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var projectionType: Input[String]
  var rangeKey: Input[String]
}

object Anon_NameNonKeyAttributesProjectionTypeRangeKey {
  @scala.inline
  def apply(
    name: Input[String],
    projectionType: Input[String],
    rangeKey: Input[String],
    nonKeyAttributes: Input[js.Array[Input[String]]] = null
  ): Anon_NameNonKeyAttributesProjectionTypeRangeKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameNonKeyAttributesProjectionTypeRangeKey]
  }
}

