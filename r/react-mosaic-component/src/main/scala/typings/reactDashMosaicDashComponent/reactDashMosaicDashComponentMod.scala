package typings.reactDashMosaicDashComponent

import typings.react.NativeMouseEvent
import typings.react.reactMod.Context
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashMosaicDashComponent.libInternalTypesMod.MosaicDropTargetPosition
import typings.reactDashMosaicDashComponent.libMosaicMod.MosaicProps
import typings.reactDashMosaicDashComponent.libMosaicMod.MosaicState
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicBranch
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicDirection
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicPath
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdate
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdateSpec
import typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component", JSImport.Namespace)
@js.native
object reactDashMosaicDashComponentMod extends js.Object {
  @js.native
  class ExpandButton ()
    extends typings.reactDashMosaicDashComponent.libButtonsExpandButtonMod.ExpandButton
  
  @js.native
  class Mosaic[T /* <: MosaicKey */] ()
    extends typings.reactDashMosaicDashComponent.libMosaicMod.MosaicWithoutDragDropContext[T]
  
  @js.native
  class MosaicWindow[T /* <: MosaicKey */] ()
    extends typings.reactDashMosaicDashComponent.libMosaicWindowMod.MosaicWindow[T]
  
  @js.native
  class MosaicWithoutDragDropContext[T /* <: MosaicKey */] ()
    extends typings.reactDashMosaicDashComponent.libMosaicMod.MosaicWithoutDragDropContext[T]
  
  @js.native
  class MosaicZeroState[T /* <: MosaicKey */] ()
    extends typings.reactDashMosaicDashComponent.libMosaicZeroStateMod.MosaicZeroState[T]
  
  @js.native
  class RemoveButton ()
    extends typings.reactDashMosaicDashComponent.libButtonsRemoveButtonMod.RemoveButton
  
  @js.native
  class ReplaceButton ()
    extends typings.reactDashMosaicDashComponent.libButtonsReplaceButtonMod.ReplaceButton
  
  @js.native
  class Separator ()
    extends typings.reactDashMosaicDashComponent.libButtonsSeparatorMod.Separator
  
  @js.native
  class SplitButton ()
    extends typings.reactDashMosaicDashComponent.libButtonsSplitButtonMod.SplitButton
  
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
  def getPathToCorner(tree: MosaicNode[_], corner: Corner): MosaicPath = js.native
  def isParent[T /* <: MosaicKey */](node: MosaicNode[T]): /* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean = js.native
  def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = js.native
  @js.native
  object Corner extends js.Object {
    /* 3 */ val BOTTOM_LEFT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_LEFT with Double = js.native
    /* 4 */ val BOTTOM_RIGHT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_RIGHT with Double = js.native
    /* 1 */ val TOP_LEFT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.TOP_LEFT with Double = js.native
    /* 2 */ val TOP_RIGHT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.TOP_RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object ExpandButton extends js.Object {
    var contextType: Context[typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext] = js.native
  }
  
  @js.native
  object MosaicDragType extends js.Object {
    var WINDOW: String = js.native
  }
  
  /* static members */
  @js.native
  object MosaicWithoutDragDropContext extends js.Object {
    var defaultProps: Anon_ClassName = js.native
    def getDerivedStateFromProps(nextProps: MosaicProps[MosaicKey], prevState: MosaicState[MosaicKey]): Partial[MosaicState[MosaicKey]] | Null = js.native
  }
  
  /* static members */
  @js.native
  object MosaicZeroState extends js.Object {
    var contextType: Context[
        typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicContext[String | Double]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object RemoveButton extends js.Object {
    var contextType: Context[typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext] = js.native
  }
  
  /* static members */
  @js.native
  object ReplaceButton extends js.Object {
    var contextType: Context[typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext] = js.native
  }
  
  /* static members */
  @js.native
  object SplitButton extends js.Object {
    var contextType: Context[typings.reactDashMosaicDashComponent.libContextTypesMod.MosaicWindowContext] = js.native
  }
  
}

