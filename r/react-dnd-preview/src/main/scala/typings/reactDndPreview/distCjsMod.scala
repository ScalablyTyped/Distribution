package typings.reactDndPreview

import typings.reactDndPreview.distCjsContextMod.PreviewState
import typings.reactDndPreview.distCjsPreviewMod.PreviewProps
import typings.reactDndPreview.distCjsUsePreviewMod.usePreviewState
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  @JSImport("react-dnd-preview/dist/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-preview/dist/cjs", "Context")
  @js.native
  val Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  inline def Preview[T, El /* <: Element */](props: PreviewProps[T, El]): typings.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Preview")(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element | Null]
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
}
