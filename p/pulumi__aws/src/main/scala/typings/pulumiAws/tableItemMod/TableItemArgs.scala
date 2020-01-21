package typings.pulumiAws.tableItemMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableItemArgs extends js.Object {
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: Input[String] = js.native
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: Input[String] = js.native
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the table to contain the item.
    */
  val tableName: Input[String] = js.native
}

object TableItemArgs {
  @scala.inline
  def apply(
    hashKey: Input[String],
    item: Input[String],
    tableName: Input[String],
    rangeKey: Input[String] = null
  ): TableItemArgs = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableItemArgs]
  }
}

