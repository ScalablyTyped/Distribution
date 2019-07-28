package typings.reactDashMosaicDashComponent

import typings.reactDashMosaicDashComponent.libInternalTypesMod.MosaicDropTargetPosition
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicPath
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdate
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicUpdateSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/util/mosaicUpdates", JSImport.Namespace)
@js.native
object libUtilMosaicUpdatesMod extends js.Object {
  def buildSpecFromUpdate[T /* <: MosaicKey */](mosaicUpdate: MosaicUpdate[T]): MosaicUpdateSpec[T] = js.native
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
  def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = js.native
}

