package typings.reactDnd

import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typings.reactDnd.distHooksTypesMod.FactoryOrInstance
import typings.reactDnd.distTypesConnectorsMod.ConnectDropTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseDropMod {
  
  @JSImport("react-dnd/dist/hooks/useDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDrop[DragObject, DropResult, CollectedProps](specArg: FactoryOrInstance[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]): js.Tuple2[CollectedProps, ConnectDropTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(specArg.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
  inline def useDrop[DragObject, DropResult, CollectedProps](
    specArg: FactoryOrInstance[DropTargetHookSpec[DragObject, DropResult, CollectedProps]],
    deps: js.Array[Any]
  ): js.Tuple2[CollectedProps, ConnectDropTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(specArg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
}
