package typings.reactCircularProgressbar

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactCircularProgressbar.anon.Background
import typings.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressbarWithChildrenMod {
  
  @JSImport("react-circular-progressbar/dist/CircularProgressbarWithChildren", JSImport.Default)
  @js.native
  def default(props: CircularProgressbarWithChildrenProps): Element = js.native
  
  /* Inlined react-circular-progressbar.react-circular-progressbar/dist/types.CircularProgressbarWrapperProps & {  children :react.react.ReactNode | undefined} */
  @js.native
  trait CircularProgressbarWithChildrenProps extends StObject {
    
    var background: js.UndefOr[Boolean] = js.native
    
    var backgroundPadding: js.UndefOr[Double] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var circleRatio: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[Background] = js.native
    
    var counterClockwise: js.UndefOr[Boolean] = js.native
    
    var maxValue: js.UndefOr[Double] = js.native
    
    var minValue: js.UndefOr[Double] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var styles: js.UndefOr[CircularProgressbarStyles] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var value: Double = js.native
  }
  object CircularProgressbarWithChildrenProps {
    
    @scala.inline
    def apply(value: Double): CircularProgressbarWithChildrenProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressbarWithChildrenProps]
    }
    
    @scala.inline
    implicit class CircularProgressbarWithChildrenPropsMutableBuilder[Self <: CircularProgressbarWithChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPadding(value: Double): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCircleRatio(value: Double): Self = StObject.set(x, "circleRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleRatioUndefined: Self = StObject.set(x, "circleRatio", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: Background): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setCounterClockwise(value: Boolean): Self = StObject.set(x, "counterClockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterClockwiseUndefined: Self = StObject.set(x, "counterClockwise", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyles(value: CircularProgressbarStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
