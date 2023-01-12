package typings.seedRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function0[Double]]
  inline def apply(seed: String): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].apply(seed.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  inline def apply(seed: String, options: Options): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].apply(seed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  inline def apply(seed: Unit, options: Options): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].apply(seed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  @JSImport("seed-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetGlobal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobal")().asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var entropy: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEntropy(value: Boolean): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      inline def setEntropyUndefined: Self = StObject.set(x, "entropy", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
}
