package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'displayTime'> */
trait PickImpldisplayTime extends StObject {
  
  var displayTime: Double
}
object PickImpldisplayTime {
  
  @scala.inline
  def apply(displayTime: Double): PickImpldisplayTime = {
    val __obj = js.Dynamic.literal(displayTime = displayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisplayTime]
  }
  
  @scala.inline
  implicit class PickImpldisplayTimeMutableBuilder[Self <: PickImpldisplayTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayTime(value: Double): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
  }
}
