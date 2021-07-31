package typings.semanticUiRating.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'interactive'> */
trait PickImplinteractive extends StObject {
  
  var interactive: Boolean
}
object PickImplinteractive {
  
  @scala.inline
  def apply(interactive: Boolean): PickImplinteractive = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinteractive]
  }
  
  @scala.inline
  implicit class PickImplinteractiveMutableBuilder[Self <: PickImplinteractive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
