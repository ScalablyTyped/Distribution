package typings.reactDashJsonschemaDashForm

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Definition
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.AjvError
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FormValidation
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/validate", JSImport.Namespace)
@js.native
object libValidateMod extends js.Object {
  def default[T](formData: T, schema: JSONSchema6Definition): Anon_ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]
  ): Anon_ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]
  ): Anon_ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.UndefOr[scala.Nothing],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): Anon_ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.Array[js.Object]
  ): Anon_ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.Array[js.Object],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): Anon_ErrorSchema = js.native
}

