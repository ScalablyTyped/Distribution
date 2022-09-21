package typings.reactSpringAnimated

import typings.reactSpringAnimated.animatedValueMod.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedStringMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/AnimatedString", "AnimatedString")
  @js.native
  open class AnimatedString protected () extends AnimatedValue[Value] {
    def this(value: String) = this()
    
    /* protected */ var _string: String | Null = js.native
    
    /* protected */ def _toString(input: Double): String = js.native
    
    /* protected */ @JSName("_value")
    var _value_AnimatedString: Double = js.native
    
    def reset(goal: String): Unit = js.native
  }
  /* static members */
  object AnimatedString {
    
    @JSImport("@react-spring/animated/dist/declarations/src/AnimatedString", "AnimatedString")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: String): AnimatedString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedString]
  }
  
  type Value = String | Double
}
