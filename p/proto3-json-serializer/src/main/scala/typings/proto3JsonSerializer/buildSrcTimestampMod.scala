package typings.proto3JsonSerializer

import org.scalablytyped.runtime.StringDictionary
import typings.proto3JsonSerializer.buildSrcTypesMod.FromObjectValue
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTimestampMod {
  
  @JSImport("proto3-json-serializer/build/src/timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def googleProtobufTimestampFromProto3JSON(json: String): StringDictionary[FromObjectValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufTimestampFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[FromObjectValue]]
  
  inline def googleProtobufTimestampToProto3JSON(obj: Message[js.Object] & Timestamp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufTimestampToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Timestamp extends StObject {
    
    var nanos: js.UndefOr[Double] = js.undefined
    
    var seconds: Double
  }
  object Timestamp {
    
    inline def apply(seconds: Double): Timestamp = {
      val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    extension [Self <: Timestamp](x: Self) {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
