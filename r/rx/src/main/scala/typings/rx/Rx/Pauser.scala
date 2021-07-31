package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pauser extends StObject {
  
  /**
    * Pauses the underlying sequence.
    */
  def pause(): Unit
  
  /**
    * Resumes the underlying sequence.
    */
  def resume(): Unit
}
object Pauser {
  
  @scala.inline
  def apply(pause: () => Unit, resume: () => Unit): Pauser = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[Pauser]
  }
  
  @scala.inline
  implicit class PauserMutableBuilder[Self <: Pauser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
  }
}
