package typings.reactDndPreview

import typings.reactDndPreview.usePreviewMod.usePreviewStateContent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("react-dnd-preview/dist/cjs/Context", "Context")
  @js.native
  val Context: typings.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  type PreviewState[T, El /* <: Element */] = usePreviewStateContent[T, El]
}
