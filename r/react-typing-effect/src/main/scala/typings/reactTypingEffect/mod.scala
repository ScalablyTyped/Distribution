package typings.reactTypingEffect

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typing-effect", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactTypingEffectProps, js.Object, Any]
  
  type ReactTypingEffect = Component[ReactTypingEffectProps, js.Object, Any]
  
  trait ReactTypingEffectProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var cursorClassName: js.UndefOr[String] = js.undefined
    
    var displayTextRenderer: js.UndefOr[js.Function2[/* text */ String, /* i */ Double, Element]] = js.undefined
    
    var eraseDelay: js.UndefOr[Double] = js.undefined
    
    var eraseSpeed: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var staticText: js.UndefOr[String] = js.undefined
    
    var text: String | js.Array[String]
    
    var typingDelay: js.UndefOr[Double] = js.undefined
  }
  object ReactTypingEffectProps {
    
    inline def apply(text: String | js.Array[String]): ReactTypingEffectProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTypingEffectProps]
    }
    
    extension [Self <: ReactTypingEffectProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorClassName(value: String): Self = StObject.set(x, "cursorClassName", value.asInstanceOf[js.Any])
      
      inline def setCursorClassNameUndefined: Self = StObject.set(x, "cursorClassName", js.undefined)
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDisplayTextRenderer(value: (/* text */ String, /* i */ Double) => Element): Self = StObject.set(x, "displayTextRenderer", js.Any.fromFunction2(value))
      
      inline def setDisplayTextRendererUndefined: Self = StObject.set(x, "displayTextRenderer", js.undefined)
      
      inline def setEraseDelay(value: Double): Self = StObject.set(x, "eraseDelay", value.asInstanceOf[js.Any])
      
      inline def setEraseDelayUndefined: Self = StObject.set(x, "eraseDelay", js.undefined)
      
      inline def setEraseSpeed(value: Double): Self = StObject.set(x, "eraseSpeed", value.asInstanceOf[js.Any])
      
      inline def setEraseSpeedUndefined: Self = StObject.set(x, "eraseSpeed", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStaticText(value: String): Self = StObject.set(x, "staticText", value.asInstanceOf[js.Any])
      
      inline def setStaticTextUndefined: Self = StObject.set(x, "staticText", js.undefined)
      
      inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTypingDelay(value: Double): Self = StObject.set(x, "typingDelay", value.asInstanceOf[js.Any])
      
      inline def setTypingDelayUndefined: Self = StObject.set(x, "typingDelay", js.undefined)
    }
  }
}
