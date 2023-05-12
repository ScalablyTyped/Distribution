package typings.reactDndMultiBackend

import typings.reactDndPreview.distUsePreviewMod.usePreviewState
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUsePreviewMod {
  
  @JSImport("react-dnd-multi-backend/dist/hooks/usePreview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
}
