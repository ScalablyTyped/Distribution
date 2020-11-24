package typings.smartwizard.JQuerySmartwizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorSettings extends js.Object {
  
  var anchorClickable: js.UndefOr[Boolean] = js.native
  
  var enableAllAnchors: js.UndefOr[Boolean] = js.native
  
  var enableAnchorOnDoneStep: js.UndefOr[Boolean] = js.native
  
  var markAllPreviousStepsAsDone: js.UndefOr[Boolean] = js.native
  
  var markDoneStep: js.UndefOr[Boolean] = js.native
  
  var removeDoneStepOnNavigateBack: js.UndefOr[Boolean] = js.native
}
object AnchorSettings {
  
  @scala.inline
  def apply(): AnchorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorSettings]
  }
  
  @scala.inline
  implicit class AnchorSettingsOps[Self <: AnchorSettings] (val x: Self) extends AnyVal {
    
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
    def setAnchorClickable(value: Boolean): Self = this.set("anchorClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorClickable: Self = this.set("anchorClickable", js.undefined)
    
    @scala.inline
    def setEnableAllAnchors(value: Boolean): Self = this.set("enableAllAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAllAnchors: Self = this.set("enableAllAnchors", js.undefined)
    
    @scala.inline
    def setEnableAnchorOnDoneStep(value: Boolean): Self = this.set("enableAnchorOnDoneStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnchorOnDoneStep: Self = this.set("enableAnchorOnDoneStep", js.undefined)
    
    @scala.inline
    def setMarkAllPreviousStepsAsDone(value: Boolean): Self = this.set("markAllPreviousStepsAsDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkAllPreviousStepsAsDone: Self = this.set("markAllPreviousStepsAsDone", js.undefined)
    
    @scala.inline
    def setMarkDoneStep(value: Boolean): Self = this.set("markDoneStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkDoneStep: Self = this.set("markDoneStep", js.undefined)
    
    @scala.inline
    def setRemoveDoneStepOnNavigateBack(value: Boolean): Self = this.set("removeDoneStepOnNavigateBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveDoneStepOnNavigateBack: Self = this.set("removeDoneStepOnNavigateBack", js.undefined)
  }
}
