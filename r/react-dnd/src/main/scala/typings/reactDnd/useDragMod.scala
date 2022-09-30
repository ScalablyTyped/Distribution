package typings.reactDnd

import typings.reactDnd.typesConnectorsMod.ConnectDragPreview
import typings.reactDnd.typesConnectorsMod.ConnectDragSource
import typings.reactDnd.typesMod.DragSourceHookSpec
import typings.reactDnd.typesMod.FactoryOrInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragMod {
  
  @JSImport("react-dnd/dist/hooks/useDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDrag[DragObject, DropResult, CollectedProps](specArg: FactoryOrInstance[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(specArg.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  inline def useDrag[DragObject, DropResult, CollectedProps](
    specArg: FactoryOrInstance[DragSourceHookSpec[DragObject, DropResult, CollectedProps]],
    deps: js.Array[Any]
  ): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(specArg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
}
