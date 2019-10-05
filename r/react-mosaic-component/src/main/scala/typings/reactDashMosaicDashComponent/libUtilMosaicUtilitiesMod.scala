package typings.reactDashMosaicDashComponent

import typings.reactDashMosaicDashComponent.libTypesMod.MosaicBranch
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicDirection
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicPath
import typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/util/mosaicUtilities", JSImport.Namespace)
@js.native
object libUtilMosaicUtilitiesMod extends js.Object {
  @js.native
  sealed trait Corner extends js.Object
  
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]]): MosaicNode[T] | Null = js.native
  def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]], startDirection: MosaicDirection): MosaicNode[T] | Null = js.native
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
  @js.native
  object Corner extends js.Object {
    @js.native
    sealed trait BOTTOM_LEFT extends Corner
    
    @js.native
    sealed trait BOTTOM_RIGHT extends Corner
    
    @js.native
    sealed trait TOP_LEFT extends Corner
    
    @js.native
    sealed trait TOP_RIGHT extends Corner
    
    /* 3 */ val BOTTOM_LEFT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_LEFT with Double = js.native
    /* 4 */ val BOTTOM_RIGHT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_RIGHT with Double = js.native
    /* 1 */ val TOP_LEFT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.TOP_LEFT with Double = js.native
    /* 2 */ val TOP_RIGHT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.TOP_RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Corner with Double] = js.native
  }
  
}

