package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicRootActions[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  /**
    * Increases the size of this node and bubbles up the tree
    * @param path Path to node to expand
    * @param percentage Every node in the path up to root will be expanded to this percentage
    */
  def expand(path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): scala.Unit = js.native
  def expand(path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath, percentage: scala.Double): scala.Unit = js.native
  /**
    * Returns the root of this Mosaic instance
    */
  def getRoot(): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  /**
    * Hide the node at `path` but keep it in the DOM. Used in Drag and Drop
    * @param path
    */
  def hide(path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): scala.Unit = js.native
  /**
    * Remove the node at `path`
    * @param path
    */
  def remove(path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): scala.Unit = js.native
  /**
    * Replace currentNode at `path` with `node`
    * @param path
    * @param node
    */
  def replaceWith(
    path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath,
    node: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]
  ): scala.Unit = js.native
  /**
    * Atomically applies all updates to the current tree
    * @param updates
    * @param suppressOnRelease (default: false)
    */
  def updateTree(updates: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]]): scala.Unit = js.native
  def updateTree(
    updates: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]],
    suppressOnRelease: scala.Boolean
  ): scala.Unit = js.native
}

