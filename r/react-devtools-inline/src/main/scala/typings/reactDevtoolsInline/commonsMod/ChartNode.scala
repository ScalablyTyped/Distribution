package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartNode extends StObject {
  
  var actualDuration: Double
  
  var didRender: Boolean
  
  var id: Double
  
  var label: String
  
  var name: String
  
  var offset: Double
  
  var selfDuration: Double
  
  var treeBaseDuration: Double
}
object ChartNode {
  
  inline def apply(
    actualDuration: Double,
    didRender: Boolean,
    id: Double,
    label: String,
    name: String,
    offset: Double,
    selfDuration: Double,
    treeBaseDuration: Double
  ): ChartNode = {
    val __obj = js.Dynamic.literal(actualDuration = actualDuration.asInstanceOf[js.Any], didRender = didRender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selfDuration = selfDuration.asInstanceOf[js.Any], treeBaseDuration = treeBaseDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartNode] (val x: Self) extends AnyVal {
    
    inline def setActualDuration(value: Double): Self = StObject.set(x, "actualDuration", value.asInstanceOf[js.Any])
    
    inline def setDidRender(value: Boolean): Self = StObject.set(x, "didRender", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSelfDuration(value: Double): Self = StObject.set(x, "selfDuration", value.asInstanceOf[js.Any])
    
    inline def setTreeBaseDuration(value: Double): Self = StObject.set(x, "treeBaseDuration", value.asInstanceOf[js.Any])
  }
}
