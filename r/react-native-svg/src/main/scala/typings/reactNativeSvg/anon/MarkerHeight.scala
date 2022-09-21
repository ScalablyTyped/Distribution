package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerHeight extends StObject {
  
  var markerHeight: Double
  
  var markerUnits: String
  
  var markerWidth: Double
  
  var orient: String
  
  var refX: Double
  
  var refY: Double
}
object MarkerHeight {
  
  inline def apply(
    markerHeight: Double,
    markerUnits: String,
    markerWidth: Double,
    orient: String,
    refX: Double,
    refY: Double
  ): MarkerHeight = {
    val __obj = js.Dynamic.literal(markerHeight = markerHeight.asInstanceOf[js.Any], markerUnits = markerUnits.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], refX = refX.asInstanceOf[js.Any], refY = refY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerHeight]
  }
  
  extension [Self <: MarkerHeight](x: Self) {
    
    inline def setMarkerHeight(value: Double): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    inline def setMarkerUnits(value: String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    inline def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setRefX(value: Double): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    inline def setRefY(value: Double): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
  }
}
