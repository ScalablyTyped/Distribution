package typings.seatsio.anon

import typings.seatsio.Seatsio.SelectionValidator
import typings.seatsio.seatsioStrings.lenient
import typings.seatsio.seatsioStrings.noOrphanSeats
import typings.seatsio.seatsioStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight
  extends StObject
     with SelectionValidator {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var highlight: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[lenient | strict] = js.undefined
  
  var `type`: noOrphanSeats
}
object Highlight {
  
  inline def apply(): Highlight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("noOrphanSeats")
    __obj.asInstanceOf[Highlight]
  }
  
  extension [Self <: Highlight](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setMode(value: lenient | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setType(value: noOrphanSeats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
