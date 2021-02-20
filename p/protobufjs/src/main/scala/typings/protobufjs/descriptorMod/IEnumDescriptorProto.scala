package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnumDescriptorProto extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[IEnumOptions] = js.native
  
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto]] = js.native
}
object IEnumDescriptorProto {
  
  @scala.inline
  def apply(): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
  
  @scala.inline
  implicit class IEnumDescriptorProtoMutableBuilder[Self <: IEnumDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IEnumOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[IEnumValueDescriptorProto]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: IEnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
