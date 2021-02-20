package typings.riotjsDomBindings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.riotjsDomBindings.mod.AttributeExpressionData
    - typings.riotjsDomBindings.mod.EventExpressionData
    - typings.riotjsDomBindings.mod.TextExpressionData
    - typings.riotjsDomBindings.mod.ValueExpressionData
  */
  type ExpressionData = typings.riotjsDomBindings.mod._ExpressionData | typings.riotjsDomBindings.mod.ValueExpressionData
  
  type ValueExpressionData = typings.riotjsDomBindings.mod.BaseExpressionData
  
  @scala.inline
  def bindingTypes: typings.riotjsDomBindings.mod.BindingType = typings.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bindingTypes").asInstanceOf[typings.riotjsDomBindings.mod.BindingType]
  
  @scala.inline
  def createBinding(root: typings.std.HTMLElement, binding: typings.riotjsDomBindings.mod.BindingData): typings.riotjsDomBindings.mod.Binding[_, _] = (typings.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBinding")(root.asInstanceOf[js.Any], binding.asInstanceOf[js.Any])).asInstanceOf[typings.riotjsDomBindings.mod.Binding[_, _]]
  @scala.inline
  def createBinding(
    root: typings.std.HTMLElement,
    binding: typings.riotjsDomBindings.mod.BindingData,
    templateTagOffset: scala.Double
  ): typings.riotjsDomBindings.mod.Binding[_, _] = (typings.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBinding")(root.asInstanceOf[js.Any], binding.asInstanceOf[js.Any], templateTagOffset.asInstanceOf[js.Any])).asInstanceOf[typings.riotjsDomBindings.mod.Binding[_, _]]
  
  @scala.inline
  def createExpression(node: typings.std.HTMLElement, expression: typings.riotjsDomBindings.mod.ExpressionData): typings.riotjsDomBindings.mod.Expression[_] = (typings.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createExpression")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.riotjsDomBindings.mod.Expression[_]]
  
  @scala.inline
  def expressionTypes: typings.riotjsDomBindings.mod.ExpressionType = typings.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].selectDynamic("expressionTypes").asInstanceOf[typings.riotjsDomBindings.mod.ExpressionType]
  
  @scala.inline
  def template(template: java.lang.String, bindings: js.Array[typings.riotjsDomBindings.mod.BindingData]): typings.riotjsDomBindings.mod.TemplateChunk[_, _] = (typings.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typings.riotjsDomBindings.mod.TemplateChunk[_, _]]
}
