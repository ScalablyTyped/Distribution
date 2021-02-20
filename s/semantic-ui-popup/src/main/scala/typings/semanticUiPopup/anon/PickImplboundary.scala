package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'boundary'> */
@js.native
trait PickImplboundary extends StObject {
  
  var boundary: String | JQuery = js.native
}
object PickImplboundary {
  
  @scala.inline
  def apply(boundary: String | JQuery): PickImplboundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplboundary]
  }
  
  @scala.inline
  implicit class PickImplboundaryMutableBuilder[Self <: PickImplboundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundary(value: String | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
  }
}
