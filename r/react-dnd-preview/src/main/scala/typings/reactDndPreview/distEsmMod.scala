package typings.reactDndPreview

import typings.reactDndPreview.distEsmContextMod.PreviewState
import typings.reactDndPreview.distEsmPreviewMod.PreviewProps
import typings.reactDndPreview.distEsmUsePreviewMod.usePreviewState
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("react-dnd-preview/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-preview/dist/esm", "Context")
  @js.native
  val Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  inline def Preview[T, El /* <: Element */](props: PreviewProps[T, El]): typings.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Preview")(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element | Null]
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
}
