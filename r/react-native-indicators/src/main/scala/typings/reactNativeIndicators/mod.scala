package typings.reactNativeIndicators

import typings.react.mod.Component
import typings.reactNative.mod.EasingFunction
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeIndicators.reactNativeIndicatorsStrings.fill
import typings.reactNativeIndicators.reactNativeIndicatorsStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-indicators", "BallIndicator")
  @js.native
  class BallIndicator protected ()
    extends Component[BallIndicatorProps, js.Object, js.Any] {
    def this(props: BallIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BallIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "BarIndicator")
  @js.native
  class BarIndicator protected ()
    extends Component[BarIndicatorProps, js.Object, js.Any] {
    def this(props: BarIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BarIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "DotIndicator")
  @js.native
  class DotIndicator protected ()
    extends Component[DotIndicatorProps, js.Object, js.Any] {
    def this(props: DotIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DotIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "MaterialIndicator")
  @js.native
  class MaterialIndicator protected ()
    extends Component[MaterialIndicatorProps, js.Object, js.Any] {
    def this(props: MaterialIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MaterialIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "PacmanIndicator")
  @js.native
  class PacmanIndicator protected ()
    extends Component[PacmanIndicatorProps, js.Object, js.Any] {
    def this(props: PacmanIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PacmanIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "PulseIndicator")
  @js.native
  class PulseIndicator protected ()
    extends Component[PulseIndicatorProps, js.Object, js.Any] {
    def this(props: PulseIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PulseIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "SkypeIndicator")
  @js.native
  class SkypeIndicator protected ()
    extends Component[SkypeIndicatorProps, js.Object, js.Any] {
    def this(props: SkypeIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SkypeIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "UIActivityIndicator")
  @js.native
  class UIActivityIndicator protected ()
    extends Component[UIActivityIndicatorProps, js.Object, js.Any] {
    def this(props: UIActivityIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIActivityIndicatorProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-indicators", "WaveIndicator")
  @js.native
  class WaveIndicator protected ()
    extends Component[WaveIndicatorProps, js.Object, js.Any] {
    def this(props: WaveIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaveIndicatorProps, context: js.Any) = this()
  }
  
  @js.native
  trait BallIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Component count
      * @default 8
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
  }
  object BallIndicatorProps {
    
    @scala.inline
    def apply(): BallIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BallIndicatorProps]
    }
    
    @scala.inline
    implicit class BallIndicatorPropsMutableBuilder[Self <: BallIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait BarIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Component count
      * @default 3
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
  }
  object BarIndicatorProps {
    
    @scala.inline
    def apply(): BarIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarIndicatorProps]
    }
    
    @scala.inline
    implicit class BarIndicatorPropsMutableBuilder[Self <: BarIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait BaseIndicatorProps extends StObject {
    
    /**
      * Animation toggle
      * @default true
      */
    var animating: js.UndefOr[Boolean] = js.native
    
    /**
      * Animation duration in ms
      * @default 1200
      */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /**
      * Animation easing function
      * @default Easing.linear
      */
    var animationEasing: js.UndefOr[EasingFunction] = js.native
    
    /**
      * Hide when not animating
      * @default true
      */
    var hidesWhenStopped: js.UndefOr[Boolean] = js.native
    
    /**
      * Animation is interaction
      * @default true
      */
    var interaction: js.UndefOr[Boolean] = js.native
    
    /**
      * Style is proxied to the underlying View
      * @default undefined
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object BaseIndicatorProps {
    
    @scala.inline
    def apply(): BaseIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseIndicatorProps]
    }
    
    @scala.inline
    implicit class BaseIndicatorPropsMutableBuilder[Self <: BaseIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationEasing(value: /* value */ Double => Double): Self = StObject.set(x, "animationEasing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      @scala.inline
      def setHidesWhenStopped(value: Boolean): Self = StObject.set(x, "hidesWhenStopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidesWhenStoppedUndefined: Self = StObject.set(x, "hidesWhenStopped", js.undefined)
      
      @scala.inline
      def setInteraction(value: Boolean): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DotIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Component count
      * @default 4
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * Base component size
      * @default 16
      */
    var size: js.UndefOr[Double] = js.native
  }
  object DotIndicatorProps {
    
    @scala.inline
    def apply(): DotIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotIndicatorProps]
    }
    
    @scala.inline
    implicit class DotIndicatorPropsMutableBuilder[Self <: DotIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait MaterialIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * Indicator track width
      * @default 'size / 10'
      */
    var trackWidth: js.UndefOr[Double] = js.native
  }
  object MaterialIndicatorProps {
    
    @scala.inline
    def apply(): MaterialIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialIndicatorProps]
    }
    
    @scala.inline
    implicit class MaterialIndicatorPropsMutableBuilder[Self <: MaterialIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTrackWidth(value: Double): Self = StObject.set(x, "trackWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackWidthUndefined: Self = StObject.set(x, "trackWidth", js.undefined)
    }
  }
  
  @js.native
  trait PacmanIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Base component size
      * @default 48
      */
    var size: js.UndefOr[Double] = js.native
  }
  object PacmanIndicatorProps {
    
    @scala.inline
    def apply(): PacmanIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PacmanIndicatorProps]
    }
    
    @scala.inline
    implicit class PacmanIndicatorPropsMutableBuilder[Self <: PacmanIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PulseIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
  }
  object PulseIndicatorProps {
    
    @scala.inline
    def apply(): PulseIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PulseIndicatorProps]
    }
    
    @scala.inline
    implicit class PulseIndicatorPropsMutableBuilder[Self <: PulseIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait SkypeIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Component count
      * @default 5
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * Maximum component scale
      * @default 1.0
      */
    var maxScale: js.UndefOr[Double] = js.native
    
    /**
      * Minimum component scale
      * @default 0.2
      */
    var minScale: js.UndefOr[Double] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
  }
  object SkypeIndicatorProps {
    
    @scala.inline
    def apply(): SkypeIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkypeIndicatorProps]
    }
    
    @scala.inline
    implicit class SkypeIndicatorPropsMutableBuilder[Self <: SkypeIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      @scala.inline
      def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait UIActivityIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Component count
      * @default 12
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
  }
  object UIActivityIndicatorProps {
    
    @scala.inline
    def apply(): UIActivityIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIActivityIndicatorProps]
    }
    
    @scala.inline
    implicit class UIActivityIndicatorPropsMutableBuilder[Self <: UIActivityIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait WaveIndicatorProps extends BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Component count
      * @default 4
      */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * Minimum component scale
      * @default 0.54
      */
    var waveFactor: js.UndefOr[Double] = js.native
    
    /**
      * Maximum component scale
      * @default 'fill'
      */
    var waveMode: js.UndefOr[fill | outline] = js.native
  }
  object WaveIndicatorProps {
    
    @scala.inline
    def apply(): WaveIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaveIndicatorProps]
    }
    
    @scala.inline
    implicit class WaveIndicatorPropsMutableBuilder[Self <: WaveIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWaveFactor(value: Double): Self = StObject.set(x, "waveFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveFactorUndefined: Self = StObject.set(x, "waveFactor", js.undefined)
      
      @scala.inline
      def setWaveMode(value: fill | outline): Self = StObject.set(x, "waveMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveModeUndefined: Self = StObject.set(x, "waveMode", js.undefined)
    }
  }
}
