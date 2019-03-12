package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'onBlur' | 'onFocus'> ]: react.react.HTMLAttributes<std.HTMLElement>[P]} */ trait WidgetProps extends js.Object {
  var autofocus: scala.Boolean
  var disabled: scala.Boolean
  var formContext: js.Any
  var id: java.lang.String
  var options: js.Object
  var readonly: scala.Boolean
  var required: scala.Boolean
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var value: js.Any
  def onBlur(id: java.lang.String, value: java.lang.String): scala.Unit
  def onChange(value: js.Any): scala.Unit
  def onFocus(id: java.lang.String, value: java.lang.String): scala.Unit
}

object WidgetProps {
  @scala.inline
  def apply(
    autofocus: scala.Boolean,
    disabled: scala.Boolean,
    formContext: js.Any,
    id: java.lang.String,
    onBlur: (java.lang.String, java.lang.String) => scala.Unit,
    onChange: js.Any => scala.Unit,
    onFocus: (java.lang.String, java.lang.String) => scala.Unit,
    options: js.Object,
    readonly: scala.Boolean,
    required: scala.Boolean,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    value: js.Any
  ): WidgetProps = {
    val __obj = js.Dynamic.literal(autofocus = autofocus, disabled = disabled, formContext = formContext, id = id, onBlur = js.Any.fromFunction2(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction2(onFocus), options = options, readonly = readonly, required = required, schema = schema, value = value)
  
    __obj.asInstanceOf[WidgetProps]
  }
}

