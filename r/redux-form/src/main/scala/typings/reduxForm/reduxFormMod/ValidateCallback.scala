package typings.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateCallback[FormData, P, ErrorType] extends js.Object {
  
  var fieldValidatorKeys: js.Array[String] = js.native
  
  var initialRender: Boolean = js.native
  
  var lastFieldValidatorKeys: js.Array[String] = js.native
  
  var nextProps: DecoratedFormProps[FormData, P, ErrorType] = js.native
  
  var props: DecoratedFormProps[FormData, P, ErrorType] = js.native
  
  var structure: js.Any = js.native
  
  var values: FormData = js.native
}
object ValidateCallback {
  
  @scala.inline
  def apply[FormData, P, ErrorType](
    fieldValidatorKeys: js.Array[String],
    initialRender: Boolean,
    lastFieldValidatorKeys: js.Array[String],
    nextProps: DecoratedFormProps[FormData, P, ErrorType],
    props: DecoratedFormProps[FormData, P, ErrorType],
    structure: js.Any,
    values: FormData
  ): ValidateCallback[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(fieldValidatorKeys = fieldValidatorKeys.asInstanceOf[js.Any], initialRender = initialRender.asInstanceOf[js.Any], lastFieldValidatorKeys = lastFieldValidatorKeys.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateCallback[FormData, P, ErrorType]]
  }
  
  @scala.inline
  implicit class ValidateCallbackOps[Self <: ValidateCallback[_, _, _], FormData, P, ErrorType] (val x: Self with (ValidateCallback[FormData, P, ErrorType])) extends AnyVal {
    
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
    def setFieldValidatorKeysVarargs(value: String*): Self = this.set("fieldValidatorKeys", js.Array(value :_*))
    
    @scala.inline
    def setFieldValidatorKeys(value: js.Array[String]): Self = this.set("fieldValidatorKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRender(value: Boolean): Self = this.set("initialRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFieldValidatorKeysVarargs(value: String*): Self = this.set("lastFieldValidatorKeys", js.Array(value :_*))
    
    @scala.inline
    def setLastFieldValidatorKeys(value: js.Array[String]): Self = this.set("lastFieldValidatorKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextProps(value: DecoratedFormProps[FormData, P, ErrorType]): Self = this.set("nextProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: DecoratedFormProps[FormData, P, ErrorType]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructure(value: js.Any): Self = this.set("structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FormData): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
