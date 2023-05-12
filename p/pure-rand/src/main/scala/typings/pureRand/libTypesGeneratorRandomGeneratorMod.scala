package typings.pureRand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesGeneratorRandomGeneratorMod {
  
  @JSImport("pure-rand/lib/types/generator/RandomGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateN(rng: RandomGenerator, num: Double): js.Tuple2[js.Array[Double], RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], RandomGenerator]]
  
  inline def skipN(rng: RandomGenerator, num: Double): RandomGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("skipN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[RandomGenerator]
  
  inline def unsafeGenerateN(rng: RandomGenerator, num: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeGenerateN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def unsafeSkipN(rng: RandomGenerator, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeSkipN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait RandomGenerator extends StObject {
    
    var jump: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    def next(): js.Tuple2[Double, RandomGenerator]
    
    var unsafeJump: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def unsafeNext(): Double
  }
  object RandomGenerator {
    
    inline def apply(next: () => js.Tuple2[Double, RandomGenerator], unsafeNext: () => Double): RandomGenerator = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), unsafeNext = js.Any.fromFunction0(unsafeNext))
      __obj.asInstanceOf[RandomGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomGenerator] (val x: Self) extends AnyVal {
      
      inline def setJump(value: () => RandomGenerator): Self = StObject.set(x, "jump", js.Any.fromFunction0(value))
      
      inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
      
      inline def setNext(value: () => js.Tuple2[Double, RandomGenerator]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setUnsafeJump(value: () => Unit): Self = StObject.set(x, "unsafeJump", js.Any.fromFunction0(value))
      
      inline def setUnsafeJumpUndefined: Self = StObject.set(x, "unsafeJump", js.undefined)
      
      inline def setUnsafeNext(value: () => Double): Self = StObject.set(x, "unsafeNext", js.Any.fromFunction0(value))
    }
  }
}
