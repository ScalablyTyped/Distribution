package typings.smartwizard.JQuerySmartwizard

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartWizardOptions extends js.Object {
  
  var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.native
  
  var anchorSettings: js.UndefOr[AnchorSettings] = js.native
  
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  
  var backButtonSupport: js.UndefOr[Boolean] = js.native
  
  var contentCache: js.UndefOr[Boolean] = js.native
  
  var contentURL: js.UndefOr[Null | String] = js.native
  
  var cycleSteps: js.UndefOr[Boolean] = js.native
  
  var disabledSteps: js.UndefOr[js.Array[Double]] = js.native
  
  var errorSteps: js.UndefOr[js.Array[Double]] = js.native
  
  var hiddenSteps: js.UndefOr[js.Array[Double]] = js.native
  
  var keyNavigation: js.UndefOr[Boolean] = js.native
  
  var lang: js.UndefOr[Lang] = js.native
  
  var selected: js.UndefOr[Double] = js.native
  
  var showStepURLhash: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  
  var transitionEffect: js.UndefOr[TransitionEffect] = js.native
  
  var transitionSpeed: js.UndefOr[String | Double] = js.native
  
  var useURLhash: js.UndefOr[Boolean] = js.native
}
object SmartWizardOptions {
  
  @scala.inline
  def apply(): SmartWizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartWizardOptions]
  }
  
  @scala.inline
  implicit class SmartWizardOptionsOps[Self <: SmartWizardOptions] (val x: Self) extends AnyVal {
    
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
    def setAjaxSettings(value: JQueryAjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    
    @scala.inline
    def setAnchorSettings(value: AnchorSettings): Self = this.set("anchorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorSettings: Self = this.set("anchorSettings", js.undefined)
    
    @scala.inline
    def setAutoAdjustHeight(value: Boolean): Self = this.set("autoAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdjustHeight: Self = this.set("autoAdjustHeight", js.undefined)
    
    @scala.inline
    def setBackButtonSupport(value: Boolean): Self = this.set("backButtonSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackButtonSupport: Self = this.set("backButtonSupport", js.undefined)
    
    @scala.inline
    def setContentCache(value: Boolean): Self = this.set("contentCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCache: Self = this.set("contentCache", js.undefined)
    
    @scala.inline
    def setContentURL(value: String): Self = this.set("contentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentURL: Self = this.set("contentURL", js.undefined)
    
    @scala.inline
    def setContentURLNull: Self = this.set("contentURL", null)
    
    @scala.inline
    def setCycleSteps(value: Boolean): Self = this.set("cycleSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycleSteps: Self = this.set("cycleSteps", js.undefined)
    
    @scala.inline
    def setDisabledStepsVarargs(value: Double*): Self = this.set("disabledSteps", js.Array(value :_*))
    
    @scala.inline
    def setDisabledSteps(value: js.Array[Double]): Self = this.set("disabledSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledSteps: Self = this.set("disabledSteps", js.undefined)
    
    @scala.inline
    def setErrorStepsVarargs(value: Double*): Self = this.set("errorSteps", js.Array(value :_*))
    
    @scala.inline
    def setErrorSteps(value: js.Array[Double]): Self = this.set("errorSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorSteps: Self = this.set("errorSteps", js.undefined)
    
    @scala.inline
    def setHiddenStepsVarargs(value: Double*): Self = this.set("hiddenSteps", js.Array(value :_*))
    
    @scala.inline
    def setHiddenSteps(value: js.Array[Double]): Self = this.set("hiddenSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenSteps: Self = this.set("hiddenSteps", js.undefined)
    
    @scala.inline
    def setKeyNavigation(value: Boolean): Self = this.set("keyNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyNavigation: Self = this.set("keyNavigation", js.undefined)
    
    @scala.inline
    def setLang(value: Lang): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setSelected(value: Double): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShowStepURLhash(value: Boolean): Self = this.set("showStepURLhash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStepURLhash: Self = this.set("showStepURLhash", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: TransitionEffect): Self = this.set("transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEffect: Self = this.set("transitionEffect", js.undefined)
    
    @scala.inline
    def setTransitionSpeed(value: String | Double): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
    
    @scala.inline
    def setUseURLhash(value: Boolean): Self = this.set("useURLhash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseURLhash: Self = this.set("useURLhash", js.undefined)
  }
}
