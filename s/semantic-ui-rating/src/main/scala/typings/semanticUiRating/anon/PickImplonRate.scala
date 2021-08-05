package typings.semanticUiRating.anon

import typings.semanticUiRating.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'onRate'> */
trait PickImplonRate extends StObject {
  
  def onRate(value: Double): Unit
  @JSName("onRate")
  var onRate_Original: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
}
object PickImplonRate {
  
  inline def apply(onRate: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]): PickImplonRate = {
    val __obj = js.Dynamic.literal(onRate = onRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRate]
  }
  
  extension [Self <: PickImplonRate](x: Self) {
    
    inline def setOnRate(value: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]): Self = StObject.set(x, "onRate", value.asInstanceOf[js.Any])
  }
}
