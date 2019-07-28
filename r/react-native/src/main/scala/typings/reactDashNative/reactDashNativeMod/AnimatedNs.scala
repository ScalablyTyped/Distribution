package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.Anon_Value
import typings.reactDashNative.Anon_X
import typings.reactDashNative.Anon_XY
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedAddition
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedDiffClamp
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedDivision
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedInterpolation
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedModulo
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedMultiplication
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedSubtraction
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedValue
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedValueXY
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedWithChildren
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.CompositeAnimation
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.DecayAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.EndCallback
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.EndResult
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.EventConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.ExtrapolateType
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.InterpolationConfigType
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.LoopAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Mapping
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.ParallelConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.TimingAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.ValueListenerCallback
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.ValueXY
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.ValueXYListenerCallback
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
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  trait CompositeAnimation extends js.Object {
    def start(): Unit = js.native
    def start(callback: EndCallback): Unit = js.native
    def stop(): Unit = js.native
  }
  
  trait DecayAnimationConfig extends AnimationConfig {
    var deceleration: js.UndefOr[Double] = js.undefined
    var velocity: Double | Anon_X
  }
  
  trait EndResult extends js.Object {
    var finished: Boolean
  }
  
  trait EventConfig[T] extends js.Object {
    var listener: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[T], Unit]] = js.undefined
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNative.reactDashNativeStrings.extend
    - typings.reactDashNative.reactDashNativeStrings.identity
    - typings.reactDashNative.reactDashNativeStrings.clamp
  */
  trait ExtrapolateType extends js.Object
  
  trait InterpolationConfigType extends js.Object {
    var easing: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.undefined
    var extrapolate: js.UndefOr[ExtrapolateType] = js.undefined
    var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.undefined
    var extrapolateRight: js.UndefOr[ExtrapolateType] = js.undefined
    var inputRange: js.Array[Double]
    var outputRange: js.Array[Double | String]
  }
  
  trait LoopAnimationConfig extends js.Object {
    var iterations: js.UndefOr[Double] = js.undefined
  }
  
  trait ParallelConfig extends js.Object {
    var stopTogether: js.UndefOr[Boolean] = js.undefined
  }
  
  trait SpringAnimationConfig extends AnimationConfig {
    var bounciness: js.UndefOr[Double] = js.undefined
    var damping: js.UndefOr[Double] = js.undefined
    var delay: js.UndefOr[Double] = js.undefined
    var friction: js.UndefOr[Double] = js.undefined
    var mass: js.UndefOr[Double] = js.undefined
    var overshootClamping: js.UndefOr[Boolean] = js.undefined
    var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
    var restSpeedThreshold: js.UndefOr[Double] = js.undefined
    var speed: js.UndefOr[Double] = js.undefined
    var stiffness: js.UndefOr[Double] = js.undefined
    var tension: js.UndefOr[Double] = js.undefined
    var toValue: Double | AnimatedValue | Anon_X | AnimatedValueXY
    var velocity: js.UndefOr[Double | Anon_X] = js.undefined
  }
  
  trait TimingAnimationConfig extends AnimationConfig {
    var delay: js.UndefOr[Double] = js.undefined
    var duration: js.UndefOr[Double] = js.undefined
    var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
    var toValue: Double | AnimatedValue | Anon_X | AnimatedValueXY
  }
  
  @js.native
  class Value protected () extends AnimatedWithChildren {
    def this(value: Double) = this()
    /**
      * Adds an asynchronous listener to the value so you can observe updates from
      * animations.  This is useful because there is no way to
      * synchronously read the value because it might be driven natively.
      */
    def addListener(callback: ValueListenerCallback): String = js.native
    /**
      * Sets the offset value to the base value, and resets the base value to zero.
      * The final output of the value is unchanged.
      */
    def extractOffset(): Unit = js.native
    /**
      * Merges the offset value into the base value and resets the offset to zero.
      * The final output of the value is unchanged.
      */
    def flattenOffset(): Unit = js.native
    /**
      * Interpolates the value before updating the property, e.g. mapping 0-1 to
      * 0-10.
      */
    def interpolate(config: InterpolationConfigType): AnimatedInterpolation = js.native
    def removeAllListeners(): Unit = js.native
    def removeListener(id: String): Unit = js.native
    /**
      * Sets an offset that is applied on top of whatever value is set, whether via
      * `setValue`, an animation, or `Animated.event`.  Useful for compensating
      * things like the start of a pan gesture.
      */
    def setOffset(offset: Double): Unit = js.native
    /**
      * Directly set the value.  This will stop any animations running on the value
      * and update all the bound properties.
      */
    def setValue(value: Double): Unit = js.native
    /**
      * Stops any running animation or tracking.  `callback` is invoked with the
      * final value after stopping the animation, which is useful for updating
      * state to match the animation position with layout.
      */
    def stopAnimation(): Unit = js.native
    def stopAnimation(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
  }
  
  @js.native
  class ValueXY () extends AnimatedWithChildren {
    def this(valueIn: Anon_XY) = this()
    var x: AnimatedValue = js.native
    var y: AnimatedValue = js.native
    def addListener(callback: ValueXYListenerCallback): String = js.native
    def extractOffset(): Unit = js.native
    def flattenOffset(): Unit = js.native
    /**
      * Converts `{x, y}` into `{left, top}` for use in style, e.g.
      *
      *```javascript
      *  style={this.state.anim.getLayout()}
      *```
      */
    def getLayout(): StringDictionary[AnimatedValue] = js.native
    /**
      * Converts `{x, y}` into a useable translation transform, e.g.
      *
      *```javascript
      *  style={{
      *    transform: this.state.anim.getTranslateTransform()
      *  }}
      *```
      */
    def getTranslateTransform(): js.Array[StringDictionary[AnimatedValue]] = js.native
    def removeListener(id: String): Unit = js.native
    def setOffset(offset: Anon_X): Unit = js.native
    def setValue(value: Anon_X): Unit = js.native
    def stopAnimation(): Unit = js.native
    def stopAnimation(callback: js.Function1[/* value */ Anon_X, Unit]): Unit = js.native
  }
  
  val FlatList: js.Any = js.native
  val Image: js.Any = js.native
  val ScrollView: js.Any = js.native
  val SectionList: js.Any = js.native
  val Text: js.Any = js.native
  val View: js.Any = js.native
  def add(a: Animated, b: Animated): AnimatedAddition = js.native
  def createAnimatedComponent(component: js.Any): js.Any = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: Double): CompositeAnimation = js.native
  def diffClamp(a: Animated, min: Double, max: Double): AnimatedDiffClamp = js.native
  def divide(a: Animated, b: Animated): AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: Animated, modulus: Double): AnimatedModulo = js.native
  def multiply(a: Animated, b: Animated): AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(a: Animated, b: Animated): AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
  type AnimatedValue = Value
  type AnimatedValueXY = ValueXY
  type Base = Animated
  type EndCallback = js.Function1[/* result */ EndResult, Unit]
  type Mapping = (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ Anon_Value, Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ Anon_X, Unit]
}

