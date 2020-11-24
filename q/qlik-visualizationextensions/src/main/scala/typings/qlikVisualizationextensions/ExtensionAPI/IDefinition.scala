package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.accordion
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
@js.native
trait IDefinition extends js.Object {
  
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
  implicit class IDefinitionOps[Self <: IDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: accordion): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: IItems): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: items): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
