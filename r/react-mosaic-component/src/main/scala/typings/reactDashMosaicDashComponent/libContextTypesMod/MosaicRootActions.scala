package typings.reactDashMosaicDashComponent.libContextTypesMod

import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicPath
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicRootActions[T /* <: MosaicKey */] extends js.Object {
  /**
    * Increases the size of this node and bubbles up the tree
    * @param path Path to node to expand
    * @param percentage Every node in the path up to root will be expanded to this percentage
    */
  def expand(path: MosaicPath): Unit = js.native
  def expand(path: MosaicPath, percentage: Double): Unit = js.native
  /**
    * Returns the root of this Mosaic instance
    */
  def getRoot(): MosaicNode[T] | Null = js.native
  /**
    * Hide the node at `path` but keep it in the DOM. Used in Drag and Drop
    * @param path
    */
  def hide(path: MosaicPath): Unit = js.native
  /**
    * Remove the node at `path`
    * @param path
    */
  def remove(path: MosaicPath): Unit = js.native
  /**
    * Replace currentNode at `path` with `node`
    * @param path
    * @param node
    */
  def replaceWith(path: MosaicPath, node: MosaicNode[T]): Unit = js.native
  /**
    * Atomically applies all updates to the current tree
    * @param updates
    * @param suppressOnRelease (default: false)
    */
  def updateTree(updates: js.Array[MosaicUpdate[T]]): Unit = js.native
  def updateTree(updates: js.Array[MosaicUpdate[T]], suppressOnRelease: Boolean): Unit = js.native
}

