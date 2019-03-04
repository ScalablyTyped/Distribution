package typings
package reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/util/mosaicUtilities", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createBalancedTreeFromLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](leaves: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]]): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def createBalancedTreeFromLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    leaves: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]],
    startDirection: reactDashMosaicDashComponentLib.libTypesMod.MosaicDirection
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def getAndAssertNodeAtPathExists[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    tree: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T],
    path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = js.native
  def getAndAssertNodeAtPathExists[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](tree: scala.Null, path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = js.native
  def getLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](): js.Array[T] = js.native
  def getLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](tree: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]): js.Array[T] = js.native
  def getNodeAtPath[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    tree: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T],
    path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def getNodeAtPath[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](tree: scala.Null, path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def getOtherBranch(branch: reactDashMosaicDashComponentLib.libTypesMod.MosaicBranch): reactDashMosaicDashComponentLib.libTypesMod.MosaicBranch = js.native
  def getOtherDirection(direction: reactDashMosaicDashComponentLib.libTypesMod.MosaicDirection): reactDashMosaicDashComponentLib.libTypesMod.MosaicDirection = js.native
  def getPathToCorner(
    tree: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[_],
    corner: reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod.Corner
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicPath = js.native
  def isParent[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](node: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]): /* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ scala.Boolean = js.native
}

