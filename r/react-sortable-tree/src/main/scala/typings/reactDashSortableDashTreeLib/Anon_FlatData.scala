package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlatData extends js.Object {
  var flatData: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.FlattenedData
  var getKey: js.UndefOr[reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction] = js.undefined
  var getParentKey: js.UndefOr[reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction] = js.undefined
  var rootKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_FlatData {
  @scala.inline
  def apply(
    flatData: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.FlattenedData,
    getKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction = null,
    getParentKey: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction = null,
    rootKey: java.lang.String | scala.Double = null
  ): Anon_FlatData = {
    val __obj = js.Dynamic.literal(flatData = flatData)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getParentKey != null) __obj.updateDynamic("getParentKey")(getParentKey)
    if (rootKey != null) __obj.updateDynamic("rootKey")(rootKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FlatData]
  }
}

