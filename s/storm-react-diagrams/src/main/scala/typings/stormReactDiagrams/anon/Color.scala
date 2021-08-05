package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: String
  
  var curvyness: Double
  
  var id: String
  
  var labels: js.Array[OffsetX]
  
  var points: js.Array[Selected]
  
  var selected: Boolean
  
  var source: String
  
  var sourcePort: String
  
  var target: String
  
  var targetPort: String
  
  var `type`: String
  
  var width: Double
}
object Color {
  
  inline def apply(
    color: String,
    curvyness: Double,
    id: String,
    labels: js.Array[OffsetX],
    points: js.Array[Selected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String,
    width: Double
  ): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curvyness = curvyness.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourcePort = sourcePort.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPort = targetPort.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCurvyness(value: Double): Self = StObject.set(x, "curvyness", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[OffsetX]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: OffsetX*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setPoints(value: js.Array[Selected]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Selected*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourcePort(value: String): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetPort(value: String): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
