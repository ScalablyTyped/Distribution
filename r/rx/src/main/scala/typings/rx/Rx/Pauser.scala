package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pauser extends js.Object {
  
  /**
    * Pauses the underlying sequence.
    */
  def pause(): Unit = js.native
  
  /**
    * Resumes the underlying sequence.
    */
  def resume(): Unit = js.native
}
object Pauser {
  
  @scala.inline
  def apply(pause: () => Unit, resume: () => Unit): Pauser = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[Pauser]
  }
  
  @scala.inline
  implicit class PauserOps[Self <: Pauser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
  }
}
