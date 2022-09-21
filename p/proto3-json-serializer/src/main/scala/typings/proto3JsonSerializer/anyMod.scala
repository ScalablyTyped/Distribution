package typings.proto3JsonSerializer

import typings.node.bufferMod.global.Buffer
import typings.proto3JsonSerializer.anon.Typeurl
import typings.proto3JsonSerializer.anon.Value
import typings.proto3JsonSerializer.toproto3jsonMod.ToProto3JSONOptions
import typings.proto3JsonSerializer.typesMod.JSONObject
import typings.proto3JsonSerializer.typesMod.JSONValue
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod {
  
  @JSImport("proto3-json-serializer/build/src/any", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def googleProtobufAnyFromProto3JSON(root: Root, json: JSONValue): Typeurl | Value = (^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufAnyFromProto3JSON")(root.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Typeurl | Value]
  
  inline def googleProtobufAnyToProto3JSON(obj: Message[js.Object] & Any): JSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufAnyToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONObject]
  inline def googleProtobufAnyToProto3JSON(obj: Message[js.Object] & Any, options: ToProto3JSONOptions): JSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufAnyToProto3JSON")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONObject]
  
  trait Any extends StObject {
    
    var type_url: String
    
    var value: Buffer | js.typedarray.Uint8Array
  }
  object Any {
    
    inline def apply(type_url: String, value: Buffer | js.typedarray.Uint8Array): Any = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
