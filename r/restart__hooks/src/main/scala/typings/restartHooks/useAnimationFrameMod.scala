package typings.restartHooks

import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useAnimationFrame", JSImport.Namespace)
@js.native
object useAnimationFrameMod extends js.Object {
  
  def default(): UseAnimationFrameReturn = js.native
  
  @js.native
  trait UseAnimationFrameReturn extends js.Object {
    
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
