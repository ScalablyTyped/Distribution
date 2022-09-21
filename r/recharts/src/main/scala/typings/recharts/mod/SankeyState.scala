package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyState extends StObject {
  
  var activeElement: js.UndefOr[Any] = js.undefined
  
  var activeElementType: js.UndefOr[Any] = js.undefined
  
  var isTooltipActive: js.UndefOr[Boolean] = js.undefined
  
  var links: js.UndefOr[Any] = js.undefined
  
  var nodes: js.UndefOr[Any] = js.undefined
}
object SankeyState {
  
  inline def apply(): SankeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyState]
  }
  
  extension [Self <: SankeyState](x: Self) {
    
    inline def setActiveElement(value: Any): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
    
    inline def setActiveElementType(value: Any): Self = StObject.set(x, "activeElementType", value.asInstanceOf[js.Any])
    
    inline def setActiveElementTypeUndefined: Self = StObject.set(x, "activeElementType", js.undefined)
    
    inline def setActiveElementUndefined: Self = StObject.set(x, "activeElement", js.undefined)
    
    inline def setIsTooltipActive(value: Boolean): Self = StObject.set(x, "isTooltipActive", value.asInstanceOf[js.Any])
    
    inline def setIsTooltipActiveUndefined: Self = StObject.set(x, "isTooltipActive", js.undefined)
    
    inline def setLinks(value: Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
  }
}
