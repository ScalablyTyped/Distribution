package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Animated")
@js.native
object AnimatedNs extends js.Object {
  @js.native
  class Animated () extends js.Object
  
  @js.native
  class AnimatedAddition () extends AnimatedInterpolation
  
  @js.native
  class AnimatedDiffClamp () extends AnimatedInterpolation
  
  @js.native
  class AnimatedDivision () extends AnimatedInterpolation
  
  @js.native
  class AnimatedInterpolation () extends AnimatedWithChildren {
    def interpolate(config: InterpolationConfigType): AnimatedInterpolation = js.native
  }
  
  @js.native
  class AnimatedModulo () extends AnimatedInterpolation
  
  @js.native
  class AnimatedMultiplication () extends AnimatedInterpolation
  
  @js.native
  class AnimatedSubtraction () extends AnimatedInterpolation
  
  @js.native
  class AnimatedWithChildren () extends Animated
  
  
  trait AnimationConfig extends js.Object {
    var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
    var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  trait CompositeAnimation extends js.Object {
    def start(): scala.Unit = js.native
    def start(callback: EndCallback): scala.Unit = js.native
    def stop(): scala.Unit = js.native
  }
  
  
  trait DecayAnimationConfig extends AnimationConfig {
    var deceleration: js.UndefOr[scala.Double] = js.undefined
    var velocity: scala.Double | reactDashNativeLib.Anon_YX
  }
  
  
  trait EndResult extends js.Object {
    var finished: scala.Boolean
  }
  
  
  trait EventConfig[T] extends js.Object {
    var listener: js.UndefOr[
        js.Function1[
          /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[T], 
          scala.Unit
        ]
      ] = js.undefined
    var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait InterpolationConfigType extends js.Object {
    var easing: js.UndefOr[js.Function1[/* input */ scala.Double, scala.Double]] = js.undefined
    var extrapolate: js.UndefOr[ExtrapolateType] = js.undefined
    var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.undefined
    var extrapolateRight: js.UndefOr[ExtrapolateType] = js.undefined
    var inputRange: js.Array[scala.Double]
    var outputRange: js.Array[scala.Double] | js.Array[java.lang.String]
  }
  
  
  trait LoopAnimationConfig extends js.Object {
    var iterations: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait ParallelConfig extends js.Object {
    var stopTogether: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait SpringAnimationConfig extends AnimationConfig {
    var bounciness: js.UndefOr[scala.Double] = js.undefined
    var damping: js.UndefOr[scala.Double] = js.undefined
    var delay: js.UndefOr[scala.Double] = js.undefined
    var friction: js.UndefOr[scala.Double] = js.undefined
    var mass: js.UndefOr[scala.Double] = js.undefined
    var overshootClamping: js.UndefOr[scala.Boolean] = js.undefined
    var restDisplacementThreshold: js.UndefOr[scala.Double] = js.undefined
    var restSpeedThreshold: js.UndefOr[scala.Double] = js.undefined
    var speed: js.UndefOr[scala.Double] = js.undefined
    var stiffness: js.UndefOr[scala.Double] = js.undefined
    var tension: js.UndefOr[scala.Double] = js.undefined
    var toValue: scala.Double | AnimatedValue | reactDashNativeLib.Anon_YX | AnimatedValueXY
    var velocity: js.UndefOr[scala.Double | reactDashNativeLib.Anon_YX] = js.undefined
  }
  
  
  trait TimingAnimationConfig extends AnimationConfig {
    var delay: js.UndefOr[scala.Double] = js.undefined
    var duration: js.UndefOr[scala.Double] = js.undefined
    var easing: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
    var toValue: scala.Double | AnimatedValue | reactDashNativeLib.Anon_YX | AnimatedValueXY
  }
  
  @js.native
  class Value protected () extends AnimatedWithChildren {
    def this(value: scala.Double) = this()
    /**
             * Adds an asynchronous listener to the value so you can observe updates from
             * animations.  This is useful because there is no way to
             * synchronously read the value because it might be driven natively.
             */
    def addListener(callback: ValueListenerCallback): java.lang.String = js.native
    /**
             * Sets the offset value to the base value, and resets the base value to zero.
             * The final output of the value is unchanged.
             */
    def extractOffset(): scala.Unit = js.native
    /**
             * Merges the offset value into the base value and resets the offset to zero.
             * The final output of the value is unchanged.
             */
    def flattenOffset(): scala.Unit = js.native
    /**
             * Interpolates the value before updating the property, e.g. mapping 0-1 to
             * 0-10.
             */
    def interpolate(config: InterpolationConfigType): AnimatedInterpolation = js.native
    def removeAllListeners(): scala.Unit = js.native
    def removeListener(id: java.lang.String): scala.Unit = js.native
    /**
             * Sets an offset that is applied on top of whatever value is set, whether via
             * `setValue`, an animation, or `Animated.event`.  Useful for compensating
             * things like the start of a pan gesture.
             */
    def setOffset(offset: scala.Double): scala.Unit = js.native
    /**
             * Directly set the value.  This will stop any animations running on the value
             * and update all the bound properties.
             */
    def setValue(value: scala.Double): scala.Unit = js.native
    /**
             * Stops any running animation or tracking.  `callback` is invoked with the
             * final value after stopping the animation, which is useful for updating
             * state to match the animation position with layout.
             */
    def stopAnimation(): scala.Unit = js.native
    /**
             * Stops any running animation or tracking.  `callback` is invoked with the
             * final value after stopping the animation, which is useful for updating
             * state to match the animation position with layout.
             */
    def stopAnimation(callback: js.Function1[/* value */ scala.Double, scala.Unit]): scala.Unit = js.native
  }
  
  @js.native
  class ValueXY () extends AnimatedWithChildren {
    def this(valueIn: reactDashNativeLib.Anon_YXNumber) = this()
    var x: AnimatedValue = js.native
    var y: AnimatedValue = js.native
    def addListener(callback: ValueXYListenerCallback): java.lang.String = js.native
    def extractOffset(): scala.Unit = js.native
    def flattenOffset(): scala.Unit = js.native
    /**
             * Converts `{x, y}` into `{left, top}` for use in style, e.g.
             *
             *```javascript
             *  style={this.state.anim.getLayout()}
             *```
             */
    def getLayout(): org.scalablytyped.runtime.StringDictionary[AnimatedValue] = js.native
    /**
             * Converts `{x, y}` into a useable translation transform, e.g.
             *
             *```javascript
             *  style={{
             *    transform: this.state.anim.getTranslateTransform()
             *  }}
             *```
             */
    def getTranslateTransform(): js.Array[org.scalablytyped.runtime.StringDictionary[AnimatedValue]] = js.native
    def removeListener(id: java.lang.String): scala.Unit = js.native
    def setOffset(offset: reactDashNativeLib.Anon_YX): scala.Unit = js.native
    def setValue(value: reactDashNativeLib.Anon_YX): scala.Unit = js.native
    def stopAnimation(): scala.Unit = js.native
    def stopAnimation(callback: js.Function1[/* value */ reactDashNativeLib.Anon_YX, scala.Unit]): scala.Unit = js.native
  }
  
  val Image: js.Any = js.native
  val ScrollView: js.Any = js.native
  val Text: js.Any = js.native
  val View: js.Any = js.native
  def add(a: Animated, b: Animated): AnimatedAddition = js.native
  def createAnimatedComponent(component: js.Any): js.Any = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: scala.Double): CompositeAnimation = js.native
  def diffClamp(a: Animated, min: scala.Double, max: scala.Double): AnimatedDiffClamp = js.native
  def divide(a: Animated, b: Animated): AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | scala.Null]): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | scala.Null], config: EventConfig[T]): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: Animated, modulus: scala.Double): AnimatedModulo = js.native
  def multiply(a: Animated, b: Animated): AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: scala.Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(a: Animated, b: Animated): AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
  type AnimatedValue = Value
  type AnimatedValueXY = ValueXY
  type Base = Animated
  type EndCallback = js.Function1[/* result */ EndResult, scala.Unit]
  type ExtrapolateType = reactDashNativeLib.reactDashNativeLibStrings.extend | reactDashNativeLib.reactDashNativeLibStrings.identity | reactDashNativeLib.reactDashNativeLibStrings.clamp
  type Mapping = org.scalablytyped.runtime.StringDictionary[js.Object] | AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ reactDashNativeLib.Anon_Value, scala.Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ reactDashNativeLib.Anon_YX, scala.Unit]
}

