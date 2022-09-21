package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BindingData[Scope] extends StObject
object _BindingData {
  
  inline def IfBindingData[Scope](template: TemplateChunk[Scope, Any]): typings.riotjsDomBindings.mod.IfBindingData[Scope] = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.IfBindingData[Scope]]
  }
  
  inline def SimpleBindingData[Scope](expressions: js.Array[ExpressionData[Scope]]): typings.riotjsDomBindings.mod.SimpleBindingData[Scope] = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.SimpleBindingData[Scope]]
  }
  
  inline def SlotBindingData[Scope](bindings: js.Array[BindingData[Scope]], html: String, id: String): typings.riotjsDomBindings.mod.SlotBindingData[Scope] = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.SlotBindingData[Scope]]
  }
  
  inline def TagBindingData[Scope](
    attributes: js.Array[AttributeExpressionData[Scope]],
    getComponent: String => TemplateChunk[Scope, Any],
    slots: js.Array[SlotBindingData[Scope]]
  ): typings.riotjsDomBindings.mod.TagBindingData[Scope] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.riotjsDomBindings.mod.TagBindingData[Scope]]
  }
}
