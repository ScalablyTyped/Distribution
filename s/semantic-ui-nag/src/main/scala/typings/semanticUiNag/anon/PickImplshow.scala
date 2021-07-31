package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, 'show'> */
trait PickImplshow extends StObject {
  
  var show: String
}
object PickImplshow {
  
  @scala.inline
  def apply(show: String): PickImplshow = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshow]
  }
  
  @scala.inline
  implicit class PickImplshowMutableBuilder[Self <: PickImplshow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
