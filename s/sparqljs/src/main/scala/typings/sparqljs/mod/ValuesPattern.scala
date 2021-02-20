package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.values
import org.scalablytyped.runtime.StObject
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
  implicit class ValuesPatternMutableBuilder[Self <: ValuesPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: values): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[ValuePatternRow]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ValuePatternRow*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
