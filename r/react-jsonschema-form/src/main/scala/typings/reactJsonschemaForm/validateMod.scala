package typings.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6Definition
import typings.reactJsonschemaForm.anon.ErrorSchema
import typings.reactJsonschemaForm.mod.AjvError
import typings.reactJsonschemaForm.mod.FormValidation
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("react-jsonschema-form/lib/validate", JSImport.Default)
  @js.native
  def default[T](formData: T, schema: JSONSchema6Definition): ErrorSchema = js.native
  @JSImport("react-jsonschema-form/lib/validate", JSImport.Default)
  @js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]]
  ): ErrorSchema = js.native
  @JSImport("react-jsonschema-form/lib/validate", JSImport.Default)
  @js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]]
  ): ErrorSchema = js.native
  @JSImport("react-jsonschema-form/lib/validate", JSImport.Default)
  @js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]
  ): ErrorSchema = js.native
  @JSImport("react-jsonschema-form/lib/validate", JSImport.Default)
  @js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[StringDictionary[(js.Function1[/* data */ String, Boolean]) | RegExp | String]]
  ): ErrorSchema = js.native
}
