package typings.reactDashMosaicDashComponent.reactDashMosaicDashComponentMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.Context
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.reactDashMosaicDashComponent.libInternalTypesMod.MosaicDropTargetPosition
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicBranch
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicDirection
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicPath
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdate
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdateSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_CONTROLS_WITHOUT_CREATION: js.Array[Element] = js.native
  val DEFAULT_CONTROLS_WITH_CREATION: js.Array[Element] = js.native
  val MosaicContext: Context[
    typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicContext[String | Double]
  ] = js.native
  val MosaicWindowContext: Context[typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext] = js.native
  def buildSpecFromUpdate[T /* <: MosaicKey */](mosaicUpdate: MosaicUpdate[T]): MosaicUpdateSpec[T] = js.native
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]]): MosaicNode[T] | Null = js.native
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]], startDirection: MosaicDirection): MosaicNode[T] | Null = js.native
  def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ MouseEvent[_, NativeMouseEvent], _]
  ): ReactElement = js.native
  def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ MouseEvent[_, NativeMouseEvent], _],
    text: String
  ): ReactElement = js.native
  def createDragToUpdates[T /* <: MosaicKey */](
    root: MosaicNode[T],
    sourcePath: MosaicPath,
    destinationPath: MosaicPath,
    position: MosaicDropTargetPosition
  ): js.Array[MosaicUpdate[T]] = js.native
  def createExpandUpdate[T /* <: MosaicKey */](path: MosaicPath, percentage: Double): MosaicUpdate[T] = js.native
  def createHideUpdate[T /* <: MosaicKey */](path: MosaicPath): MosaicUpdate[T] = js.native
  def createRemoveUpdate[T /* <: MosaicKey */](root: Null, path: MosaicPath): MosaicUpdate[T] = js.native
  def createRemoveUpdate[T /* <: MosaicKey */](root: MosaicNode[T], path: MosaicPath): MosaicUpdate[T] = js.native
  def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] = js.native
  def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] = js.native
  def getLeaves[T /* <: MosaicKey */](): js.Array[T] = js.native
  def getLeaves[T /* <: MosaicKey */](tree: MosaicNode[T]): js.Array[T] = js.native
  def getNodeAtPath[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] | Null = js.native
  def getNodeAtPath[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] | Null = js.native
  def getOtherBranch(branch: MosaicBranch): MosaicBranch = js.native
  def getOtherDirection(direction: MosaicDirection): MosaicDirection = js.native
  def getPathToCorner(tree: MosaicNode[_], corner: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner): MosaicPath = js.native
  def isParent[T /* <: MosaicKey */](node: MosaicNode[T]): /* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean = js.native
  def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = js.native
}

