package typings.simonwepSelectionJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrolling extends StObject {
  
  var manualSpeed: Double
  
  var speedDivider: Double
}
object Scrolling {
  
  inline def apply(manualSpeed: Double, speedDivider: Double): Scrolling = {
    val __obj = js.Dynamic.literal(manualSpeed = manualSpeed.asInstanceOf[js.Any], speedDivider = speedDivider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scrolling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scrolling] (val x: Self) extends AnyVal {
    
    inline def setManualSpeed(value: Double): Self = StObject.set(x, "manualSpeed", value.asInstanceOf[js.Any])
    
    inline def setSpeedDivider(value: Double): Self = StObject.set(x, "speedDivider", value.asInstanceOf[js.Any])
  }
}
