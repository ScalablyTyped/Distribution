package typings.rcFieldForm.interfaceMod

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
    validating: Boolean,
    value: StoreValue
  ): InternalFieldData = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFieldData]
  }
  
  extension [Self <: InternalFieldData](x: Self) {
    
    inline def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
