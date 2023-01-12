package typings.reactNativeIndicators

import typings.react.mod.Component
import typings.reactNative.mod.EasingFunction
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeIndicators.reactNativeIndicatorsStrings.fill
import typings.reactNativeIndicators.reactNativeIndicatorsStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-indicators", "BallIndicator")
  @js.native
  open class BallIndicator protected ()
    extends Component[BallIndicatorProps, js.Object, Any] {
    def this(props: BallIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BallIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "BarIndicator")
  @js.native
  open class BarIndicator protected ()
    extends Component[BarIndicatorProps, js.Object, Any] {
    def this(props: BarIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BarIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "DotIndicator")
  @js.native
  open class DotIndicator protected ()
    extends Component[DotIndicatorProps, js.Object, Any] {
    def this(props: DotIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DotIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "MaterialIndicator")
  @js.native
  open class MaterialIndicator protected ()
    extends Component[MaterialIndicatorProps, js.Object, Any] {
    def this(props: MaterialIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MaterialIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "PacmanIndicator")
  @js.native
  open class PacmanIndicator protected ()
    extends Component[PacmanIndicatorProps, js.Object, Any] {
    def this(props: PacmanIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PacmanIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "PulseIndicator")
  @js.native
  open class PulseIndicator protected ()
    extends Component[PulseIndicatorProps, js.Object, Any] {
    def this(props: PulseIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PulseIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "SkypeIndicator")
  @js.native
  open class SkypeIndicator protected ()
    extends Component[SkypeIndicatorProps, js.Object, Any] {
    def this(props: SkypeIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SkypeIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "UIActivityIndicator")
  @js.native
  open class UIActivityIndicator protected ()
    extends Component[UIActivityIndicatorProps, js.Object, Any] {
    def this(props: UIActivityIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIActivityIndicatorProps, context: Any) = this()
  }
  
  @JSImport("react-native-indicators", "WaveIndicator")
  @js.native
  open class WaveIndicator protected ()
    extends Component[WaveIndicatorProps, js.Object, Any] {
    def this(props: WaveIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WaveIndicatorProps, context: Any) = this()
  }
  
  trait BallIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Component count
      * @default 8
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object BallIndicatorProps {
    
    inline def apply(): BallIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BallIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BallIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait BarIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Component count
      * @default 3
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object BarIndicatorProps {
    
    inline def apply(): BarIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait BaseIndicatorProps extends StObject {
    
    /**
      * Animation toggle
      * @default true
      */
    var animating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Animation duration in ms
      * @default 1200
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation easing function
      * @default Easing.linear
      */
    var animationEasing: js.UndefOr[EasingFunction] = js.undefined
    
    /**
      * Hide when not animating
      * @default true
      */
    var hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Animation is interaction
      * @default true
      */
    var interaction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style is proxied to the underlying View
      * @default undefined
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object BaseIndicatorProps {
    
    inline def apply(): BaseIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationEasing(value: /* value */ Double => Double): Self = StObject.set(x, "animationEasing", js.Any.fromFunction1(value))
      
      inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      inline def setHidesWhenStopped(value: Boolean): Self = StObject.set(x, "hidesWhenStopped", value.asInstanceOf[js.Any])
      
      inline def setHidesWhenStoppedUndefined: Self = StObject.set(x, "hidesWhenStopped", js.undefined)
      
      inline def setInteraction(value: Boolean): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
      
      inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DotIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Component count
      * @default 4
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Base component size
      * @default 16
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object DotIndicatorProps {
    
    inline def apply(): DotIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait MaterialIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicator track width
      * @default 'size / 10'
      */
    var trackWidth: js.UndefOr[Double] = js.undefined
  }
  object MaterialIndicatorProps {
    
    inline def apply(): MaterialIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaterialIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTrackWidth(value: Double): Self = StObject.set(x, "trackWidth", value.asInstanceOf[js.Any])
      
      inline def setTrackWidthUndefined: Self = StObject.set(x, "trackWidth", js.undefined)
    }
  }
  
  trait PacmanIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Base component size
      * @default 48
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object PacmanIndicatorProps {
    
    inline def apply(): PacmanIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PacmanIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PacmanIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PulseIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object PulseIndicatorProps {
    
    inline def apply(): PulseIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PulseIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PulseIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SkypeIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Component count
      * @default 5
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum component scale
      * @default 1.0
      */
    var maxScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum component scale
      * @default 0.2
      */
    var minScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object SkypeIndicatorProps {
    
    inline def apply(): SkypeIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkypeIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkypeIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait UIActivityIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Component count
      * @default 12
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object UIActivityIndicatorProps {
    
    inline def apply(): UIActivityIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIActivityIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UIActivityIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait WaveIndicatorProps
    extends StObject
       with BaseIndicatorProps {
    
    /**
      * Component color
      * @default 'rgb(0, 0, 0)'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Component count
      * @default 4
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Base component size
      * @default 40
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum component scale
      * @default 0.54
      */
    var waveFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum component scale
      * @default 'fill'
      */
    var waveMode: js.UndefOr[fill | outline] = js.undefined
  }
  object WaveIndicatorProps {
    
    inline def apply(): WaveIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaveIndicatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaveIndicatorProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWaveFactor(value: Double): Self = StObject.set(x, "waveFactor", value.asInstanceOf[js.Any])
      
      inline def setWaveFactorUndefined: Self = StObject.set(x, "waveFactor", js.undefined)
      
      inline def setWaveMode(value: fill | outline): Self = StObject.set(x, "waveMode", value.asInstanceOf[js.Any])
      
      inline def setWaveModeUndefined: Self = StObject.set(x, "waveMode", js.undefined)
    }
  }
}
