package typings.reactStars

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stars", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactStarsProps, js.Object, js.Any]
  
  type ReactStars = Component[ReactStarsProps, js.Object, js.Any]
  
  trait ReactStarsProps extends StObject {
    
    /** Which character you want to use as a star */
    var char: js.UndefOr[String] = js.undefined
    
    /** Name of parent class */
    var className: js.UndefOr[String] = js.undefined
    
    /** Color of inactive star (this supports any CSS valid value) */
    var color1: js.UndefOr[String] = js.undefined
    
    /** Color of selected or active star */
    var color2: js.UndefOr[String] = js.undefined
    
    /** How many total stars you want */
    var count: js.UndefOr[Double] = js.undefined
    
    /** Should you be able to select rating or just see rating (for reusability) */
    var edit: js.UndefOr[Boolean] = js.undefined
    
    /** Should component use half stars, if not the decimal part will be dropped otherwise normal algebra rools will apply to round to half stars */
    var half: js.UndefOr[Boolean] = js.undefined
    
    /** Will be invoked any time the rating is changed */
    var onChange: js.UndefOr[js.Function1[/* new_rating */ Double, Unit]] = js.undefined
    
    /** Size of stars (in px) */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Set rating value */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ReactStarsProps {
    
    @scala.inline
    def apply(): ReactStarsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactStarsProps]
    }
    
    @scala.inline
    implicit class ReactStarsPropsMutableBuilder[Self <: ReactStarsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor1Undefined: Self = StObject.set(x, "color1", js.undefined)
      
      @scala.inline
      def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      @scala.inline
      def setHalf(value: Boolean): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* new_rating */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
