package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IGridMetadata extends js.Object {
  var GridOperationalConstantsFieldKeyMap: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var GroupingLevel: js.UndefOr[scala.Double] = js.undefined
  var GroupingPrefix: js.UndefOr[java.lang.String] = js.undefined
  var IsGanttEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var IsHierarchyEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var IsSorted: js.UndefOr[scala.Boolean] = js.undefined
  var KeyColumnName: java.lang.String
  var RecordKeyHash: js.UndefOr[java.lang.String] = js.undefined
  var RecordKeyOrderChanged: js.UndefOr[js.Any] = js.undefined
}

object IGridMetadata {
  @scala.inline
  def apply(
    KeyColumnName: java.lang.String,
    GridOperationalConstantsFieldKeyMap: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    GroupingLevel: scala.Int | scala.Double = null,
    GroupingPrefix: java.lang.String = null,
    IsGanttEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    IsHierarchyEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    IsSorted: js.UndefOr[scala.Boolean] = js.undefined,
    RecordKeyHash: java.lang.String = null,
    RecordKeyOrderChanged: js.Any = null
  ): IGridMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("KeyColumnName")(KeyColumnName)
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

