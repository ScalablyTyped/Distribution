package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.EventBuffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventBufferMod {
  
  @JSImport("@sentry/replay/types/eventBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/replay/types/eventBuffer", "EventBufferSizeExceededError")
  @js.native
  open class EventBufferSizeExceededError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def createEventBuffer(param0: CreateEventBufferParams): EventBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventBuffer")(param0.asInstanceOf[js.Any]).asInstanceOf[EventBuffer]
  
  trait CreateEventBufferParams extends StObject {
    
    var useCompression: Boolean
  }
  object CreateEventBufferParams {
    
    inline def apply(useCompression: Boolean): CreateEventBufferParams = {
      val __obj = js.Dynamic.literal(useCompression = useCompression.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateEventBufferParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventBufferParams] (val x: Self) extends AnyVal {
      
      inline def setUseCompression(value: Boolean): Self = StObject.set(x, "useCompression", value.asInstanceOf[js.Any])
    }
  }
}
