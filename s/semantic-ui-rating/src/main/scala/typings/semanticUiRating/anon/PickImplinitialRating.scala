package typings.semanticUiRating.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'initialRating'> */
trait PickImplinitialRating extends StObject {
  
  var initialRating: Double
}
object PickImplinitialRating {
  
  @scala.inline
  def apply(initialRating: Double): PickImplinitialRating = {
    val __obj = js.Dynamic.literal(initialRating = initialRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinitialRating]
  }
  
  @scala.inline
  implicit class PickImplinitialRatingMutableBuilder[Self <: PickImplinitialRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRating(value: Double): Self = StObject.set(x, "initialRating", value.asInstanceOf[js.Any])
  }
}
