package typings.reactDnd

import typings.reactDnd.connectorsMod.ConnectDropTarget
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DropTargetHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDropMod {
  
  @JSImport("react-dnd/lib/hooks/useDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
}
