package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.FlattenedData
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlatData extends js.Object {
  var flatData: FlattenedData
  var getKey: js.UndefOr[GetNodeKeyFunction] = js.undefined
  var getParentKey: js.UndefOr[GetNodeKeyFunction] = js.undefined
  var rootKey: js.UndefOr[String | Double] = js.undefined
}

object Anon_FlatData {
  @scala.inline
  def apply(
    flatData: FlattenedData,
    getKey: GetNodeKeyFunction = null,
    getParentKey: GetNodeKeyFunction = null,
    rootKey: String | Double = null
  ): Anon_FlatData = {
    val __obj = js.Dynamic.literal(flatData = flatData)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getParentKey != null) __obj.updateDynamic("getParentKey")(getParentKey)
    if (rootKey != null) __obj.updateDynamic("rootKey")(rootKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FlatData]
  }
}

