package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl, 'hide'> */
@js.native
trait PickImplhide extends StObject {
  
  var hide: Double = js.native
}
object PickImplhide {
  
  @scala.inline
  def apply(hide: Double): PickImplhide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhide]
  }
  
  @scala.inline
  implicit class PickImplhideMutableBuilder[Self <: PickImplhide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
  }
}
