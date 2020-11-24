package typings.reduxForm.fieldsMod

import typings.react.mod.ComponentType
import typings.reduxForm.fieldMod.Formatter
import typings.reduxForm.fieldMod.Parser
import typings.reduxForm.fieldMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFieldsProps[P] extends js.Object {
  
  var component: js.UndefOr[ComponentType[_]] = js.native
  
  var format: js.UndefOr[Formatter | Null] = js.native
  
  var forwardRef: js.UndefOr[Boolean] = js.native
  
  var names: js.Array[String] = js.native
  
  var parse: js.UndefOr[Parser] = js.native
  
  var props: js.UndefOr[P] = js.native
  
  var validate: js.UndefOr[FieldsWarnerOrValidator] = js.native
  
  var warn: js.UndefOr[FieldsWarnerOrValidator] = js.native
}
object BaseFieldsProps {
  
  @scala.inline
  def apply[P](names: js.Array[String]): BaseFieldsProps[P] = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldsProps[P]]
  }
  
  @scala.inline
  implicit class BaseFieldsPropsOps[Self <: BaseFieldsProps[_], P] (val x: Self with BaseFieldsProps[P]) extends AnyVal {
    
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
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setFormat(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setForwardRef(value: Boolean): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
    
    @scala.inline
    def setParse(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = this.set("parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setValidateVarargs(value: Validator*): Self = this.set("validate", js.Array(value :_*))
    
    @scala.inline
    def setValidateFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("validate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValidate(value: FieldsWarnerOrValidator): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setWarnVarargs(value: Validator*): Self = this.set("warn", js.Array(value :_*))
    
    @scala.inline
    def setWarnFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("warn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWarn(value: FieldsWarnerOrValidator): Self = this.set("warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
