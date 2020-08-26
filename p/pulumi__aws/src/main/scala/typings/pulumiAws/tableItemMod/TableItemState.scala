package typings.pulumiAws.tableItemMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableItemState extends js.Object {
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: js.UndefOr[Input[String]] = js.native
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: js.UndefOr[Input[String]] = js.native
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the table to contain the item.
    */
  val tableName: js.UndefOr[Input[String]] = js.native
}

object TableItemState {
  @scala.inline
  def apply(): TableItemState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableItemState]
  }
  @scala.inline
  implicit class TableItemStateOps[Self <: TableItemState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHashKey(value: Input[String]): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashKey: Self = this.set("hashKey", js.undefined)
    @scala.inline
    def setItem(value: Input[String]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setRangeKey(value: Input[String]): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeKey: Self = this.set("rangeKey", js.undefined)
    @scala.inline
    def setTableName(value: Input[String]): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
  
}

