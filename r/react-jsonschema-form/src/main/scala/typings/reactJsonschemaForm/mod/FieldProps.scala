package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.reactJsonschemaForm.AnonDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'onBlur'> ]: react.react.HTMLAttributes<std.HTMLElement>[P]} */ @js.native
trait FieldProps[T]
  extends /* prop */ StringDictionary[js.Any] {
  var autofocus: Boolean = js.native
  var disabled: Boolean = js.native
  var errorSchema: ErrorSchema = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema = js.native
  var name: String = js.native
  var readonly: Boolean = js.native
  var registry: AnonDefinitions = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
  var uiSchema: UiSchema = js.native
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  def onChange(e: js.Any): js.Any = js.native
  def onChange(e: js.Any, es: ErrorSchema): js.Any = js.native
  def onChange(e: IChangeEvent[T]): js.Any = js.native
  def onChange(e: IChangeEvent[T], es: ErrorSchema): js.Any = js.native
}

