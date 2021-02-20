package typings.seatsio.anon

import typings.seatsio.Seatsio.SelectionValidator
import typings.seatsio.seatsioStrings.lenient
import typings.seatsio.seatsioStrings.noOrphanSeats
import typings.seatsio.seatsioStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlight extends SelectionValidator {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[lenient | strict] = js.native
  
  var `type`: noOrphanSeats = js.native
}
object Highlight {
  
  @scala.inline
  def apply(`type`: noOrphanSeats): Highlight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit class HighlightMutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setMode(value: lenient | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setType(value: noOrphanSeats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
