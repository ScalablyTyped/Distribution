package typings.semanticUiRating.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'hover'> */
trait PickImplhover extends StObject {
  
  var hover: String
}
object PickImplhover {
  
  @scala.inline
  def apply(hover: String): PickImplhover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhover]
  }
  
  @scala.inline
  implicit class PickImplhoverMutableBuilder[Self <: PickImplhover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
  }
}
