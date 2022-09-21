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
  open class default ()
    extends Component[TypingProps, js.Object, Any]
  object default {
    
    @JSImport("react-typing-animation", "default.Backspace")
    @js.native
    open class Backspace ()
      extends Component[BackspaceProperties, js.Object, Any]
    
    @JSImport("react-typing-animation", "default.Delay")
    @js.native
    open class Delay ()
      extends Component[DelayProperties, js.Object, Any]
    
    @JSImport("react-typing-animation", "default.Reset")
    @js.native
    open class Reset ()
      extends Component[ResetProperties, js.Object, Any]
    
    @JSImport("react-typing-animation", "default.Speed")
    @js.native
    open class Speed ()
      extends Component[SpeedProperties, js.Object, Any]
  }
  
  object Typing {
    
    type Backspace = Component[BackspaceProperties, js.Object, Any]
    
    trait BackspaceProperties extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var speed: js.UndefOr[Double] = js.undefined
    }
    object BackspaceProperties {
      
      inline def apply(): BackspaceProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BackspaceProperties]
      }
      
      extension [Self <: BackspaceProperties](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    type Delay = Component[DelayProperties, js.Object, Any]
    
    trait DelayProperties extends StObject {
      
      var ms: Double
    }
    object DelayProperties {
      
      inline def apply(ms: Double): DelayProperties = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DelayProperties]
      }
      
      extension [Self <: DelayProperties](x: Self) {
        
        inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
    
    type Reset = Component[ResetProperties, js.Object, Any]
    
    trait ResetProperties extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var speed: js.UndefOr[Double] = js.undefined
    }
    object ResetProperties {
      
      inline def apply(): ResetProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResetProperties]
      }
      
      extension [Self <: ResetProperties](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    type Speed = Component[SpeedProperties, js.Object, Any]
    
    trait SpeedProperties extends StObject {
      
      var ms: Double
    }
    object SpeedProperties {
      
      inline def apply(ms: Double): SpeedProperties = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[SpeedProperties]
      }
      
      extension [Self <: SpeedProperties](x: Self) {
        
        inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
  }
  type Typing = Component[TypingProps, js.Object, Any]
  
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
    
    inline def apply(): TypingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypingProps]
    }
    
    extension [Self <: TypingProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursor(value: ReactNode): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorClassName(value: String): Self = StObject.set(x, "cursorClassName", value.asInstanceOf[js.Any])
      
      inline def setCursorClassNameUndefined: Self = StObject.set(x, "cursorClassName", js.undefined)
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      inline def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnAfterType(value: () => Unit): Self = StObject.set(x, "onAfterType", js.Any.fromFunction0(value))
      
      inline def setOnAfterTypeUndefined: Self = StObject.set(x, "onAfterType", js.undefined)
      
      inline def setOnBeforeType(value: () => Unit): Self = StObject.set(x, "onBeforeType", js.Any.fromFunction0(value))
      
      inline def setOnBeforeTypeUndefined: Self = StObject.set(x, "onBeforeType", js.undefined)
      
      inline def setOnFinishedTyping(value: () => Unit): Self = StObject.set(x, "onFinishedTyping", js.Any.fromFunction0(value))
      
      inline def setOnFinishedTypingUndefined: Self = StObject.set(x, "onFinishedTyping", js.undefined)
      
      inline def setOnStartedTyping(value: () => Unit): Self = StObject.set(x, "onStartedTyping", js.Any.fromFunction0(value))
      
      inline def setOnStartedTypingUndefined: Self = StObject.set(x, "onStartedTyping", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    }
  }
}
