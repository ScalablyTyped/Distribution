package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labels extends StObject {
  
  var id: String = js.native
  
  var labels: js.Array[OffsetX] = js.native
  
  var points: js.Array[Selected] = js.native
  
  var selected: Boolean = js.native
  
  var source: String = js.native
  
  var sourcePort: String = js.native
  
  var target: String = js.native
  
  var targetPort: String = js.native
  
  var `type`: String = js.native
}
object Labels {
  
  @scala.inline
  def apply(
    id: String,
    labels: js.Array[OffsetX],
    points: js.Array[Selected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String
  ): Labels = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourcePort = sourcePort.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPort = targetPort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[OffsetX]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: OffsetX*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Selected]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Selected*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePort(value: String): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPort(value: String): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
