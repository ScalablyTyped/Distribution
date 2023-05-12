package typings.reactDndMultiBackend

import typings.react.mod.Context
import typings.reactDndPreview.distContextMod.PreviewState
import typings.reactDndPreview.distPreviewMod.PreviewProps
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsPreviewMod {
  
  object Preview {
    
    inline def apply[T, El /* <: Element */](props: PreviewProps[T, El]): typings.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element | Null]
    
    @JSImport("react-dnd-multi-backend/dist/components/Preview", "Preview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-multi-backend/dist/components/Preview", "Preview.Context")
    @js.native
    def Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
    inline def Context_=(x: Context[js.UndefOr[PreviewState[Any, Element]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-dnd-multi-backend/dist/components/Preview", "PreviewContext")
  @js.native
  val PreviewContext: Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
}
