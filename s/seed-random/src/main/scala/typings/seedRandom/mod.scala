package typings.seedRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("seed-random", JSImport.Namespace)
  @js.native
  def apply(): js.Function0[Double] = js.native
  @JSImport("seed-random", JSImport.Namespace)
  @js.native
  def apply(seed: js.UndefOr[scala.Nothing], options: Options): js.Function0[Double] = js.native
  @JSImport("seed-random", JSImport.Namespace)
  @js.native
  def apply(seed: String): js.Function0[Double] = js.native
  @JSImport("seed-random", JSImport.Namespace)
  @js.native
  def apply(seed: String, options: Options): js.Function0[Double] = js.native
  
  @JSImport("seed-random", "resetGlobal")
  @js.native
  def resetGlobal(): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var entropy: js.UndefOr[Boolean] = js.native
    
    var global: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntropy(value: Boolean): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntropyUndefined: Self = StObject.set(x, "entropy", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
}
