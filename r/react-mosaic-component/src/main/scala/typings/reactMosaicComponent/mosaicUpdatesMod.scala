package typings.reactMosaicComponent

import typings.reactMosaicComponent.internalTypesMod.MosaicDropTargetPosition
import typings.reactMosaicComponent.typesMod.MosaicKey
import typings.reactMosaicComponent.typesMod.MosaicNode
import typings.reactMosaicComponent.typesMod.MosaicPath
import typings.reactMosaicComponent.typesMod.MosaicUpdate
import typings.reactMosaicComponent.typesMod.MosaicUpdateSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mosaicUpdatesMod {
  
  @JSImport("react-mosaic-component/lib/util/mosaicUpdates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildSpecFromUpdate[T /* <: MosaicKey */](mosaicUpdate: MosaicUpdate[T]): MosaicUpdateSpec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSpecFromUpdate")(mosaicUpdate.asInstanceOf[js.Any]).asInstanceOf[MosaicUpdateSpec[T]]
  
  inline def createDragToUpdates[T /* <: MosaicKey */](
    root: MosaicNode[T],
    sourcePath: MosaicPath,
    destinationPath: MosaicPath,
    position: MosaicDropTargetPosition
  ): js.Array[MosaicUpdate[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragToUpdates")(root.asInstanceOf[js.Any], sourcePath.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[MosaicUpdate[T]]]
  
  inline def createExpandUpdate[T /* <: MosaicKey */](path: MosaicPath, percentage: Double): MosaicUpdate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createExpandUpdate")(path.asInstanceOf[js.Any], percentage.asInstanceOf[js.Any])).asInstanceOf[MosaicUpdate[T]]
  
  inline def createHideUpdate[T /* <: MosaicKey */](path: MosaicPath): MosaicUpdate[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHideUpdate")(path.asInstanceOf[js.Any]).asInstanceOf[MosaicUpdate[T]]
  
  inline def createRemoveUpdate[T /* <: MosaicKey */](root: Null, path: MosaicPath): MosaicUpdate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveUpdate")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicUpdate[T]]
  inline def createRemoveUpdate[T /* <: MosaicKey */](root: MosaicNode[T], path: MosaicPath): MosaicUpdate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveUpdate")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicUpdate[T]]
  
  inline def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTree")(root.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T]]
}
