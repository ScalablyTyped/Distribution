package typings.seedrandom

import org.scalablytyped.runtime.Shortcut
import typings.seedrandom.anon.State
import typings.seedrandom.anon.`0`
import typings.seedrandom.mod.State.Alea
import typings.seedrandom.mod.State.Arc4
import typings.seedrandom.mod.State.Tychei
import typings.seedrandom.mod.State.Xor128
import typings.seedrandom.mod.State.Xor4096
import typings.seedrandom.mod.State.Xorshift7
import typings.seedrandom.mod.State.Xorwow
import typings.seedrandom.seedrandomBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("seedrandom", JSImport.Namespace)
  @js.native
  val ^ : typings.seedrandom.mod.seedrandom = js.native
  
  type Callback[callbackReturnType] = js.Function4[
    /* prng */ PRNG, 
    /* seed */ String, 
    /* is_math_call */ Boolean, 
    /* state */ js.UndefOr[Boolean | Arc4], 
    callbackReturnType
  ]
  
  type ComplexStateBuilder[S /* <: String */, M /* <: String */] = StateBuilder[S] & (Record[M, js.Array[Double]])
  
  @js.native
  trait OtherAlgorithm[State] extends StObject {
    
    def apply(): StatefulPRNG[State] = js.native
    def apply(seed: String): StatefulPRNG[State] = js.native
    def apply(seed: String, options: typings.seedrandom.anon.State): PRNG = js.native
    def apply(seed: String, options: `0`[State]): StatefulPRNG[State] = js.native
    def apply(seed: Unit, options: typings.seedrandom.anon.State): PRNG = js.native
    def apply(seed: Unit, options: `0`[State]): StatefulPRNG[State] = js.native
  }
  
  @js.native
  trait PRNG extends StObject {
    
    def apply(): Double = js.native
    
    def double(): Double = js.native
    
    def int32(): Double = js.native
    
    def quick(): Double = js.native
  }
  
  object State {
    
    /* Inlined seedrandom.seedrandom.StateBuilder<'c' | 's0' | 's1' | 's2'> */
    trait Alea extends StObject {
      
      var c: Double
      
      var s0: Double
      
      var s1: Double
      
      var s2: Double
    }
    object Alea {
      
      inline def apply(c: Double, s0: Double, s1: Double, s2: Double): Alea = {
        val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], s0 = s0.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any])
        __obj.asInstanceOf[Alea]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Alea] (val x: Self) extends AnyVal {
        
        inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        inline def setS0(value: Double): Self = StObject.set(x, "s0", value.asInstanceOf[js.Any])
        
        inline def setS1(value: Double): Self = StObject.set(x, "s1", value.asInstanceOf[js.Any])
        
        inline def setS2(value: Double): Self = StObject.set(x, "s2", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined seedrandom.seedrandom.ComplexStateBuilder<'i' | 'j', 'S'> */
    trait Arc4 extends StObject {
      
      var S: js.Array[Double]
      
      var i: Double
      
      var j: Double
    }
    object Arc4 {
      
      inline def apply(S: js.Array[Double], i: Double, j: Double): Arc4 = {
        val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
        __obj.asInstanceOf[Arc4]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Arc4] (val x: Self) extends AnyVal {
        
        inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
        
        inline def setS(value: js.Array[Double]): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
        
        inline def setSVarargs(value: Double*): Self = StObject.set(x, "S", js.Array(value*))
      }
    }
    
    /* Inlined seedrandom.seedrandom.StateBuilder<'a' | 'b' | 'c' | 'd'> */
    trait Tychei extends StObject {
      
      var a: Double
      
      var b: Double
      
      var c: Double
      
      var d: Double
    }
    object Tychei {
      
      inline def apply(a: Double, b: Double, c: Double, d: Double): Tychei = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
        __obj.asInstanceOf[Tychei]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Tychei] (val x: Self) extends AnyVal {
        
        inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined seedrandom.seedrandom.StateBuilder<'x' | 'y' | 'z' | 'w'> */
    trait Xor128 extends StObject {
      
      var w: Double
      
      var x: Double
      
      var y: Double
      
      var z: Double
    }
    object Xor128 {
      
      inline def apply(w: Double, x: Double, y: Double, z: Double): Xor128 = {
        val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
        __obj.asInstanceOf[Xor128]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Xor128] (val x: Self) extends AnyVal {
        
        inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined seedrandom.seedrandom.ComplexStateBuilder<'i' | 'w', 'X'> */
    trait Xor4096 extends StObject {
      
      var X: js.Array[Double]
      
      var i: Double
      
      var w: Double
    }
    object Xor4096 {
      
      inline def apply(X: js.Array[Double], i: Double, w: Double): Xor4096 = {
        val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
        __obj.asInstanceOf[Xor4096]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Xor4096] (val x: Self) extends AnyVal {
        
        inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        inline def setX(value: js.Array[Double]): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
        
        inline def setXVarargs(value: Double*): Self = StObject.set(x, "X", js.Array(value*))
      }
    }
    
    /* Inlined seedrandom.seedrandom.ComplexStateBuilder<'i', 'x'> */
    trait Xorshift7 extends StObject {
      
      var i: Double
      
      var x: js.Array[Double]
    }
    object Xorshift7 {
      
      inline def apply(i: Double, x: js.Array[Double]): Xorshift7 = {
        val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
        __obj.asInstanceOf[Xorshift7]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Xorshift7] (val x: Self) extends AnyVal {
        
        inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      }
    }
    
    /* Inlined seedrandom.seedrandom.StateBuilder<'x' | 'y' | 'z' | 'w' | 'v' | 'd'> */
    trait Xorwow extends StObject {
      
      var d: Double
      
      var v: Double
      
      var w: Double
      
      var x: Double
      
      var y: Double
      
      var z: Double
    }
    object Xorwow {
      
      inline def apply(d: Double, v: Double, w: Double, x: Double, y: Double, z: Double): Xorwow = {
        val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
        __obj.asInstanceOf[Xorwow]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Xorwow] (val x: Self) extends AnyVal {
        
        inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
        
        inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
        
        inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type StateBuilder[S /* <: String */] = Record[S, Double]
  
  @js.native
  trait StatefulPRNG[State]
    extends StObject
       with PRNG {
    
    def state(): State = js.native
  }
  
  type _To = typings.seedrandom.mod.seedrandom
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.seedrandom.mod.seedrandom = ^
  
  trait callbackOption[callbackReturnType] extends StObject {
    
    def pass(prng: PRNG, seed: String, is_math_call: Boolean): callbackReturnType
    def pass(prng: PRNG, seed: String, is_math_call: Boolean, state: Boolean): callbackReturnType
    def pass(prng: PRNG, seed: String, is_math_call: Boolean, state: Arc4): callbackReturnType
    @JSName("pass")
    var pass_Original: Callback[callbackReturnType]
  }
  object callbackOption {
    
    inline def apply[callbackReturnType](
      pass: (/* prng */ PRNG, /* seed */ String, /* is_math_call */ Boolean, /* state */ js.UndefOr[Boolean | Arc4]) => callbackReturnType
    ): callbackOption[callbackReturnType] = {
      val __obj = js.Dynamic.literal(pass = js.Any.fromFunction4(pass))
      __obj.asInstanceOf[callbackOption[callbackReturnType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: callbackOption[?], callbackReturnType] (val x: Self & callbackOption[callbackReturnType]) extends AnyVal {
      
      inline def setPass(
        value: (/* prng */ PRNG, /* seed */ String, /* is_math_call */ Boolean, /* state */ js.UndefOr[Boolean | Arc4]) => callbackReturnType
      ): Self = StObject.set(x, "pass", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait seedrandom extends StObject {
    
    // Arc4 Algorithm, default seedrandom
    def apply[O /* <: seedrandomOptions[Any] */](): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : O extends seedrandom.seedrandom.stateOptionEnabled ? seedrandom.seedrandom.StatefulPRNG<seedrandom.seedrandom.State.Arc4> : seedrandom.seedrandom.PRNG */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */](seed: String): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : O extends seedrandom.seedrandom.stateOptionEnabled ? seedrandom.seedrandom.StatefulPRNG<seedrandom.seedrandom.State.Arc4> : seedrandom.seedrandom.PRNG */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */](seed: String, options: O): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : O extends seedrandom.seedrandom.stateOptionEnabled ? seedrandom.seedrandom.StatefulPRNG<seedrandom.seedrandom.State.Arc4> : seedrandom.seedrandom.PRNG */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */](seed: String, options: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : O extends seedrandom.seedrandom.stateOptionEnabled ? seedrandom.seedrandom.StatefulPRNG<seedrandom.seedrandom.State.Arc4> : seedrandom.seedrandom.PRNG */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */](seed: Unit, options: O): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : O extends seedrandom.seedrandom.stateOptionEnabled ? seedrandom.seedrandom.StatefulPRNG<seedrandom.seedrandom.State.Arc4> : seedrandom.seedrandom.PRNG */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */](seed: Unit, options: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : O extends seedrandom.seedrandom.stateOptionEnabled ? seedrandom.seedrandom.StatefulPRNG<seedrandom.seedrandom.State.Arc4> : seedrandom.seedrandom.PRNG */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */, callbackReturnType](seed: String, options: O, callback: Callback[callbackReturnType]): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : callbackReturnType */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */, callbackReturnType](seed: String, options: Boolean, callback: Callback[callbackReturnType]): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : callbackReturnType */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */, callbackReturnType](seed: String, options: Unit, callback: Callback[callbackReturnType]): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : callbackReturnType */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */, callbackReturnType](seed: Unit, options: O, callback: Callback[callbackReturnType]): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : callbackReturnType */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */, callbackReturnType](seed: Unit, options: Boolean, callback: Callback[callbackReturnType]): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : callbackReturnType */ js.Any = js.native
    def apply[O /* <: seedrandomOptions[Any] */, callbackReturnType](seed: Unit, options: Unit, callback: Callback[callbackReturnType]): /* import warning: importer.ImportType#apply Failed type conversion: O extends seedrandom.seedrandom.callbackOption<infer callbackReturnType> ? callbackReturnType : callbackReturnType */ js.Any = js.native
    
    // Other Algorithms
    def alea(): StatefulPRNG[Alea] = js.native
    def alea(seed: String): StatefulPRNG[Alea] = js.native
    def alea(seed: String, options: State): PRNG = js.native
    def alea(seed: String, options: `0`[Alea]): StatefulPRNG[Alea] = js.native
    def alea(seed: Unit, options: State): PRNG = js.native
    def alea(seed: Unit, options: `0`[Alea]): StatefulPRNG[Alea] = js.native
    // Other Algorithms
    @JSName("alea")
    var alea_Original: OtherAlgorithm[Alea] = js.native
    // Other Algorithms
    @JSName("alea")
    def alea_PRNG(): PRNG = js.native
    @JSName("alea")
    def alea_PRNG(seed: String): PRNG = js.native
    
    def tychei(): StatefulPRNG[Tychei] = js.native
    def tychei(seed: String): StatefulPRNG[Tychei] = js.native
    def tychei(seed: String, options: State): PRNG = js.native
    def tychei(seed: String, options: `0`[Tychei]): StatefulPRNG[Tychei] = js.native
    def tychei(seed: Unit, options: State): PRNG = js.native
    def tychei(seed: Unit, options: `0`[Tychei]): StatefulPRNG[Tychei] = js.native
    @JSName("tychei")
    var tychei_Original: OtherAlgorithm[Tychei] = js.native
    @JSName("tychei")
    def tychei_PRNG(): PRNG = js.native
    @JSName("tychei")
    def tychei_PRNG(seed: String): PRNG = js.native
    
    def xor128(): StatefulPRNG[Xor128] = js.native
    def xor128(seed: String): StatefulPRNG[Xor128] = js.native
    def xor128(seed: String, options: State): PRNG = js.native
    def xor128(seed: String, options: `0`[Xor128]): StatefulPRNG[Xor128] = js.native
    def xor128(seed: Unit, options: State): PRNG = js.native
    def xor128(seed: Unit, options: `0`[Xor128]): StatefulPRNG[Xor128] = js.native
    @JSName("xor128")
    var xor128_Original: OtherAlgorithm[Xor128] = js.native
    @JSName("xor128")
    def xor128_PRNG(): PRNG = js.native
    @JSName("xor128")
    def xor128_PRNG(seed: String): PRNG = js.native
    
    def xor4096(): StatefulPRNG[Xor4096] = js.native
    def xor4096(seed: String): StatefulPRNG[Xor4096] = js.native
    def xor4096(seed: String, options: State): PRNG = js.native
    def xor4096(seed: String, options: `0`[Xor4096]): StatefulPRNG[Xor4096] = js.native
    def xor4096(seed: Unit, options: State): PRNG = js.native
    def xor4096(seed: Unit, options: `0`[Xor4096]): StatefulPRNG[Xor4096] = js.native
    @JSName("xor4096")
    var xor4096_Original: OtherAlgorithm[Xor4096] = js.native
    @JSName("xor4096")
    def xor4096_PRNG(): PRNG = js.native
    @JSName("xor4096")
    def xor4096_PRNG(seed: String): PRNG = js.native
    
    def xorshift7(): StatefulPRNG[Xorshift7] = js.native
    def xorshift7(seed: String): StatefulPRNG[Xorshift7] = js.native
    def xorshift7(seed: String, options: State): PRNG = js.native
    def xorshift7(seed: String, options: `0`[Xorshift7]): StatefulPRNG[Xorshift7] = js.native
    def xorshift7(seed: Unit, options: State): PRNG = js.native
    def xorshift7(seed: Unit, options: `0`[Xorshift7]): StatefulPRNG[Xorshift7] = js.native
    @JSName("xorshift7")
    var xorshift7_Original: OtherAlgorithm[Xorshift7] = js.native
    @JSName("xorshift7")
    def xorshift7_PRNG(): PRNG = js.native
    @JSName("xorshift7")
    def xorshift7_PRNG(seed: String): PRNG = js.native
    
    def xorwow(): StatefulPRNG[Xorwow] = js.native
    def xorwow(seed: String): StatefulPRNG[Xorwow] = js.native
    def xorwow(seed: String, options: State): PRNG = js.native
    def xorwow(seed: String, options: `0`[Xorwow]): StatefulPRNG[Xorwow] = js.native
    def xorwow(seed: Unit, options: State): PRNG = js.native
    def xorwow(seed: Unit, options: `0`[Xorwow]): StatefulPRNG[Xorwow] = js.native
    @JSName("xorwow")
    var xorwow_Original: OtherAlgorithm[Xorwow] = js.native
    @JSName("xorwow")
    def xorwow_PRNG(): PRNG = js.native
    @JSName("xorwow")
    def xorwow_PRNG(seed: String): PRNG = js.native
  }
  
  trait seedrandomOptions[callbackReturnType] extends StObject {
    
    var entropy: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var pass: js.UndefOr[Callback[callbackReturnType]] = js.undefined
    
    var state: js.UndefOr[Boolean | Arc4] = js.undefined
  }
  object seedrandomOptions {
    
    inline def apply[callbackReturnType](): seedrandomOptions[callbackReturnType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[seedrandomOptions[callbackReturnType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: seedrandomOptions[?], callbackReturnType] (val x: Self & seedrandomOptions[callbackReturnType]) extends AnyVal {
      
      inline def setEntropy(value: Boolean): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      inline def setEntropyUndefined: Self = StObject.set(x, "entropy", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setPass(
        value: (/* prng */ PRNG, /* seed */ String, /* is_math_call */ Boolean, /* state */ js.UndefOr[Boolean | Arc4]) => callbackReturnType
      ): Self = StObject.set(x, "pass", js.Any.fromFunction4(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setState(value: Boolean | Arc4): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait stateOptionEnabled extends StObject {
    
    var state: `true` | Arc4
  }
  object stateOptionEnabled {
    
    inline def apply(state: `true` | Arc4): stateOptionEnabled = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[stateOptionEnabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: stateOptionEnabled] (val x: Self) extends AnyVal {
      
      inline def setState(value: `true` | Arc4): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
