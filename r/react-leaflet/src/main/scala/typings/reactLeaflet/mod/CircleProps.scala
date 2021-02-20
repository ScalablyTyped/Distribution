package typings.reactLeaflet.mod

import typings.leaflet.mod.CircleMarkerOptions
import typings.leaflet.mod.LatLngExpression
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait CircleProps
  extends CircleMarkerOptions
     with PathEvents {
  
  var center: LatLngExpression = js.native
  
  var children: js.UndefOr[Children] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  @JSName("radius")
  var radius_CircleProps: Double = js.native
}
object CircleProps {
  
  @scala.inline
  def apply(center: LatLngExpression, radius: Double): CircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
  
  @scala.inline
  implicit class CirclePropsMutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
