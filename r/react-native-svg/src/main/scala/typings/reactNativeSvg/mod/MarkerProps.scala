package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerProps extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var markerHeight: js.UndefOr[NumberProp] = js.undefined
  
  var markerUnits: js.UndefOr[MarkerUnits] = js.undefined
  
  var markerWidth: js.UndefOr[NumberProp] = js.undefined
  
  var orient: js.UndefOr[Orient | NumberProp] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var refX: js.UndefOr[NumberProp] = js.undefined
  
  var refY: js.UndefOr[NumberProp] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
}
object MarkerProps {
  
  @scala.inline
  def apply(): MarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerProps]
  }
  
  @scala.inline
  implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: NumberProp): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerUnits(value: MarkerUnits): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: NumberProp): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
    
    @scala.inline
    def setOrient(value: Orient | NumberProp): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setRefX(value: NumberProp): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
    
    @scala.inline
    def setRefY(value: NumberProp): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
