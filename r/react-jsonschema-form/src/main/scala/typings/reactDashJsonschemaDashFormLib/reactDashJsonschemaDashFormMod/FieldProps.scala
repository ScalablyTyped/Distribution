package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]
     with /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autofocus: scala.Boolean
  var disabled: scala.Boolean
  var errorSchema: js.Object
  var formContext: js.Any
  var formData: js.Any
  var idSchema: IdSchema
  var name: java.lang.String
  var readonly: scala.Boolean
  var registry: reactDashJsonschemaDashFormLib.Anon_Definitions
  var required: scala.Boolean
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var uiSchema: UiSchema
  @JSName("onChange")
  def onChange_MFieldProps(value: js.Any): scala.Unit
}

object FieldProps {
  @scala.inline
  def apply(
    autofocus: scala.Boolean,
    disabled: scala.Boolean,
    errorSchema: js.Object,
    formContext: js.Any,
    formData: js.Any,
    idSchema: IdSchema,
    name: java.lang.String,
    onChange: js.Function1[js.Any, scala.Unit],
    readonly: scala.Boolean,
    registry: reactDashJsonschemaDashFormLib.Anon_Definitions,
    required: scala.Boolean,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    uiSchema: UiSchema,
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): FieldProps = {
    val __obj = js.Dynamic.literal(autofocus = autofocus, disabled = disabled, errorSchema = errorSchema, formContext = formContext, formData = formData, idSchema = idSchema, name = name, onChange = onChange, readonly = readonly, registry = registry, required = required, schema = schema, uiSchema = uiSchema)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FieldProps]
  }
}

