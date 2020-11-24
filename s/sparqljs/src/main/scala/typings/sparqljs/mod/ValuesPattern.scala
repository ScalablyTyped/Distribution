package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuesPattern extends Pattern {
  
  var `type`: values = js.native
  
  var values: js.Array[ValuePatternRow] = js.native
}
object ValuesPattern {
  
  @scala.inline
  def apply(`type`: values, values: js.Array[ValuePatternRow]): ValuesPattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesPattern]
  }
  
  @scala.inline
  implicit class ValuesPatternOps[Self <: ValuesPattern] (val x: Self) extends AnyVal {
    
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
    def setType(value: values): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ValuePatternRow*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[ValuePatternRow]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
