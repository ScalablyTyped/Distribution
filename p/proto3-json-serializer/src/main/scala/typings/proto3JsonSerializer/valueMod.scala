package typings.proto3JsonSerializer

import org.scalablytyped.runtime.StringDictionary
import typings.proto3JsonSerializer.proto3JsonSerializerNumbers.`0`
import typings.proto3JsonSerializer.typesMod.FromObjectValue
import typings.proto3JsonSerializer.typesMod.JSONObject
import typings.proto3JsonSerializer.typesMod.JSONValue
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueMod {
  
  @JSImport("proto3-json-serializer/build/src/value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def googleProtobufListValueFromProto3JSON(json: js.Array[JSONValue]): FromObjectValue = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufListValueFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[FromObjectValue]
  
  inline def googleProtobufListValueToProto3JSON(obj: Message[js.Object] & ListValue): js.Array[JSONValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufListValueToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSONValue]]
  
  inline def googleProtobufStructFromProto3JSON(json: JSONObject): FromObjectValue = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufStructFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[FromObjectValue]
  
  inline def googleProtobufStructToProto3JSON(obj: Message[js.Object] & Struct): JSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufStructToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONObject]
  
  inline def googleProtobufValueFromProto3JSON(json: JSONValue): FromObjectValue = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufValueFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[FromObjectValue]
  
  inline def googleProtobufValueToProto3JSON(obj: Message[js.Object] & Value): JSONValue = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufValueToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONValue]
  
  trait ListValue extends StObject {
    
    var values: js.Array[Value]
  }
  object ListValue {
    
    inline def apply(values: js.Array[Value]): ListValue = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListValue]
    }
    
    extension [Self <: ListValue](x: Self) {
      
      inline def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait Struct extends StObject {
    
    var fields: StringDictionary[Value]
  }
  object Struct {
    
    inline def apply(fields: StringDictionary[Value]): Struct = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Struct]
    }
    
    extension [Self <: Struct](x: Self) {
      
      inline def setFields(value: StringDictionary[Value]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var boolValue: js.UndefOr[Boolean] = js.undefined
    
    var listValue: js.UndefOr[ListValue] = js.undefined
    
    var nullValue: js.UndefOr[`0`] = js.undefined
    
    var numberValue: js.UndefOr[Double] = js.undefined
    
    var stringValue: js.UndefOr[String] = js.undefined
    
    var structValue: js.UndefOr[Struct] = js.undefined
  }
  object Value {
    
    inline def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
      
      inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
      
      inline def setListValue(value: ListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
      
      inline def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
      
      inline def setNullValue(value: `0`): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
      
      inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
      
      inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
      
      inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
      
      inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
      
      inline def setStructValue(value: Struct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
      
      inline def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
    }
  }
}
