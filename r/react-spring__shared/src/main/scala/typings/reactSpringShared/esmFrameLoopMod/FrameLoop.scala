package typings.reactSpringShared.esmFrameLoopMod

import typings.reactSpringShared.esmTypesMod.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/shared/esm/FrameLoop", "FrameLoop")
@js.native
class FrameLoop () extends js.Object {
  def this(raf: RequestFrameFn) = this()
  
  var _animations: js.Array[OpaqueAnimation] = js.native
  
  /* protected */ def _dispose(): Unit = js.native
  
  /**
    * Advance the animations to the current time.
    */
  def advance(): Unit = js.native
  
  /**
    * Execute a function once after all animations have updated.
    */
  def onFrame(cb: FrameRequestCallback): Unit = js.native
  
  /**
    * Execute a function once at the very end of the current frame.
    *
    * Only call this within an `onFrame` callback.
    */
  def onWrite(cb: FrameRequestCallback): Unit = js.native
  
  /**
    * Invoke the given `handler` on the soonest frame after the given
    * `ms` delay is completed. When the delay is `<= 0`, the handler is
    * invoked immediately.
    */
  def setTimeout(handler: js.Function0[Unit], ms: Double): Timeout = js.native
  
  /**
    * Start a new animation, or reorder an active animation in
    * the animations array in response to a priority change.
    */
  def start(animation: OpaqueAnimation): Unit = js.native
}
