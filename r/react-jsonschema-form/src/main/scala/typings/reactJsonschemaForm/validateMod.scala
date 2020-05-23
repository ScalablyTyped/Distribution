package typings.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6Definition
import typings.reactJsonschemaForm.anon.ErrorSchema
import typings.reactJsonschemaForm.mod.AjvError
import typings.reactJsonschemaForm.mod.FormValidation
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  def default[T](formData: T, schema: JSONSchema6Definition): ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]
  ): ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]
  ): ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.UndefOr[scala.Nothing],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.Array[js.Object]
  ): ErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.Array[js.Object],
    customFormats: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]
  ): ErrorSchema = js.native
}

