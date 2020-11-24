package typings.progressbarJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationSupport extends js.Object {
  
  /**
    * @param progress - progress from 0 to 1.
    * @param [options] - Animation options. These options override the defaults given in initialization
    * @param [cb] - Callback function which is called after transition ends.
    */
  def animate(progress: Double): Unit = js.native
  def animate(progress: Double, options: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def animate(progress: Double, options: AnimationOptions): Unit = js.native
  def animate(progress: Double, options: AnimationOptions, cb: js.Function0[Unit]): Unit = js.native
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
  
  /**
    * @param progress = progress from 0 to 1.
    */
  def set(progress: Double): Unit = js.native
  
  /**
    * Stops animation to its current position.
    */
  def stop(): Unit = js.native
  
  /**
    * Returns current shown progress from 0 to 1.
    * This value changes when animation is running.
    */
  def value(): Double = js.native
}
