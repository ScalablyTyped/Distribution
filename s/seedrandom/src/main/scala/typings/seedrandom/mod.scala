package typings.seedrandom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("seedrandom", JSImport.Namespace)
  @js.native
  val ^ : seedrandomPrng = js.native
  
  type State = js.Object
  
  type _To = seedrandomPrng
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: seedrandomPrng = ^
  
  @js.native
  trait prng
    extends StObject
       with Instantiable0[prng]
       with Instantiable1[/* seed */ String, prng]
       with Instantiable2[(/* seed */ String) | (/* seed */ Unit), /* options */ seedRandomOptions, prng]
       with Instantiable3[
          (/* seed */ String) | (/* seed */ Unit), 
          (/* options */ Unit) | (/* options */ seedRandomOptions), 
          /* callback */ js.Any, 
          prng
        ] {
    
    def apply(): Double = js.native
    
    def double(): Double = js.native
    
    def int32(): Double = js.native
    
    def quick(): Double = js.native
    
    def state(): State = js.native
  }
  
  trait seedRandomOptions extends StObject {
    
    var entropy: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var pass: js.UndefOr[seedrandomCallback] = js.undefined
    
    var state: js.UndefOr[Boolean | State] = js.undefined
  }
  object seedRandomOptions {
    
    @scala.inline
    def apply(): seedRandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[seedRandomOptions]
    }
    
    @scala.inline
    implicit class seedRandomOptionsMutableBuilder[Self <: seedRandomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntropy(value: Boolean): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntropyUndefined: Self = StObject.set(x, "entropy", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setPass(
        value: (/* prng */ js.UndefOr[prng], /* shortseed */ js.UndefOr[String], /* global */ js.UndefOr[Boolean], /* state */ js.UndefOr[State]) => prng
      ): Self = StObject.set(x, "pass", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setState(value: Boolean | State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type seedrandomCallback = js.Function4[
    /* prng */ js.UndefOr[prng], 
    /* shortseed */ js.UndefOr[String], 
    /* global */ js.UndefOr[Boolean], 
    /* state */ js.UndefOr[State], 
    prng
  ]
  
  @js.native
  trait seedrandomPrng extends StObject {
    
    def apply(): prng = js.native
    def apply(seed: String): prng = js.native
    def apply(seed: String, options: Unit, callback: seedrandomCallback): prng = js.native
    def apply(seed: String, options: seedRandomOptions): prng = js.native
    def apply(seed: String, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
    def apply(seed: Unit, options: Unit, callback: seedrandomCallback): prng = js.native
    def apply(seed: Unit, options: seedRandomOptions): prng = js.native
    def apply(seed: Unit, options: seedRandomOptions, callback: seedrandomCallback): prng = js.native
    
    def alea(): prng = js.native
    def alea(seed: String): prng = js.native
    def alea(seed: String, options: seedRandomOptions): prng = js.native
    def alea(seed: Unit, options: seedRandomOptions): prng = js.native
    
    def quick(): prng = js.native
    def quick(seed: String): prng = js.native
    def quick(seed: String, options: seedRandomOptions): prng = js.native
    def quick(seed: Unit, options: seedRandomOptions): prng = js.native
    
    def tychei(): prng = js.native
    def tychei(seed: String): prng = js.native
    def tychei(seed: String, options: seedRandomOptions): prng = js.native
    def tychei(seed: Unit, options: seedRandomOptions): prng = js.native
    
    def xor128(): prng = js.native
    def xor128(seed: String): prng = js.native
    def xor128(seed: String, options: seedRandomOptions): prng = js.native
    def xor128(seed: Unit, options: seedRandomOptions): prng = js.native
    
    def xor4096(): prng = js.native
    def xor4096(seed: String): prng = js.native
    def xor4096(seed: String, options: seedRandomOptions): prng = js.native
    def xor4096(seed: Unit, options: seedRandomOptions): prng = js.native
    
    def xorshift7(): prng = js.native
    def xorshift7(seed: String): prng = js.native
    def xorshift7(seed: String, options: seedRandomOptions): prng = js.native
    def xorshift7(seed: Unit, options: seedRandomOptions): prng = js.native
    
    def xorwow(): prng = js.native
    def xorwow(seed: String): prng = js.native
    def xorwow(seed: String, options: seedRandomOptions): prng = js.native
    def xorwow(seed: Unit, options: seedRandomOptions): prng = js.native
  }
}
