package typings.sigstoreProtobufSpecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@GeneratedGoogleProtobufTimestampMod` {
  
  trait Timestamp extends StObject {
    
    /**
      * Non-negative fractions of a second at nanosecond resolution. Negative
      * second values with fractions must still have non-negative nanos values
      * that count forward in time. Must be from 0 to 999,999,999
      * inclusive.
      */
    var nanos: Double
    
    /**
      * Represents seconds of UTC time since Unix epoch
      * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      * 9999-12-31T23:59:59Z inclusive.
      */
    var seconds: String
  }
  object Timestamp {
    
    inline def apply(nanos: Double, seconds: String): Timestamp = {
      val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/timestamp", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    inline def toJSON(message: Timestamp): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
