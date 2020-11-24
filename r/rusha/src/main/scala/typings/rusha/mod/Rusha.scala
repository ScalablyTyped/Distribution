package typings.rusha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rusha extends js.Object {
  
  def createHash(): Hash = js.native
  
  def createWorker(): RushaWorker = js.native
  
  def disableWorkerBehaviour(): Unit = js.native
}
object Rusha {
  
  @scala.inline
  def apply(createHash: () => Hash, createWorker: () => RushaWorker, disableWorkerBehaviour: () => Unit): Rusha = {
    val __obj = js.Dynamic.literal(createHash = js.Any.fromFunction0(createHash), createWorker = js.Any.fromFunction0(createWorker), disableWorkerBehaviour = js.Any.fromFunction0(disableWorkerBehaviour))
    __obj.asInstanceOf[Rusha]
  }
  
  @scala.inline
  implicit class RushaOps[Self <: Rusha] (val x: Self) extends AnyVal {
    
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
    def setCreateHash(value: () => Hash): Self = this.set("createHash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWorker(value: () => RushaWorker): Self = this.set("createWorker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableWorkerBehaviour(value: () => Unit): Self = this.set("disableWorkerBehaviour", js.Any.fromFunction0(value))
  }
}
