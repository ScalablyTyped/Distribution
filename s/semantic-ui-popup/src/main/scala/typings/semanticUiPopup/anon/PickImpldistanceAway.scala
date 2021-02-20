package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'distanceAway'> */
@js.native
trait PickImpldistanceAway extends StObject {
  
  var distanceAway: Double = js.native
}
object PickImpldistanceAway {
  
  @scala.inline
  def apply(distanceAway: Double): PickImpldistanceAway = {
    val __obj = js.Dynamic.literal(distanceAway = distanceAway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldistanceAway]
  }
  
  @scala.inline
  implicit class PickImpldistanceAwayMutableBuilder[Self <: PickImpldistanceAway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceAway(value: Double): Self = StObject.set(x, "distanceAway", value.asInstanceOf[js.Any])
  }
}
