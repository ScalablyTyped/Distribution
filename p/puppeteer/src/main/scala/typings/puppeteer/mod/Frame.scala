package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame
  extends StObject
     with FrameBase {
  
  def childFrames(): js.Array[Frame] = js.native
  
  /** Execution context associated with this frame. */
  def executionContext(): js.Promise[ExecutionContext] = js.native
  
  /** Returns `true` if the frame has been detached, or `false` otherwise. */
  def isDetached(): Boolean = js.native
  
  /** Returns frame's name attribute as specified in the tag. */
  def name(): String = js.native
  
  /** Returns parent frame, if any. Detached frames and main frames return null. */
  def parentFrame(): Frame | Null = js.native
}
