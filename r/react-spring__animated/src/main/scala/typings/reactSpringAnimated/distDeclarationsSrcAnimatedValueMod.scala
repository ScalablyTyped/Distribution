package typings.reactSpringAnimated

import typings.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedValueMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/AnimatedValue", "AnimatedValue")
  @js.native
  open class AnimatedValue[T] protected () extends Animated[Any] {
    def this(_value: T) = this()
    
    /* protected */ var _value: T = js.native
    
    var done: Boolean = js.native
    
    var durationProgress: Double = js.native
    
    var elapsedTime: Double = js.native
    
    var lastPosition: Double = js.native
    
    var lastVelocity: js.UndefOr[Double | Null] = js.native
    
    def setValue(value: T, step: Double): Boolean = js.native
    
    var v0: js.UndefOr[Double | Null] = js.native
  }
  /* static members */
  object AnimatedValue {
    
    @JSImport("@react-spring/animated/dist/declarations/src/AnimatedValue", "AnimatedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: Any): AnimatedValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedValue[Any]]
  }
}
