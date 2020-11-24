package typings.pulumiPulumi.automationStackMod

import typings.pulumiPulumi.workspaceMod.PulumiFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewOptions extends js.Object {
  
  var expectNoChanges: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var parallel: js.UndefOr[Double] = js.native
  
  var program: js.UndefOr[PulumiFn] = js.native
  
  var replace: js.UndefOr[js.Array[String]] = js.native
  
  var target: js.UndefOr[js.Array[String]] = js.native
  
  var targetDependents: js.UndefOr[Boolean] = js.native
}
object PreviewOptions {
  
  @scala.inline
  def apply(): PreviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewOptions]
  }
  
  @scala.inline
  implicit class PreviewOptionsOps[Self <: PreviewOptions] (val x: Self) extends AnyVal {
    
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
    def setExpectNoChanges(value: Boolean): Self = this.set("expectNoChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectNoChanges: Self = this.set("expectNoChanges", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setProgram(value: () => js.Promise[(Record[String, js.Any]) | Unit]): Self = this.set("program", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setReplaceVarargs(value: String*): Self = this.set("replace", js.Array(value :_*))
    
    @scala.inline
    def setReplace(value: js.Array[String]): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetDependents(value: Boolean): Self = this.set("targetDependents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDependents: Self = this.set("targetDependents", js.undefined)
  }
}
