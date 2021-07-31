package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuesPattern
  extends StObject
     with Pattern {
  
  var `type`: values
  
  var values: js.Array[ValuePatternRow]
}
object ValuesPattern {
  
  @scala.inline
  def apply(values: js.Array[ValuePatternRow]): ValuesPattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("values")
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
