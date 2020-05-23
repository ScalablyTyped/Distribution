package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IGridMetadata extends js.Object {
  var GridOperationalConstantsFieldKeyMap: js.UndefOr[NumberDictionary[String]] = js.undefined
  var GroupingLevel: js.UndefOr[Double] = js.undefined
  var GroupingPrefix: js.UndefOr[String] = js.undefined
  var IsGanttEnabled: js.UndefOr[Boolean] = js.undefined
  var IsHierarchyEnabled: js.UndefOr[Boolean] = js.undefined
  var IsSorted: js.UndefOr[Boolean] = js.undefined
  var KeyColumnName: String
  var RecordKeyHash: js.UndefOr[String] = js.undefined
  var RecordKeyOrderChanged: js.UndefOr[js.Any] = js.undefined
}

object IGridMetadata {
  @scala.inline
  def apply(
    KeyColumnName: String,
    GridOperationalConstantsFieldKeyMap: NumberDictionary[String] = null,
    GroupingLevel: js.UndefOr[Double] = js.undefined,
    GroupingPrefix: String = null,
    IsGanttEnabled: js.UndefOr[Boolean] = js.undefined,
    IsHierarchyEnabled: js.UndefOr[Boolean] = js.undefined,
    IsSorted: js.UndefOr[Boolean] = js.undefined,
    RecordKeyHash: String = null,
    RecordKeyOrderChanged: js.Any = null
  ): IGridMetadata = {
    val __obj = js.Dynamic.literal(KeyColumnName = KeyColumnName.asInstanceOf[js.Any])
    if (GridOperationalConstantsFieldKeyMap != null) __obj.updateDynamic("GridOperationalConstantsFieldKeyMap")(GridOperationalConstantsFieldKeyMap.asInstanceOf[js.Any])
    if (!js.isUndefined(GroupingLevel)) __obj.updateDynamic("GroupingLevel")(GroupingLevel.get.asInstanceOf[js.Any])
    if (GroupingPrefix != null) __obj.updateDynamic("GroupingPrefix")(GroupingPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(IsGanttEnabled)) __obj.updateDynamic("IsGanttEnabled")(IsGanttEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IsHierarchyEnabled)) __obj.updateDynamic("IsHierarchyEnabled")(IsHierarchyEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IsSorted)) __obj.updateDynamic("IsSorted")(IsSorted.get.asInstanceOf[js.Any])
    if (RecordKeyHash != null) __obj.updateDynamic("RecordKeyHash")(RecordKeyHash.asInstanceOf[js.Any])
    if (RecordKeyOrderChanged != null) __obj.updateDynamic("RecordKeyOrderChanged")(RecordKeyOrderChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMetadata]
  }
}

