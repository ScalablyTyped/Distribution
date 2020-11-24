package typings.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedFieldArrayProps[FieldValue] extends js.Object {
  
  var fields: FieldArrayFieldsProps[FieldValue] = js.native
  
  var meta: FieldArrayMetaProps = js.native
}
object WrappedFieldArrayProps {
  
  @scala.inline
  def apply[FieldValue](fields: FieldArrayFieldsProps[FieldValue], meta: FieldArrayMetaProps): WrappedFieldArrayProps[FieldValue] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldArrayProps[FieldValue]]
  }
  
  @scala.inline
  implicit class WrappedFieldArrayPropsOps[Self <: WrappedFieldArrayProps[_], FieldValue] (val x: Self with WrappedFieldArrayProps[FieldValue]) extends AnyVal {
    
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
    def setFields(value: FieldArrayFieldsProps[FieldValue]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: FieldArrayMetaProps): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
