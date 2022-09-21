package typings.proto3JsonSerializer

import org.scalablytyped.runtime.StringDictionary
import typings.proto3JsonSerializer.typesMod.FromObjectValue
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object durationMod {
  
  @JSImport("proto3-json-serializer/build/src/duration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def googleProtobufDurationFromProto3JSON(json: String): StringDictionary[FromObjectValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufDurationFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[FromObjectValue]]
  
  inline def googleProtobufDurationToProto3JSON(obj: Message[js.Object] & Duration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufDurationToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Duration extends StObject {
    
    var nanos: js.UndefOr[Double] = js.undefined
    
    var seconds: Double
  }
  object Duration {
    
    inline def apply(seconds: Double): Duration = {
      val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
