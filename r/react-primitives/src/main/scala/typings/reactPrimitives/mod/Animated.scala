package typings.reactPrimitives.mod

import typings.reactNative.AnonXY
import typings.reactNative.mod.Animated.AnimatedValue
import typings.reactNative.mod.Animated.AnimatedValueXY
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.DecayAnimationConfig
import typings.reactNative.mod.Animated.EventConfig
import typings.reactNative.mod.Animated.LoopAnimationConfig
import typings.reactNative.mod.Animated.Mapping
import typings.reactNative.mod.Animated.ParallelConfig
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "Animated")
@js.native
object Animated extends js.Object {
  @js.native
  class Animated ()
    extends typings.reactNative.mod.Animated.Animated
  
  @js.native
  class AnimatedAddition ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDiffClamp ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDivision ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedInterpolation ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedModulo ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedMultiplication ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedSubtraction ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedWithChildren ()
    extends typings.reactNative.mod.Animated.Animated
  
  @js.native
  class Value protected ()
    extends typings.reactNative.mod.Animated.Value {
    def this(value: Double) = this()
  }
  
  @js.native
  class ValueXY ()
    extends typings.reactNative.mod.Animated.ValueXY {
    def this(valueIn: AnonXY) = this()
  }
  
  val FlatList: js.Any = js.native
  val Image: js.Any = js.native
  val ScrollView: js.Any = js.native
  val SectionList: js.Any = js.native
  val Text: js.Any = js.native
  val View: js.Any = js.native
  def add(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedAddition = js.native
  def createAnimatedComponent(component: js.Any): js.Any = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: Double): CompositeAnimation = js.native
  def diffClamp(a: typings.reactNative.mod.Animated.Animated, min: Double, max: Double): typings.reactNative.mod.Animated.AnimatedDiffClamp = js.native
  def divide(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: typings.reactNative.mod.Animated.Animated, modulus: Double): typings.reactNative.mod.Animated.AnimatedModulo = js.native
  def multiply(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
}

