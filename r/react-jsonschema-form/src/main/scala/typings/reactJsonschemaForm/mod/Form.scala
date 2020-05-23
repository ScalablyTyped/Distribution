package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.Component
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form[T]
  extends Component[FormProps[T], js.Object, js.Any] {
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  def onChange(formData: T, newErrorSchema: ErrorSchema): Unit = js.native
  def submit(): Unit = js.native
  def validate(formData: T): typings.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6): typings.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.UndefOr[scala.Nothing],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): typings.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6, additionalMetaSchemas: js.Array[js.Object]): typings.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.Array[js.Object],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): typings.reactJsonschemaForm.anon.ErrorSchema = js.native
}

