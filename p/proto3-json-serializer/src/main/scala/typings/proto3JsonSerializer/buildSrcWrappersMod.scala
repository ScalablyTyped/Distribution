package typings.proto3JsonSerializer

import typings.node.bufferMod.global.Buffer
import typings.proto3JsonSerializer.anon.ValueBuffer
import typings.proto3JsonSerializer.anon.ValueNull
import typings.proto3JsonSerializer.anon.`0`
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcWrappersMod {
  
  @JSImport("proto3-json-serializer/build/src/wrappers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapperFromProto3JSON(typeName: String): ValueNull | ValueBuffer | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapperFromProto3JSON")(typeName.asInstanceOf[js.Any]).asInstanceOf[ValueNull | ValueBuffer | `0`]
  inline def wrapperFromProto3JSON(typeName: String, json: String): ValueNull | ValueBuffer | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperFromProto3JSON")(typeName.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[ValueNull | ValueBuffer | `0`]
  inline def wrapperFromProto3JSON(typeName: String, json: Boolean): ValueNull | ValueBuffer | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperFromProto3JSON")(typeName.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[ValueNull | ValueBuffer | `0`]
  inline def wrapperFromProto3JSON(typeName: String, json: Double): ValueNull | ValueBuffer | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapperFromProto3JSON")(typeName.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[ValueNull | ValueBuffer | `0`]
  
  inline def wrapperToProto3JSON(obj: NumberValue & Message[js.Object] & StringValue & BoolValue & BytesValue): String | Double | Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapperToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[String | Double | Boolean | Null]
  
  trait BoolValue extends StObject {
    
    var value: Boolean
  }
  object BoolValue {
    
    inline def apply(value: Boolean): BoolValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoolValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoolValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesValue extends StObject {
    
    var value: Buffer | js.typedarray.Uint8Array
  }
  object BytesValue {
    
    inline def apply(value: Buffer | js.typedarray.Uint8Array): BytesValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BytesValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberValue extends StObject {
    
    var value: Double | js.Object
  }
  object NumberValue {
    
    inline def apply(value: Double | js.Object): NumberValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringValue extends StObject {
    
    var value: String
  }
  object StringValue {
    
    inline def apply(value: String): StringValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
