package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineSenderMod {
  
  @JSImport("pusher-js/types/src/core/timeline/timeline_sender", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TimelineSender {
    def this(timeline: typings.pusherJs.timelineMod.default, options: TimelineSenderOptions) = this()
  }
  
  @js.native
  trait TimelineSender extends StObject {
    
    var host: String = js.native
    
    var options: TimelineSenderOptions = js.native
    
    def send(useTLS: Boolean): Unit = js.native
    def send(useTLS: Boolean, callback: js.Function): Unit = js.native
    
    var timeline: typings.pusherJs.timelineMod.default = js.native
  }
  
  trait TimelineSenderOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object TimelineSenderOptions {
    
    inline def apply(): TimelineSenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineSenderOptions]
    }
    
    extension [Self <: TimelineSenderOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
