package typings.semanticUiSticky

import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings.Param
import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typings.semanticUiSticky.semanticUiStickyBooleans.`false`
import typings.semanticUiSticky.semanticUiStickyStrings.destroy
import typings.semanticUiSticky.semanticUiStickyStrings.refresh
import typings.semanticUiSticky.semanticUiStickyStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Sticky extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * recalculates offsets
      */
    def apply(behavior: refresh): JQuery = js.native
    def apply(behavior: setting, value: StickySettings): JQuery = js.native
    def apply(settings: StickySettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-sticky.SemanticUI.StickySettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-sticky.SemanticUI.StickySettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any = js.native
    
    var settings: StickySettings = js.native
  }
  object Sticky {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'bottom'
          */
        var bottom: String
        
        /**
          * @default 'bound'
          */
        var bound: String
        
        /**
          * @default 'fixed'
          */
        var fixed: String
        
        /**
          * @default 'native'
          */
        var supported: String
        
        /**
          * @default 'top'
          */
        var top: String
      }
      object Impl {
        
        inline def apply(bottom: String, bound: String, fixed: String, supported: String, top: String): Impl = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          inline def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
          
          inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
          
          inline def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
          
          inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiSticky.anon.PickImplboundPartialPickI
        - typings.semanticUiSticky.anon.PickImplfixedPartialPickI
        - typings.semanticUiSticky.anon.PickImplsupportedPartialP
        - typings.semanticUiSticky.anon.PickImpltopPartialPickImp
        - typings.semanticUiSticky.anon.PickImplbottomPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplbottomPartialPick(bottom: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplbottomPartialPick = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplbottomPartialPick]
        }
        
        inline def PickImplboundPartialPickI(bound: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplboundPartialPickI = {
          val __obj = js.Dynamic.literal(bound = bound.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplboundPartialPickI]
        }
        
        inline def PickImplfixedPartialPickI(fixed: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplfixedPartialPickI = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplfixedPartialPickI]
        }
        
        inline def PickImplsupportedPartialP(supported: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplsupportedPartialP = {
          val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplsupportedPartialP]
        }
        
        inline def PickImpltopPartialPickImp(top: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImpltopPartialPickImp = {
          val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImpltopPartialPickImp]
        }
      }
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'Sticky element must be inside a relative container'
          */
        var container: String
        
        /**
          * @default 'Sticky element is larger than its container, cannot create sticky.'
          */
        var elementSize: String
        
        /**
          * @default 'Context specified does not exist'
          */
        var invalidContext: String
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String
        
        /**
          * @default 'Element is hidden, you must call refresh after element becomes visible'
          */
        var visible: String
      }
      object Impl {
        
        inline def apply(container: String, elementSize: String, invalidContext: String, method: String, visible: String): Impl = {
          val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], invalidContext = invalidContext.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
          
          inline def setElementSize(value: String): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
          
          inline def setInvalidContext(value: String): Self = StObject.set(x, "invalidContext", value.asInstanceOf[js.Any])
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiSticky.anon.PickImplcontainerPartialP
        - typings.semanticUiSticky.anon.PickImplvisiblePartialPic
        - typings.semanticUiSticky.anon.PickImplmethodPartialPick
        - typings.semanticUiSticky.anon.PickImplinvalidContextPar
        - typings.semanticUiSticky.anon.PickImplelementSizePartia
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplcontainerPartialP(container: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplcontainerPartialP = {
          val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplcontainerPartialP]
        }
        
        inline def PickImplelementSizePartia(elementSize: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplelementSizePartia = {
          val __obj = js.Dynamic.literal(elementSize = elementSize.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplelementSizePartia]
        }
        
        inline def PickImplinvalidContextPar(invalidContext: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplinvalidContextPar = {
          val __obj = js.Dynamic.literal(invalidContext = invalidContext.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplinvalidContextPar]
        }
        
        inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplmethodPartialPick = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplmethodPartialPick]
        }
        
        inline def PickImplvisiblePartialPic(visible: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplvisiblePartialPic = {
          val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplvisiblePartialPic]
        }
      }
    }
    type ErrorSettings = typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings.Param
  }
  
  object StickySettings {
    
    trait Impl extends StObject {
      
      /**
        * Offset in pixels from the bottom of the screen when fixing element to viewport
        *
        * @default 0
        */
      var bottomOffset: Double
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings
      
      /**
        * Context which sticky element should stick to
        *
        * @default false
        */
      var context: `false` | String | JQuery
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Sticky container height will only be set if the difference between heights of container and context is larger than this jitter value.
        *
        * @default 5
        */
      var jitter: Double
      
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
        * Whether any change in context DOM should automatically refresh cached sticky positions
        *
        * @default false
        */
      var observeChanges: Boolean
      
      /**
        * Offset in pixels from the top of the screen when fixing element to viewport
        *
        * @default 0
        */
      var offset: Double
      
      /**
        * Callback when element is bound to bottom of parent container
        */
      def onBottom(): Unit
      
      // endregion
      // region Callbacks
      /**
        * Callback when element is repositioned from layout change
        */
      def onReposition(): Unit
      
      /**
        * Callback when requestAnimationFrame fires from scroll handler.
        */
      def onScroll(): Unit
      
      /**
        * Callback when element is fixed to page
        */
      def onStick(): Unit
      
      /**
        * Callback when element is bound to top of parent container
        */
      def onTop(): Unit
      
      /**
        * Callback when element is unfixed from page
        */
      def onUnstick(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // region Sticky Settings
      /**
        * Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up
        *
        * @default false
        */
      var pushing: Boolean
      
      /**
        * Context which sticky should attach onscroll events.
        *
        * @default 'window'
        */
      var scrollContext: String | JQuery
      
      /**
        * Sets size of fixed content to match its width before fixing to screen dynamically.
        * This is used because fixed may display block or 100% width content differently than it appears before sticking.
        *
        * @default true
        * @since 2.2.11
        */
      var setSize: Boolean
      
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
        bottomOffset: Double,
        className: ClassNameSettings,
        context: `false` | String | JQuery,
        debug: Boolean,
        error: ErrorSettings,
        jitter: Double,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        onBottom: () => Unit,
        onReposition: () => Unit,
        onScroll: () => Unit,
        onStick: () => Unit,
        onTop: () => Unit,
        onUnstick: () => Unit,
        performance: Boolean,
        pushing: Boolean,
        scrollContext: String | JQuery,
        setSize: Boolean,
        silent: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onBottom = js.Any.fromFunction0(onBottom), onReposition = js.Any.fromFunction0(onReposition), onScroll = js.Any.fromFunction0(onScroll), onStick = js.Any.fromFunction0(onStick), onTop = js.Any.fromFunction0(onTop), onUnstick = js.Any.fromFunction0(onUnstick), performance = performance.asInstanceOf[js.Any], pushing = pushing.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], setSize = setSize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOnBottom(value: () => Unit): Self = StObject.set(x, "onBottom", js.Any.fromFunction0(value))
        
        inline def setOnReposition(value: () => Unit): Self = StObject.set(x, "onReposition", js.Any.fromFunction0(value))
        
        inline def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
        
        inline def setOnStick(value: () => Unit): Self = StObject.set(x, "onStick", js.Any.fromFunction0(value))
        
        inline def setOnTop(value: () => Unit): Self = StObject.set(x, "onTop", js.Any.fromFunction0(value))
        
        inline def setOnUnstick(value: () => Unit): Self = StObject.set(x, "onUnstick", js.Any.fromFunction0(value))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
        
        inline def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
        
        inline def setSetSize(value: Boolean): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSticky.anon.PickImplpushingPartialPic
      - typings.semanticUiSticky.anon.PickImplsetSizePartialPic
      - typings.semanticUiSticky.anon.PickImpljitterPartialPick
      - typings.semanticUiSticky.anon.PickImplobserveChangesPar
      - typings.semanticUiSticky.anon.PickImplcontextPartialPic
      - typings.semanticUiSticky.anon.PickImplscrollContextPart
      - typings.semanticUiSticky.anon.PickImploffsetPartialPick
      - typings.semanticUiSticky.anon.PickImplbottomOffsetParti
      - typings.semanticUiSticky.anon.PickImplonRepositionParti
      - typings.semanticUiSticky.anon.PickImplonScrollPartialPi
      - typings.semanticUiSticky.anon.PickImplonStickPartialPic
      - typings.semanticUiSticky.anon.PickImplonUnstickPartialP
      - typings.semanticUiSticky.anon.PickImplonTopPartialPickI
      - typings.semanticUiSticky.anon.PickImplonBottomPartialPi
      - typings.semanticUiSticky.anon.PickImplclassNamePartialP
      - typings.semanticUiSticky.anon.PickImplerrorPartialPickI
      - typings.semanticUiSticky.anon.PickImplnamespacePartialP
      - typings.semanticUiSticky.anon.PickImplnamePartialPickIm
      - typings.semanticUiSticky.anon.PickImplsilentPartialPick
      - typings.semanticUiSticky.anon.PickImpldebugPartialPickI
      - typings.semanticUiSticky.anon.PickImplperformancePartia
      - typings.semanticUiSticky.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbottomOffsetParti(bottomOffset: Double & js.UndefOr[Double]): typings.semanticUiSticky.anon.PickImplbottomOffsetParti = {
        val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplbottomOffsetParti]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typings.semanticUiSticky.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplcontextPartialPic(context: (`false` | String | JQuery) & (js.UndefOr[`false` | String | JQuery])): typings.semanticUiSticky.anon.PickImplcontextPartialPic = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplcontextPartialPic]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typings.semanticUiSticky.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImpljitterPartialPick(jitter: Double & js.UndefOr[Double]): typings.semanticUiSticky.anon.PickImpljitterPartialPick = {
        val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImpljitterPartialPick]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typings.semanticUiSticky.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplobserveChangesPar(observeChanges: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImplobserveChangesPar = {
        val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplobserveChangesPar]
      }
      
      inline def PickImploffsetPartialPick(offset: Double & js.UndefOr[Double]): typings.semanticUiSticky.anon.PickImploffsetPartialPick = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImploffsetPartialPick]
      }
      
      inline def PickImplonBottomPartialPi(
        onBottom: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiSticky.anon.PickImplonBottomPartialPi = {
        val __obj = js.Dynamic.literal(onBottom = onBottom.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplonBottomPartialPi]
      }
      
      inline def PickImplonRepositionParti(
        onReposition: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiSticky.anon.PickImplonRepositionParti = {
        val __obj = js.Dynamic.literal(onReposition = onReposition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplonRepositionParti]
      }
      
      inline def PickImplonScrollPartialPi(
        onScroll: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiSticky.anon.PickImplonScrollPartialPi = {
        val __obj = js.Dynamic.literal(onScroll = onScroll.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplonScrollPartialPi]
      }
      
      inline def PickImplonStickPartialPic(
        onStick: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiSticky.anon.PickImplonStickPartialPic = {
        val __obj = js.Dynamic.literal(onStick = onStick.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplonStickPartialPic]
      }
      
      inline def PickImplonTopPartialPickI(
        onTop: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiSticky.anon.PickImplonTopPartialPickI = {
        val __obj = js.Dynamic.literal(onTop = onTop.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplonTopPartialPickI]
      }
      
      inline def PickImplonUnstickPartialP(
        onUnstick: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typings.semanticUiSticky.anon.PickImplonUnstickPartialP = {
        val __obj = js.Dynamic.literal(onUnstick = onUnstick.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplonUnstickPartialP]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplperformancePartia]
      }
      
      inline def PickImplpushingPartialPic(pushing: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImplpushingPartialPic = {
        val __obj = js.Dynamic.literal(pushing = pushing.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplpushingPartialPic]
      }
      
      inline def PickImplscrollContextPart(scrollContext: (String | JQuery) & (js.UndefOr[String | JQuery])): typings.semanticUiSticky.anon.PickImplscrollContextPart = {
        val __obj = js.Dynamic.literal(scrollContext = scrollContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplscrollContextPart]
      }
      
      inline def PickImplsetSizePartialPic(setSize: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImplsetSizePartialPic = {
        val __obj = js.Dynamic.literal(setSize = setSize.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplsetSizePartialPic]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typings.semanticUiSticky.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSticky.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/sticky.html#/settings}
    */
  type StickySettings = typings.semanticUiSticky.SemanticUI.StickySettings.Param
}
