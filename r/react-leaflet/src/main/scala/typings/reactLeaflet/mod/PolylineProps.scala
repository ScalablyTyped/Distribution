package typings.reactLeaflet.mod

import typings.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LayerOptions because Already inherited
- typings.leaflet.mod.InteractiveLayerOptions because Already inherited
- typings.leaflet.mod.PathOptions because Already inherited
- typings.leaflet.mod.PolylineOptions because var conflicts: attribution, bubblingMouseEvents, className, color, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule, interactive, lineCap, lineJoin, opacity, pane, renderer, stroke, weight. Inlined noClip, smoothFactor */ @js.native
trait PolylineProps extends PathProps {
  
  var noClip: js.UndefOr[Boolean] = js.native
  
  var positions: js.Array[js.Array[LatLngExpression] | LatLngExpression] = js.native
  
  var smoothFactor: js.UndefOr[Double] = js.native
}
object PolylineProps {
  
  @scala.inline
  def apply(positions: js.Array[js.Array[LatLngExpression] | LatLngExpression]): PolylineProps = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineProps]
  }
  
  @scala.inline
  implicit class PolylinePropsMutableBuilder[Self <: PolylineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoClip(value: Boolean): Self = StObject.set(x, "noClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoClipUndefined: Self = StObject.set(x, "noClip", js.undefined)
    
    @scala.inline
    def setPositions(value: js.Array[js.Array[LatLngExpression] | LatLngExpression]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: (js.Array[LatLngExpression] | LatLngExpression)*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
  }
}
