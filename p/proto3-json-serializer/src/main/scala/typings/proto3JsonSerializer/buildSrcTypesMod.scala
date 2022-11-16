package typings.proto3JsonSerializer

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FromObjectValue = string | number | boolean | null | std.Array<proto3-json-serializer.proto3-json-serializer/build/src/types.FromObjectValue> | node.buffer.<global>.Buffer | std.Uint8Array | {[key: string] : proto3-json-serializer.proto3-json-serializer/build/src/types.FromObjectValue}
  }}}
  to avoid circular code involving: 
  - proto3-json-serializer.proto3-json-serializer/build/src/types.FromObjectValue
  */
  type FromObjectValue = String | Double | Boolean | Null | js.Array[Any] | Buffer | js.typedarray.Uint8Array | StringDictionary[Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[key: string] : proto3-json-serializer.proto3-json-serializer/build/src/types.JSONValue}
  }}}
  to avoid circular code involving: 
  - proto3-json-serializer.proto3-json-serializer/build/src/types.JSONObject
  - proto3-json-serializer.proto3-json-serializer/build/src/types.JSONValue
  */
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = string | number | boolean | null | std.Array<proto3-json-serializer.proto3-json-serializer/build/src/types.JSONValue> | {[key: string] : proto3-json-serializer.proto3-json-serializer/build/src/types.JSONValue}
  }}}
  to avoid circular code involving: 
  - proto3-json-serializer.proto3-json-serializer/build/src/types.JSONValue
  */
  type JSONValue = String | Double | Boolean | Null | js.Array[Any] | StringDictionary[Any]
  
  trait LongStub extends StObject
}
