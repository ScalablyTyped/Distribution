package typings.reactSpringAnimated

import typings.reactSpringAnimated.animatedObjectMod.AnimatedObject
import typings.reactSpringAnimated.animatedValueMod.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedArrayMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/AnimatedArray", "AnimatedArray")
  @js.native
  open class AnimatedArray[T /* <: js.Array[Value] */] protected () extends AnimatedObject {
    def this(source: T) = this()
    
    /* protected */ @JSName("source")
    var source_AnimatedArray: Source = js.native
  }
  /* static members */
  object AnimatedArray {
    
    @JSImport("@react-spring/animated/dist/declarations/src/AnimatedArray", "AnimatedArray")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create[T /* <: js.Array[Value] */](source: T): AnimatedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[AnimatedArray[T]]
  }
  
  type Source = js.Array[AnimatedValue[Value]]
  
  type Value = Double | String
}
