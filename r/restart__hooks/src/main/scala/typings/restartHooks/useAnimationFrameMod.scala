package typings.restartHooks

import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAnimationFrameMod {
  
  @JSImport("@restart/hooks/cjs/useAnimationFrame", JSImport.Default)
  @js.native
  def default(): UseAnimationFrameReturn = js.native
  
  @js.native
  trait UseAnimationFrameReturn extends StObject {
    
    def cancel(): Unit = js.native
    
    /**
      * Request for the provided callback to be called on the next animation frame.
      * Previously registered callbacks will be cancelled
      */
    def request(callback: FrameRequestCallback): Unit = js.native
    /**
      * Request for the provided callback to be called on the next animation frame.
      * Previously registered callbacks can be cancelled by providing `cancelPrevious`
      */
    def request(cancelPrevious: Boolean, callback: FrameRequestCallback): Unit = js.native
  }
}
