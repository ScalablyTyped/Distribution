package typings.pulumiPulumi.workspaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSummary extends js.Object {
  
  var current: Boolean = js.native
  
  var lastUpdate: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var resourceCount: js.UndefOr[Double] = js.native
  
  var updateInProgress: Boolean = js.native
  
  var url: js.UndefOr[String] = js.native
}
object StackSummary {
  
  @scala.inline
  def apply(current: Boolean, name: String, updateInProgress: Boolean): StackSummary = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateInProgress = updateInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
  
  @scala.inline
  implicit class StackSummaryOps[Self <: StackSummary] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInProgress(value: Boolean): Self = this.set("updateInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdate(value: String): Self = this.set("lastUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdate: Self = this.set("lastUpdate", js.undefined)
    
    @scala.inline
    def setResourceCount(value: Double): Self = this.set("resourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceCount: Self = this.set("resourceCount", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
