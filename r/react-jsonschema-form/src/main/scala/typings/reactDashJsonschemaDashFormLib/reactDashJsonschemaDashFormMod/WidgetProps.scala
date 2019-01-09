package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLElement>, 'onBlur' | 'onFocus'> ]: react.react.HTMLAttributes<react.HTMLElement>[P]} */ trait WidgetProps extends js.Object {
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

