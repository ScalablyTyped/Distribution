package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  leaflet :react-leaflet.react-leaflet.LeafletContext | undefined} & leaflet.leaflet.ControlOptions */
@js.native
trait MapControlProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var position: js.UndefOr[ControlPosition] = js.native
}
object MapControlProps {
  
  @scala.inline
  def apply(): MapControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlProps]
  }
  
  @scala.inline
  implicit class MapControlPropsMutableBuilder[Self <: MapControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
