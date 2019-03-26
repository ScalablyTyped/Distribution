package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLElement>, 'onBlur' | 'onFocus'> ]: react.react.React.HTMLAttributes<std.HTMLElement>[P]} */ @js.native
trait WidgetProps extends js.Object {
  var autofocus: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  var formContext: js.Any = js.native
  var id: java.lang.String = js.native
  var label: java.lang.String = js.native
  var options: js.Object = js.native
  var readonly: scala.Boolean = js.native
  var required: scala.Boolean = js.native
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6 = js.native
  var value: js.Any = js.native
  def onBlur(id: java.lang.String): scala.Unit = js.native
  def onBlur(id: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def onBlur(id: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def onBlur(id: java.lang.String, value: scala.Double): scala.Unit = js.native
  def onChange(value: js.Any): scala.Unit = js.native
  def onFocus(id: java.lang.String): scala.Unit = js.native
  def onFocus(id: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def onFocus(id: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def onFocus(id: java.lang.String, value: scala.Double): scala.Unit = js.native
}

