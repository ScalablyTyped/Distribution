package typings.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6Definition
import typings.reactJsonschemaForm.anon.ErrorSchema
import typings.reactJsonschemaForm.mod.AjvError
import typings.reactJsonschemaForm.mod.FormValidation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidateMod {
  
  @JSImport("react-jsonschema-form/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](formData: T, schema: JSONSchema6Definition): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: Unit,
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: Unit,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: Unit,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]],
    transformErrors: Unit,
    additionalMetaSchemas: Unit,
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]],
    additionalMetaSchemas: Unit,
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: Unit,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: Unit,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
  inline def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: Unit,
    transformErrors: Unit,
    additionalMetaSchemas: Unit,
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): ErrorSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(formData.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], customValidate.asInstanceOf[js.Any], transformErrors.asInstanceOf[js.Any], additionalMetaSchemas.asInstanceOf[js.Any], customFormats.asInstanceOf[js.Any])).asInstanceOf[ErrorSchema]
}
