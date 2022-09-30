package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.JobOptions
import typings.sphereEngineBrowser.JobToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Dispatch API provides the means by which the game can manage the event loop.
  */
object Dispatch {
  
  @JSGlobal("Dispatch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cancel all currently scheduled one-time jobs, excluding those scheduled with `onExit`.
    * Recurring jobs are not affected.
    */
  inline def cancelAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAll")().asInstanceOf[Unit]
  
  /**
    * Schedule a one-time job to be run during a future frame.
    * @param numFrames How many frames to wait before firing.
    * @param callback  A function to be called when the Dispatch job fires.
    */
  inline def later(numFrames: Double, callback: js.Function0[Unit]): JobToken = (^.asInstanceOf[js.Dynamic].applyDynamic("later")(numFrames.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[JobToken]
  
  /**
    * Schedule a one-time job to run during the current frame.
    * @param callback A function to be called when the Dispatch job fires.
    */
  inline def now(callback: js.Function0[Unit]): JobToken = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(callback.asInstanceOf[js.Any]).asInstanceOf[JobToken]
  
  /**
    * Schedule a one-time job to run when the engine shuts down.
    * @param callback A function to be called when the Dispatch job fires.
    */
  inline def onExit(callback: js.Function0[Unit]): JobToken = ^.asInstanceOf[js.Dynamic].applyDynamic("onExit")(callback.asInstanceOf[js.Any]).asInstanceOf[JobToken]
  
  /**
    * Schedule a recurring job to run during the Render phase of each frame, before the backbuffer
    * is flipped to the screen.
    * @param callback A non-`async` function to be called when the job fires.
    * @param options  Scheduling options for this job.
    */
  inline def onRender(callback: js.Function0[Unit]): JobToken = ^.asInstanceOf[js.Dynamic].applyDynamic("onRender")(callback.asInstanceOf[js.Any]).asInstanceOf[JobToken]
  inline def onRender(callback: js.Function0[Unit], options: JobOptions): JobToken = (^.asInstanceOf[js.Dynamic].applyDynamic("onRender")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobToken]
  
  /**
    * Schedule a recurring job to run during the Update phase of each frame. Use an `async`
    * callback to spread an update over multiple frames.
    * @param callback A function to be called when the job fires.
    * @param options  Scheduling options for this job.
    */
  inline def onUpdate(callback: js.Function0[Unit]): JobToken = ^.asInstanceOf[js.Dynamic].applyDynamic("onUpdate")(callback.asInstanceOf[js.Any]).asInstanceOf[JobToken]
  inline def onUpdate(callback: js.Function0[Unit], options: JobOptions): JobToken = (^.asInstanceOf[js.Dynamic].applyDynamic("onUpdate")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobToken]
}
