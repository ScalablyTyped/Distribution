package typings.reactDndPreview

import typings.reactDndPreview.distUsePreviewMod.usePreviewStateContent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextMod {
  
  @JSImport("react-dnd-preview/dist/Context", "Context")
  @js.native
  val Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  type PreviewState[T, El /* <: Element */] = usePreviewStateContent[T, El]
}
