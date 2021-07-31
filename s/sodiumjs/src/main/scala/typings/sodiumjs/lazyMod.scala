package typings.sodiumjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Lazy", "Lazy")
  @js.native
  class Lazy[A] protected () extends StObject {
    def this(f: js.Function0[A]) = this()
    
    var f: js.Any = js.native
    
    /**
      * Get the value if available, throwing an exception if not.
      * In the general case this should only be used in subsequent transactions to
      * when the Lazy was obtained.
      */
    def get(): A = js.native
    
    /**
      * Lift a binary function into lazy values, so the returned Lazy reflects
      * the value of the function applied to the input Lazys' values.
      */
    def lift[B, C](b: Lazy[B], f: js.Function2[/* a */ A, /* b */ B, C]): Lazy[C] = js.native
    
    /**
      * Lift a ternary function into lazy values, so the returned Lazy reflects
      * the value of the function applied to the input Lazys' values.
      */
    def lift3[B, C, D](b: Lazy[B], c: Lazy[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Lazy[D] = js.native
    
    /**
      * Lift a quaternary function into lazy values, so the returned Lazy reflects
      * the value of the function applied to the input Lazys' values.
      */
    def lift4[B, C, D, E](b: Lazy[B], c: Lazy[C], d: Lazy[D], f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Lazy[E] = js.native
    
    /**
      * Map the lazy value according to the specified function, so the returned Lazy reflects
      * the value of the function applied to the input Lazy's value.
      * @param f Function to apply to the contained value. It must be <em>referentially transparent</em>.
      */
    def map[B](f: js.Function1[/* a */ A, B]): Lazy[B] = js.native
  }
}
