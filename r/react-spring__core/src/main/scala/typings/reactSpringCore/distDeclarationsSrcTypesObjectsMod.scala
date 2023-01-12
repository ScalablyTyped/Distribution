package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typings.reactSpringCore.distDeclarationsSrcTypesInternalMod.Readable
import typings.reactSpringTypes.interpolationMod.EasingFunction
import typings.reactSpringTypes.utilMod.Lookup
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesObjectsMod {
  
  trait AnimationResult[T /* <: Readable[Any] */] extends StObject {
    
    /** When true, the animation was cancelled before it could finish. */
    var cancelled: js.UndefOr[Boolean] = js.undefined
    
    /** When true, the animation was neither cancelled nor stopped prematurely. */
    var finished: js.UndefOr[Boolean] = js.undefined
    
    /** When true, no animation ever started. */
    var noop: js.UndefOr[Boolean] = js.undefined
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.Readable<infer U> ? U : never */ js.Any
  }
  object AnimationResult {
    
    inline def apply[T /* <: Readable[Any] */](
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.Readable<infer U> ? U : never */ js.Any
    ): AnimationResult[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationResult[?], T /* <: Readable[Any] */] (val x: Self & AnimationResult[T]) extends AnyVal {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
      
      inline def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
      
      inline def setNoopUndefined: Self = StObject.set(x, "noop", js.undefined)
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.Readable<infer U> ? U : never */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type AsyncResult[T /* <: Readable[Any] */] = js.Promise[AnimationResult[T]]
  
  /* Inlined std.Partial<@react-spring/core.@react-spring/core/dist/declarations/src/AnimationConfig.AnimationConfig> */
  trait SpringConfig extends StObject {
    
    var bounce: js.UndefOr[Double] = js.undefined
    
    var clamp: js.UndefOr[Boolean] = js.undefined
    
    var constructor: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var decay: js.UndefOr[Boolean | Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var frequency: js.UndefOr[Double] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var mass: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var progress: js.UndefOr[Double] = js.undefined
    
    var restVelocity: js.UndefOr[Double] = js.undefined
    
    var round: js.UndefOr[Double] = js.undefined
    
    var tension: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object SpringConfig {
    
    inline def apply(): SpringConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpringConfig] (val x: Self) extends AnyVal {
      
      inline def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setDecay(value: Boolean | Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRestVelocity(value: Double): Self = StObject.set(x, "restVelocity", value.asInstanceOf[js.Any])
      
      inline def setRestVelocityUndefined: Self = StObject.set(x, "restVelocity", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
      
      inline def setVelocity(value: Double | js.Array[Double]): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
      
      inline def setVelocityVarargs(value: Double*): Self = StObject.set(x, "velocity", js.Array(value*))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [@react-spring/types.@react-spring/types.Any] ? @react-spring/types.@react-spring/types/util.Lookup<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<unknown> | undefined> : {[ P in keyof T ]: @react-spring/core.@react-spring/core/dist/declarations/src/types/objects.SpringWrap<T[P]>}
    }}}
    */
  type SpringValues[T /* <: Lookup[Any] */] = Lookup[js.UndefOr[SpringValue[Any]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [std.Exclude<T, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue * / any>, std.Extract<T, std.Array<any>>] extends [object | void, never] ? never : @react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<std.Exclude<T, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue * / any | void>> | std.Extract<T, void>
    }}}
    */
  type SpringWrap[T] = (SpringValue[
    Exclude[
      T, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ Any) | Unit
    ]
  ]) | (Extract[T, Unit])
  
  type Springify[T] = Lookup[js.UndefOr[SpringValue[Any]]] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] | @react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<T[P]>} */ js.Any)
}
