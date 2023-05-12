package typings.reactDndPreview

import typings.reactDndPreview.distContextMod.PreviewState
import typings.reactDndPreview.distPreviewMod.PreviewProps
import typings.reactDndPreview.distUsePreviewMod.usePreviewState
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-preview", "Context")
  @js.native
  val Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  inline def Preview[T, El /* <: Element */](props: PreviewProps[T, El]): typings.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Preview")(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element | Null]
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
}
