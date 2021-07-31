package typings.reactLeaflet.mod

import typings.leaflet.mod.FillRule
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LineCapShape
import typings.leaflet.mod.LineJoinShape
import typings.leaflet.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LayerOptions because var conflicts: attribution, pane. Inlined 
- typings.leaflet.mod.InteractiveLayerOptions because var conflicts: attribution, pane. Inlined bubblingMouseEvents, interactive
- typings.leaflet.mod.PathOptions because var conflicts: attribution, pane. Inlined lineCap, fillOpacity, stroke, lineJoin, fillColor, dashOffset, color, renderer, fillRule, fill, className, dashArray, opacity, weight
- typings.leaflet.mod.CircleMarkerOptions because var conflicts: attribution, pane. Inlined radius */ trait CircleProps
  extends StObject
     with MapLayerProps
     with PathEvents {
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  var center: LatLngExpression
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var dashArray: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var dashOffset: js.UndefOr[String] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var fillRule: js.UndefOr[FillRule] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var lineCap: js.UndefOr[LineCapShape] = js.undefined
  
  var lineJoin: js.UndefOr[LineJoinShape] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double]
  
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  var stroke: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object CircleProps {
  
  @scala.inline
  def apply(center: LatLngExpression): CircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
  
  @scala.inline
  implicit class CirclePropsMutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    @scala.inline
    def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashArray(value: String | js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
    
    @scala.inline
    def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value :_*))
    
    @scala.inline
    def setDashOffset(value: String): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashOffsetUndefined: Self = StObject.set(x, "dashOffset", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setLineCap(value: LineCapShape): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    @scala.inline
    def setLineJoin(value: LineJoinShape): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
