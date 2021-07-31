package typings.reactTextTruncate

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-truncate", JSImport.Default)
  @js.native
  class default ()
    extends Component[TextTruncateProps, js.Object, js.Any]
  
  type TextTruncate = Component[TextTruncateProps, js.Object, js.Any]
  
  trait TextTruncateProps extends StObject {
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[Double | Boolean] = js.undefined
    
    var maxCalculateTimes: js.UndefOr[Double] = js.undefined
    
    var onCalculated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onToggled: js.UndefOr[js.Function1[/* truncated */ Boolean, Unit]] = js.undefined
    
    var onTruncated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var textElement: js.UndefOr[ReactNode] = js.undefined
    
    var textTruncateChild: js.UndefOr[ReactNode] = js.undefined
    
    var truncateText: js.UndefOr[String] = js.undefined
  }
  object TextTruncateProps {
    
    @scala.inline
    def apply(): TextTruncateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextTruncateProps]
    }
    
    @scala.inline
    implicit class TextTruncatePropsMutableBuilder[Self <: TextTruncateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setLine(value: Double | Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMaxCalculateTimes(value: Double): Self = StObject.set(x, "maxCalculateTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCalculateTimesUndefined: Self = StObject.set(x, "maxCalculateTimes", js.undefined)
      
      @scala.inline
      def setOnCalculated(value: () => Unit): Self = StObject.set(x, "onCalculated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCalculatedUndefined: Self = StObject.set(x, "onCalculated", js.undefined)
      
      @scala.inline
      def setOnToggled(value: /* truncated */ Boolean => Unit): Self = StObject.set(x, "onToggled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggledUndefined: Self = StObject.set(x, "onToggled", js.undefined)
      
      @scala.inline
      def setOnTruncated(value: () => Unit): Self = StObject.set(x, "onTruncated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTruncatedUndefined: Self = StObject.set(x, "onTruncated", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextElement(value: ReactNode): Self = StObject.set(x, "textElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextElementUndefined: Self = StObject.set(x, "textElement", js.undefined)
      
      @scala.inline
      def setTextTruncateChild(value: ReactNode): Self = StObject.set(x, "textTruncateChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTruncateChildUndefined: Self = StObject.set(x, "textTruncateChild", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTruncateText(value: String): Self = StObject.set(x, "truncateText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateTextUndefined: Self = StObject.set(x, "truncateText", js.undefined)
    }
  }
}
