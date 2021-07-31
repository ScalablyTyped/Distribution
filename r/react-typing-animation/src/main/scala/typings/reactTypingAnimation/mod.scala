package typings.reactTypingAnimation

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactTypingAnimation.mod.Typing.BackspaceProperties
import typings.reactTypingAnimation.mod.Typing.DelayProperties
import typings.reactTypingAnimation.mod.Typing.ResetProperties
import typings.reactTypingAnimation.mod.Typing.SpeedProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typing-animation", JSImport.Default)
  @js.native
  class default ()
    extends Component[TypingProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-typing-animation", "default.Backspace")
    @js.native
    class Backspace ()
      extends Component[BackspaceProperties, js.Object, js.Any]
    
    @JSImport("react-typing-animation", "default.Delay")
    @js.native
    class Delay ()
      extends Component[DelayProperties, js.Object, js.Any]
    
    @JSImport("react-typing-animation", "default.Reset")
    @js.native
    class Reset ()
      extends Component[ResetProperties, js.Object, js.Any]
    
    @JSImport("react-typing-animation", "default.Speed")
    @js.native
    class Speed ()
      extends Component[SpeedProperties, js.Object, js.Any]
  }
  
  object Typing {
    
    type Backspace = Component[BackspaceProperties, js.Object, js.Any]
    
    trait BackspaceProperties extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var speed: js.UndefOr[Double] = js.undefined
    }
    object BackspaceProperties {
      
      @scala.inline
      def apply(): BackspaceProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BackspaceProperties]
      }
      
      @scala.inline
      implicit class BackspacePropertiesMutableBuilder[Self <: BackspaceProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        @scala.inline
        def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    type Delay = Component[DelayProperties, js.Object, js.Any]
    
    trait DelayProperties extends StObject {
      
      var ms: Double
    }
    object DelayProperties {
      
      @scala.inline
      def apply(ms: Double): DelayProperties = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DelayProperties]
      }
      
      @scala.inline
      implicit class DelayPropertiesMutableBuilder[Self <: DelayProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
    
    type Reset = Component[ResetProperties, js.Object, js.Any]
    
    trait ResetProperties extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var speed: js.UndefOr[Double] = js.undefined
    }
    object ResetProperties {
      
      @scala.inline
      def apply(): ResetProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResetProperties]
      }
      
      @scala.inline
      implicit class ResetPropertiesMutableBuilder[Self <: ResetProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        @scala.inline
        def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    type Speed = Component[SpeedProperties, js.Object, js.Any]
    
    trait SpeedProperties extends StObject {
      
      var ms: Double
    }
    object SpeedProperties {
      
      @scala.inline
      def apply(ms: Double): SpeedProperties = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[SpeedProperties]
      }
      
      @scala.inline
      implicit class SpeedPropertiesMutableBuilder[Self <: SpeedProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
  }
  type Typing = Component[TypingProps, js.Object, js.Any]
  
  trait TypingProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[ReactNode] = js.undefined
    
    var cursorClassName: js.UndefOr[String] = js.undefined
    
    var hideCursor: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onAfterType: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBeforeType: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFinishedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStartedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var startDelay: js.UndefOr[Double] = js.undefined
  }
  object TypingProps {
    
    @scala.inline
    def apply(): TypingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypingProps]
    }
    
    @scala.inline
    implicit class TypingPropsMutableBuilder[Self <: TypingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursor(value: ReactNode): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorClassName(value: String): Self = StObject.set(x, "cursorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorClassNameUndefined: Self = StObject.set(x, "cursorClassName", js.undefined)
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnAfterType(value: () => Unit): Self = StObject.set(x, "onAfterType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterTypeUndefined: Self = StObject.set(x, "onAfterType", js.undefined)
      
      @scala.inline
      def setOnBeforeType(value: () => Unit): Self = StObject.set(x, "onBeforeType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeTypeUndefined: Self = StObject.set(x, "onBeforeType", js.undefined)
      
      @scala.inline
      def setOnFinishedTyping(value: () => Unit): Self = StObject.set(x, "onFinishedTyping", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFinishedTypingUndefined: Self = StObject.set(x, "onFinishedTyping", js.undefined)
      
      @scala.inline
      def setOnStartedTyping(value: () => Unit): Self = StObject.set(x, "onStartedTyping", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartedTypingUndefined: Self = StObject.set(x, "onStartedTyping", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    }
  }
}
