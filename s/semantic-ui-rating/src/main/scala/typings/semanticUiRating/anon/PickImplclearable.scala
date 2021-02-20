package typings.semanticUiRating.anon

import typings.semanticUiRating.semanticUiRatingStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'clearable'> */
@js.native
trait PickImplclearable extends StObject {
  
  var clearable: auto | Boolean = js.native
}
object PickImplclearable {
  
  @scala.inline
  def apply(clearable: auto | Boolean): PickImplclearable = {
    val __obj = js.Dynamic.literal(clearable = clearable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclearable]
  }
  
  @scala.inline
  implicit class PickImplclearableMutableBuilder[Self <: PickImplclearable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearable(value: auto | Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
  }
}
