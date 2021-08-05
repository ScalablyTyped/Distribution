package typings.smartwizard

import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQuerySmartwizard {
  
  trait AnchorSettings extends StObject {
    
    var anchorClickable: js.UndefOr[Boolean] = js.undefined
    
    var enableAllAnchors: js.UndefOr[Boolean] = js.undefined
    
    var enableAnchorOnDoneStep: js.UndefOr[Boolean] = js.undefined
    
    var markAllPreviousStepsAsDone: js.UndefOr[Boolean] = js.undefined
    
    var markDoneStep: js.UndefOr[Boolean] = js.undefined
    
    var removeDoneStepOnNavigateBack: js.UndefOr[Boolean] = js.undefined
  }
  object AnchorSettings {
    
    inline def apply(): AnchorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorSettings]
    }
    
    extension [Self <: AnchorSettings](x: Self) {
      
      inline def setAnchorClickable(value: Boolean): Self = StObject.set(x, "anchorClickable", value.asInstanceOf[js.Any])
      
      inline def setAnchorClickableUndefined: Self = StObject.set(x, "anchorClickable", js.undefined)
      
      inline def setEnableAllAnchors(value: Boolean): Self = StObject.set(x, "enableAllAnchors", value.asInstanceOf[js.Any])
      
      inline def setEnableAllAnchorsUndefined: Self = StObject.set(x, "enableAllAnchors", js.undefined)
      
      inline def setEnableAnchorOnDoneStep(value: Boolean): Self = StObject.set(x, "enableAnchorOnDoneStep", value.asInstanceOf[js.Any])
      
      inline def setEnableAnchorOnDoneStepUndefined: Self = StObject.set(x, "enableAnchorOnDoneStep", js.undefined)
      
      inline def setMarkAllPreviousStepsAsDone(value: Boolean): Self = StObject.set(x, "markAllPreviousStepsAsDone", value.asInstanceOf[js.Any])
      
      inline def setMarkAllPreviousStepsAsDoneUndefined: Self = StObject.set(x, "markAllPreviousStepsAsDone", js.undefined)
      
      inline def setMarkDoneStep(value: Boolean): Self = StObject.set(x, "markDoneStep", value.asInstanceOf[js.Any])
      
      inline def setMarkDoneStepUndefined: Self = StObject.set(x, "markDoneStep", js.undefined)
      
      inline def setRemoveDoneStepOnNavigateBack(value: Boolean): Self = StObject.set(x, "removeDoneStepOnNavigateBack", value.asInstanceOf[js.Any])
      
      inline def setRemoveDoneStepOnNavigateBackUndefined: Self = StObject.set(x, "removeDoneStepOnNavigateBack", js.undefined)
    }
  }
  
  trait Lang extends StObject {
    
    var next: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
  }
  object Lang {
    
    inline def apply(): Lang = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lang]
    }
    
    extension [Self <: Lang](x: Self) {
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait SmartWizardOptions extends StObject {
    
    var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
    
    var anchorSettings: js.UndefOr[AnchorSettings] = js.undefined
    
    var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
    
    var backButtonSupport: js.UndefOr[Boolean] = js.undefined
    
    var contentCache: js.UndefOr[Boolean] = js.undefined
    
    var contentURL: js.UndefOr[Null | String] = js.undefined
    
    var cycleSteps: js.UndefOr[Boolean] = js.undefined
    
    var disabledSteps: js.UndefOr[js.Array[Double]] = js.undefined
    
    var errorSteps: js.UndefOr[js.Array[Double]] = js.undefined
    
    var hiddenSteps: js.UndefOr[js.Array[Double]] = js.undefined
    
    var keyNavigation: js.UndefOr[Boolean] = js.undefined
    
    var lang: js.UndefOr[Lang] = js.undefined
    
    var selected: js.UndefOr[Double] = js.undefined
    
    var showStepURLhash: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
    
    var transitionEffect: js.UndefOr[TransitionEffect] = js.undefined
    
    var transitionSpeed: js.UndefOr[String | Double] = js.undefined
    
    var useURLhash: js.UndefOr[Boolean] = js.undefined
  }
  object SmartWizardOptions {
    
    inline def apply(): SmartWizardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartWizardOptions]
    }
    
    extension [Self <: SmartWizardOptions](x: Self) {
      
      inline def setAjaxSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      inline def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      inline def setAnchorSettings(value: AnchorSettings): Self = StObject.set(x, "anchorSettings", value.asInstanceOf[js.Any])
      
      inline def setAnchorSettingsUndefined: Self = StObject.set(x, "anchorSettings", js.undefined)
      
      inline def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      inline def setBackButtonSupport(value: Boolean): Self = StObject.set(x, "backButtonSupport", value.asInstanceOf[js.Any])
      
      inline def setBackButtonSupportUndefined: Self = StObject.set(x, "backButtonSupport", js.undefined)
      
      inline def setContentCache(value: Boolean): Self = StObject.set(x, "contentCache", value.asInstanceOf[js.Any])
      
      inline def setContentCacheUndefined: Self = StObject.set(x, "contentCache", js.undefined)
      
      inline def setContentURL(value: String): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
      
      inline def setContentURLNull: Self = StObject.set(x, "contentURL", null)
      
      inline def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
      
      inline def setCycleSteps(value: Boolean): Self = StObject.set(x, "cycleSteps", value.asInstanceOf[js.Any])
      
      inline def setCycleStepsUndefined: Self = StObject.set(x, "cycleSteps", js.undefined)
      
      inline def setDisabledSteps(value: js.Array[Double]): Self = StObject.set(x, "disabledSteps", value.asInstanceOf[js.Any])
      
      inline def setDisabledStepsUndefined: Self = StObject.set(x, "disabledSteps", js.undefined)
      
      inline def setDisabledStepsVarargs(value: Double*): Self = StObject.set(x, "disabledSteps", js.Array(value :_*))
      
      inline def setErrorSteps(value: js.Array[Double]): Self = StObject.set(x, "errorSteps", value.asInstanceOf[js.Any])
      
      inline def setErrorStepsUndefined: Self = StObject.set(x, "errorSteps", js.undefined)
      
      inline def setErrorStepsVarargs(value: Double*): Self = StObject.set(x, "errorSteps", js.Array(value :_*))
      
      inline def setHiddenSteps(value: js.Array[Double]): Self = StObject.set(x, "hiddenSteps", value.asInstanceOf[js.Any])
      
      inline def setHiddenStepsUndefined: Self = StObject.set(x, "hiddenSteps", js.undefined)
      
      inline def setHiddenStepsVarargs(value: Double*): Self = StObject.set(x, "hiddenSteps", js.Array(value :_*))
      
      inline def setKeyNavigation(value: Boolean): Self = StObject.set(x, "keyNavigation", value.asInstanceOf[js.Any])
      
      inline def setKeyNavigationUndefined: Self = StObject.set(x, "keyNavigation", js.undefined)
      
      inline def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShowStepURLhash(value: Boolean): Self = StObject.set(x, "showStepURLhash", value.asInstanceOf[js.Any])
      
      inline def setShowStepURLhashUndefined: Self = StObject.set(x, "showStepURLhash", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      inline def setTransitionEffect(value: TransitionEffect): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
      
      inline def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
      
      inline def setTransitionSpeed(value: String | Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
      
      inline def setUseURLhash(value: Boolean): Self = StObject.set(x, "useURLhash", value.asInstanceOf[js.Any])
      
      inline def setUseURLhashUndefined: Self = StObject.set(x, "useURLhash", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.left
    - typings.smartwizard.smartwizardStrings.right
  */
  trait ToolbarButtonPosition extends StObject
  object ToolbarButtonPosition {
    
    inline def left: typings.smartwizard.smartwizardStrings.left = "left".asInstanceOf[typings.smartwizard.smartwizardStrings.left]
    
    inline def right: typings.smartwizard.smartwizardStrings.right = "right".asInstanceOf[typings.smartwizard.smartwizardStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.none
    - typings.smartwizard.smartwizardStrings.top
    - typings.smartwizard.smartwizardStrings.bottom
    - typings.smartwizard.smartwizardStrings.both
  */
  trait ToolbarPosition extends StObject
  object ToolbarPosition {
    
    inline def both: typings.smartwizard.smartwizardStrings.both = "both".asInstanceOf[typings.smartwizard.smartwizardStrings.both]
    
    inline def bottom: typings.smartwizard.smartwizardStrings.bottom = "bottom".asInstanceOf[typings.smartwizard.smartwizardStrings.bottom]
    
    inline def none: typings.smartwizard.smartwizardStrings.none = "none".asInstanceOf[typings.smartwizard.smartwizardStrings.none]
    
    inline def top: typings.smartwizard.smartwizardStrings.top = "top".asInstanceOf[typings.smartwizard.smartwizardStrings.top]
  }
  
  trait ToolbarSettings extends StObject {
    
    var showNextButton: js.UndefOr[Boolean] = js.undefined
    
    var showPreviousButton: js.UndefOr[Boolean] = js.undefined
    
    var toolbarButtonPosition: js.UndefOr[ToolbarButtonPosition] = js.undefined
    
    var toolbarExtraButtons: js.UndefOr[js.Array[JQuery]] = js.undefined
    
    var toolbarPosition: js.UndefOr[ToolbarPosition] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    extension [Self <: ToolbarSettings](x: Self) {
      
      inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      inline def setShowPreviousButton(value: Boolean): Self = StObject.set(x, "showPreviousButton", value.asInstanceOf[js.Any])
      
      inline def setShowPreviousButtonUndefined: Self = StObject.set(x, "showPreviousButton", js.undefined)
      
      inline def setToolbarButtonPosition(value: ToolbarButtonPosition): Self = StObject.set(x, "toolbarButtonPosition", value.asInstanceOf[js.Any])
      
      inline def setToolbarButtonPositionUndefined: Self = StObject.set(x, "toolbarButtonPosition", js.undefined)
      
      inline def setToolbarExtraButtons(value: js.Array[JQuery]): Self = StObject.set(x, "toolbarExtraButtons", value.asInstanceOf[js.Any])
      
      inline def setToolbarExtraButtonsUndefined: Self = StObject.set(x, "toolbarExtraButtons", js.undefined)
      
      inline def setToolbarExtraButtonsVarargs(value: JQuery*): Self = StObject.set(x, "toolbarExtraButtons", js.Array(value :_*))
      
      inline def setToolbarPosition(value: ToolbarPosition): Self = StObject.set(x, "toolbarPosition", value.asInstanceOf[js.Any])
      
      inline def setToolbarPositionUndefined: Self = StObject.set(x, "toolbarPosition", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.none
    - typings.smartwizard.smartwizardStrings.slide
    - typings.smartwizard.smartwizardStrings.fade
  */
  trait TransitionEffect extends StObject
  object TransitionEffect {
    
    inline def fade: typings.smartwizard.smartwizardStrings.fade = "fade".asInstanceOf[typings.smartwizard.smartwizardStrings.fade]
    
    inline def none: typings.smartwizard.smartwizardStrings.none = "none".asInstanceOf[typings.smartwizard.smartwizardStrings.none]
    
    inline def slide: typings.smartwizard.smartwizardStrings.slide = "slide".asInstanceOf[typings.smartwizard.smartwizardStrings.slide]
  }
}
