package typings.sharepoint.SPNs.JsGridNs

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
    GroupingLevel: Int | Double = null,
    GroupingPrefix: String = null,
    IsGanttEnabled: js.UndefOr[Boolean] = js.undefined,
    IsHierarchyEnabled: js.UndefOr[Boolean] = js.undefined,
    IsSorted: js.UndefOr[Boolean] = js.undefined,
    RecordKeyHash: String = null,
    RecordKeyOrderChanged: js.Any = null
  ): IGridMetadata = {
    val __obj = js.Dynamic.literal(KeyColumnName = KeyColumnName)
    if (GridOperationalConstantsFieldKeyMap != null) __obj.updateDynamic("GridOperationalConstantsFieldKeyMap")(GridOperationalConstantsFieldKeyMap)
    if (GroupingLevel != null) __obj.updateDynamic("GroupingLevel")(GroupingLevel.asInstanceOf[js.Any])
    if (GroupingPrefix != null) __obj.updateDynamic("GroupingPrefix")(GroupingPrefix)
    if (!js.isUndefined(IsGanttEnabled)) __obj.updateDynamic("IsGanttEnabled")(IsGanttEnabled)
    if (!js.isUndefined(IsHierarchyEnabled)) __obj.updateDynamic("IsHierarchyEnabled")(IsHierarchyEnabled)
    if (!js.isUndefined(IsSorted)) __obj.updateDynamic("IsSorted")(IsSorted)
    if (RecordKeyHash != null) __obj.updateDynamic("RecordKeyHash")(RecordKeyHash)
    if (RecordKeyOrderChanged != null) __obj.updateDynamic("RecordKeyOrderChanged")(RecordKeyOrderChanged)
    __obj.asInstanceOf[IGridMetadata]
  }
}

