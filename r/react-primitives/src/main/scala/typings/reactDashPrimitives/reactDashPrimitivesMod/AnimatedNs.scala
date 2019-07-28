package typings.reactDashPrimitives.reactDashPrimitivesMod

import typings.reactDashNative.Anon_XY
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedValue
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedValueXY
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.CompositeAnimation
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.DecayAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.EventConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.LoopAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Mapping
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.ParallelConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.TimingAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "Animated")
@js.native
object AnimatedNs extends js.Object {
  @js.native
  class Animated ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated
  
  @js.native
  class AnimatedAddition ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedAddition
  
  @js.native
  class AnimatedDiffClamp ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedDiffClamp
  
  @js.native
  class AnimatedDivision ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedDivision
  
  @js.native
  class AnimatedInterpolation ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedInterpolation
  
  @js.native
  class AnimatedModulo ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedModulo
  
  @js.native
  class AnimatedMultiplication ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedMultiplication
  
  @js.native
  class AnimatedSubtraction ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedSubtraction
  
  @js.native
  class AnimatedWithChildren ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedWithChildren
  
  @js.native
  class Value protected ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value {
    def this(value: Double) = this()
  }
  
  @js.native
  class ValueXY ()
    extends typings.reactDashNative.reactDashNativeMod.AnimatedNs.ValueXY {
    def this(valueIn: Anon_XY) = this()
  }
  
  val FlatList: js.Any = js.native
  val Image: js.Any = js.native
  val ScrollView: js.Any = js.native
  val SectionList: js.Any = js.native
  val Text: js.Any = js.native
  val View: js.Any = js.native
  def add(
    a: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated,
    b: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated
  ): typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedAddition = js.native
  def createAnimatedComponent(component: js.Any): js.Any = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: Double): CompositeAnimation = js.native
  def diffClamp(a: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated, min: Double, max: Double): typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedDiffClamp = js.native
  def divide(
    a: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated,
    b: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated
  ): typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated, modulus: Double): typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedModulo = js.native
  def multiply(
    a: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated,
    b: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated
  ): typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(
    a: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated,
    b: typings.reactDashNative.reactDashNativeMod.AnimatedNs.Animated
  ): typings.reactDashNative.reactDashNativeMod.AnimatedNs.AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
}

