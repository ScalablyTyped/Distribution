package typings.atPulumiAws.typesInputMod.dynamodb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableLocalSecondaryIndex extends js.Object {
  /**
    * The name of the index
    */
  var name: Input[String] = js.native
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: Input[String] = js.native
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: Input[String] = js.native
}

object TableLocalSecondaryIndex {
  @scala.inline
  def apply(
    name: Input[String],
    projectionType: Input[String],
    rangeKey: Input[String],
    nonKeyAttributes: Input[js.Array[Input[String]]] = null
  ): TableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLocalSecondaryIndex]
  }
}

