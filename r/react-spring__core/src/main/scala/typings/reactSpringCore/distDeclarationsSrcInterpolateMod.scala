package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcInterpolationMod.Interpolation
import typings.reactSpringTypes.animatedMod.Animatable
import typings.reactSpringTypes.interpolationMod.ExtrapolateType
import typings.reactSpringTypes.interpolationMod.InterpolatorConfig
import typings.reactSpringTypes.interpolationMod.InterpolatorFn
import typings.reactSpringTypes.utilMod.Constrain
import typings.reactSpringTypes.utilMod.OneOrMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcInterpolateMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/interpolate", "interpolate")
  @js.native
  val interpolate: Interpolator = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src/interpolate", "to")
  @js.native
  val to: Interpolator = js.native
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends infer Element? Element extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<infer U> * / any? U : Element : never}
    }}}
    */
  @js.native
  trait Interpolated[T /* <: js.Array[Any] */] extends StObject
  
  @js.native
  trait Interpolator extends StObject {
    
    def apply[Out](
      parents: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<Array<number>> */ Any) | (OneOrMore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<number> */ Any
        ]),
      range: js.Array[Double],
      output: js.Array[Constrain[Out, Animatable[Any]]]
    ): Interpolation[Animatable[Out], Any] = js.native
    def apply[Out](
      parents: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<Array<number>> */ Any) | (OneOrMore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<number> */ Any
        ]),
      range: js.Array[Double],
      output: js.Array[Constrain[Out, Animatable[Any]]],
      extrapolate: ExtrapolateType
    ): Interpolation[Animatable[Out], Any] = js.native
    def apply[Out](
      parents: OneOrMore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ Any
        ],
      config: InterpolatorConfig[Out]
    ): Interpolation[Animatable[Out], Any] = js.native
    def apply[Input /* <: js.Array[Any] */, Output](
      parents: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<Input> */ Any) | Input,
      interpolator: (js.Function1[/* args */ Interpolated[Input], Output]) | (InterpolatorFn[Input, Output])
    ): Interpolation[Output, Any] = js.native
  }
}
