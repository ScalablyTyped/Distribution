package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IGridMetadata extends js.Object {
  var GridOperationalConstantsFieldKeyMap: js.UndefOr[NumberDictionary[String]] = js.native
  var GroupingLevel: js.UndefOr[Double] = js.native
  var GroupingPrefix: js.UndefOr[String] = js.native
  var IsGanttEnabled: js.UndefOr[Boolean] = js.native
  var IsHierarchyEnabled: js.UndefOr[Boolean] = js.native
  var IsSorted: js.UndefOr[Boolean] = js.native
  var KeyColumnName: String = js.native
  var RecordKeyHash: js.UndefOr[String] = js.native
  var RecordKeyOrderChanged: js.UndefOr[js.Any] = js.native
}

object IGridMetadata {
  @scala.inline
  def apply(KeyColumnName: String): IGridMetadata = {
    val __obj = js.Dynamic.literal(KeyColumnName = KeyColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMetadata]
  }
  @scala.inline
  implicit class IGridMetadataOps[Self <: IGridMetadata] (val x: Self) extends AnyVal {
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
    def setKeyColumnName(value: String): Self = this.set("KeyColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridOperationalConstantsFieldKeyMap(value: NumberDictionary[String]): Self = this.set("GridOperationalConstantsFieldKeyMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridOperationalConstantsFieldKeyMap: Self = this.set("GridOperationalConstantsFieldKeyMap", js.undefined)
    @scala.inline
    def setGroupingLevel(value: Double): Self = this.set("GroupingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingLevel: Self = this.set("GroupingLevel", js.undefined)
    @scala.inline
    def setGroupingPrefix(value: String): Self = this.set("GroupingPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingPrefix: Self = this.set("GroupingPrefix", js.undefined)
    @scala.inline
    def setIsGanttEnabled(value: Boolean): Self = this.set("IsGanttEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGanttEnabled: Self = this.set("IsGanttEnabled", js.undefined)
    @scala.inline
    def setIsHierarchyEnabled(value: Boolean): Self = this.set("IsHierarchyEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHierarchyEnabled: Self = this.set("IsHierarchyEnabled", js.undefined)
    @scala.inline
    def setIsSorted(value: Boolean): Self = this.set("IsSorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSorted: Self = this.set("IsSorted", js.undefined)
    @scala.inline
    def setRecordKeyHash(value: String): Self = this.set("RecordKeyHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordKeyHash: Self = this.set("RecordKeyHash", js.undefined)
    @scala.inline
    def setRecordKeyOrderChanged(value: js.Any): Self = this.set("RecordKeyOrderChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordKeyOrderChanged: Self = this.set("RecordKeyOrderChanged", js.undefined)
  }
  
}

