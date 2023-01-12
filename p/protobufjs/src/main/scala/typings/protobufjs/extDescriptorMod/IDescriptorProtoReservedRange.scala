package typings.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDescriptorProtoReservedRange extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object IDescriptorProtoReservedRange {
  
  inline def apply(): IDescriptorProtoReservedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProtoReservedRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDescriptorProtoReservedRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
