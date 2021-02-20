package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet.leaflet.Control.AttributionOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait AttributionControlProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var position: js.UndefOr[ControlPosition] = js.native
  
  var prefix: js.UndefOr[String | Boolean] = js.native
}
object AttributionControlProps {
  
  @scala.inline
  def apply(): AttributionControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributionControlProps]
  }
  
  @scala.inline
  implicit class AttributionControlPropsMutableBuilder[Self <: AttributionControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPrefix(value: String | Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
