package typings.semanticUiDimmer.SemanticUI

import typings.semanticUiDimmer.JQuery
import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import typings.semanticUiDimmer.semanticUiDimmerStrings.click
import typings.semanticUiDimmer.semanticUiDimmerStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DimmerSettings {
  
  trait Impl extends StObject {
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Whether clicking on the dimmer should hide the dimmer (Defaults to auto, closable only when settings.on is not hover
      *
      * @default 'auto'
      */
    var closable: auto | Boolean
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    /**
      * If initializing a dimmer on a dimmable context, you can use dimmerName to distinguish between multiple dimmers in that context.
      *
      * @default false
      */
    var dimmerName: `false` | String
    
    /**
      * Animation duration of dimming. If an integer is used, that value will apply to both show and hide animations.
      */
    var duration: Double | DurationSettings
    
    // endregion
    // region Debug Settings
    /**
      * Error messages displayed to console
      */
    var error: ErrorSettings
    
    // endregion
    // region Debug Settings
    /**
      * Name used in log statements
      */
    var name: String
    
    // endregion
    // region Component Settings
    // region DOM Settings
    /**
      * Event namespace. Makes sure module teardown does not effect other events attached to an element.
      */
    var namespace: String
    
    /**
      * Can be set to hover or click to show/hide dimmer on dimmable event
      *
      * @default false
      */
    var on: `false` | hover | click
    
    /**
      * Callback on element show or hide
      */
    def onChange(): Unit
    
    /**
      * Callback on element hide
      */
    def onHide(): Unit
    
    // endregion
    // region Callbacks
    /**
      * Callback on element show
      */
    def onShow(): Unit
    
    // region Behavior
    /**
      * Dimmers opacity from 0-1. Defaults to auto which uses the CSS specified opacity.
      *
      * @default 'auto'
      */
    var opacity: auto | Double
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    // endregion
    // region DOM Settings
    /**
      * Object containing selectors used by module.
      */
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    /**
      * Templates used to generate dimmer content
      */
    var template: TemplateSettings
    
    /**
      * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
      *
      * @default 'fade'
      * @see {@link http://semantic-ui.com/modules/transition.html}
      */
    var transition: String
    
    /**
      * Whether to dim dimmers using CSS transitions.
      *
      * @default true
      */
    var useCSS: Boolean
    
    /**
      * Specify a variation to add when generating dimmer, like inverted
      *
      * @default false
      */
    var variation: `false` | String
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      className: ClassNameSettings,
      closable: auto | Boolean,
      debug: Boolean,
      dimmerName: `false` | String,
      duration: Double | DurationSettings,
      error: ErrorSettings,
      name: String,
      namespace: String,
      on: `false` | hover | click,
      onChange: () => Unit,
      onHide: () => Unit,
      onShow: () => Unit,
      opacity: auto | Double,
      performance: Boolean,
      selector: SelectorSettings,
      silent: Boolean,
      template: TemplateSettings,
      transition: String,
      useCSS: Boolean,
      variation: `false` | String,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], dimmerName = dimmerName.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), opacity = opacity.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: auto | Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDimmerName(value: `false` | String): Self = StObject.set(x, "dimmerName", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double | DurationSettings): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOn(value: `false` | hover | click): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOpacity(value: auto | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: TemplateSettings): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      inline def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiDimmer.anon.PickImplopacityPartialPic
    - typings.semanticUiDimmer.anon.PickImplvariationPartialP
    - typings.semanticUiDimmer.anon.PickImpldimmerNamePartial
    - typings.semanticUiDimmer.anon.PickImplclosablePartialPi
    - typings.semanticUiDimmer.anon.PickImplonPartialPickImpl
    - typings.semanticUiDimmer.anon.PickImpluseCSSPartialPick
    - typings.semanticUiDimmer.anon.PickImpldurationPartialPi
    - typings.semanticUiDimmer.anon.PickImpltransitionPartial
    - typings.semanticUiDimmer.anon.PickImplonShowPartialPick
    - typings.semanticUiDimmer.anon.PickImplonHidePartialPick
    - typings.semanticUiDimmer.anon.PickImplonChangePartialPi
    - typings.semanticUiDimmer.anon.PickImplselectorPartialPi
    - typings.semanticUiDimmer.anon.PickImpltemplatePartialPi
    - typings.semanticUiDimmer.anon.PickImplclassNamePartialP
    - typings.semanticUiDimmer.anon.PickImplerrorPartialPickI
    - typings.semanticUiDimmer.anon.PickImplnamespacePartialP
    - typings.semanticUiDimmer.anon.PickImplnamePartialPickIm
    - typings.semanticUiDimmer.anon.PickImplsilentPartialPick
    - typings.semanticUiDimmer.anon.PickImpldebugPartialPickI
    - typings.semanticUiDimmer.anon.PickImplperformancePartia
    - typings.semanticUiDimmer.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings): typings.semanticUiDimmer.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplclosablePartialPi(closable: auto | Boolean): typings.semanticUiDimmer.anon.PickImplclosablePartialPi = {
      val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplclosablePartialPi]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean): typings.semanticUiDimmer.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldimmerNamePartial(dimmerName: `false` | String): typings.semanticUiDimmer.anon.PickImpldimmerNamePartial = {
      val __obj = js.Dynamic.literal(dimmerName = dimmerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldimmerNamePartial]
    }
    
    inline def PickImpldurationPartialPi(duration: Double | DurationSettings): typings.semanticUiDimmer.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings): typings.semanticUiDimmer.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplnamePartialPickIm(name: String): typings.semanticUiDimmer.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String): typings.semanticUiDimmer.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonChangePartialPi(onChange: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiDimmer.anon.PickImplonChangePartialPi = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplonChangePartialPi]
    }
    
    inline def PickImplonHidePartialPick(onHide: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiDimmer.anon.PickImplonHidePartialPick = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplonHidePartialPick]
    }
    
    inline def PickImplonPartialPickImpl(on: `false` | hover | click): typings.semanticUiDimmer.anon.PickImplonPartialPickImpl = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplonPartialPickImpl]
    }
    
    inline def PickImplonShowPartialPick(onShow: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiDimmer.anon.PickImplonShowPartialPick = {
      val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplonShowPartialPick]
    }
    
    inline def PickImplopacityPartialPic(opacity: auto | Double): typings.semanticUiDimmer.anon.PickImplopacityPartialPic = {
      val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplopacityPartialPic]
    }
    
    inline def PickImplperformancePartia(performance: Boolean): typings.semanticUiDimmer.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplperformancePartia]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings): typings.semanticUiDimmer.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean): typings.semanticUiDimmer.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltemplatePartialPi(template: TemplateSettings): typings.semanticUiDimmer.anon.PickImpltemplatePartialPi = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpltemplatePartialPi]
    }
    
    inline def PickImpltransitionPartial(transition: String): typings.semanticUiDimmer.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpltransitionPartial]
    }
    
    inline def PickImpluseCSSPartialPick(useCSS: Boolean): typings.semanticUiDimmer.anon.PickImpluseCSSPartialPick = {
      val __obj = js.Dynamic.literal(useCSS = useCSS.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpluseCSSPartialPick]
    }
    
    inline def PickImplvariationPartialP(variation: `false` | String): typings.semanticUiDimmer.anon.PickImplvariationPartialP = {
      val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplvariationPartialP]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean): typings.semanticUiDimmer.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplverbosePartialPic]
    }
  }
}
