package typings.reactTypingEffect

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typing-effect", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactTypingEffectProps, js.Object, js.Any]
  
  type ReactTypingEffect = Component[ReactTypingEffectProps, js.Object, js.Any]
  
  trait ReactTypingEffectProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var cursorClassName: js.UndefOr[String] = js.undefined
    
    var eraseDelay: js.UndefOr[Double] = js.undefined
    
    var eraseSpeed: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var staticText: js.UndefOr[String] = js.undefined
    
    var text: String | js.Array[String]
    
    var typingDelay: js.UndefOr[Double] = js.undefined
  }
  object ReactTypingEffectProps {
    
    @scala.inline
    def apply(text: String | js.Array[String]): ReactTypingEffectProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTypingEffectProps]
    }
    
    @scala.inline
    implicit class ReactTypingEffectPropsMutableBuilder[Self <: ReactTypingEffectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorClassName(value: String): Self = StObject.set(x, "cursorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorClassNameUndefined: Self = StObject.set(x, "cursorClassName", js.undefined)
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setEraseDelay(value: Double): Self = StObject.set(x, "eraseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraseDelayUndefined: Self = StObject.set(x, "eraseDelay", js.undefined)
      
      @scala.inline
      def setEraseSpeed(value: Double): Self = StObject.set(x, "eraseSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraseSpeedUndefined: Self = StObject.set(x, "eraseSpeed", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStaticText(value: String): Self = StObject.set(x, "staticText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticTextUndefined: Self = StObject.set(x, "staticText", js.undefined)
      
      @scala.inline
      def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      @scala.inline
      def setTypingDelay(value: Double): Self = StObject.set(x, "typingDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypingDelayUndefined: Self = StObject.set(x, "typingDelay", js.undefined)
    }
  }
}
