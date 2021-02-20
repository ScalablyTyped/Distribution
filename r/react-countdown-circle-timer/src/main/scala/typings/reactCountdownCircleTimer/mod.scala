package typings.reactCountdownCircleTimer

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-countdown-circle-timer", "CountdownCircleTimer")
  @js.native
  class CountdownCircleTimer protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  type ColorType = js.Array[js.Tuple2[String, js.UndefOr[Double]]]
  
  type OnCompleteFunctionType = js.Function0[js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]]
  
  @js.native
  trait Props extends StObject {
    
    var colors: ColorType = js.native
    
    var durationSeconds: Double = js.native
    
    var gradientUniqueKey: js.UndefOr[String] = js.native
    
    var isLinearGradient: js.UndefOr[Boolean] = js.native
    
    var isPlaying: js.UndefOr[Boolean] = js.native
    
    var onComplete: js.UndefOr[OnCompleteFunctionType] = js.native
    
    var renderTime: js.UndefOr[RenderTimeFunctionType] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(colors: ColorType, durationSeconds: Double): Props = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], durationSeconds = durationSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: ColorType): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: (js.Tuple2[String, js.UndefOr[Double]])*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUniqueKey(value: String): Self = StObject.set(x, "gradientUniqueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUniqueKeyUndefined: Self = StObject.set(x, "gradientUniqueKey", js.undefined)
      
      @scala.inline
      def setIsLinearGradient(value: Boolean): Self = StObject.set(x, "isLinearGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinearGradientUndefined: Self = StObject.set(x, "isLinearGradient", js.undefined)
      
      @scala.inline
      def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPlayingUndefined: Self = StObject.set(x, "isPlaying", js.undefined)
      
      @scala.inline
      def setOnComplete(value: () => js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setRenderTime(
        value: (/* remainingTime */ Double, /* elapsedTime */ Double, /* isPlaying */ Boolean) => ReactNode
      ): Self = StObject.set(x, "renderTime", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderTimeUndefined: Self = StObject.set(x, "renderTime", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: StrokeLinecapType): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
    }
  }
  
  type RenderTimeFunctionType = js.Function3[
    /* remainingTime */ Double, 
    /* elapsedTime */ Double, 
    /* isPlaying */ Boolean, 
    ReactNode
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.round
    - typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.square
  */
  trait StrokeLinecapType extends StObject
  object StrokeLinecapType {
    
    @scala.inline
    def round: typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.round = "round".asInstanceOf[typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.round]
    
    @scala.inline
    def square: typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.square = "square".asInstanceOf[typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.square]
  }
}
