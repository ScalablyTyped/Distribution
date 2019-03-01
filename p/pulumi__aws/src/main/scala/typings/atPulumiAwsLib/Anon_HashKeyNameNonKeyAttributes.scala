package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyNameNonKeyAttributes extends js.Object {
  var hashKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var nonKeyAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var projectionType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var rangeKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var readCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var writeCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_HashKeyNameNonKeyAttributes {
  @scala.inline
  def apply(
    hashKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    projectionType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    nonKeyAttributes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    rangeKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    readCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    writeCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_HashKeyNameNonKeyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashKey")(hashKey.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyNameNonKeyAttributes]
  }
}

