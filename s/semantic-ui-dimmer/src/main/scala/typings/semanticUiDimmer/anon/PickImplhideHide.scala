package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'hide'> */
trait PickImplhideHide extends StObject {
  
  var hide: String
}
object PickImplhideHide {
  
  @scala.inline
  def apply(hide: String): PickImplhideHide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideHide]
  }
  
  @scala.inline
  implicit class PickImplhideHideMutableBuilder[Self <: PickImplhideHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
  }
}
