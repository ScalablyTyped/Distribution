package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleSchemaOptions extends js.Object {
  
  var check: js.UndefOr[Boolean] = js.native
  
  var clean: js.UndefOr[CleanOption] = js.native
  
  var defaultLabel: js.UndefOr[String] = js.native
  
  var humanizeAutoLabels: js.UndefOr[Boolean] = js.native
  
  var requiredByDefault: js.UndefOr[Boolean] = js.native
  
  var tracker: js.UndefOr[js.Any] = js.native
}
object SimpleSchemaOptions {
  
  @scala.inline
  def apply(): SimpleSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleSchemaOptions]
  }
  
  @scala.inline
  implicit class SimpleSchemaOptionsOps[Self <: SimpleSchemaOptions] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setClean(value: CleanOption): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    
    @scala.inline
    def setDefaultLabel(value: String): Self = this.set("defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLabel: Self = this.set("defaultLabel", js.undefined)
    
    @scala.inline
    def setHumanizeAutoLabels(value: Boolean): Self = this.set("humanizeAutoLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanizeAutoLabels: Self = this.set("humanizeAutoLabels", js.undefined)
    
    @scala.inline
    def setRequiredByDefault(value: Boolean): Self = this.set("requiredByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredByDefault: Self = this.set("requiredByDefault", js.undefined)
    
    @scala.inline
    def setTracker(value: js.Any): Self = this.set("tracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracker: Self = this.set("tracker", js.undefined)
  }
}
