package typings.seedrandom

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("seedrandom", JSImport.Namespace)
  @js.native
  val ^ : typings.seedrandom.mod.seedrandom = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("seedrandom", "Alea")
  @js.native
  open class Alea ()
    extends StObject
       with PRNG {
    def this(seed: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("seedrandom", "Tychei")
  @js.native
  open class Tychei ()
    extends StObject
       with PRNG {
    def this(seed: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("seedrandom", "Xor128")
  @js.native
  open class Xor128 ()
    extends StObject
       with PRNG {
    def this(seed: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("seedrandom", "Xor4096")
  @js.native
  open class Xor4096 ()
    extends StObject
       with PRNG {
    def this(seed: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("seedrandom", "XorShift7")
  @js.native
  open class XorShift7 ()
    extends StObject
       with PRNG {
    def this(seed: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("seedrandom", "XorWow")
  @js.native
  open class XorWow ()
    extends StObject
       with PRNG {
    def this(seed: String) = this()
  }
  
  type Callback = js.Function4[
    /* prng */ js.UndefOr[PRNG], 
    /* shortseed */ js.UndefOr[String], 
    /* global */ js.UndefOr[Boolean], 
    /* state */ js.UndefOr[State], 
    PRNG
  ]
  
  trait Options extends StObject {
    
    var entropy: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var pass: js.UndefOr[Callback] = js.undefined
    
    var state: js.UndefOr[Boolean | State] = js.undefined
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
      
      inline def setPass(
        value: (/* prng */ js.UndefOr[PRNG], /* shortseed */ js.UndefOr[String], /* global */ js.UndefOr[Boolean], /* state */ js.UndefOr[State]) => PRNG
      ): Self = StObject.set(x, "pass", js.Any.fromFunction4(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setState(value: Boolean | State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait PRNG extends StObject {
    
    def apply(): Double = js.native
    
    def double(): Double = js.native
    
    def int32(): Double = js.native
    
    def quick(): Double = js.native
    
    def state(): State = js.native
  }
  
  type State = js.Object
  
  type _To = typings.seedrandom.mod.seedrandom
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.seedrandom.mod.seedrandom = ^
  
  @js.native
  trait seedrandom extends StObject {
    
    def apply(): PRNG = js.native
    def apply(seed: String): PRNG = js.native
    def apply(seed: String, options: Unit, callback: Callback): PRNG = js.native
    def apply(seed: String, options: Options): PRNG = js.native
    def apply(seed: String, options: Options, callback: Callback): PRNG = js.native
    def apply(seed: Unit, options: Unit, callback: Callback): PRNG = js.native
    def apply(seed: Unit, options: Options): PRNG = js.native
    def apply(seed: Unit, options: Options, callback: Callback): PRNG = js.native
    
    var Alea: Instantiable1[/* seed */ js.UndefOr[String], PRNG] = js.native
    
    var Tychei: Instantiable1[/* seed */ js.UndefOr[String], PRNG] = js.native
    
    var Xor128: Instantiable1[/* seed */ js.UndefOr[String], PRNG] = js.native
    
    var Xor4096: Instantiable1[/* seed */ js.UndefOr[String], PRNG] = js.native
    
    var XorShift7: Instantiable1[/* seed */ js.UndefOr[String], PRNG] = js.native
    
    var XorWow: Instantiable1[/* seed */ js.UndefOr[String], PRNG] = js.native
    
    def alea(): PRNG = js.native
    def alea(seed: String): PRNG = js.native
    def alea(seed: String, options: Options): PRNG = js.native
    def alea(seed: Unit, options: Options): PRNG = js.native
    
    def tychei(): PRNG = js.native
    def tychei(seed: String): PRNG = js.native
    def tychei(seed: String, options: Options): PRNG = js.native
    def tychei(seed: Unit, options: Options): PRNG = js.native
    
    def xor128(): PRNG = js.native
    def xor128(seed: String): PRNG = js.native
    def xor128(seed: String, options: Options): PRNG = js.native
    def xor128(seed: Unit, options: Options): PRNG = js.native
    
    def xor4096(): PRNG = js.native
    def xor4096(seed: String): PRNG = js.native
    def xor4096(seed: String, options: Options): PRNG = js.native
    def xor4096(seed: Unit, options: Options): PRNG = js.native
    
    def xorshift7(): PRNG = js.native
    def xorshift7(seed: String): PRNG = js.native
    def xorshift7(seed: String, options: Options): PRNG = js.native
    def xorshift7(seed: Unit, options: Options): PRNG = js.native
    
    def xorwow(): PRNG = js.native
    def xorwow(seed: String): PRNG = js.native
    def xorwow(seed: String, options: Options): PRNG = js.native
    def xorwow(seed: Unit, options: Options): PRNG = js.native
  }
}
