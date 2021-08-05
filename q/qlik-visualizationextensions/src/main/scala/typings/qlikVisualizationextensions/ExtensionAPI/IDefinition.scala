package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.accordion
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
trait IDefinition extends StObject {
  
  var component: accordion
  
  var items: IItems
  
  var `type`: items
}
object IDefinition {
  
  inline def apply(items: IItems): IDefinition = {
    val __obj = js.Dynamic.literal(component = "accordion", items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("items")
    __obj.asInstanceOf[IDefinition]
  }
  
  extension [Self <: IDefinition](x: Self) {
    
    inline def setComponent(value: accordion): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
