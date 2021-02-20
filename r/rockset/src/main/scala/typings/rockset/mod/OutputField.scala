package typings.rockset.mod

import typings.rockset.rocksetStrings.FAIL
import typings.rockset.rocksetStrings.SKIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputField extends StObject {
  
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.native
  
  // Error in Mapping execution: 'skip' or 'fail'
  var on_error: js.UndefOr[SKIP | FAIL] = js.native
  
  // The name of a sql function
  var value: js.UndefOr[SqlExpression] = js.native
}
object OutputField {
  
  @scala.inline
  def apply(): OutputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputField]
  }
  
  @scala.inline
  implicit class OutputFieldMutableBuilder[Self <: OutputField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    @scala.inline
    def setOn_error(value: SKIP | FAIL): Self = StObject.set(x, "on_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
    
    @scala.inline
    def setValue(value: SqlExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
