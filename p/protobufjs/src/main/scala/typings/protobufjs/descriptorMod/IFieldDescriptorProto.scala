package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldDescriptorProto extends StObject {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var extendee: js.UndefOr[String] = js.native
  
  var jsonName: js.UndefOr[js.Any] = js.native
  
  var label: js.UndefOr[IFieldDescriptorProtoLabel] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var oneofIndex: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[IFieldOptions] = js.native
  
  var `type`: js.UndefOr[IFieldDescriptorProtoType] = js.native
  
  var typeName: js.UndefOr[String] = js.native
}
object IFieldDescriptorProto {
  
  @scala.inline
  def apply(): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
  
  @scala.inline
  implicit class IFieldDescriptorProtoMutableBuilder[Self <: IFieldDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setExtendee(value: String): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
    
    @scala.inline
    def setJsonName(value: js.Any): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    @scala.inline
    def setLabel(value: IFieldDescriptorProtoLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    @scala.inline
    def setOptions(value: IFieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setType(value: IFieldDescriptorProtoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
