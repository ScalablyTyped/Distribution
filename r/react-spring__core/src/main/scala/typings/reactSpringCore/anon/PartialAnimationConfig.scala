package typings.reactSpringCore.anon

import typings.reactSpringTypes.interpolationMod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-spring/core.@react-spring/core/dist/declarations/src/AnimationConfig.AnimationConfig> */
trait PartialAnimationConfig extends StObject {
  
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
object PartialAnimationConfig {
  
  inline def apply(): PartialAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAnimationConfig] (val x: Self) extends AnyVal {
    
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
