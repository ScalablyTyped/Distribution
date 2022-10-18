package typings.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnumValueDescriptorProto extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
}
object IEnumValueDescriptorProto {
  
  inline def apply(): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
  
  extension [Self <: IEnumValueDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
