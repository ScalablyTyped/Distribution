package typings.smartwizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQuerySmartwizard {
  
  trait AnchorSettings extends StObject {
    
    /**
      * Enable/Disable anchor navigation
      *
      * @default true
      */
    var anchorClickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Activates all anchors clickable all times
      *
      * @default false
      */
    var enableAllAnchors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/Disable the done steps navigation
      *
      * @default true
      */
    var enableAnchorOnDoneStep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a step selected by url hash, all previous steps are marked done
      *
      * @default true
      */
    var markAllPreviousStepsAsDone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add done state on navigation
      *
      * @default true
      */
    var markDoneStep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * While navigate back done step after active step will be cleared
      *
      * @default false
      */
    var removeDoneStepOnNavigateBack: js.UndefOr[Boolean] = js.undefined
  }
  object AnchorSettings {
    
    inline def apply(): AnchorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorSettings] (val x: Self) extends AnyVal {
      
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
  
  trait KeyboardSettings extends StObject {
    
    /**
      * Left key code
      *
      * @default [37]
      */
    var keyLeft: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Enable/Disable keyboard navigation(left and right keys are used if enabled)
      *
      * @default true
      */
    var keyNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Right key code
      *
      * @default [39]
      */
    var keyRight: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object KeyboardSettings {
    
    inline def apply(): KeyboardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardSettings] (val x: Self) extends AnyVal {
      
      inline def setKeyLeft(value: js.Array[Double]): Self = StObject.set(x, "keyLeft", value.asInstanceOf[js.Any])
      
      inline def setKeyLeftUndefined: Self = StObject.set(x, "keyLeft", js.undefined)
      
      inline def setKeyLeftVarargs(value: Double*): Self = StObject.set(x, "keyLeft", js.Array(value*))
      
      inline def setKeyNavigation(value: Boolean): Self = StObject.set(x, "keyNavigation", value.asInstanceOf[js.Any])
      
      inline def setKeyNavigationUndefined: Self = StObject.set(x, "keyNavigation", js.undefined)
      
      inline def setKeyRight(value: js.Array[Double]): Self = StObject.set(x, "keyRight", value.asInstanceOf[js.Any])
      
      inline def setKeyRightUndefined: Self = StObject.set(x, "keyRight", js.undefined)
      
      inline def setKeyRightVarargs(value: Double*): Self = StObject.set(x, "keyRight", js.Array(value*))
    }
  }
  
  trait LangSettings extends StObject {
    
    var next: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
  }
  object LangSettings {
    
    inline def apply(): LangSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LangSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LangSettings] (val x: Self) extends AnyVal {
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait SmartWizardOptions extends StObject {
    
    var anchorSettings: js.UndefOr[AnchorSettings] = js.undefined
    
    /**
      * Automatically adjust content height
      *
      * @default true
      */
    var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable the back button support
      *
      * @default true
      */
    var backButtonSupport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows to cycle the navigation of steps
      *
      * @default false
      */
    var cycleSteps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable Dark Mode if the theme supports. true/false
      *
      * @default false
      */
    var darkMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array Steps disabled
      *
      * @default []
      */
    var disabledSteps: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Enable selection of the step based on url hash
      *
      * @default true
      */
    var enableURLhash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Highlight step with errors
      *
      * @default []
      */
    var errorSteps: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Hidden steps
      *
      * @default []
      */
    var hiddenSteps: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Nav menu justification. true/false
      *
      * @default true
      */
    var justified: js.UndefOr[Boolean] = js.undefined
    
    var keyboardSettings: js.UndefOr[KeyboardSettings] = js.undefined
    
    /**
      * Language variables for button
      */
    var lang: js.UndefOr[LangSettings] = js.undefined
    
    /**
      * Initial selected step, 0 = first step
      *
      * @default 0
      */
    var selected: js.UndefOr[Double] = js.undefined
    
    /**
      * theme for the wizard, related css need to include for other than default theme
      *
      * @default 'default'
      */
    var theme: js.UndefOr[String] = js.undefined
    
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
    
    var transition: js.UndefOr[TransitionSettings] = js.undefined
  }
  object SmartWizardOptions {
    
    inline def apply(): SmartWizardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartWizardOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmartWizardOptions] (val x: Self) extends AnyVal {
      
      inline def setAnchorSettings(value: AnchorSettings): Self = StObject.set(x, "anchorSettings", value.asInstanceOf[js.Any])
      
      inline def setAnchorSettingsUndefined: Self = StObject.set(x, "anchorSettings", js.undefined)
      
      inline def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      inline def setBackButtonSupport(value: Boolean): Self = StObject.set(x, "backButtonSupport", value.asInstanceOf[js.Any])
      
      inline def setBackButtonSupportUndefined: Self = StObject.set(x, "backButtonSupport", js.undefined)
      
      inline def setCycleSteps(value: Boolean): Self = StObject.set(x, "cycleSteps", value.asInstanceOf[js.Any])
      
      inline def setCycleStepsUndefined: Self = StObject.set(x, "cycleSteps", js.undefined)
      
      inline def setDarkMode(value: Boolean): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setDisabledSteps(value: js.Array[Double]): Self = StObject.set(x, "disabledSteps", value.asInstanceOf[js.Any])
      
      inline def setDisabledStepsUndefined: Self = StObject.set(x, "disabledSteps", js.undefined)
      
      inline def setDisabledStepsVarargs(value: Double*): Self = StObject.set(x, "disabledSteps", js.Array(value*))
      
      inline def setEnableURLhash(value: Boolean): Self = StObject.set(x, "enableURLhash", value.asInstanceOf[js.Any])
      
      inline def setEnableURLhashUndefined: Self = StObject.set(x, "enableURLhash", js.undefined)
      
      inline def setErrorSteps(value: js.Array[Double]): Self = StObject.set(x, "errorSteps", value.asInstanceOf[js.Any])
      
      inline def setErrorStepsUndefined: Self = StObject.set(x, "errorSteps", js.undefined)
      
      inline def setErrorStepsVarargs(value: Double*): Self = StObject.set(x, "errorSteps", js.Array(value*))
      
      inline def setHiddenSteps(value: js.Array[Double]): Self = StObject.set(x, "hiddenSteps", value.asInstanceOf[js.Any])
      
      inline def setHiddenStepsUndefined: Self = StObject.set(x, "hiddenSteps", js.undefined)
      
      inline def setHiddenStepsVarargs(value: Double*): Self = StObject.set(x, "hiddenSteps", js.Array(value*))
      
      inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      inline def setKeyboardSettings(value: KeyboardSettings): Self = StObject.set(x, "keyboardSettings", value.asInstanceOf[js.Any])
      
      inline def setKeyboardSettingsUndefined: Self = StObject.set(x, "keyboardSettings", js.undefined)
      
      inline def setLang(value: LangSettings): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      inline def setTransition(value: TransitionSettings): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.left
    - typings.smartwizard.smartwizardStrings.right
    - typings.smartwizard.smartwizardStrings.center
  */
  trait ToolbarButtonPosition extends StObject
  object ToolbarButtonPosition {
    
    inline def center: typings.smartwizard.smartwizardStrings.center = "center".asInstanceOf[typings.smartwizard.smartwizardStrings.center]
    
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
    
    /**
      * show/hide a Next button
      *
      * @default true
      */
    var showNextButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * show/hide a Previous button
      *
      * @default true
      */
    var showPreviousButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * @default 'right'
      */
    var toolbarButtonPosition: js.UndefOr[ToolbarButtonPosition] = js.undefined
    
    /**
      * Extra buttons to show on toolbar, array of jQuery input/buttons elements
      *
      * @default []
      */
    var toolbarExtraButtons: js.UndefOr[js.Array[JQuery]] = js.undefined
    
    /**
      *
      * @default 'bottom'
      */
    var toolbarPosition: js.UndefOr[ToolbarPosition] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      inline def setShowPreviousButton(value: Boolean): Self = StObject.set(x, "showPreviousButton", value.asInstanceOf[js.Any])
      
      inline def setShowPreviousButtonUndefined: Self = StObject.set(x, "showPreviousButton", js.undefined)
      
      inline def setToolbarButtonPosition(value: ToolbarButtonPosition): Self = StObject.set(x, "toolbarButtonPosition", value.asInstanceOf[js.Any])
      
      inline def setToolbarButtonPositionUndefined: Self = StObject.set(x, "toolbarButtonPosition", js.undefined)
      
      inline def setToolbarExtraButtons(value: js.Array[JQuery]): Self = StObject.set(x, "toolbarExtraButtons", value.asInstanceOf[js.Any])
      
      inline def setToolbarExtraButtonsUndefined: Self = StObject.set(x, "toolbarExtraButtons", js.undefined)
      
      inline def setToolbarExtraButtonsVarargs(value: JQuery*): Self = StObject.set(x, "toolbarExtraButtons", js.Array(value*))
      
      inline def setToolbarPosition(value: ToolbarPosition): Self = StObject.set(x, "toolbarPosition", value.asInstanceOf[js.Any])
      
      inline def setToolbarPositionUndefined: Self = StObject.set(x, "toolbarPosition", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smartwizard.smartwizardStrings.none
    - typings.smartwizard.smartwizardStrings.fade
    - typings.smartwizard.smartwizardStrings.`slide-horizontal`
    - typings.smartwizard.smartwizardStrings.`slide-vertical`
    - typings.smartwizard.smartwizardStrings.`slide-swing`
  */
  trait TransitionAnimation extends StObject
  object TransitionAnimation {
    
    inline def fade: typings.smartwizard.smartwizardStrings.fade = "fade".asInstanceOf[typings.smartwizard.smartwizardStrings.fade]
    
    inline def none: typings.smartwizard.smartwizardStrings.none = "none".asInstanceOf[typings.smartwizard.smartwizardStrings.none]
    
    inline def `slide-horizontal`: typings.smartwizard.smartwizardStrings.`slide-horizontal` = "slide-horizontal".asInstanceOf[typings.smartwizard.smartwizardStrings.`slide-horizontal`]
    
    inline def `slide-swing`: typings.smartwizard.smartwizardStrings.`slide-swing` = "slide-swing".asInstanceOf[typings.smartwizard.smartwizardStrings.`slide-swing`]
    
    inline def `slide-vertical`: typings.smartwizard.smartwizardStrings.`slide-vertical` = "slide-vertical".asInstanceOf[typings.smartwizard.smartwizardStrings.`slide-vertical`]
  }
  
  trait TransitionSettings extends StObject {
    
    /**
      * Effect on navigation, none/fade/slide-horizontal/slide-vertical/slide-swing
      *
      * @default 'none'
      */
    var animation: js.UndefOr[TransitionAnimation] = js.undefined
    
    /**
      * Transition animation easing. Not supported without a jQuery easing plugin
      *
      * @default ''
      */
    var easing: js.UndefOr[String] = js.undefined
    
    /**
      * Transion animation speed
      *
      * @default '400'
      */
    var speed: js.UndefOr[String] = js.undefined
  }
  object TransitionSettings {
    
    inline def apply(): TransitionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitionSettings] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: TransitionAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setSpeed(value: String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
