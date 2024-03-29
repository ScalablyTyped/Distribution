package typings.reactTextMarquee

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-marquee", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MarqueeProps, js.Object, Any]
  
  type Marquee = Component[MarqueeProps, js.Object, Any]
  
  trait MarqueeProps
    extends StObject
       with HTMLProps[HTMLTextAreaElement] {
    
    var hoverToStop: js.UndefOr[Boolean] = js.undefined
    
    var leading: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    var trailing: js.UndefOr[Double] = js.undefined
  }
  object MarqueeProps {
    
    inline def apply(text: String): MarqueeProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarqueeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarqueeProps] (val x: Self) extends AnyVal {
      
      inline def setHoverToStop(value: Boolean): Self = StObject.set(x, "hoverToStop", value.asInstanceOf[js.Any])
      
      inline def setHoverToStopUndefined: Self = StObject.set(x, "hoverToStop", js.undefined)
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
