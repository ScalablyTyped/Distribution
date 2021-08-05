package typings.streamThrottle

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-throttle", "Throttle")
  @js.native
  class Throttle protected () extends Transform {
    def this(options: ThrottleOptions) = this()
  }
  
  @JSImport("stream-throttle", "ThrottleGroup")
  @js.native
  class ThrottleGroup protected () extends StObject {
    def this(options: ThrottleOptions) = this()
    
    def throttle(options: ThrottleOptions): Throttle = js.native
  }
  
  trait ThrottleOptions extends StObject {
    
    val chunksize: js.UndefOr[Double] = js.undefined
    
    val rate: Double
  }
  object ThrottleOptions {
    
    inline def apply(rate: Double): ThrottleOptions = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    extension [Self <: ThrottleOptions](x: Self) {
      
      inline def setChunksize(value: Double): Self = StObject.set(x, "chunksize", value.asInstanceOf[js.Any])
      
      inline def setChunksizeUndefined: Self = StObject.set(x, "chunksize", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
}
