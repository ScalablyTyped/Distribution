package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Depth extends StObject {
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var isComponent: js.UndefOr[Boolean] = js.undefined
  
  var isExpandable: js.UndefOr[Boolean] = js.undefined
  
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}
object Depth {
  
  inline def apply(): Depth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Depth]
  }
  
  extension [Self <: Depth](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setIsComponentUndefined: Self = StObject.set(x, "isComponent", js.undefined)
    
    inline def setIsExpandable(value: Boolean): Self = StObject.set(x, "isExpandable", value.asInstanceOf[js.Any])
    
    inline def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
  }
}
