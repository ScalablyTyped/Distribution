package typings
package reactDashSortableDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsTreeDashDataDashUtilsMod {
  type FlattenedData = js.Array[
    reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with reactDashSortableDashTreeLib.Anon_LowerSiblingsCounts
  ]
  type GetNodeKeyFunction = js.Function1[
    /* data */ reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode, 
    java.lang.String | scala.Double
  ]
  type WalkAndMapFunctionParameters = reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_Callback
}
