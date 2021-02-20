package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDescriptorProtoReservedRange extends StObject {
  
  var end: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object IDescriptorProtoReservedRange {
  
  @scala.inline
  def apply(): IDescriptorProtoReservedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProtoReservedRange]
  }
  
  @scala.inline
  implicit class IDescriptorProtoReservedRangeMutableBuilder[Self <: IDescriptorProtoReservedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
