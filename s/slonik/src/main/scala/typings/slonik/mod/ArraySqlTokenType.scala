package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySqlTokenType extends _SqlTokenType {
  
  var memberType: TypeNameIdentifierType | SqlTokenType = js.native
  
  var `type`: js.Symbol = js.native
  
  var values: js.Array[ValueExpressionType] = js.native
}
object ArraySqlTokenType {
  
  @scala.inline
  def apply(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySqlTokenType]
  }
  
  @scala.inline
  implicit class ArraySqlTokenTypeOps[Self <: ArraySqlTokenType] (val x: Self) extends AnyVal {
    
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
    def setMemberType(value: TypeNameIdentifierType | SqlTokenType): Self = this.set("memberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ValueExpressionType*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[ValueExpressionType]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
