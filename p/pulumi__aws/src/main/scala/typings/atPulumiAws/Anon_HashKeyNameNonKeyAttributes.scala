package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyNameNonKeyAttributes extends js.Object {
  var hashKey: Input[String]
  var name: Input[String]
  var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var projectionType: Input[String]
  var rangeKey: js.UndefOr[Input[String]] = js.undefined
  var readCapacity: js.UndefOr[Input[Double]] = js.undefined
  var writeCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_HashKeyNameNonKeyAttributes {
  @scala.inline
  def apply(
    hashKey: Input[String],
    name: Input[String],
    projectionType: Input[String],
    nonKeyAttributes: Input[js.Array[Input[String]]] = null,
    rangeKey: Input[String] = null,
    readCapacity: Input[Double] = null,
    writeCapacity: Input[Double] = null
  ): Anon_HashKeyNameNonKeyAttributes = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyNameNonKeyAttributes]
  }
}

