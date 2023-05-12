package typings.reactDndMultiBackend

import typings.dndCore.distInterfacesMod.BackendFactory
import typings.dndMultiBackend.distTypesMod.Transition
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typings.reactDndMultiBackend.distComponentsDndProviderMod.DndProviderProps
import typings.reactDndMultiBackend.distHooksUseMultiDragMod.useMultiDragState
import typings.reactDndMultiBackend.distHooksUseMultiDropMod.useMultiDropState
import typings.reactDndPreview.distContextMod.PreviewState
import typings.reactDndPreview.distPreviewMod.PreviewProps
import typings.reactDndPreview.distUsePreviewMod.usePreviewState
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-multi-backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DndProvider(param0: DndProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DndProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-dnd-multi-backend", "HTML5DragTransition")
  @js.native
  val HTML5DragTransition: Transition = js.native
  
  @JSImport("react-dnd-multi-backend", "MouseTransition")
  @js.native
  val MouseTransition: Transition = js.native
  
  @JSImport("react-dnd-multi-backend", "MultiBackend")
  @js.native
  val MultiBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-multi-backend", "PointerTransition")
  @js.native
  val PointerTransition: Transition = js.native
  
  object Preview {
    
    inline def apply[T, El /* <: typings.std.Element */](props: PreviewProps[T, El]): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-dnd-multi-backend", "Preview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-multi-backend", "Preview.Context")
    @js.native
    def Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, typings.std.Element]]] = js.native
    inline def Context_=(x: Context[js.UndefOr[PreviewState[Any, typings.std.Element]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-dnd-multi-backend", "PreviewContext")
  @js.native
  val PreviewContext: Context[js.UndefOr[PreviewState[Any, typings.std.Element]]] = js.native
  
  @JSImport("react-dnd-multi-backend", "TouchTransition")
  @js.native
  val TouchTransition: Transition = js.native
  
  inline def createTransition(event: String, check: js.Function1[/* e */ Event, Boolean]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransition")(event.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Transition]
  
  inline def useMultiDrag[Drag, Drop, Props](spec: DragSourceHookSpec[Drag, Drop, Props]): useMultiDragState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDragState[Props]]
  
  inline def useMultiDrop[Drag, Drop, Props](spec: DropTargetHookSpec[Drag, Drop, Props]): useMultiDropState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDropState[Props]]
  
  inline def usePreview[T, El /* <: typings.std.Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
}
