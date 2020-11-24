package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.riotjsDomBindings.mod.IfBindingData
  - typings.riotjsDomBindings.mod.EachBindingData
  - typings.riotjsDomBindings.mod.SimpleBindingData
  - typings.riotjsDomBindings.mod.SlotBindingData
  - typings.riotjsDomBindings.mod.TagBindingData
*/
trait BindingData extends js.Object
object BindingData {
  
  @scala.inline
  def TagBindingData(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[_, _],
    slots: js.Array[SlotBindingData]
  ): BindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  
  @scala.inline
  def SlotBindingData(bindings: BindingData, html: String, id: String): BindingData = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  
  @scala.inline
  def IfBindingData(template: TemplateChunk[_, _]): BindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  
  @scala.inline
  def EachBindingData(itemName: String, template: TemplateChunk[_, _]): BindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  
  @scala.inline
  def SimpleBindingData(expressions: js.Array[ExpressionData]): BindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
}
