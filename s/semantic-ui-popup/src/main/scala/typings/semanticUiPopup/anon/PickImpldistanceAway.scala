package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'distanceAway'> */
trait PickImpldistanceAway extends StObject {
  
  var distanceAway: Double
}
object PickImpldistanceAway {
  
  inline def apply(distanceAway: Double): PickImpldistanceAway = {
    val __obj = js.Dynamic.literal(distanceAway = distanceAway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldistanceAway]
  }
  
  extension [Self <: PickImpldistanceAway](x: Self) {
    
    inline def setDistanceAway(value: Double): Self = StObject.set(x, "distanceAway", value.asInstanceOf[js.Any])
  }
}
