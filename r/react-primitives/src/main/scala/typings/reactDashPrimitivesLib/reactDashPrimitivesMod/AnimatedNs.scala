package typings
package reactDashPrimitivesLib.reactDashPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "Animated")
@js.native
object AnimatedNs extends js.Object {
  @js.native
  class Animated ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated
  
  @js.native
  class AnimatedAddition ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedAddition
  
  @js.native
  class AnimatedDiffClamp ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedDiffClamp
  
  @js.native
  class AnimatedDivision ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedDivision
  
  @js.native
  class AnimatedInterpolation ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedInterpolation
  
  @js.native
  class AnimatedModulo ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedModulo
  
  @js.native
  class AnimatedMultiplication ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedMultiplication
  
  @js.native
  class AnimatedWithChildren ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedWithChildren
  
  @js.native
  class Value protected ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value {
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class ValueXY ()
    extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.ValueXY {
    def this(valueIn: reactDashNativeLib.Anon_YXNumber) = this()
  }
  
  val Image: js.Any = js.native
  val ScrollView: js.Any = js.native
  val Text: js.Any = js.native
  val View: js.Any = js.native
  val timing: js.Function2[
    /* value */ reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue | reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValueXY, 
    /* config */ reactDashNativeLib.reactDashNativeMod.AnimatedNs.TimingAnimationConfig, 
    reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation
  ] = js.native
  def add(
    a: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated,
    b: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedAddition = js.native
  def createAnimatedComponent(component: js.Any): js.Any = js.native
  def decay(
    value: reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValueXY,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.DecayAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def decay(
    value: reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.DecayAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def delay(time: scala.Double): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def diffClamp(a: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated, min: scala.Double, max: scala.Double): reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedDiffClamp = js.native
  def divide(
    a: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated,
    b: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedDivision = js.native
  def event[T](argMapping: js.Array[reactDashNativeLib.reactDashNativeMod.AnimatedNs.Mapping | scala.Null]): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def event[T](
    argMapping: js.Array[reactDashNativeLib.reactDashNativeMod.AnimatedNs.Mapping | scala.Null],
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.EventConfig[T]
  ): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def loop(animation: reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def loop(
    animation: reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.LoopAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def modulo(a: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated, modulus: scala.Double): reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedModulo = js.native
  def multiply(
    a: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated,
    b: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Animated
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedMultiplication = js.native
  def parallel(animations: js.Array[reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation]): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def parallel(
    animations: js.Array[reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation],
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.ParallelConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def sequence(animations: js.Array[reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation]): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def spring(
    value: reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValueXY,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def spring(
    value: reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue,
    config: reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
  def stagger(
    time: scala.Double,
    animations: js.Array[reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation]
  ): reactDashNativeLib.reactDashNativeMod.AnimatedNs.CompositeAnimation = js.native
}

