package typings
package reactDashMosaicDashComponentLib.reactDashMosaicDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_CONTROLS_WITHOUT_CREATION: js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  val DEFAULT_CONTROLS_WITH_CREATION: js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  val MosaicContext: reactLib.reactMod.Context[
    reactDashMosaicDashComponentLib.libContextTypesMod.MosaicContext[java.lang.String | scala.Double]
  ] = js.native
  val MosaicWindowContext: reactLib.reactMod.Context[reactDashMosaicDashComponentLib.libContextTypesMod.MosaicWindowContext] = js.native
  def buildSpecFromUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](mosaicUpdate: reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdateSpec[T] = js.native
  def createBalancedTreeFromLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](leaves: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]]): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def createBalancedTreeFromLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    leaves: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]],
    startDirection: reactDashMosaicDashComponentLib.libTypesMod.MosaicDirection
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def createDefaultToolbarButton(
    title: java.lang.String,
    className: java.lang.String,
    onClick: js.Function1[/* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], _]
  ): reactLib.reactMod.ReactElement = js.native
  def createDefaultToolbarButton(
    title: java.lang.String,
    className: java.lang.String,
    onClick: js.Function1[/* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], _],
    text: java.lang.String
  ): reactLib.reactMod.ReactElement = js.native
  def createDragToUpdates[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    root: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T],
    sourcePath: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath,
    destinationPath: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath,
    position: reactDashMosaicDashComponentLib.libInternalTypesMod.MosaicDropTargetPosition
  ): js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]] = js.native
  def createExpandUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath, percentage: scala.Double): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T] = js.native
  def createHideUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T] = js.native
  def createRemoveUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    root: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T],
    path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T] = js.native
  def createRemoveUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](root: scala.Null, path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T] = js.native
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
  def updateTree[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    root: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T],
    updates: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]]
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = js.native
}

