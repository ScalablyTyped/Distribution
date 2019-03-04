package typings
package reactDashMosaicDashComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/util/mosaicUpdates", JSImport.Namespace)
@js.native
object libUtilMosaicUpdatesMod extends js.Object {
  def buildSpecFromUpdate[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](mosaicUpdate: reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]): reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdateSpec[T] = js.native
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
  def updateTree[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    root: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T],
    updates: js.Array[reactDashMosaicDashComponentLib.libTypesMod.MosaicUpdate[T]]
  ): reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = js.native
}

