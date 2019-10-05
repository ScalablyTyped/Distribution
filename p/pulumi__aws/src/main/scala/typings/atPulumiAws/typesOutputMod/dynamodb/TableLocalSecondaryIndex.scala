package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLocalSecondaryIndex extends js.Object {
  /**
    * The name of the index
    */
  var name: String
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: String
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: String
}

object TableLocalSecondaryIndex {
  @scala.inline
  def apply(name: String, projectionType: String, rangeKey: String, nonKeyAttributes: js.Array[String] = null): TableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(name = name, projectionType = projectionType, rangeKey = rangeKey)
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    __obj.asInstanceOf[TableLocalSecondaryIndex]
  }
}

