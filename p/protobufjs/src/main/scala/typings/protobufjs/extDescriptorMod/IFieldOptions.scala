package typings.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldOptions extends StObject {
  
  var jstype: js.UndefOr[IFieldOptionsJSType] = js.undefined
  
  var packed: js.UndefOr[Boolean] = js.undefined
}
object IFieldOptions {
  
  inline def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setJstype(value: IFieldOptionsJSType): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    inline def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
  }
}
