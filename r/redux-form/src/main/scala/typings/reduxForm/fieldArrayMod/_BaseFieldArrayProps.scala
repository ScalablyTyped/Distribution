package typings.reduxForm.fieldArrayMod

import typings.react.mod.ComponentType
import typings.reduxForm.fieldMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _BaseFieldArrayProps[P, FieldValue] extends js.Object {
  
  var component: ComponentType[WrappedFieldArrayProps[FieldValue] with P] = js.native
  
  var name: String = js.native
  
  var rerenderOnEveryChange: js.UndefOr[Boolean] = js.native
  
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.native
  
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.native
  
  var withRef: js.UndefOr[Boolean] = js.native
}
object _BaseFieldArrayProps {
  
  @scala.inline
  def apply[P, FieldValue](component: ComponentType[WrappedFieldArrayProps[FieldValue] with P], name: String): _BaseFieldArrayProps[P, FieldValue] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BaseFieldArrayProps[P, FieldValue]]
  }
  
  @scala.inline
  implicit class _BaseFieldArrayPropsOps[Self <: _BaseFieldArrayProps[_, _], P, FieldValue] (val x: Self with (_BaseFieldArrayProps[P, FieldValue])) extends AnyVal {
    
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
    def setComponent(value: ComponentType[WrappedFieldArrayProps[FieldValue] with P]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRerenderOnEveryChange(value: Boolean): Self = this.set("rerenderOnEveryChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRerenderOnEveryChange: Self = this.set("rerenderOnEveryChange", js.undefined)
    
    @scala.inline
    def setValidateVarargs(value: Validator*): Self = this.set("validate", js.Array(value :_*))
    
    @scala.inline
    def setValidateFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("validate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValidate(value: Validator | js.Array[Validator]): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setWarnVarargs(value: Validator*): Self = this.set("warn", js.Array(value :_*))
    
    @scala.inline
    def setWarnFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("warn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWarn(value: Validator | js.Array[Validator]): Self = this.set("warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
    
    @scala.inline
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
}
