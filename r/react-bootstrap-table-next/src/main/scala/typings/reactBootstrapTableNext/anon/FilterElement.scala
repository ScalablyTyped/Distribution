package typings.reactBootstrapTableNext.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterElement extends StObject {
  
  var filterElement: Element
  
  var sortElement: Element
}
object FilterElement {
  
  inline def apply(filterElement: Element, sortElement: Element): FilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterElement]
  }
  
  extension [Self <: FilterElement](x: Self) {
    
    inline def setFilterElement(value: Element): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
    
    inline def setSortElement(value: Element): Self = StObject.set(x, "sortElement", value.asInstanceOf[js.Any])
  }
}
