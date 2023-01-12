package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides proof of a scheduled Dispatch job and allows its scheduling to be manipulated.
  */
trait JobToken extends StObject {
  
  /**
    * Cancels the job. For one-time jobs, if the job has already fired, calling this has no
    * effect.
    */
  def cancel(): Unit
  
  /** Pauses the job, preventing it from firing until `resume` is called. */
  def pause(): Unit
  
  /** Resumes a job whose scheduling was paused with `pause`. */
  def resume(): Unit
}
object JobToken {
  
  inline def apply(cancel: () => Unit, pause: () => Unit, resume: () => Unit): JobToken = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[JobToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobToken] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
  }
}
