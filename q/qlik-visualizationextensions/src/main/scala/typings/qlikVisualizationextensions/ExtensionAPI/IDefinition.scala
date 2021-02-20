package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.accordion
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
@js.native
trait IDefinition extends StObject {
  
  var component: accordion = js.native
  
  var items: IItems = js.native
  
  var `type`: items = js.native
}
object IDefinition {
  
  @scala.inline
  def apply(component: accordion, items: IItems, `type`: items): IDefinition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefinition]
  }
  
  @scala.inline
  implicit class IDefinitionMutableBuilder[Self <: IDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: accordion): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: IItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
