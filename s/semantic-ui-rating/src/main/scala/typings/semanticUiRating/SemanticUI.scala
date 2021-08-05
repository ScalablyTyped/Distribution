package typings.semanticUiRating

import typings.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typings.semanticUiRating.SemanticUI.Rating.ClassNameSettings.Param
import typings.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typings.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typings.semanticUiRating.anon.PartialPickImplkeyofImpl
import typings.semanticUiRating.anon.PartialPickImplkeyofImplActive
import typings.semanticUiRating.anon.PickImplactive
import typings.semanticUiRating.anon.PickImplclassName
import typings.semanticUiRating.anon.PickImplclearable
import typings.semanticUiRating.anon.PickImpldebug
import typings.semanticUiRating.anon.PickImplerror
import typings.semanticUiRating.anon.PickImplfireOnInit
import typings.semanticUiRating.anon.PickImplhover
import typings.semanticUiRating.anon.PickImplinitialRating
import typings.semanticUiRating.anon.PickImplinteractive
import typings.semanticUiRating.anon.PickImplloading
import typings.semanticUiRating.anon.PickImplname
import typings.semanticUiRating.anon.PickImplnamespace
import typings.semanticUiRating.anon.PickImplonRate
import typings.semanticUiRating.anon.PickImplperformance
import typings.semanticUiRating.anon.PickImplselector
import typings.semanticUiRating.anon.PickImplsilent
import typings.semanticUiRating.anon.PickImplverbose
import typings.semanticUiRating.semanticUiRatingStrings.`clear rating`
import typings.semanticUiRating.semanticUiRatingStrings.`get rating`
import typings.semanticUiRating.semanticUiRatingStrings.`set rating`
import typings.semanticUiRating.semanticUiRatingStrings.auto
import typings.semanticUiRating.semanticUiRatingStrings.className
import typings.semanticUiRating.semanticUiRatingStrings.clearable
import typings.semanticUiRating.semanticUiRatingStrings.debug
import typings.semanticUiRating.semanticUiRatingStrings.destroy
import typings.semanticUiRating.semanticUiRatingStrings.disable
import typings.semanticUiRating.semanticUiRatingStrings.enable
import typings.semanticUiRating.semanticUiRatingStrings.error
import typings.semanticUiRating.semanticUiRatingStrings.fireOnInit
import typings.semanticUiRating.semanticUiRatingStrings.initialRating
import typings.semanticUiRating.semanticUiRatingStrings.interactive
import typings.semanticUiRating.semanticUiRatingStrings.name
import typings.semanticUiRating.semanticUiRatingStrings.namespace
import typings.semanticUiRating.semanticUiRatingStrings.onRate
import typings.semanticUiRating.semanticUiRatingStrings.performance
import typings.semanticUiRating.semanticUiRatingStrings.selector
import typings.semanticUiRating.semanticUiRatingStrings.setting
import typings.semanticUiRating.semanticUiRatingStrings.silent
import typings.semanticUiRating.semanticUiRatingStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Rating extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears current rating
      */
    def apply(behavior: `clear rating`): JQuery = js.native
    /**
      * Gets current rating
      */
    def apply(behavior: `get rating`): Double = js.native
    /**
      * Sets rating programmatically
      */
    def apply(behavior: `set rating`, rating: Double): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Disables interactive rating mode
      */
    def apply(behavior: disable): JQuery = js.native
    /**
      * Enables interactive rating mode
      */
    def apply(behavior: enable): JQuery = js.native
    def apply(behavior: setting, name: className, value: Unit): ClassNameSettings = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: clearable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: clearable, value: Unit): auto | Boolean = js.native
    def apply(behavior: setting, name: clearable, value: auto): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: error, value: Unit): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: fireOnInit, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: initialRating, value: Double): JQuery = js.native
    def apply(behavior: setting, name: initialRating, value: Unit): Double = js.native
    def apply(behavior: setting, name: interactive, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: interactive, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: Unit): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: Unit): String = js.native
    def apply(
      behavior: setting,
      name: onRate,
      value: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onRate, value: Unit): js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit] = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: performance, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: selector, value: Unit): SelectorSettings = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: Unit): Boolean = js.native
    def apply(behavior: setting, value: RatingSettings): JQuery = js.native
    def apply(settings: RatingSettings): JQuery = js.native
    
    var settings: RatingSettings = js.native
  }
  object Rating {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'hover'
          */
        var hover: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(active: String, hover: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImplhover | PickImplloading) & PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-rating.SemanticUI.Rating.ErrorSettings.Param */
    trait ErrorSettings extends StObject {
      
      var action: String & js.UndefOr[String]
    }
    object ErrorSettings {
      
      inline def apply(action: String & js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      extension [Self <: ErrorSettings](x: Self) {
        
        inline def setAction(value: String & js.UndefOr[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      }
      
      trait Impl extends StObject {
        
        /**
          * @default 'You called a rating action that was not defined'
          */
        var action: String
      }
      object Impl {
        
        inline def apply(action: String): Impl = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl, 'action'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var action: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(action: String & js.UndefOr[String]): typings.semanticUiRating.SemanticUI.Rating.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiRating.SemanticUI.Rating.ErrorSettings.Param]
        }
        
        extension [Self <: typings.semanticUiRating.SemanticUI.Rating.ErrorSettings.Param](x: Self) {
          
          inline def setAction(value: String & js.UndefOr[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /* Inlined semantic-ui-rating.SemanticUI.Rating.SelectorSettings.Param */
    trait SelectorSettings extends StObject {
      
      var icon: String & js.UndefOr[String]
    }
    object SelectorSettings {
      
      inline def apply(icon: String & js.UndefOr[String]): SelectorSettings = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectorSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * @default '.icon'
          */
        var icon: String
      }
      object Impl {
        
        inline def apply(icon: String): Impl = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, 'icon'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.SelectorSettings._Impl>> */
      trait Param extends StObject {
        
        var icon: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(icon: String & js.UndefOr[String]): typings.semanticUiRating.SemanticUI.Rating.SelectorSettings.Param = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiRating.SemanticUI.Rating.SelectorSettings.Param]
        }
        
        extension [Self <: typings.semanticUiRating.SemanticUI.Rating.SelectorSettings.Param](x: Self) {
          
          inline def setIcon(value: String & js.UndefOr[String]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: SelectorSettings](x: Self) {
        
        inline def setIcon(value: String & js.UndefOr[String]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object RatingSettings {
    
    trait Impl extends StObject {
      
      var className: ClassNameSettings
      
      /**
        * By default a rating will be only clearable if there is 1 icon. Setting to true/false will allow or disallow a user to clear their rating
        *
        * @default 'auto'
        */
      var clearable: auto | Boolean
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether callbacks like onRate should fire immediately after initializing with the current value.
        *
        * @default false
        */
      var fireOnInit: Boolean
      
      // region Rating Settings
      /**
        * A number representing the default rating to apply
        *
        * @default 0
        */
      var initialRating: Double
      
      /**
        * Whether to enable user's ability to rate
        *
        * @default true
        */
      var interactive: Boolean
      
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
      
      // endregion
      // region Callbacks
      /**
        * Is called after user selects a new rating
        */
      def onRate(value: Double): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        className: ClassNameSettings,
        clearable: auto | Boolean,
        debug: Boolean,
        error: ErrorSettings,
        fireOnInit: Boolean,
        initialRating: Double,
        interactive: Boolean,
        name: String,
        namespace: String,
        onRate: Double => Unit,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], initialRating = initialRating.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onRate = js.Any.fromFunction1(onRate), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClearable(value: auto | Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
        
        inline def setInitialRating(value: Double): Self = StObject.set(x, "initialRating", value.asInstanceOf[js.Any])
        
        inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnRate(value: Double => Unit): Self = StObject.set(x, "onRate", js.Any.fromFunction1(value))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplinitialRating | PickImplfireOnInit | PickImplclearable | PickImplinteractive | PickImplonRate | PickImplselector | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) & PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/rating.html#/settings}
    */
  type RatingSettings = typings.semanticUiRating.SemanticUI.RatingSettings.Param
}
