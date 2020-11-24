package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeOptions extends js.Object {
  
  var only: js.UndefOr[String | js.Array[String]] = js.native
  
  var values: js.UndefOr[js.Array[_]] = js.native
}
object AttributeOptions {
  
  @scala.inline
  def apply(): AttributeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeOptions]
  }
  
  @scala.inline
  implicit class AttributeOptionsOps[Self <: AttributeOptions] (val x: Self) extends AnyVal {
    
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
    def setOnlyVarargs(value: String*): Self = this.set("only", js.Array(value :_*))
    
    @scala.inline
    def setOnly(value: String | js.Array[String]): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
