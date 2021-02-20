package typings.reactMotionSlider

import typings.react.mod.Component
import typings.reactMotion.mod.OpaqueConfig
import typings.reactMotionSlider.reactMotionSliderStrings.center
import typings.reactMotionSlider.reactMotionSliderStrings.left
import typings.reactMotionSlider.reactMotionSliderStrings.mouse
import typings.reactMotionSlider.reactMotionSliderStrings.right
import typings.reactMotionSlider.reactMotionSliderStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-motion-slider", JSImport.Default)
  @js.native
  class default () extends Slider
  
  @js.native
  trait Slider
    extends Component[SliderProps, js.Object, js.Any] {
    
    /**
      * Moves to next slide
      */
    def next(): Unit = js.native
    
    /**
      * Move to previous slide
      */
    def prev(): Unit = js.native
  }
  
  @js.native
  trait SliderProps extends StObject {
    
    /**
      * Prop callback fired after slide change.
      * @param currentIndex
      */
    var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
    
    /**
      * Offsets the slide to align either left, center, or right.
      * @default "left"
      */
    var align: js.UndefOr[left | center | right] = js.native
    
    /**
      * Animates the wrapper height to fit the current slide.
      * @default false
      */
    var autoHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * Prop callback fired before slide change.
      * @param currentIndex
      * @param nextIndex
      */
    var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* nextIndex */ Double, Unit]] = js.native
    
    /**
      * Move to a slide by its index.
      */
    var currentIndex: js.UndefOr[Double] = js.native
    
    /**
      * Move to a slide by its key.
      */
    var currentKey: js.UndefOr[String | Double] = js.native
    
    /**
      * The amount of time in milliseconds that determines if a swipe was a flick or not.
      */
    var flickTimeout: js.UndefOr[Double] = js.native
    
    /**
      * The amount of slides to move upon using prev and next methods.
      * @default 1
      */
    var slidesToMove: js.UndefOr[Double] = js.native
    
    /**
      * The amount of slides shown in view
      * @default 1
      */
    var slidesToShow: js.UndefOr[Double] = js.native
    
    /**
      * Accepts a React Motion spring config.
      */
    var springConfig: js.UndefOr[OpaqueConfig] = js.native
    
    /**
      * Enable touch and/or mouse dragging
      * @default true
      */
    var swipe: js.UndefOr[Boolean | touch | mouse] = js.native
    
    /**
      * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
      * @default 0.5
      */
    var swipeThreshold: js.UndefOr[Double] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterSlide(value: /* currentIndex */ Double => Unit): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      @scala.inline
      def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setBeforeSlide(value: (/* currentIndex */ Double, /* nextIndex */ Double) => Unit): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      @scala.inline
      def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIndexUndefined: Self = StObject.set(x, "currentIndex", js.undefined)
      
      @scala.inline
      def setCurrentKey(value: String | Double): Self = StObject.set(x, "currentKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentKeyUndefined: Self = StObject.set(x, "currentKey", js.undefined)
      
      @scala.inline
      def setFlickTimeout(value: Double): Self = StObject.set(x, "flickTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlickTimeoutUndefined: Self = StObject.set(x, "flickTimeout", js.undefined)
      
      @scala.inline
      def setSlidesToMove(value: Double): Self = StObject.set(x, "slidesToMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToMoveUndefined: Self = StObject.set(x, "slidesToMove", js.undefined)
      
      @scala.inline
      def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      @scala.inline
      def setSpringConfig(value: OpaqueConfig): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      @scala.inline
      def setSwipe(value: Boolean | touch | mouse): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      @scala.inline
      def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    }
  }
}
