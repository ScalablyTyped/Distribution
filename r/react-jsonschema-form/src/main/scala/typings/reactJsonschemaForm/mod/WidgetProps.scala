package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'onBlur' | 'onFocus'> ]: react.react.HTMLAttributes<std.HTMLElement>[P]} */ @js.native
trait WidgetProps extends js.Object {
  var autofocus: Boolean = js.native
  var disabled: Boolean = js.native
  var formContext: js.Any = js.native
  var id: String = js.native
  var label: String = js.native
  var options: StringDictionary[Boolean | Double | String | js.Object | Null] = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
  var value: js.Any = js.native
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  def onChange(value: js.Any): Unit = js.native
  def onFocus(id: String): Unit = js.native
  def onFocus(id: String, value: String): Unit = js.native
  def onFocus(id: String, value: Boolean): Unit = js.native
  def onFocus(id: String, value: Double): Unit = js.native
}

