package typings.semanticUiShape

import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings.Param
import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typings.semanticUiShape.SemanticUI.Shape.Translation
import typings.semanticUiShape.anon.PartialPickImplkeyofImpl
import typings.semanticUiShape.anon.PartialPickImplkeyofImplActive
import typings.semanticUiShape.anon.PartialPickImplkeyofImplMethod
import typings.semanticUiShape.anon.PartialPickImplkeyofImplSide
import typings.semanticUiShape.anon.PickImplactive
import typings.semanticUiShape.anon.PickImplanimating
import typings.semanticUiShape.anon.PickImplbeforeChange
import typings.semanticUiShape.anon.PickImplclassName
import typings.semanticUiShape.anon.PickImpldebug
import typings.semanticUiShape.anon.PickImplduration
import typings.semanticUiShape.anon.PickImplerror
import typings.semanticUiShape.anon.PickImplheight
import typings.semanticUiShape.anon.PickImplhidden
import typings.semanticUiShape.anon.PickImplloading
import typings.semanticUiShape.anon.PickImplmethod
import typings.semanticUiShape.anon.PickImplname
import typings.semanticUiShape.anon.PickImplnamespace
import typings.semanticUiShape.anon.PickImplonChange
import typings.semanticUiShape.anon.PickImplperformance
import typings.semanticUiShape.anon.PickImplselector
import typings.semanticUiShape.anon.PickImplside
import typings.semanticUiShape.anon.PickImplsides
import typings.semanticUiShape.anon.PickImplsilent
import typings.semanticUiShape.anon.PickImplverbose
import typings.semanticUiShape.anon.PickImplwidth
import typings.semanticUiShape.semanticUiShapeStrings.`flip back`
import typings.semanticUiShape.semanticUiShapeStrings.`flip down`
import typings.semanticUiShape.semanticUiShapeStrings.`flip left`
import typings.semanticUiShape.semanticUiShapeStrings.`flip over`
import typings.semanticUiShape.semanticUiShapeStrings.`flip right`
import typings.semanticUiShape.semanticUiShapeStrings.`flip up`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typings.semanticUiShape.semanticUiShapeStrings.`is animating`
import typings.semanticUiShape.semanticUiShapeStrings.`set default side`
import typings.semanticUiShape.semanticUiShapeStrings.`set next side`
import typings.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typings.semanticUiShape.semanticUiShapeStrings.beforeChange
import typings.semanticUiShape.semanticUiShapeStrings.className
import typings.semanticUiShape.semanticUiShapeStrings.debug
import typings.semanticUiShape.semanticUiShapeStrings.destroy
import typings.semanticUiShape.semanticUiShapeStrings.duration
import typings.semanticUiShape.semanticUiShapeStrings.error
import typings.semanticUiShape.semanticUiShapeStrings.height
import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.name
import typings.semanticUiShape.semanticUiShapeStrings.namespace
import typings.semanticUiShape.semanticUiShapeStrings.next
import typings.semanticUiShape.semanticUiShapeStrings.onChange
import typings.semanticUiShape.semanticUiShapeStrings.performance
import typings.semanticUiShape.semanticUiShapeStrings.queue
import typings.semanticUiShape.semanticUiShapeStrings.refresh
import typings.semanticUiShape.semanticUiShapeStrings.repaint
import typings.semanticUiShape.semanticUiShapeStrings.reset
import typings.semanticUiShape.semanticUiShapeStrings.selector
import typings.semanticUiShape.semanticUiShapeStrings.setting
import typings.semanticUiShape.semanticUiShapeStrings.silent
import typings.semanticUiShape.semanticUiShapeStrings.verbose
import typings.semanticUiShape.semanticUiShapeStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Shape extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Flips the shape over counter-clockwise
      */
    def apply(behavior: `flip back`): JQuery = js.native
    /**
      * Flips the shape downward
      */
    def apply(behavior: `flip down`): JQuery = js.native
    /**
      * Flips the shape left
      */
    def apply(behavior: `flip left`): JQuery = js.native
    /**
      * Flips the shape over clock-wise
      */
    def apply(behavior: `flip over`): JQuery = js.native
    /**
      * Flips the shape right
      */
    def apply(behavior: `flip right`): JQuery = js.native
    /**
      * Flips the shape upward
      */
    def apply(behavior: `flip up`): JQuery = js.native
    /**
      * Returns translation for next side staged below
      */
    def apply(behavior: `get transform down`): Translation = js.native
    /**
      * Returns translation for next side staged left
      */
    def apply(behavior: `get transform left`): Translation = js.native
    /**
      * Returns translation for next side staged right
      */
    def apply(behavior: `get transform right`): Translation = js.native
    /**
      * Returns translation for next side staged up
      */
    def apply(behavior: `get transform up`): Translation = js.native
    /**
      * Returns whether shape is currently animating
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Set the next side to next sibling to active element
      */
    def apply(behavior: `set default side`): JQuery = js.native
    /**
      * Set the next side to a specific selector
      */
    def apply(behavior: `set next side`, selector: String): JQuery = js.native
    def apply(behavior: `set next side`, selector: JQuery): JQuery = js.native
    /**
      * Sets shape to the content size of the next side
      */
    def apply(behavior: `set stage size`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Queues an animation until after current animation
      */
    def apply(behavior: queue, animation: String): JQuery = js.native
    /**
      * Refreshes the selector cache for element sides
      */
    def apply(behavior: refresh): JQuery = js.native
    /**
      * Forces a reflow on element
      */
    def apply(behavior: repaint): JQuery = js.native
    /**
      * Removes all inline styles
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: beforeChange, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: className, value: Unit): ClassNameSettings = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: duration, value: Unit): Double = js.native
    def apply(behavior: setting, name: error, value: Unit): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: height, value: Double): JQuery = js.native
    def apply(behavior: setting, name: height, value: Unit): next | initial | Double = js.native
    def apply(behavior: setting, name: height, value: initial): JQuery = js.native
    def apply(behavior: setting, name: height, value: next): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: Unit): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: Unit): String = js.native
    def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: performance, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: selector, value: Unit): SelectorSettings = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: width, value: Double): JQuery = js.native
    def apply(behavior: setting, name: width, value: Unit): next | initial | Double = js.native
    def apply(behavior: setting, name: width, value: initial): JQuery = js.native
    def apply(behavior: setting, name: width, value: next): JQuery = js.native
    def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
    def apply(settings: ShapeSettings): JQuery = js.native
    
    var settings: ShapeSettings = js.native
  }
  object Shape {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'animating'
          */
        var animating: String
        
        /**
          * @default 'hidden'
          */
        var hidden: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(active: String, animating: String, hidden: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
          
          inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplanimating | PickImplhidden | PickImplloading | PickImplactive) & PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String
        
        /**
          * @default 'You tried to switch to a side that does not exist.'
          */
        var side: String
      }
      object Impl {
        
        inline def apply(method: String, side: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplside | PickImplmethod) & PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typings.semanticUiShape.SemanticUI.Shape.ErrorSettings.Param
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.side'
          */
        var side: String
        
        /**
          * @default '.sides'
          */
        var sides: String
      }
      object Impl {
        
        inline def apply(side: String, sides: String): Impl = {
          val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
          
          inline def setSides(value: String): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplsides | PickImplside) & PartialPickImplkeyofImplSide
    }
    type SelectorSettings = typings.semanticUiShape.SemanticUI.Shape.SelectorSettings.Param
    
    trait Translation extends StObject {
      
      var transform: String
    }
    object Translation {
      
      inline def apply(transform: String): Translation = {
        val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
        __obj.asInstanceOf[Translation]
      }
      
      extension [Self <: Translation](x: Self) {
        
        inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object ShapeSettings {
    
    trait Impl extends StObject {
      
      // endregion
      // region Callbacks
      /**
        * Is called before side change
        */
      def beforeChange(): Unit
      
      var className: ClassNameSettings
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // region Shape Settings
      /**
        * Duration of side change animation
        *
        * @default 700
        */
      var duration: Double
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * When set to next will use the height of the next side during the shape's animation.
        * When set to initial it will use the height of the shape at initialization.
        * When set to a specific pixel height, will force the height to that height.
        *
        * @default 'initial'
        * @since 2.2
        */
      var height: next | initial | Double
      
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
        * Is called after visible side change
        */
      def onChange(): Unit
      
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
      
      /**
        * When set to next will use the width of the next side during the shape's animation.
        * When set to initial it will use the width of the shape at initialization.
        * When set to a specific pixel height, will force the width to that height.
        *
        * @default 'initial'
        * @since 2.2
        */
      var width: next | initial | Double
    }
    object Impl {
      
      inline def apply(
        beforeChange: () => Unit,
        className: ClassNameSettings,
        debug: Boolean,
        duration: Double,
        error: ErrorSettings,
        height: next | initial | Double,
        name: String,
        namespace: String,
        onChange: () => Unit,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean,
        width: next | initial | Double
      ): Impl = {
        val __obj = js.Dynamic.literal(beforeChange = js.Any.fromFunction0(beforeChange), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setBeforeChange(value: () => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction0(value))
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: next | initial | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: next | initial | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplduration | PickImplwidth | PickImplheight | PickImplbeforeChange | PickImplonChange | PickImplselector | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) & PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/shape.html#/settings}
    */
  type ShapeSettings = typings.semanticUiShape.SemanticUI.ShapeSettings.Param
}
