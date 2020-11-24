package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completed
  extends /* key */ StringDictionary[js.Any] {
  
  var completed: js.UndefOr[Double] = js.native
  
  var errored: js.UndefOr[Double] = js.native
  
  var failed: js.UndefOr[Double] = js.native
  
  var finished: js.UndefOr[Double] = js.native
  
  var passed: js.UndefOr[Double] = js.native
  
  var public: js.UndefOr[Double] = js.native
  
  var queued: js.UndefOr[Double] = js.native
  
  var running: js.UndefOr[Double] = js.native
}
object Completed {
  
  @scala.inline
  def apply(): Completed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Completed]
  }
  
  @scala.inline
  implicit class CompletedOps[Self <: Completed] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    
    @scala.inline
    def setErrored(value: Double): Self = this.set("errored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrored: Self = this.set("errored", js.undefined)
    
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    
    @scala.inline
    def setFinished(value: Double): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinished: Self = this.set("finished", js.undefined)
    
    @scala.inline
    def setPassed(value: Double): Self = this.set("passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
    
    @scala.inline
    def setPublic(value: Double): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setQueued(value: Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueued: Self = this.set("queued", js.undefined)
    
    @scala.inline
    def setRunning(value: Double): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
  }
}
