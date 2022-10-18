package typings.reactDndMultiBackend

import typings.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typings.reactDndMultiBackend.distEsmHooksUseMultiDragMod.useMultiDragState
import typings.reactDndMultiBackend.distEsmHooksUseMultiDropMod.useMultiDropState
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmHooksMod {
  
  @JSImport("react-dnd-multi-backend/dist/esm/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMultiDrag[Drag, Drop, Props](spec: DragSourceHookSpec[Drag, Drop, Props]): useMultiDragState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDragState[Props]]
  
  inline def useMultiDrop[Drag, Drop, Props](spec: DropTargetHookSpec[Drag, Drop, Props]): useMultiDropState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDropState[Props]]
  
  inline def usePreview[T, El /* <: Element */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[Any]
}
