package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControlProps
  extends StObject
     with ControlOptions {
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
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
  }
}
