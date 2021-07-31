package typings.reactSpringShared

import org.scalablytyped.runtime.TopLevel
import typings.reactSpringShared.typesUtilMod.Arrify
import typings.reactSpringShared.typesUtilMod.Constrain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Animatable[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-spring/shared.@react-spring/shared/cjs/types.Animatable<T[P]> * / object}
    */ typings.reactSpringShared.reactSpringSharedStrings.Animatable & TopLevel[js.Any]) | (js.Array[Double | String]) | String | Double
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSpringShared.reactSpringSharedStrings.identity
    - typings.reactSpringShared.reactSpringSharedStrings.clamp
    - typings.reactSpringShared.reactSpringSharedStrings.extend
  */
  trait ExtrapolateType extends StObject
  object ExtrapolateType {
    
    @scala.inline
    def clamp: typings.reactSpringShared.reactSpringSharedStrings.clamp = "clamp".asInstanceOf[typings.reactSpringShared.reactSpringSharedStrings.clamp]
    
    @scala.inline
    def extend: typings.reactSpringShared.reactSpringSharedStrings.extend = "extend".asInstanceOf[typings.reactSpringShared.reactSpringSharedStrings.extend]
    
    @scala.inline
    def identity: typings.reactSpringShared.reactSpringSharedStrings.identity = "identity".asInstanceOf[typings.reactSpringShared.reactSpringSharedStrings.identity]
  }
  
  type FrameRequestCallback = js.Function1[/* time */ js.UndefOr[Double], Unit]
  
  type InterpolatorArgs[In, Out] = (js.Array[InterpolatorConfig[Out] | (InterpolatorFn[Arrify[In], Out])]) | (js.Tuple3[
    js.Array[Double], 
    js.Array[Constrain[Out, Animatable[js.Any]]], 
    js.UndefOr[ExtrapolateType]
  ])
  
  trait InterpolatorConfig[Out] extends StObject {
    
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
    var output: js.Array[Constrain[Out, Animatable[js.Any]]]
    
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
    
    @scala.inline
    def apply[Out](output: js.Array[Constrain[Out, Animatable[js.Any]]]): InterpolatorConfig[Out] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolatorConfig[Out]]
    }
    
    @scala.inline
    implicit class InterpolatorConfigMutableBuilder[Self <: InterpolatorConfig[?], Out] (val x: Self & InterpolatorConfig[Out]) extends AnyVal {
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setExtrapolate(value: ExtrapolateType): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrapolateLeft(value: ExtrapolateType): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
      
      @scala.inline
      def setExtrapolateRight(value: ExtrapolateType): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
      
      @scala.inline
      def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
      
      @scala.inline
      def setMap(value: /* value */ Double => Double): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOutput(value: js.Array[Constrain[Out, Animatable[js.Any]]]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputVarargs(value: (Constrain[Out, Animatable[js.Any]])*): Self = StObject.set(x, "output", js.Array(value :_*))
      
      @scala.inline
      def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InterpolatorFactory extends StObject {
    
    def apply[Out](config: InterpolatorConfig[Out]): js.Function1[/* input */ Double, Animatable[Out]] = js.native
    def apply[Out](range: js.Array[Double], output: js.Array[Constrain[Out, Animatable[js.Any]]]): js.Function1[/* input */ Double, Animatable[Out]] = js.native
    def apply[Out](
      range: js.Array[Double],
      output: js.Array[Constrain[Out, Animatable[js.Any]]],
      extrapolate: ExtrapolateType
    ): js.Function1[/* input */ Double, Animatable[Out]] = js.native
    def apply[In, Out](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InterpolatorArgs<In, Out> is not an array type */ args: InterpolatorArgs[In, Out]
    ): InterpolatorFn[In, Out] = js.native
    def apply[In, Out](interpolator: InterpolatorFn[In, Out]): js.Any = js.native
  }
  
  type InterpolatorFn[In, Out] = js.Function1[/* inputs */ Arrify[In], Out]
}
