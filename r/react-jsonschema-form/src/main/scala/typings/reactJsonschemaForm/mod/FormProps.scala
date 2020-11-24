package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps[T] extends js.Object {
  
  var ArrayFieldTemplate: js.UndefOr[StatelessComponent[ArrayFieldTemplateProps[_]]] = js.native
  
  var ErrorList: js.UndefOr[StatelessComponent[ErrorListProps]] = js.native
  
  var FieldTemplate: js.UndefOr[StatelessComponent[FieldTemplateProps]] = js.native
  
  var ObjectFieldTemplate: js.UndefOr[StatelessComponent[ObjectFieldTemplateProps[_]]] = js.native
  
  var acceptcharset: js.UndefOr[String] = js.native
  
  var action: js.UndefOr[String] = js.native
  
  var additionalMetaSchemas: js.UndefOr[js.Array[js.Object]] = js.native
  
  var autocomplete: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var customFormats: js.UndefOr[StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var enctype: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[StringDictionary[Field]] = js.native
  
  var formContext: js.UndefOr[js.Any] = js.native
  
  var formData: js.UndefOr[T] = js.native
  
  // HTML Attributes
  var id: js.UndefOr[String] = js.native
  
  var idPrefix: js.UndefOr[String] = js.native
  
  var liveOmit: js.UndefOr[Boolean] = js.native
  
  var liveValidate: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noHtml5Validate: js.UndefOr[Boolean] = js.native
  
  var noValidate: js.UndefOr[Boolean] = js.native
  
  var omitExtraData: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], _]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var onFocus: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.native
  
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], _]] = js.native
  
  var safeRenderCompletion: js.UndefOr[Boolean] = js.native
  
  var schema: JSONSchema6 = js.native
  
  var showErrorList: js.UndefOr[Boolean] = js.native
  
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.native
  
  var uiSchema: js.UndefOr[UiSchema] = js.native
  
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.native
  
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.native
}
object FormProps {
  
  @scala.inline
  def apply[T](schema: JSONSchema6): FormProps[T] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps[T]]
  }
  
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps[_], T] (val x: Self with FormProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFieldTemplate(value: StatelessComponent[ArrayFieldTemplateProps[_]]): Self = this.set("ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFieldTemplate: Self = this.set("ArrayFieldTemplate", js.undefined)
    
    @scala.inline
    def setErrorList(value: StatelessComponent[ErrorListProps]): Self = this.set("ErrorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorList: Self = this.set("ErrorList", js.undefined)
    
    @scala.inline
    def setFieldTemplate(value: StatelessComponent[FieldTemplateProps]): Self = this.set("FieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTemplate: Self = this.set("FieldTemplate", js.undefined)
    
    @scala.inline
    def setObjectFieldTemplate(value: StatelessComponent[ObjectFieldTemplateProps[_]]): Self = this.set("ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectFieldTemplate: Self = this.set("ObjectFieldTemplate", js.undefined)
    
    @scala.inline
    def setAcceptcharset(value: String): Self = this.set("acceptcharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptcharset: Self = this.set("acceptcharset", js.undefined)
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAdditionalMetaSchemasVarargs(value: js.Object*): Self = this.set("additionalMetaSchemas", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalMetaSchemas(value: js.Array[js.Object]): Self = this.set("additionalMetaSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalMetaSchemas: Self = this.set("additionalMetaSchemas", js.undefined)
    
    @scala.inline
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCustomFormats(value: StringDictionary[String | RegExp | (js.Function1[/* data */ String, Boolean])]): Self = this.set("customFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFormats: Self = this.set("customFormats", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnctype(value: String): Self = this.set("enctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnctype: Self = this.set("enctype", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormContext: Self = this.set("formContext", js.undefined)
    
    @scala.inline
    def setFormData(value: T): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    
    @scala.inline
    def setLiveOmit(value: Boolean): Self = this.set("liveOmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveOmit: Self = this.set("liveOmit", js.undefined)
    
    @scala.inline
    def setLiveValidate(value: Boolean): Self = this.set("liveValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveValidate: Self = this.set("liveValidate", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoHtml5Validate(value: Boolean): Self = this.set("noHtml5Validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoHtml5Validate: Self = this.set("noHtml5Validate", js.undefined)
    
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    
    @scala.inline
    def setOmitExtraData(value: Boolean): Self = this.set("omitExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitExtraData: Self = this.set("omitExtraData", js.undefined)
    
    @scala.inline
    def setOnBlur(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ js.Any => _): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* e */ ISubmitEvent[T] => _): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setSafeRenderCompletion(value: Boolean): Self = this.set("safeRenderCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeRenderCompletion: Self = this.set("safeRenderCompletion", js.undefined)
    
    @scala.inline
    def setShowErrorList(value: Boolean): Self = this.set("showErrorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowErrorList: Self = this.set("showErrorList", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTransformErrors(value: /* errors */ js.Array[AjvError] => js.Array[AjvError]): Self = this.set("transformErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformErrors: Self = this.set("transformErrors", js.undefined)
    
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiSchema: Self = this.set("uiSchema", js.undefined)
    
    @scala.inline
    def setValidate(value: (/* formData */ T, /* errors */ FormValidation) => FormValidation): Self = this.set("validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setWidgets(value: StringDictionary[Widget]): Self = this.set("widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgets: Self = this.set("widgets", js.undefined)
  }
}
