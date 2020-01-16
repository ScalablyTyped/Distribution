package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.react.reactMod.Component
import typings.reactDashJsonschemaDashForm.Anon_ErrorSchema
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
  def validate(formData: T): Anon_ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6): Anon_ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.UndefOr[scala.Nothing],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): Anon_ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6, additionalMetaSchemas: js.Array[js.Object]): Anon_ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.Array[js.Object],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): Anon_ErrorSchema = js.native
}

