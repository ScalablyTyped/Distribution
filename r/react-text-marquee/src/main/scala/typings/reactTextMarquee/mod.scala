package typings.reactTextMarquee

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-marquee", JSImport.Default)
  @js.native
  class default ()
    extends Component[MarqueeProps, js.Object, js.Any]
  
  type Marquee = Component[MarqueeProps, js.Object, js.Any]
  
  @js.native
  trait MarqueeProps extends HTMLProps[HTMLTextAreaElement] {
    
    var hoverToStop: js.UndefOr[Boolean] = js.native
    
    var leading: js.UndefOr[Double] = js.native
    
    var text: String = js.native
    
    var trailing: js.UndefOr[Double] = js.native
  }
  object MarqueeProps {
    
    @scala.inline
    def apply(text: String): MarqueeProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarqueeProps]
    }
    
    @scala.inline
    implicit class MarqueePropsMutableBuilder[Self <: MarqueeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHoverToStop(value: Boolean): Self = StObject.set(x, "hoverToStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverToStopUndefined: Self = StObject.set(x, "hoverToStop", js.undefined)
      
      @scala.inline
      def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
