package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.TopLevel
import typings.riotjsDomBindings.mod.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bindingTypes: BindingType = ^.asInstanceOf[js.Dynamic].selectDynamic("bindingTypes").asInstanceOf[BindingType]

inline def createBinding[Scope](root: HTMLElement, binding: BindingData[Scope]): Binding[Scope, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBinding")(root.asInstanceOf[js.Any], binding.asInstanceOf[js.Any])).asInstanceOf[Binding[Scope, Any]]
inline def createBinding[Scope](root: HTMLElement, binding: BindingData[Scope], templateTagOffset: Double): Binding[Scope, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBinding")(root.asInstanceOf[js.Any], binding.asInstanceOf[js.Any], templateTagOffset.asInstanceOf[js.Any])).asInstanceOf[Binding[Scope, Any]]

inline def createExpression[Scope](node: HTMLElement, expression: ExpressionData[Scope]): Expression[Scope] = (^.asInstanceOf[js.Dynamic].applyDynamic("createExpression")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[Expression[Scope]]

inline def expressionTypes: ExpressionType = ^.asInstanceOf[js.Dynamic].selectDynamic("expressionTypes").asInstanceOf[ExpressionType]

inline def template[Scope, ParentScope](template: String): TemplateChunk[Scope, ParentScope] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateChunk[Scope, ParentScope]]
inline def template[Scope, ParentScope](template: String, bindings: js.Array[BindingData[Scope]]): TemplateChunk[Scope, ParentScope] = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[TemplateChunk[Scope, ParentScope]]

/* Rewritten from type alias, can be one of: 
  - typings.riotjsDomBindings.mod.EachBindingData[
Scope, 
java.lang.String, 
java.lang.String, 
scala.Any, 
Scope & typings.riotjsDomBindings.riotjsDomBindingsStrings.BindingData & org.scalablytyped.runtime.TopLevel[scala.Any]]
  - typings.riotjsDomBindings.mod.IfBindingData[Scope]
  - typings.riotjsDomBindings.mod.SimpleBindingData[Scope]
  - typings.riotjsDomBindings.mod.SlotBindingData[Scope]
  - typings.riotjsDomBindings.mod.TagBindingData[Scope]
*/
type BindingData[Scope] = _BindingData[Scope] | (EachBindingData[
Scope, 
String, 
String, 
Any, 
Scope & typings.riotjsDomBindings.riotjsDomBindingsStrings.BindingData & TopLevel[Any]])

/* Rewritten from type alias, can be one of: 
  - typings.riotjsDomBindings.mod.AttributeExpressionData[Scope]
  - typings.riotjsDomBindings.mod.EventExpressionData[Scope]
  - typings.riotjsDomBindings.mod.TextExpressionData[Scope]
  - typings.riotjsDomBindings.mod.ValueExpressionData[Scope]
*/
type ExpressionData[Scope] = _ExpressionData[Scope] | ValueExpressionData[Scope]

type ValueExpressionData[Scope] = BaseExpressionData[Scope]
