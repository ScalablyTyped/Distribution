package typings.reactSpringTypes

import typings.reactSpringTypes.animatedMod.Animatable
import typings.reactSpringTypes.utilMod.Arrify
import typings.reactSpringTypes.utilMod.Constrain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolationMod {
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringTypes.reactSpringTypesStrings.identity
    - typings.reactSpringTypes.reactSpringTypesStrings.clamp
    - typings.reactSpringTypes.reactSpringTypesStrings.extend
  */
  trait ExtrapolateType extends StObject
  object ExtrapolateType {
    
    inline def clamp: typings.reactSpringTypes.reactSpringTypesStrings.clamp = "clamp".asInstanceOf[typings.reactSpringTypes.reactSpringTypesStrings.clamp]
    
    inline def extend: typings.reactSpringTypes.reactSpringTypesStrings.extend = "extend".asInstanceOf[typings.reactSpringTypes.reactSpringTypesStrings.extend]
    
    inline def identity: typings.reactSpringTypes.reactSpringTypesStrings.identity = "identity".asInstanceOf[typings.reactSpringTypes.reactSpringTypesStrings.identity]
  }
  
  type InterpolatorArgs[Input, Output] = (js.Array[InterpolatorConfig[Output] | (InterpolatorFn[Arrify[Input], Output])]) | (js.Tuple3[
    js.Array[Double], 
    js.Array[Constrain[Output, Animatable[Any]]], 
    js.UndefOr[ExtrapolateType]
  ])
  
  trait InterpolatorConfig[Output] extends StObject {
    
    /**
      * Custom easing to apply in interpolator.
      */
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    /**
      * What happens when the spring exceeds its target value.
      * Shortcut to set `extrapolateLeft` and `extrapolateRight`.
      *
      *  - `extend` continues the interpolation past the target value
      *  - `clamp` limits the interpolation at the max value
      *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
      *
      * @default 'extend'
      */
    var extrapolate: js.UndefOr[ExtrapolateType] = js.undefined
    
    /**
      * What happens when the spring goes below its target value.
      *
      *  - `extend` continues the interpolation past the target value
      *  - `clamp` limits the interpolation at the max value
      *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
      *
      * @default 'extend'
      */
    var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.undefined
    
    /**
      * What happens when the spring exceeds its target value.
      *
      *  - `extend` continues the interpolation past the target value
      *  - `clamp` limits the interpolation at the max value
      *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
      *
      * @default 'extend'
      */
    var extrapolateRight: js.UndefOr[ExtrapolateType] = js.undefined
    
    /**
      * Transformation to apply to the value before interpolation.
      */
    var map: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
    
    /**
      * Output values from the interpolation function. Should match the length of the `range` array.
      */
    var output: js.Array[Constrain[Output, Animatable[Any]]]
    
    /**
      * Input ranges mapping the interpolation to the output values.
      *
      * @example
      *
      *   range: [0, 0.5, 1], output: ['yellow', 'orange', 'red']
      *
      * @default [0,1]
      */
    var range: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object InterpolatorConfig {
    
    inline def apply[Output](output: js.Array[Constrain[Output, Animatable[Any]]]): InterpolatorConfig[Output] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolatorConfig[Output]]
    }
    
    extension [Self <: InterpolatorConfig[?], Output](x: Self & InterpolatorConfig[Output]) {
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setExtrapolate(value: ExtrapolateType): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateLeft(value: ExtrapolateType): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
      
      inline def setExtrapolateRight(value: ExtrapolateType): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
      
      inline def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
      
      inline def setMap(value: /* value */ Double => Double): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOutput(value: js.Array[Constrain[Output, Animatable[Any]]]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: (Constrain[Output, Animatable[Any]])*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
  
  @js.native
  trait InterpolatorFactory extends StObject {
    
    def apply[Output](config: InterpolatorConfig[Output]): js.Function1[/* input */ Double, Animatable[Output]] = js.native
    def apply[Output](range: js.Array[Double], output: js.Array[Constrain[Output, Animatable[Any]]]): js.Function1[/* input */ Double, Animatable[Output]] = js.native
    def apply[Output](
      range: js.Array[Double],
      output: js.Array[Constrain[Output, Animatable[Any]]],
      extrapolate: ExtrapolateType
    ): js.Function1[/* input */ Double, Animatable[Output]] = js.native
    def apply[Input, Output](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InterpolatorArgs<Input, Output> is not an array type */ args: InterpolatorArgs[Input, Output]
    ): InterpolatorFn[Input, Output] = js.native
    def apply[Input, Output](interpolator: InterpolatorFn[Input, Output]): Any = js.native
  }
  
  type InterpolatorFn[Input, Output] = js.Function1[/* inputs */ Arrify[Input], Output]
}
