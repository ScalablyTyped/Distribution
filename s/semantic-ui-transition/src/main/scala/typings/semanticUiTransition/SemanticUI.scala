package typings.semanticUiTransition

import typings.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typings.semanticUiTransition.SemanticUI.Transition.ClassNameSettings.Param
import typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typings.semanticUiTransition.anon.PartialPickImplkeyofImpl
import typings.semanticUiTransition.anon.PartialPickImplkeyofImplAnimating
import typings.semanticUiTransition.anon.PartialPickImplkeyofImplMethod
import typings.semanticUiTransition.anon.PickImplallowRepeats
import typings.semanticUiTransition.anon.PickImplanimating
import typings.semanticUiTransition.anon.PickImplanimation
import typings.semanticUiTransition.anon.PickImplclassName
import typings.semanticUiTransition.anon.PickImpldebug
import typings.semanticUiTransition.anon.PickImpldisabled
import typings.semanticUiTransition.anon.PickImpldisplayType
import typings.semanticUiTransition.anon.PickImplduration
import typings.semanticUiTransition.anon.PickImplerror
import typings.semanticUiTransition.anon.PickImplhidden
import typings.semanticUiTransition.anon.PickImplinterval
import typings.semanticUiTransition.anon.PickImplinward
import typings.semanticUiTransition.anon.PickImplloading
import typings.semanticUiTransition.anon.PickImpllooping
import typings.semanticUiTransition.anon.PickImplmethod
import typings.semanticUiTransition.anon.PickImplname
import typings.semanticUiTransition.anon.PickImplnamespace
import typings.semanticUiTransition.anon.PickImplnoAnimation
import typings.semanticUiTransition.anon.PickImplonComplete
import typings.semanticUiTransition.anon.PickImplonHide
import typings.semanticUiTransition.anon.PickImplonShow
import typings.semanticUiTransition.anon.PickImplonStart
import typings.semanticUiTransition.anon.PickImploutward
import typings.semanticUiTransition.anon.PickImplperformance
import typings.semanticUiTransition.anon.PickImplqueue
import typings.semanticUiTransition.anon.PickImplreverse
import typings.semanticUiTransition.anon.PickImplsilent
import typings.semanticUiTransition.anon.PickImpltransition
import typings.semanticUiTransition.anon.PickImpluseFailSafe
import typings.semanticUiTransition.anon.PickImplverbose
import typings.semanticUiTransition.anon.PickImplvisible
import typings.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typings.semanticUiTransition.semanticUiTransitionStrings.`clear queue`
import typings.semanticUiTransition.semanticUiTransitionStrings.`force repaint`
import typings.semanticUiTransition.semanticUiTransitionStrings.`get animation event`
import typings.semanticUiTransition.semanticUiTransitionStrings.`get animation name`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is animating`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is looping`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is supported`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is visible`
import typings.semanticUiTransition.semanticUiTransitionStrings.`remove looping`
import typings.semanticUiTransition.semanticUiTransitionStrings.`restore conditions`
import typings.semanticUiTransition.semanticUiTransitionStrings.`save conditions`
import typings.semanticUiTransition.semanticUiTransitionStrings.`set duration`
import typings.semanticUiTransition.semanticUiTransitionStrings.`stop all`
import typings.semanticUiTransition.semanticUiTransitionStrings.allowRepeats
import typings.semanticUiTransition.semanticUiTransitionStrings.animation
import typings.semanticUiTransition.semanticUiTransitionStrings.auto
import typings.semanticUiTransition.semanticUiTransitionStrings.className
import typings.semanticUiTransition.semanticUiTransitionStrings.debug
import typings.semanticUiTransition.semanticUiTransitionStrings.destroy
import typings.semanticUiTransition.semanticUiTransitionStrings.disable
import typings.semanticUiTransition.semanticUiTransitionStrings.displayType
import typings.semanticUiTransition.semanticUiTransitionStrings.duration
import typings.semanticUiTransition.semanticUiTransitionStrings.enable
import typings.semanticUiTransition.semanticUiTransitionStrings.error
import typings.semanticUiTransition.semanticUiTransitionStrings.hide
import typings.semanticUiTransition.semanticUiTransitionStrings.interval
import typings.semanticUiTransition.semanticUiTransitionStrings.looping
import typings.semanticUiTransition.semanticUiTransitionStrings.name
import typings.semanticUiTransition.semanticUiTransitionStrings.namespace
import typings.semanticUiTransition.semanticUiTransitionStrings.onComplete
import typings.semanticUiTransition.semanticUiTransitionStrings.onHide
import typings.semanticUiTransition.semanticUiTransitionStrings.onShow
import typings.semanticUiTransition.semanticUiTransitionStrings.onStart
import typings.semanticUiTransition.semanticUiTransitionStrings.performance
import typings.semanticUiTransition.semanticUiTransitionStrings.queue
import typings.semanticUiTransition.semanticUiTransitionStrings.repaint
import typings.semanticUiTransition.semanticUiTransitionStrings.reset
import typings.semanticUiTransition.semanticUiTransitionStrings.reverse
import typings.semanticUiTransition.semanticUiTransitionStrings.setting
import typings.semanticUiTransition.semanticUiTransitionStrings.show
import typings.semanticUiTransition.semanticUiTransitionStrings.silent
import typings.semanticUiTransition.semanticUiTransitionStrings.stop
import typings.semanticUiTransition.semanticUiTransitionStrings.toggle
import typings.semanticUiTransition.semanticUiTransitionStrings.useFailSafe
import typings.semanticUiTransition.semanticUiTransitionStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Transition extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears all queued animations
      */
    def apply(behavior: `clear queue`): JQuery = js.native
    /**
      * Forces reflow using a more expensive but stable method
      */
    def apply(behavior: `force repaint`): JQuery = js.native
    /**
      * Returns vendor prefixed animation property for animationend
      */
    def apply(behavior: `get animation event`): String = js.native
    /**
      * Returns vendor prefixed animation property for animationname
      */
    def apply(behavior: `get animation name`): String = js.native
    /**
      * Returns whether transition is currently occurring
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Returns whether animation looping is set
      */
    def apply(behavior: `is looping`): Boolean = js.native
    /**
      * Returns whether animations are supported
      */
    def apply(behavior: `is supported`): Boolean = js.native
    /**
      * Returns whether element is currently visible
      */
    def apply(behavior: `is visible`): Boolean = js.native
    /**
      * Removes looping state from element
      */
    def apply(behavior: `remove looping`): JQuery = js.native
    /**
      * Adds back cached names and styles to element
      */
    def apply(behavior: `restore conditions`): JQuery = js.native
    /**
      * Saves all class names and styles to cache to be retrieved after animation
      */
    def apply(behavior: `save conditions`): JQuery = js.native
    /**
      * Modifies element animation duration
      */
    def apply(behavior: `set duration`, duration: Double): JQuery = js.native
    /**
      * Stop current animation and queued animations
      */
    def apply(behavior: `stop all`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Adds disabled state (stops ability to animate)
      */
    def apply(behavior: disable): JQuery = js.native
    /**
      * Removes disabled state
      */
    def apply(behavior: enable): JQuery = js.native
    /**
      * Stop current animation and hide element
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Enables animation looping
      */
    def apply(behavior: looping): JQuery = js.native
    /**
      * Triggers reflow on element
      */
    def apply(behavior: repaint): JQuery = js.native
    /**
      * Resets all conditions changes during transition
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, name: allowRepeats, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: allowRepeats, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: animation, value: String): JQuery = js.native
    def apply(behavior: setting, name: animation, value: Unit): String = js.native
    def apply(behavior: setting, name: className, value: Unit): ClassNameSettings = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: displayType, value: String): JQuery = js.native
    def apply(behavior: setting, name: displayType, value: Unit): `false` | String = js.native
    def apply(behavior: setting, name: displayType, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: duration, value: Unit): Double = js.native
    def apply(behavior: setting, name: error, value: Unit): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: interval, value: Double): JQuery = js.native
    def apply(behavior: setting, name: interval, value: Unit): Double = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: Unit): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: Unit): String = js.native
    def apply(behavior: setting, name: onComplete, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onComplete, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onShow, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onStart, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onStart, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: performance, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: queue, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: queue, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: reverse, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: reverse, value: Unit): auto | Boolean = js.native
    def apply(behavior: setting, name: reverse, value: auto): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: useFailSafe, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: useFailSafe, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: Unit): Boolean = js.native
    def apply(behavior: setting, value: TransitionSettings): JQuery = js.native
    /**
      * Stop current animation and show element
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Stop current animation and preserve queue
      */
    def apply(behavior: stop): JQuery = js.native
    /**
      * Toggles between hide and show
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: TransitionSettings): JQuery = js.native
    def apply(transition: String): JQuery = js.native
    
    var settings: TransitionSettings = js.native
  }
  object Transition {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'animating'
          */
        var animating: String
        
        /**
          * @default 'disabled'
          */
        var disabled: String
        
        /**
          * @default 'hidden'
          */
        var hidden: String
        
        /**
          * @default 'in'
          */
        var inward: String
        
        /**
          * @default 'loading'
          */
        var loading: String
        
        /**
          * @default 'looping'
          */
        var looping: String
        
        /**
          * @default 'out'
          */
        var outward: String
        
        /**
          * @default 'transition'
          */
        var transition: String
        
        /**
          * @default 'visible'
          */
        var visible: String
      }
      object Impl {
        
        @scala.inline
        def apply(
          animating: String,
          disabled: String,
          hidden: String,
          inward: String,
          loading: String,
          looping: String,
          outward: String,
          transition: String,
          visible: String
        ): Impl = {
          val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inward = inward.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], outward = outward.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInward(value: String): Self = StObject.set(x, "inward", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLooping(value: String): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOutward(value: String): Self = StObject.set(x, "outward", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplanimating | PickImpldisabled | PickImplhidden | PickImplinward | PickImplloading | PickImpllooping | PickImploutward | PickImpltransition | PickImplvisible) & PartialPickImplkeyofImplAnimating
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String
        
        /**
          * @default 'There is no CSS animation matching the one you specified.'
          */
        var noAnimation: String
      }
      object Impl {
        
        @scala.inline
        def apply(method: String, noAnimation: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noAnimation = noAnimation.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplnoAnimation | PickImplmethod) & PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings.Param
  }
  
  object TransitionSettings {
    
    trait Impl extends StObject {
      
      /**
        * If enabled will allow same animation to be queued while it is already occurring
        */
      var allowRepeats: Boolean
      
      // region Transition Settings
      /**
        * Named animation event to used. Must be defined in CSS.
        *
        * @default 'fade'
        */
      var animation: String
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
        *
        * @default false
        */
      var displayType: `false` | String
      
      /**
        * Duration of the CSS transition animation
        *
        * @default 500
        */
      var duration: Double
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Interval in MS between each elements transition
        *
        * @default 0
        */
      var interval: Double
      
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
        * Callback on each transition complete
        */
      def onComplete(): Unit
      
      /**
        * Callback on each transition that changes visibility to hidden
        */
      def onHide(): Unit
      
      // endregion
      // region Callbacks
      /**
        * Callback on each transition that changes visibility to shown
        */
      def onShow(): Unit
      
      /**
        * Callback on animation start, useful for queued animations
        */
      def onStart(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      /**
        * Whether to automatically queue animation if another is occurring
        */
      var queue: Boolean
      
      /**
        * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
        *
        * @default 'auto'
        */
      var reverse: auto | Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
        */
      var useFailSafe: Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      @scala.inline
      def apply(
        allowRepeats: Boolean,
        animation: String,
        className: ClassNameSettings,
        debug: Boolean,
        displayType: `false` | String,
        duration: Double,
        error: ErrorSettings,
        interval: Double,
        name: String,
        namespace: String,
        onComplete: () => Unit,
        onHide: () => Unit,
        onShow: () => Unit,
        onStart: () => Unit,
        performance: Boolean,
        queue: Boolean,
        reverse: auto | Boolean,
        silent: Boolean,
        useFailSafe: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onComplete = js.Any.fromFunction0(onComplete), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), onStart = js.Any.fromFunction0(onStart), performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], useFailSafe = useFailSafe.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowRepeats(value: Boolean): Self = StObject.set(x, "allowRepeats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayType(value: `false` | String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReverse(value: auto | Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseFailSafe(value: Boolean): Self = StObject.set(x, "useFailSafe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplanimation | PickImplinterval | PickImplreverse | PickImpldisplayType | PickImplduration | PickImpluseFailSafe | PickImplallowRepeats | PickImplqueue | PickImplonShow | PickImplonHide | PickImplonStart | PickImplonComplete | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) & PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/transition.html#/settings}
    */
  type TransitionSettings = typings.semanticUiTransition.SemanticUI.TransitionSettings.Param
}
