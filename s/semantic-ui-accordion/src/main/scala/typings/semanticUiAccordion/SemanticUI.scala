package typings.semanticUiAccordion

import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings.Param
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import typings.semanticUiAccordion.anon.PartialPickImplkeyofImpl
import typings.semanticUiAccordion.anon.PartialPickImplkeyofImplAccordion
import typings.semanticUiAccordion.anon.PartialPickImplkeyofImplActive
import typings.semanticUiAccordion.anon.PickImplaccordion
import typings.semanticUiAccordion.anon.PickImplactive
import typings.semanticUiAccordion.anon.PickImplanimateChildren
import typings.semanticUiAccordion.anon.PickImplanimating
import typings.semanticUiAccordion.anon.PickImplclassName
import typings.semanticUiAccordion.anon.PickImplcloseNested
import typings.semanticUiAccordion.anon.PickImplcollapsible
import typings.semanticUiAccordion.anon.PickImplcontent
import typings.semanticUiAccordion.anon.PickImpldebug
import typings.semanticUiAccordion.anon.PickImplduration
import typings.semanticUiAccordion.anon.PickImpleasing
import typings.semanticUiAccordion.anon.PickImplerror
import typings.semanticUiAccordion.anon.PickImplexclusive
import typings.semanticUiAccordion.anon.PickImplname
import typings.semanticUiAccordion.anon.PickImplnamespace
import typings.semanticUiAccordion.anon.PickImplobserveChanges
import typings.semanticUiAccordion.anon.PickImplon
import typings.semanticUiAccordion.anon.PickImplonChange
import typings.semanticUiAccordion.anon.PickImplonClose
import typings.semanticUiAccordion.anon.PickImplonClosing
import typings.semanticUiAccordion.anon.PickImplonOpen
import typings.semanticUiAccordion.anon.PickImplonOpening
import typings.semanticUiAccordion.anon.PickImplperformance
import typings.semanticUiAccordion.anon.PickImplselector
import typings.semanticUiAccordion.anon.PickImplsilent
import typings.semanticUiAccordion.anon.PickImpltitle
import typings.semanticUiAccordion.anon.PickImpltrigger
import typings.semanticUiAccordion.anon.PickImplverbose
import typings.semanticUiAccordion.semanticUiAccordionStrings.`close others`
import typings.semanticUiAccordion.semanticUiAccordionStrings.animateChildren
import typings.semanticUiAccordion.semanticUiAccordionStrings.className
import typings.semanticUiAccordion.semanticUiAccordionStrings.close
import typings.semanticUiAccordion.semanticUiAccordionStrings.closeNested
import typings.semanticUiAccordion.semanticUiAccordionStrings.collapsible
import typings.semanticUiAccordion.semanticUiAccordionStrings.debug
import typings.semanticUiAccordion.semanticUiAccordionStrings.destroy
import typings.semanticUiAccordion.semanticUiAccordionStrings.duration
import typings.semanticUiAccordion.semanticUiAccordionStrings.easing
import typings.semanticUiAccordion.semanticUiAccordionStrings.error
import typings.semanticUiAccordion.semanticUiAccordionStrings.exclusive
import typings.semanticUiAccordion.semanticUiAccordionStrings.name
import typings.semanticUiAccordion.semanticUiAccordionStrings.namespace
import typings.semanticUiAccordion.semanticUiAccordionStrings.observeChanges
import typings.semanticUiAccordion.semanticUiAccordionStrings.on
import typings.semanticUiAccordion.semanticUiAccordionStrings.onChange
import typings.semanticUiAccordion.semanticUiAccordionStrings.onClose
import typings.semanticUiAccordion.semanticUiAccordionStrings.onClosing
import typings.semanticUiAccordion.semanticUiAccordionStrings.onOpen
import typings.semanticUiAccordion.semanticUiAccordionStrings.onOpening
import typings.semanticUiAccordion.semanticUiAccordionStrings.open
import typings.semanticUiAccordion.semanticUiAccordionStrings.performance
import typings.semanticUiAccordion.semanticUiAccordionStrings.refresh
import typings.semanticUiAccordion.semanticUiAccordionStrings.selector
import typings.semanticUiAccordion.semanticUiAccordionStrings.setting
import typings.semanticUiAccordion.semanticUiAccordionStrings.silent
import typings.semanticUiAccordion.semanticUiAccordionStrings.toggle
import typings.semanticUiAccordion.semanticUiAccordionStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Accordion extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Closes accordion content that are not active
      */
    def apply(behavior: `close others`): JQuery = js.native
    /**
      * Closes accordion content at index
      */
    def apply(behavior: close, index: Double): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Opens accordion content at index
      */
    def apply(behavior: open, index: Double): JQuery = js.native
    /**
      * Refreshes all cached selectors and data
      */
    def apply(behavior: refresh): JQuery = js.native
    def apply(behavior: setting, name: animateChildren, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: animateChildren, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: closeNested, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: closeNested, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: collapsible, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: collapsible, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: easing, value: String): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onClose, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onClosing, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onClosing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onOpening, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onOpening, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onOpen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: on, value: String): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: AccordionSettings): JQuery = js.native
    /**
      * Toggles accordion content at index
      */
    def apply(behavior: toggle, index: Double): JQuery = js.native
    def apply(settings: AccordionSettings): JQuery = js.native
    
    var settings: AccordionSettings = js.native
  }
  object Accordion {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'animating'
          */
        var animating: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(active: String, animating: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImplanimating) with PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings.Param */
    @js.native
    trait ErrorSettings extends StObject {
      
      var method: String with js.UndefOr[String] = js.native
    }
    object ErrorSettings {
      
      @scala.inline
      def apply(method: String with js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      @scala.inline
      implicit class ErrorSettingsMutableBuilder[Self <: ErrorSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var method: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(method: String with js.UndefOr[String]): typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.accordion'
          */
        var accordion: String = js.native
        
        /**
          * @default '.content'
          */
        var content: String = js.native
        
        /**
          * @default '.title'
          */
        var title: String = js.native
        
        /**
          * @default '.title'
          */
        var trigger: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(accordion: String, content: String, title: String, trigger: String): Impl = {
          val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccordion(value: String): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplaccordion | PickImpltitle | PickImpltrigger | PickImplcontent) with PartialPickImplkeyofImplAccordion
    }
    type SelectorSettings = typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings.Param
  }
  
  object AccordionSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Whether child content opacity should be animated (may cause performance issues with many child elements)
        *
        * @default true
        */
      var animateChildren: Boolean = js.native
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Close open nested accordion content when an element closes
        *
        * @default true
        */
      var closeNested: Boolean = js.native
      
      /**
        * Allow active sections to collapse
        *
        * @default true
        */
      var collapsible: Boolean = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * Duration in ms of opening animation
        *
        * @default 500
        */
      var duration: Double = js.native
      
      /**
        * Easing of opening animation. EaseInOutQuint is included with accordion, for additional options you must include easing equations.
        *
        * @default 'easeInOutQuint'
        * @see {@link http://gsgd.co.uk/sandbox/jquery/easing/}
        */
      var easing: String = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      // region Behavior
      /**
        * Only allow one section open at a time
        *
        * @default true
        */
      var exclusive: Boolean = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      /**
        * whether accordion should automatically refresh on DOM insertion
        *
        * @default true
        */
      var observeChanges: Boolean = js.native
      
      /**
        * Event on title that will cause accordion to open
        *
        * @default 'click'
        */
      var on: String = js.native
      
      /**
        * Callback on element open or close
        */
      def onChange(): Unit = js.native
      
      /**
        * Callback after element is closed
        */
      def onClose(): Unit = js.native
      
      /**
        * Callback before element closes
        */
      def onClosing(): Unit = js.native
      
      /**
        * Callback after element is open
        */
      def onOpen(): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback before element opens
        */
      def onOpening(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        animateChildren: Boolean,
        className: ClassNameSettings,
        closeNested: Boolean,
        collapsible: Boolean,
        debug: Boolean,
        duration: Double,
        easing: String,
        error: ErrorSettings,
        exclusive: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        on: String,
        onChange: () => Unit,
        onClose: () => Unit,
        onClosing: () => Unit,
        onOpen: () => Unit,
        onOpening: () => Unit,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeNested = closeNested.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onClosing = js.Any.fromFunction0(onClosing), onOpen = js.Any.fromFunction0(onOpen), onOpening = js.Any.fromFunction0(onOpening), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnimateChildren(value: Boolean): Self = StObject.set(x, "animateChildren", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseNested(value: Boolean): Self = StObject.set(x, "closeNested", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnClosing(value: () => Unit): Self = StObject.set(x, "onClosing", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnOpening(value: () => Unit): Self = StObject.set(x, "onOpening", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplexclusive | PickImplon | PickImplanimateChildren | PickImplcloseNested | PickImplcollapsible | PickImplduration | PickImpleasing | PickImplobserveChanges | PickImplonOpening | PickImplonOpen | PickImplonClosing | PickImplonClose | PickImplonChange | PickImplselector | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/accordion.html#/settings}
    */
  type AccordionSettings = typings.semanticUiAccordion.SemanticUI.AccordionSettings.Param
}
