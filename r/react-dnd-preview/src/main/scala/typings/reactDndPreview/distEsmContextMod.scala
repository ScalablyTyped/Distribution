package typings.reactDndPreview

import typings.reactDndPreview.distEsmUsePreviewMod.usePreviewStateContent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContextMod {
  
  @JSImport("react-dnd-preview/dist/esm/Context", "Context")
  @js.native
  val Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  type PreviewState[T, El /* <: Element */] = usePreviewStateContent[T, El]
}
