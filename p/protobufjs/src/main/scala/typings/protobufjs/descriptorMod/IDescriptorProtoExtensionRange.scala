package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDescriptorProtoExtensionRange extends StObject {
  
  var end: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object IDescriptorProtoExtensionRange {
  
  @scala.inline
  def apply(): IDescriptorProtoExtensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProtoExtensionRange]
  }
  
  @scala.inline
  implicit class IDescriptorProtoExtensionRangeMutableBuilder[Self <: IDescriptorProtoExtensionRange] (val x: Self) extends AnyVal {
    
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
