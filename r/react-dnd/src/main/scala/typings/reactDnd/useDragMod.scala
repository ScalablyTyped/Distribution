package typings.reactDnd

import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectDragSource
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DragSourceHookSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragMod {
  
  @JSImport("react-dnd/lib/hooks/useDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
}
