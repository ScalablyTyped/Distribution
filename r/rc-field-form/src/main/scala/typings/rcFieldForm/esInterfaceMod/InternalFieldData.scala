package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalFieldData
  extends StObject
     with Meta {
  
  var value: StoreValue
}
object InternalFieldData {
  
  inline def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: Boolean,
    validated: Boolean,
    validating: Boolean,
    value: StoreValue,
    warnings: js.Array[String]
  ): InternalFieldData = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFieldData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalFieldData] (val x: Self) extends AnyVal {
    
    inline def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
