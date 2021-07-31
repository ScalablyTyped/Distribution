package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeOptions extends StObject {
  
  var only: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var values: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object AttributeOptions {
  
  @scala.inline
  def apply(): AttributeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeOptions]
  }
  
  @scala.inline
  implicit class AttributeOptionsMutableBuilder[Self <: AttributeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnly(value: String | js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    @scala.inline
    def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
