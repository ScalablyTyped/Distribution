package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateErrorEntity[Values] extends StObject {
  
  var errorFields: js.Array[Errors] = js.native
  
  var outOfDate: Boolean = js.native
  
  var values: Values = js.native
}
object ValidateErrorEntity {
  
  @scala.inline
  def apply[Values](errorFields: js.Array[Errors], outOfDate: Boolean, values: Values): ValidateErrorEntity[Values] = {
    val __obj = js.Dynamic.literal(errorFields = errorFields.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateErrorEntity[Values]]
  }
  
  @scala.inline
  implicit class ValidateErrorEntityMutableBuilder[Self <: ValidateErrorEntity[_], Values] (val x: Self with ValidateErrorEntity[Values]) extends AnyVal {
    
    @scala.inline
    def setErrorFields(value: js.Array[Errors]): Self = StObject.set(x, "errorFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorFieldsVarargs(value: Errors*): Self = StObject.set(x, "errorFields", js.Array(value :_*))
    
    @scala.inline
    def setOutOfDate(value: Boolean): Self = StObject.set(x, "outOfDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Values): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
