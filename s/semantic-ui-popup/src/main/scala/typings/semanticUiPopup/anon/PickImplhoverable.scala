package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'hoverable'> */
@js.native
trait PickImplhoverable extends StObject {
  
  var hoverable: Boolean = js.native
}
object PickImplhoverable {
  
  @scala.inline
  def apply(hoverable: Boolean): PickImplhoverable = {
    val __obj = js.Dynamic.literal(hoverable = hoverable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhoverable]
  }
  
  @scala.inline
  implicit class PickImplhoverableMutableBuilder[Self <: PickImplhoverable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
  }
}
