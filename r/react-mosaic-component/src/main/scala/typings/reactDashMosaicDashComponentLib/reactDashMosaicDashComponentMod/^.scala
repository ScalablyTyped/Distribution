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
  val ExpandButtonFactory: reactLib.reactMod.ReactNs.ComponentFactory[
    reactDashMosaicDashComponentLib.libButtonsMosaicButtonMod.MosaicButtonProps, 
    reactDashMosaicDashComponentLib.libButtonsExpandButtonMod.ExpandButton[java.lang.String | scala.Double]
  ] = js.native
  val ModernMosaicContext: reactLib.reactMod.ReactNs.Context[
    reactDashMosaicDashComponentLib.libContextTypesMod.MosaicContext[java.lang.String | scala.Double]
  ] = js.native
  val ModernMosaicWindowContext: reactLib.reactMod.ReactNs.Context[
    stdLib.Pick[
      reactDashMosaicDashComponentLib.libContextTypesMod.MosaicWindowContext[java.lang.String | scala.Double], 
      reactDashMosaicDashComponentLib.reactDashMosaicDashComponentLibStrings.mosaicWindowActions
    ]
  ] = js.native
  val MosaicActionsPropType: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_Args]
  ] = js.native
  val MosaicContext: reactDashMosaicDashComponentLib.Anon_MosaicActions = js.native
  val MosaicDragType: reactDashMosaicDashComponentLib.Anon_WINDOW = js.native
  val MosaicWindowActionsPropType: propDashTypesLib.propDashTypesMod.Validator[
    propDashTypesLib.propDashTypesMod.InferProps[reactDashMosaicDashComponentLib.Anon_ArgsConnectDragSource]
  ] = js.native
  val MosaicWindowContext: reactDashMosaicDashComponentLib.Anon_MosaicActionsMosaicId = js.native
  val RemoveButtonFactory: reactLib.reactMod.ReactNs.ComponentFactory[
    reactDashMosaicDashComponentLib.libButtonsMosaicButtonMod.MosaicButtonProps, 
    reactDashMosaicDashComponentLib.libButtonsRemoveButtonMod.RemoveButton[java.lang.String | scala.Double]
  ] = js.native
  val ReplaceButtonFactory: reactLib.reactMod.ReactNs.ComponentFactory[
    reactDashMosaicDashComponentLib.libButtonsMosaicButtonMod.MosaicButtonProps, 
    reactDashMosaicDashComponentLib.libButtonsReplaceButtonMod.ReplaceButton[java.lang.String | scala.Double]
  ] = js.native
  val SeparatorFactory: reactLib.reactMod.ReactNs.ComponentFactory[js.Object, reactDashMosaicDashComponentLib.libButtonsSeparatorMod.Separator] = js.native
  val SplitButtonFactory: reactLib.reactMod.ReactNs.ComponentFactory[
    reactDashMosaicDashComponentLib.libButtonsMosaicButtonMod.MosaicButtonProps, 
    reactDashMosaicDashComponentLib.libButtonsSplitButtonMod.SplitButton[java.lang.String | scala.Double]
  ] = js.native
  def MosaicFactory[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    props: reactDashMosaicDashComponentLib.libMosaicMod.MosaicProps[T] with reactLib.reactMod.ReactNs.Attributes,
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[reactDashMosaicDashComponentLib.libMosaicMod.MosaicProps[T]] = js.native
  def MosaicWindowFactory[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    props: reactDashMosaicDashComponentLib.libMosaicWindowMod.MosaicWindowProps[T] with reactLib.reactMod.ReactNs.Attributes,
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[reactDashMosaicDashComponentLib.libMosaicWindowMod.MosaicWindowProps[T]] = js.native
  def MosaicZeroStateFactory[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](): reactLib.reactMod.ReactNs.ReactElement[reactDashMosaicDashComponentLib.libMosaicZeroStateMod.MosaicZeroStateProps[T]] = js.native
  def MosaicZeroStateFactory[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    props: reactDashMosaicDashComponentLib.libMosaicZeroStateMod.MosaicZeroStateProps[T] with reactLib.reactMod.ReactNs.Attributes,
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[reactDashMosaicDashComponentLib.libMosaicZeroStateMod.MosaicZeroStateProps[T]] = js.native
  def buildSpecFromUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](mosaicUpdate: reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdateSpec[T] = js.native
  def createBalancedTreeFromLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](leaves: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]]): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def createBalancedTreeFromLeaves[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    leaves: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T]],
    startDirection: reactDashMosaicDashComponentLib.libTypesMod.MosaicDirection
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null = js.native
  def createDefaultToolbarButton(
    title: java.lang.String,
    className: java.lang.String,
    onClick: js.Function1[/* event */ reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent], _]
  ): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def createDefaultToolbarButton(
    title: java.lang.String,
    className: java.lang.String,
    onClick: js.Function1[/* event */ reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent], _],
    text: java.lang.String
  ): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
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

