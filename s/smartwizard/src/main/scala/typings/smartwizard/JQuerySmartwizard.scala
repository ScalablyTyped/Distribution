package typings.smartwizard

import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQuerySmartwizard {
  
  @js.native
  trait AnchorSettings extends StObject {
    
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
    implicit class AnchorSettingsMutableBuilder[Self <: AnchorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorClickable(value: Boolean): Self = StObject.set(x, "anchorClickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorClickableUndefined: Self = StObject.set(x, "anchorClickable", js.undefined)
      
      @scala.inline
      def setEnableAllAnchors(value: Boolean): Self = StObject.set(x, "enableAllAnchors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAllAnchorsUndefined: Self = StObject.set(x, "enableAllAnchors", js.undefined)
      
      @scala.inline
      def setEnableAnchorOnDoneStep(value: Boolean): Self = StObject.set(x, "enableAnchorOnDoneStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnchorOnDoneStepUndefined: Self = StObject.set(x, "enableAnchorOnDoneStep", js.undefined)
      
      @scala.inline
      def setMarkAllPreviousStepsAsDone(value: Boolean): Self = StObject.set(x, "markAllPreviousStepsAsDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkAllPreviousStepsAsDoneUndefined: Self = StObject.set(x, "markAllPreviousStepsAsDone", js.undefined)
      
      @scala.inline
      def setMarkDoneStep(value: Boolean): Self = StObject.set(x, "markDoneStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDoneStepUndefined: Self = StObject.set(x, "markDoneStep", js.undefined)
      
      @scala.inline
      def setRemoveDoneStepOnNavigateBack(value: Boolean): Self = StObject.set(x, "removeDoneStepOnNavigateBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDoneStepOnNavigateBackUndefined: Self = StObject.set(x, "removeDoneStepOnNavigateBack", js.undefined)
    }
  }
  
  @js.native
  trait Lang extends StObject {
    
    var next: js.UndefOr[String] = js.native
    
    var previous: js.UndefOr[String] = js.native
  }
  object Lang {
    
    @scala.inline
    def apply(): Lang = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lang]
    }
    
    @scala.inline
    implicit class LangMutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  @js.native
  trait SmartWizardOptions extends StObject {
    
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
    implicit class SmartWizardOptionsMutableBuilder[Self <: SmartWizardOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAnchorSettings(value: AnchorSettings): Self = StObject.set(x, "anchorSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorSettingsUndefined: Self = StObject.set(x, "anchorSettings", js.undefined)
      
      @scala.inline
      def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      @scala.inline
      def setBackButtonSupport(value: Boolean): Self = StObject.set(x, "backButtonSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonSupportUndefined: Self = StObject.set(x, "backButtonSupport", js.undefined)
      
      @scala.inline
      def setContentCache(value: Boolean): Self = StObject.set(x, "contentCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentCacheUndefined: Self = StObject.set(x, "contentCache", js.undefined)
      
      @scala.inline
      def setContentURL(value: String): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentURLNull: Self = StObject.set(x, "contentURL", null)
      
      @scala.inline
      def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
      
      @scala.inline
      def setCycleSteps(value: Boolean): Self = StObject.set(x, "cycleSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCycleStepsUndefined: Self = StObject.set(x, "cycleSteps", js.undefined)
      
      @scala.inline
      def setDisabledSteps(value: js.Array[Double]): Self = StObject.set(x, "disabledSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStepsUndefined: Self = StObject.set(x, "disabledSteps", js.undefined)
      
      @scala.inline
      def setDisabledStepsVarargs(value: Double*): Self = StObject.set(x, "disabledSteps", js.Array(value :_*))
      
      @scala.inline
      def setErrorSteps(value: js.Array[Double]): Self = StObject.set(x, "errorSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStepsUndefined: Self = StObject.set(x, "errorSteps", js.undefined)
      
      @scala.inline
      def setErrorStepsVarargs(value: Double*): Self = StObject.set(x, "errorSteps", js.Array(value :_*))
      
      @scala.inline
      def setHiddenSteps(value: js.Array[Double]): Self = StObject.set(x, "hiddenSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenStepsUndefined: Self = StObject.set(x, "hiddenSteps", js.undefined)
      
      @scala.inline
      def setHiddenStepsVarargs(value: Double*): Self = StObject.set(x, "hiddenSteps", js.Array(value :_*))
      
      @scala.inline
      def setKeyNavigation(value: Boolean): Self = StObject.set(x, "keyNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNavigationUndefined: Self = StObject.set(x, "keyNavigation", js.undefined)
      
      @scala.inline
      def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShowStepURLhash(value: Boolean): Self = StObject.set(x, "showStepURLhash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStepURLhashUndefined: Self = StObject.set(x, "showStepURLhash", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      @scala.inline
      def setTransitionEffect(value: TransitionEffect): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
      
      @scala.inline
      def setTransitionSpeed(value: String | Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
      
      @scala.inline
      def setUseURLhash(value: Boolean): Self = StObject.set(x, "useURLhash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseURLhashUndefined: Self = StObject.set(x, "useURLhash", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.left
    - typings.smartwizard.smartwizardStrings.right
  */
  trait ToolbarButtonPosition extends StObject
  object ToolbarButtonPosition {
    
    @scala.inline
    def left: typings.smartwizard.smartwizardStrings.left = "left".asInstanceOf[typings.smartwizard.smartwizardStrings.left]
    
    @scala.inline
    def right: typings.smartwizard.smartwizardStrings.right = "right".asInstanceOf[typings.smartwizard.smartwizardStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.none
    - typings.smartwizard.smartwizardStrings.top
    - typings.smartwizard.smartwizardStrings.bottom
    - typings.smartwizard.smartwizardStrings.both
  */
  trait ToolbarPosition extends StObject
  object ToolbarPosition {
    
    @scala.inline
    def both: typings.smartwizard.smartwizardStrings.both = "both".asInstanceOf[typings.smartwizard.smartwizardStrings.both]
    
    @scala.inline
    def bottom: typings.smartwizard.smartwizardStrings.bottom = "bottom".asInstanceOf[typings.smartwizard.smartwizardStrings.bottom]
    
    @scala.inline
    def none: typings.smartwizard.smartwizardStrings.none = "none".asInstanceOf[typings.smartwizard.smartwizardStrings.none]
    
    @scala.inline
    def top: typings.smartwizard.smartwizardStrings.top = "top".asInstanceOf[typings.smartwizard.smartwizardStrings.top]
  }
  
  @js.native
  trait ToolbarSettings extends StObject {
    
    var showNextButton: js.UndefOr[Boolean] = js.native
    
    var showPreviousButton: js.UndefOr[Boolean] = js.native
    
    var toolbarButtonPosition: js.UndefOr[ToolbarButtonPosition] = js.native
    
    var toolbarExtraButtons: js.UndefOr[js.Array[JQuery]] = js.native
    
    var toolbarPosition: js.UndefOr[ToolbarPosition] = js.native
  }
  object ToolbarSettings {
    
    @scala.inline
    def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit class ToolbarSettingsMutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      @scala.inline
      def setShowPreviousButton(value: Boolean): Self = StObject.set(x, "showPreviousButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviousButtonUndefined: Self = StObject.set(x, "showPreviousButton", js.undefined)
      
      @scala.inline
      def setToolbarButtonPosition(value: ToolbarButtonPosition): Self = StObject.set(x, "toolbarButtonPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarButtonPositionUndefined: Self = StObject.set(x, "toolbarButtonPosition", js.undefined)
      
      @scala.inline
      def setToolbarExtraButtons(value: js.Array[JQuery]): Self = StObject.set(x, "toolbarExtraButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarExtraButtonsUndefined: Self = StObject.set(x, "toolbarExtraButtons", js.undefined)
      
      @scala.inline
      def setToolbarExtraButtonsVarargs(value: JQuery*): Self = StObject.set(x, "toolbarExtraButtons", js.Array(value :_*))
      
      @scala.inline
      def setToolbarPosition(value: ToolbarPosition): Self = StObject.set(x, "toolbarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarPositionUndefined: Self = StObject.set(x, "toolbarPosition", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.none
    - typings.smartwizard.smartwizardStrings.slide
    - typings.smartwizard.smartwizardStrings.fade
  */
  trait TransitionEffect extends StObject
  object TransitionEffect {
    
    @scala.inline
    def fade: typings.smartwizard.smartwizardStrings.fade = "fade".asInstanceOf[typings.smartwizard.smartwizardStrings.fade]
    
    @scala.inline
    def none: typings.smartwizard.smartwizardStrings.none = "none".asInstanceOf[typings.smartwizard.smartwizardStrings.none]
    
    @scala.inline
    def slide: typings.smartwizard.smartwizardStrings.slide = "slide".asInstanceOf[typings.smartwizard.smartwizardStrings.slide]
  }
}
