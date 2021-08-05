package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.riotjsDomBindings.mod.IfBindingData
  - typings.riotjsDomBindings.mod.EachBindingData
  - typings.riotjsDomBindings.mod.SimpleBindingData
  - typings.riotjsDomBindings.mod.SlotBindingData
  - typings.riotjsDomBindings.mod.TagBindingData
*/
trait BindingData extends StObject
object BindingData {
  
  inline def EachBindingData(itemName: String, template: TemplateChunk[js.Any, js.Any]): typings.riotjsDomBindings.mod.EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.EachBindingData]
  }
  
  inline def IfBindingData(template: TemplateChunk[js.Any, js.Any]): typings.riotjsDomBindings.mod.IfBindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.IfBindingData]
  }
  
  inline def SimpleBindingData(expressions: js.Array[ExpressionData]): typings.riotjsDomBindings.mod.SimpleBindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.SimpleBindingData]
  }
  
  inline def SlotBindingData(bindings: BindingData, html: String, id: String): typings.riotjsDomBindings.mod.SlotBindingData = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.SlotBindingData]
  }
  
  inline def TagBindingData(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[js.Any, js.Any],
    slots: js.Array[SlotBindingData]
  ): typings.riotjsDomBindings.mod.TagBindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.TagBindingData]
  }
}
