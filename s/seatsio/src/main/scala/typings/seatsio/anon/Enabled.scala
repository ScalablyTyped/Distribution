package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: Boolean
  
  var multiSelect: Boolean
  
  var zoomOnSelect: Boolean
}
object Enabled {
  
  inline def apply(enabled: Boolean, multiSelect: Boolean, zoomOnSelect: Boolean): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], zoomOnSelect = zoomOnSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setZoomOnSelect(value: Boolean): Self = StObject.set(x, "zoomOnSelect", value.asInstanceOf[js.Any])
  }
}
