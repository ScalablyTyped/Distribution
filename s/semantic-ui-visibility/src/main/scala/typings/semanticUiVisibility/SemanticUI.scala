package typings.semanticUiVisibility

import typings.jquery.JQueryCoordinates
import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typings.semanticUiVisibility.SemanticUI.VisibilitySettings.Param
import typings.semanticUiVisibility.anon.Bottom
import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import typings.semanticUiVisibility.semanticUiVisibilityStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Visibility extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
      */
    def apply(behavior: `disable callbacks`): JQuery = js.native
    /**
      * Re-enable callbacks
      */
    def apply(behavior: `enable callbacks`): JQuery = js.native
    /**
      * Returns element calculations as object
      */
    def apply(behavior: `get element calculations`): ElementCalculations = js.native
    /**
      * Returns number of pixels passed in current element from top of element
      */
    def apply(behavior: `get pixels passed`): Double = js.native
    /**
      * Returns screen calculations as object
      */
    def apply(behavior: `get screen calculations`): ScreenCalculations = js.native
    /**
      * Returns screen size as object
      */
    def apply(behavior: `get screen size`): ScreenSize = js.native
    /**
      * Returns whether element is off screen
      */
    def apply(behavior: `is off screen`): Boolean = js.native
    /**
      * Returns whether element is on screen
      */
    def apply(behavior: `is on screen`): Boolean = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, value: VisibilitySettings): JQuery = js.native
    def apply(settings: VisibilitySettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-visibility.SemanticUI.VisibilitySettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-visibility.SemanticUI.VisibilitySettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any = js.native
    
    var settings: VisibilitySettings = js.native
  }
  object Visibility {
    
    /* Inlined semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings.Param */
    trait ClassNameSettings extends StObject {
      
      var fixed: String
    }
    object ClassNameSettings {
      
      inline def apply(fixed: String): ClassNameSettings = {
        val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClassNameSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * @default 'fixed'
          */
        var fixed: String
      }
      object Impl {
        
        inline def apply(fixed: String): Impl = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: ClassNameSettings](x: Self) {
        
        inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      }
      
      /* Inlined std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl, 'fixed'> & std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl, keyof semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl>> */
      trait Param extends StObject {
        
        var fixed: String
      }
      object Param {
        
        inline def apply(fixed: String): Param = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Param]
        }
        
        extension [Self <: Param](x: Self) {
          
          inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        }
      }
    }
    
    trait ElementCalculations
      extends StObject
         with ElementPosition {
      
      var bottom: Double
      
      var bottomPassed: Boolean
      
      var bottomVisible: Boolean
      
      var margin: js.UndefOr[Bottom] = js.undefined
      
      var offScreen: Boolean
      
      var onScreen: Boolean
      
      var passing: Boolean
      
      var percentagePassed: Double
      
      var pixelsPassed: Double
      
      var top: Double
      
      var topPassed: Boolean
      
      var topVisible: Boolean
    }
    object ElementCalculations {
      
      inline def apply(
        bottom: Double,
        bottomPassed: Boolean,
        bottomVisible: Boolean,
        fits: Boolean,
        height: Double,
        offScreen: Boolean,
        offset: JQueryCoordinates,
        onScreen: Boolean,
        passing: Boolean,
        percentagePassed: Double,
        pixelsPassed: Double,
        top: Double,
        topPassed: Boolean,
        topVisible: Boolean,
        width: Double
      ): ElementCalculations = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementCalculations]
      }
      
      extension [Self <: ElementCalculations](x: Self) {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setBottomPassed(value: Boolean): Self = StObject.set(x, "bottomPassed", value.asInstanceOf[js.Any])
        
        inline def setBottomVisible(value: Boolean): Self = StObject.set(x, "bottomVisible", value.asInstanceOf[js.Any])
        
        inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
        
        inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
        
        inline def setOffScreen(value: Boolean): Self = StObject.set(x, "offScreen", value.asInstanceOf[js.Any])
        
        inline def setOnScreen(value: Boolean): Self = StObject.set(x, "onScreen", value.asInstanceOf[js.Any])
        
        inline def setPassing(value: Boolean): Self = StObject.set(x, "passing", value.asInstanceOf[js.Any])
        
        inline def setPercentagePassed(value: Double): Self = StObject.set(x, "percentagePassed", value.asInstanceOf[js.Any])
        
        inline def setPixelsPassed(value: Double): Self = StObject.set(x, "pixelsPassed", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setTopPassed(value: Boolean): Self = StObject.set(x, "topPassed", value.asInstanceOf[js.Any])
        
        inline def setTopVisible(value: Boolean): Self = StObject.set(x, "topVisible", value.asInstanceOf[js.Any])
      }
    }
    
    trait ElementPosition extends StObject {
      
      var fits: Boolean
      
      var height: Double
      
      var offset: JQueryCoordinates
      
      var width: Double
    }
    object ElementPosition {
      
      inline def apply(fits: Boolean, height: Double, offset: JQueryCoordinates, width: Double): ElementPosition = {
        val __obj = js.Dynamic.literal(fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementPosition]
      }
      
      extension [Self <: ElementPosition](x: Self) {
        
        inline def setFits(value: Boolean): Self = StObject.set(x, "fits", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: JQueryCoordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings.Param */
    trait ErrorSettings extends StObject {
      
      var method: String
    }
    object ErrorSettings {
      
      inline def apply(method: String): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String
      }
      object Impl {
        
        inline def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: ErrorSettings](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      /* Inlined std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings._Impl, keyof semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var method: String
      }
      object Param {
        
        inline def apply(method: String): Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Param]
        }
        
        extension [Self <: Param](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    trait ScreenCalculations extends StObject {
      
      var bottom: Double
      
      var top: Double
    }
    object ScreenCalculations {
      
      inline def apply(bottom: Double, top: Double): ScreenCalculations = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[ScreenCalculations]
      }
      
      extension [Self <: ScreenCalculations](x: Self) {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
    
    trait ScreenSize extends StObject {
      
      var height: Double
    }
    object ScreenSize {
      
      inline def apply(height: Double): ScreenSize = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
        __obj.asInstanceOf[ScreenSize]
      }
      
      extension [Self <: ScreenSize](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object VisibilitySettings {
    
    trait Impl extends StObject {
      
      /**
        * Whether visibility conditions should be checked on calls to refresh.
        * These calls can be triggered from either resize, load or manually calling $('.foo').visibility('refresh')
        *
        * @default true
        */
      var checkOnRefresh: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings
      
      /**
        * The scroll context visibility should use.
        *
        * @default 'window'
        */
      var context: String | JQuery
      
      /**
        * When set to true a callback will occur anytime an element passes a condition not just immediately after the threshold is met.
        *
        * @default false
        */
      var continuous: Boolean
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * When using type: image allows you to specify transition duration
        *
        * @default 1000
        */
      var duration: Double
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether element calculations should include its margin
        *
        * @default false
        */
      var includeMargin: Boolean
      
      /**
        * Whether visibility conditions should be checked immediately on init
        *
        * @default true
        */
      var initialCheck: Boolean
      
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
        * Whether to automatically refresh content when changes are made to the element's DOM subtree
        *
        * @default true
        */
      var observeChanges: Boolean
      
      /**
        * Value that context scrollTop should be adjusted in pixels. Useful for making content appear below content fixed to the page.
        *
        * @default 0
        */
      var offset: Double
      
      /**
        * Occurs after all img initialized at the same time have loaded.
        *
        * @since 2.2
        */
      def onAllLoaded(): Unit
      
      /**
        * Element's bottom edge has passed top of screen
        */
      def onBottomPassed(): Unit
      
      /**
        * Element's bottom edge has not passed top of screen
        */
      def onBottomPassedReverse(): Unit
      
      /**
        * Element's bottom edge has passed bottom of screen
        */
      def onBottomVisible(): Unit
      
      /**
        * Element's bottom edge has not passed bottom of screen
        */
      def onBottomVisibleReverse(): Unit
      
      // endregion
      // region Fixed Callbacks
      /**
        * Occurs after element has been assigned position fixed
        *
        * @since 2.2
        */
      def onFixed(): Unit
      
      // endregion
      // region Image Callbacks
      /**
        * Occurs after an image has completed loading
        *
        * @since 2.2
        */
      def onLoad(): Unit
      
      def onOffScreen(): Unit
      
      def onOnScreen(): Unit
      
      /**
        * Any part of an element is visible on screen
        */
      def onPassing(): Unit
      
      /**
        * Element's top has not passed top of screen but bottom has
        */
      def onPassingReverse(): Unit
      
      /**
        * Occurs whenever element's visibility is refreshed
        */
      def onRefresh(): Unit
      
      /**
        * Element's top edge has passed top of the screen
        */
      def onTopPassed(): Unit
      
      /**
        * Element's top edge has not passed top of the screen
        */
      def onTopPassedReverse(): Unit
      
      // endregion
      // region Visibility Callbacks
      /**
        * Element's top edge has passed bottom of screen
        */
      def onTopVisible(): Unit
      
      /**
        * Element's top edge has not passed bottom of screen
        */
      def onTopVisibleReverse(): Unit
      
      /**
        * Occurs after element has been removed from fixed position
        *
        * @since 2.2
        */
      def onUnfixed(): Unit
      
      // endregion
      // region Utility Callbacks
      /**
        * Occurs each time an elements calculations are updated
        */
      def onUpdate(calculations: ElementCalculations): Unit
      
      // region Functionality
      /**
        * When set to false a callback will occur each time an element passes the threshold for a condition.
        *
        * @default true
        */
      var once: Boolean
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      /**
        * Whether visibility conditions should be checked on window load. This ensures that after images load content positions will be updated correctly.
        *
        * @default true
        */
      var refreshOnLoad: Boolean
      
      /**
        * Whether visibility conditions should be checked on window resize. Useful when content resizes causes continuous changes in position
        *
        * @default true
        */
      var refreshOnResize: Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * When set to an integer, scroll position will be debounced using this ms value. false will debounce with requestAnimationFrame.
        *
        * @default false
        */
      var throttle: `false` | Double
      
      /**
        * When using type: image allows you to specify transition when showing a loaded image
        *
        * @default false
        */
      var transition: `false` | String
      
      /**
        * Set to image to load images when on screen. Set to fixed to add class name fixed when passed.
        *
        * @default false
        */
      var `type`: `false` | image | fixed
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
      
      /**
        * Specify a z-index when using type: 'fixed'.
        *
        * @default 1
        * @since 2.2
        */
      var zIndex: Double
    }
    object Impl {
      
      inline def apply(
        checkOnRefresh: Boolean,
        className: ClassNameSettings,
        context: String | JQuery,
        continuous: Boolean,
        debug: Boolean,
        duration: Double,
        error: ErrorSettings,
        includeMargin: Boolean,
        initialCheck: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        onAllLoaded: () => Unit,
        onBottomPassed: () => Unit,
        onBottomPassedReverse: () => Unit,
        onBottomVisible: () => Unit,
        onBottomVisibleReverse: () => Unit,
        onFixed: () => Unit,
        onLoad: () => Unit,
        onOffScreen: () => Unit,
        onOnScreen: () => Unit,
        onPassing: () => Unit,
        onPassingReverse: () => Unit,
        onRefresh: () => Unit,
        onTopPassed: () => Unit,
        onTopPassedReverse: () => Unit,
        onTopVisible: () => Unit,
        onTopVisibleReverse: () => Unit,
        onUnfixed: () => Unit,
        onUpdate: ElementCalculations => Unit,
        once: Boolean,
        performance: Boolean,
        refreshOnLoad: Boolean,
        refreshOnResize: Boolean,
        silent: Boolean,
        throttle: `false` | Double,
        transition: `false` | String,
        `type`: `false` | image | fixed,
        verbose: Boolean,
        zIndex: Double
      ): Impl = {
        val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], includeMargin = includeMargin.asInstanceOf[js.Any], initialCheck = initialCheck.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onAllLoaded = js.Any.fromFunction0(onAllLoaded), onBottomPassed = js.Any.fromFunction0(onBottomPassed), onBottomPassedReverse = js.Any.fromFunction0(onBottomPassedReverse), onBottomVisible = js.Any.fromFunction0(onBottomVisible), onBottomVisibleReverse = js.Any.fromFunction0(onBottomVisibleReverse), onFixed = js.Any.fromFunction0(onFixed), onLoad = js.Any.fromFunction0(onLoad), onOffScreen = js.Any.fromFunction0(onOffScreen), onOnScreen = js.Any.fromFunction0(onOnScreen), onPassing = js.Any.fromFunction0(onPassing), onPassingReverse = js.Any.fromFunction0(onPassingReverse), onRefresh = js.Any.fromFunction0(onRefresh), onTopPassed = js.Any.fromFunction0(onTopPassed), onTopPassedReverse = js.Any.fromFunction0(onTopPassedReverse), onTopVisible = js.Any.fromFunction0(onTopVisible), onTopVisibleReverse = js.Any.fromFunction0(onTopVisibleReverse), onUnfixed = js.Any.fromFunction0(onUnfixed), onUpdate = js.Any.fromFunction1(onUpdate), once = once.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any], refreshOnResize = refreshOnResize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setCheckOnRefresh(value: Boolean): Self = StObject.set(x, "checkOnRefresh", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
        
        inline def setInitialCheck(value: Boolean): Self = StObject.set(x, "initialCheck", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOnAllLoaded(value: () => Unit): Self = StObject.set(x, "onAllLoaded", js.Any.fromFunction0(value))
        
        inline def setOnBottomPassed(value: () => Unit): Self = StObject.set(x, "onBottomPassed", js.Any.fromFunction0(value))
        
        inline def setOnBottomPassedReverse(value: () => Unit): Self = StObject.set(x, "onBottomPassedReverse", js.Any.fromFunction0(value))
        
        inline def setOnBottomVisible(value: () => Unit): Self = StObject.set(x, "onBottomVisible", js.Any.fromFunction0(value))
        
        inline def setOnBottomVisibleReverse(value: () => Unit): Self = StObject.set(x, "onBottomVisibleReverse", js.Any.fromFunction0(value))
        
        inline def setOnFixed(value: () => Unit): Self = StObject.set(x, "onFixed", js.Any.fromFunction0(value))
        
        inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
        
        inline def setOnOffScreen(value: () => Unit): Self = StObject.set(x, "onOffScreen", js.Any.fromFunction0(value))
        
        inline def setOnOnScreen(value: () => Unit): Self = StObject.set(x, "onOnScreen", js.Any.fromFunction0(value))
        
        inline def setOnPassing(value: () => Unit): Self = StObject.set(x, "onPassing", js.Any.fromFunction0(value))
        
        inline def setOnPassingReverse(value: () => Unit): Self = StObject.set(x, "onPassingReverse", js.Any.fromFunction0(value))
        
        inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
        
        inline def setOnTopPassed(value: () => Unit): Self = StObject.set(x, "onTopPassed", js.Any.fromFunction0(value))
        
        inline def setOnTopPassedReverse(value: () => Unit): Self = StObject.set(x, "onTopPassedReverse", js.Any.fromFunction0(value))
        
        inline def setOnTopVisible(value: () => Unit): Self = StObject.set(x, "onTopVisible", js.Any.fromFunction0(value))
        
        inline def setOnTopVisibleReverse(value: () => Unit): Self = StObject.set(x, "onTopVisibleReverse", js.Any.fromFunction0(value))
        
        inline def setOnUnfixed(value: () => Unit): Self = StObject.set(x, "onUnfixed", js.Any.fromFunction0(value))
        
        inline def setOnUpdate(value: ElementCalculations => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
        
        inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setRefreshOnLoad(value: Boolean): Self = StObject.set(x, "refreshOnLoad", value.asInstanceOf[js.Any])
        
        inline def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setThrottle(value: `false` | Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        inline def setTransition(value: `false` | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        inline def setType(value: `false` | image | fixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiVisibility.anon.PickImploncePartialPickIm
      - typings.semanticUiVisibility.anon.PickImplcontinuousPartial
      - typings.semanticUiVisibility.anon.PickImpltypePartialPickIm
      - typings.semanticUiVisibility.anon.PickImplinitialCheckParti
      - typings.semanticUiVisibility.anon.PickImplcontextPartialPic
      - typings.semanticUiVisibility.anon.PickImplrefreshOnLoadPart
      - typings.semanticUiVisibility.anon.PickImplrefreshOnResizePa
      - typings.semanticUiVisibility.anon.PickImplcheckOnRefreshPar
      - typings.semanticUiVisibility.anon.PickImplzIndexPartialPick
      - typings.semanticUiVisibility.anon.PickImploffsetPartialPick
      - typings.semanticUiVisibility.anon.PickImplincludeMarginPart
      - typings.semanticUiVisibility.anon.PickImplthrottlePartialPi
      - typings.semanticUiVisibility.anon.PickImplobserveChangesPar
      - typings.semanticUiVisibility.anon.PickImpltransitionPartial
      - typings.semanticUiVisibility.anon.PickImpldurationPartialPi
      - typings.semanticUiVisibility.anon.PickImplonTopVisibleParti
      - typings.semanticUiVisibility.anon.PickImplonTopPassedPartia
      - typings.semanticUiVisibility.anon.PickImplonBottomVisiblePa
      - typings.semanticUiVisibility.anon.PickImplonPassingPartialP
      - typings.semanticUiVisibility.anon.PickImplonBottomPassedPar
      - typings.semanticUiVisibility.anon.PickImplonTopVisibleRever
      - typings.semanticUiVisibility.anon.PickImplonTopPassedRevers
      - typings.semanticUiVisibility.anon.PickImplonBottomVisibleRe
      - typings.semanticUiVisibility.anon.PickImplonPassingReverseP
      - typings.semanticUiVisibility.anon.PickImplonBottomPassedRev
      - typings.semanticUiVisibility.anon.PickImplonOnScreenPartial
      - typings.semanticUiVisibility.anon.PickImplonOffScreenPartia
      - typings.semanticUiVisibility.anon.PickImplonLoadPartialPick
      - typings.semanticUiVisibility.anon.PickImplonAllLoadedPartia
      - typings.semanticUiVisibility.anon.PickImplonFixedPartialPic
      - typings.semanticUiVisibility.anon.PickImplonUnfixedPartialP
      - typings.semanticUiVisibility.anon.PickImplonUpdatePartialPi
      - typings.semanticUiVisibility.anon.PickImplonRefreshPartialP
      - typings.semanticUiVisibility.anon.PickImplclassNamePartialP
      - typings.semanticUiVisibility.anon.PickImplerrorPartialPickI
      - typings.semanticUiVisibility.anon.PickImplnamespacePartialP
      - typings.semanticUiVisibility.anon.PickImplnamePartialPickIm
      - typings.semanticUiVisibility.anon.PickImplsilentPartialPick
      - typings.semanticUiVisibility.anon.PickImpldebugPartialPickI
      - typings.semanticUiVisibility.anon.PickImplperformancePartia
      - typings.semanticUiVisibility.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcheckOnRefreshPar(checkOnRefresh: Boolean): typings.semanticUiVisibility.anon.PickImplcheckOnRefreshPar = {
        val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplcheckOnRefreshPar]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings): typings.semanticUiVisibility.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplcontextPartialPic(context: String | JQuery): typings.semanticUiVisibility.anon.PickImplcontextPartialPic = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplcontextPartialPic]
      }
      
      inline def PickImplcontinuousPartial(continuous: Boolean): typings.semanticUiVisibility.anon.PickImplcontinuousPartial = {
        val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplcontinuousPartial]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean): typings.semanticUiVisibility.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldurationPartialPi(duration: Double): typings.semanticUiVisibility.anon.PickImpldurationPartialPi = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImpldurationPartialPi]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings): typings.semanticUiVisibility.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplincludeMarginPart(includeMargin: Boolean): typings.semanticUiVisibility.anon.PickImplincludeMarginPart = {
        val __obj = js.Dynamic.literal(includeMargin = includeMargin.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplincludeMarginPart]
      }
      
      inline def PickImplinitialCheckParti(initialCheck: Boolean): typings.semanticUiVisibility.anon.PickImplinitialCheckParti = {
        val __obj = js.Dynamic.literal(initialCheck = initialCheck.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplinitialCheckParti]
      }
      
      inline def PickImplnamePartialPickIm(name: String): typings.semanticUiVisibility.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String): typings.semanticUiVisibility.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplobserveChangesPar(observeChanges: Boolean): typings.semanticUiVisibility.anon.PickImplobserveChangesPar = {
        val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplobserveChangesPar]
      }
      
      inline def PickImploffsetPartialPick(offset: Double): typings.semanticUiVisibility.anon.PickImploffsetPartialPick = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImploffsetPartialPick]
      }
      
      inline def PickImplonAllLoadedPartia(onAllLoaded: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonAllLoadedPartia = {
        val __obj = js.Dynamic.literal(onAllLoaded = onAllLoaded.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonAllLoadedPartia]
      }
      
      inline def PickImplonBottomPassedPar(onBottomPassed: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonBottomPassedPar = {
        val __obj = js.Dynamic.literal(onBottomPassed = onBottomPassed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonBottomPassedPar]
      }
      
      inline def PickImplonBottomPassedRev(onBottomPassedReverse: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonBottomPassedRev = {
        val __obj = js.Dynamic.literal(onBottomPassedReverse = onBottomPassedReverse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonBottomPassedRev]
      }
      
      inline def PickImplonBottomVisiblePa(onBottomVisible: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonBottomVisiblePa = {
        val __obj = js.Dynamic.literal(onBottomVisible = onBottomVisible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonBottomVisiblePa]
      }
      
      inline def PickImplonBottomVisibleRe(onBottomVisibleReverse: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonBottomVisibleRe = {
        val __obj = js.Dynamic.literal(onBottomVisibleReverse = onBottomVisibleReverse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonBottomVisibleRe]
      }
      
      inline def PickImplonFixedPartialPic(onFixed: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonFixedPartialPic = {
        val __obj = js.Dynamic.literal(onFixed = onFixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonFixedPartialPic]
      }
      
      inline def PickImplonLoadPartialPick(onLoad: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonLoadPartialPick = {
        val __obj = js.Dynamic.literal(onLoad = onLoad.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonLoadPartialPick]
      }
      
      inline def PickImplonOffScreenPartia(onOffScreen: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonOffScreenPartia = {
        val __obj = js.Dynamic.literal(onOffScreen = onOffScreen.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonOffScreenPartia]
      }
      
      inline def PickImplonOnScreenPartial(onOnScreen: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonOnScreenPartial = {
        val __obj = js.Dynamic.literal(onOnScreen = onOnScreen.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonOnScreenPartial]
      }
      
      inline def PickImplonPassingPartialP(onPassing: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonPassingPartialP = {
        val __obj = js.Dynamic.literal(onPassing = onPassing.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonPassingPartialP]
      }
      
      inline def PickImplonPassingReverseP(onPassingReverse: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonPassingReverseP = {
        val __obj = js.Dynamic.literal(onPassingReverse = onPassingReverse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonPassingReverseP]
      }
      
      inline def PickImplonRefreshPartialP(onRefresh: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonRefreshPartialP = {
        val __obj = js.Dynamic.literal(onRefresh = onRefresh.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonRefreshPartialP]
      }
      
      inline def PickImplonTopPassedPartia(onTopPassed: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonTopPassedPartia = {
        val __obj = js.Dynamic.literal(onTopPassed = onTopPassed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonTopPassedPartia]
      }
      
      inline def PickImplonTopPassedRevers(onTopPassedReverse: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonTopPassedRevers = {
        val __obj = js.Dynamic.literal(onTopPassedReverse = onTopPassedReverse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonTopPassedRevers]
      }
      
      inline def PickImplonTopVisibleParti(onTopVisible: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonTopVisibleParti = {
        val __obj = js.Dynamic.literal(onTopVisible = onTopVisible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonTopVisibleParti]
      }
      
      inline def PickImplonTopVisibleRever(onTopVisibleReverse: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonTopVisibleRever = {
        val __obj = js.Dynamic.literal(onTopVisibleReverse = onTopVisibleReverse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonTopVisibleRever]
      }
      
      inline def PickImplonUnfixedPartialP(onUnfixed: js.ThisFunction0[/* this */ JQuery, Unit]): typings.semanticUiVisibility.anon.PickImplonUnfixedPartialP = {
        val __obj = js.Dynamic.literal(onUnfixed = onUnfixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonUnfixedPartialP]
      }
      
      inline def PickImplonUpdatePartialPi(onUpdate: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): typings.semanticUiVisibility.anon.PickImplonUpdatePartialPi = {
        val __obj = js.Dynamic.literal(onUpdate = onUpdate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplonUpdatePartialPi]
      }
      
      inline def PickImploncePartialPickIm(once: Boolean): typings.semanticUiVisibility.anon.PickImploncePartialPickIm = {
        val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImploncePartialPickIm]
      }
      
      inline def PickImplperformancePartia(performance: Boolean): typings.semanticUiVisibility.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplperformancePartia]
      }
      
      inline def PickImplrefreshOnLoadPart(refreshOnLoad: Boolean): typings.semanticUiVisibility.anon.PickImplrefreshOnLoadPart = {
        val __obj = js.Dynamic.literal(refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplrefreshOnLoadPart]
      }
      
      inline def PickImplrefreshOnResizePa(refreshOnResize: Boolean): typings.semanticUiVisibility.anon.PickImplrefreshOnResizePa = {
        val __obj = js.Dynamic.literal(refreshOnResize = refreshOnResize.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplrefreshOnResizePa]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean): typings.semanticUiVisibility.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplthrottlePartialPi(throttle: `false` | Double): typings.semanticUiVisibility.anon.PickImplthrottlePartialPi = {
        val __obj = js.Dynamic.literal(throttle = throttle.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplthrottlePartialPi]
      }
      
      inline def PickImpltransitionPartial(transition: `false` | String): typings.semanticUiVisibility.anon.PickImpltransitionPartial = {
        val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImpltransitionPartial]
      }
      
      inline def PickImpltypePartialPickIm(`type`: `false` | image | fixed): typings.semanticUiVisibility.anon.PickImpltypePartialPickIm = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImpltypePartialPickIm]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean): typings.semanticUiVisibility.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplverbosePartialPic]
      }
      
      inline def PickImplzIndexPartialPick(zIndex: Double): typings.semanticUiVisibility.anon.PickImplzIndexPartialPick = {
        val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiVisibility.anon.PickImplzIndexPartialPick]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/behaviors/visibility.html#/settings}
    */
  type VisibilitySettings = Param
}
