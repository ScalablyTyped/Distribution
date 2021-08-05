package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IStyleType.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllSelected extends StObject {
  
  var allSelected: Header
  
  var allSelectedHover: Header
  
  var normal: Header
  
  var normalHover: Header
  
  var partSelected: Header
  
  var partSelectedHover: Header
}
object AllSelected {
  
  inline def apply(
    allSelected: Header,
    allSelectedHover: Header,
    normal: Header,
    normalHover: Header,
    partSelected: Header,
    partSelectedHover: Header
  ): AllSelected = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], allSelectedHover = allSelectedHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any], partSelected = partSelected.asInstanceOf[js.Any], partSelectedHover = partSelectedHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSelected]
  }
  
  extension [Self <: AllSelected](x: Self) {
    
    inline def setAllSelected(value: Header): Self = StObject.set(x, "allSelected", value.asInstanceOf[js.Any])
    
    inline def setAllSelectedHover(value: Header): Self = StObject.set(x, "allSelectedHover", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: Header): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalHover(value: Header): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
    
    inline def setPartSelected(value: Header): Self = StObject.set(x, "partSelected", value.asInstanceOf[js.Any])
    
    inline def setPartSelectedHover(value: Header): Self = StObject.set(x, "partSelectedHover", value.asInstanceOf[js.Any])
  }
}
