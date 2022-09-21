package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textencoderMod {
  
  trait TextEncoderCommon extends StObject {
    
    /**
      * Returns "utf-8".
      */
    val encoding: String
  }
  object TextEncoderCommon {
    
    inline def apply(encoding: String): TextEncoderCommon = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextEncoderCommon]
    }
    
    extension [Self <: TextEncoderCommon](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextEncoderInternal
    extends StObject
       with TextEncoderCommon {
    
    def encode(): js.typedarray.Uint8Array = js.native
    def encode(input: String): js.typedarray.Uint8Array = js.native
  }
}
