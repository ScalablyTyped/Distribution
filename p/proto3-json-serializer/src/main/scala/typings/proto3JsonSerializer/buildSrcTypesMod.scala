package typings.proto3JsonSerializer

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  type FromObjectValue = String | Double | Boolean | Null | js.Array[Any] | Buffer | js.typedarray.Uint8Array | StringDictionary[Any]
  
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONValue = String | Double | Boolean | Null | js.Array[Any] | StringDictionary[Any]
  
  trait LongStub extends StObject
}
