package typings.reactDndMultiBackend

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typings.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typings.reactDndMultiBackend.distCjsComponentsDndProviderMod.DndProviderProps
import typings.reactDndMultiBackend.distCjsHooksUseMultiDragMod.useMultiDragState
import typings.reactDndMultiBackend.distCjsHooksUseMultiDropMod.useMultiDropState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  @JSImport("react-dnd-multi-backend/dist/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DndProvider(param0: DndProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DndProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object Preview {
    
    inline def apply[T, El /* <: typings.std.Element */](
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewProps<T, El> */ Any
    ): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-dnd-multi-backend/dist/cjs", "Preview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-multi-backend/dist/cjs", "Preview.Context")
    @js.native
    def Context: typings.react.mod.Context[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewState<unknown, Element> */ Any
        ]
      ] = js.native
    inline def Context_=(
      x: Context[
          js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewState<unknown, Element> */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  }
  
  inline def useMultiDrag[Drag, Drop, Props](spec: DragSourceHookSpec[Drag, Drop, Props]): useMultiDragState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDragState[Props]]
  
  inline def useMultiDrop[Drag, Drop, Props](spec: DropTargetHookSpec[Drag, Drop, Props]): useMultiDropState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDropState[Props]]
  
  inline def usePreview[T, El /* <: typings.std.Element */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[Any]
}
