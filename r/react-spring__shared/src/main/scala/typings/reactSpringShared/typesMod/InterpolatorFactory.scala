package typings.reactSpringShared.typesMod

import typings.reactSpringShared.typesUtilMod.Constrain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolatorFactory extends js.Object {
  
  def apply[Out](config: InterpolatorConfig[Out]): js.Function1[/* input */ Double, Animatable[Out]] = js.native
  def apply[Out](range: js.Array[Double], output: js.Array[Constrain[Out, Animatable[_]]]): js.Function1[/* input */ Double, Animatable[Out]] = js.native
  def apply[Out](
    range: js.Array[Double],
    output: js.Array[Constrain[Out, Animatable[_]]],
    extrapolate: ExtrapolateType
  ): js.Function1[/* input */ Double, Animatable[Out]] = js.native
  def apply[In, Out](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InterpolatorArgs<In, Out> is not an array type */ args: InterpolatorArgs[In, Out]
  ): InterpolatorFn[In, Out] = js.native
  def apply[In, Out](interpolator: InterpolatorFn[In, Out]): js.Any = js.native
}
