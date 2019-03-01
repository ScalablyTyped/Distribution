package typings
package atPulumiAwsLib.dynamodbTableItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableItemArgs extends js.Object {
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the table to contain the item.
    */
  val tableName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object TableItemArgs {
  @scala.inline
  def apply(
    hashKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    item: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tableName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    rangeKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): TableItemArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashKey")(hashKey.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableItemArgs]
  }
}

