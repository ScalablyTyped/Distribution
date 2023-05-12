package typings.reactSpringCore.mod

import typings.reactSpringShared.mod.FluidValue
import typings.reactSpringTypes.mod.Animatable
import typings.reactSpringTypes.mod.Constrain
import typings.reactSpringTypes.mod.ExtrapolateType
import typings.reactSpringTypes.mod.InterpolatorConfig
import typings.reactSpringTypes.mod.InterpolatorFn
import typings.reactSpringTypes.mod.OneOrMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interpolates one or more `FluidValue` objects.
  * The exported `interpolate` function uses this type.
  */
@js.native
trait Interpolator extends StObject {
  
  def apply[Out](
    parents: FluidValue[js.Array[Double], scala.Any],
    range: js.Array[Double],
    output: js.Array[Constrain[Out, Animatable[scala.Any]]]
  ): Interpolation[Animatable[Out], scala.Any] = js.native
  def apply[Out](
    parents: FluidValue[js.Array[Double], scala.Any],
    range: js.Array[Double],
    output: js.Array[Constrain[Out, Animatable[scala.Any]]],
    extrapolate: ExtrapolateType
  ): Interpolation[Animatable[Out], scala.Any] = js.native
  def apply[Out](parents: OneOrMore[FluidValue[scala.Any, scala.Any]], config: InterpolatorConfig[Out]): Interpolation[Animatable[Out], scala.Any] = js.native
  def apply[Out](
    parents: OneOrMore[FluidValue[Double, scala.Any]],
    range: js.Array[Double],
    output: js.Array[Constrain[Out, Animatable[scala.Any]]]
  ): Interpolation[Animatable[Out], scala.Any] = js.native
  def apply[Out](
    parents: OneOrMore[FluidValue[Double, scala.Any]],
    range: js.Array[Double],
    output: js.Array[Constrain[Out, Animatable[scala.Any]]],
    extrapolate: ExtrapolateType
  ): Interpolation[Animatable[Out], scala.Any] = js.native
  def apply[Input /* <: js.Array[scala.Any] */, Output](
    parents: Input,
    interpolator: (js.Function1[/* args */ Interpolated[Input], Output]) | (InterpolatorFn[Input, Output])
  ): Interpolation[Output, scala.Any] = js.native
  def apply[Input, Output](parent: FluidValue[Input, scala.Any], interpolator: InterpolatorFn[Input, Output]): Interpolation[Output, scala.Any] = js.native
}
