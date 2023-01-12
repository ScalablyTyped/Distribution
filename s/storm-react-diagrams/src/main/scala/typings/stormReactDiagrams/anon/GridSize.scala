package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSize extends StObject {
  
  var gridSize: Double
  
  var id: String
  
  var links: js.Array[Labels]
  
  var nodes: js.Array[Ports]
  
  var offsetX: Double
  
  var offsetY: Double
  
  var zoom: Double
}
object GridSize {
  
  inline def apply(
    gridSize: Double,
    id: String,
    links: js.Array[Labels],
    nodes: js.Array[Ports],
    offsetX: Double,
    offsetY: Double,
    zoom: Double
  ): GridSize = {
    val __obj = js.Dynamic.literal(gridSize = gridSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridSize] (val x: Self) extends AnyVal {
    
    inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[Labels]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: Labels*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[Ports]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Ports*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
