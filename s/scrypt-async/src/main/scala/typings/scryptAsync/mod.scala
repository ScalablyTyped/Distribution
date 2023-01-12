package typings.scryptAsync

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("scrypt-async", JSImport.Namespace)
  @js.native
  val ^ : ScryptStatic = js.native
  
  @js.native
  trait CallbackFunc extends StObject {
    
    def apply(key: String): Any = js.native
    def apply(key: js.Array[Double]): Any = js.native
  }
  
  trait Options extends StObject {
    
    var N: js.UndefOr[Double] = js.undefined
    
    var dkLen: Double
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var interruptStep: js.UndefOr[Double] = js.undefined
    
    var logN: js.UndefOr[Double] = js.undefined
    
    var p: Double
    
    var r: Double
  }
  object Options {
    
    inline def apply(dkLen: Double, p: Double, r: Double): Options = {
      val __obj = js.Dynamic.literal(dkLen = dkLen.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setInterruptStep(value: Double): Self = StObject.set(x, "interruptStep", value.asInstanceOf[js.Any])
      
      inline def setInterruptStepUndefined: Self = StObject.set(x, "interruptStep", js.undefined)
      
      inline def setLogN(value: Double): Self = StObject.set(x, "logN", value.asInstanceOf[js.Any])
      
      inline def setLogNUndefined: Self = StObject.set(x, "logN", js.undefined)
      
      inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScryptStatic extends StObject {
    
    def apply(password: String, salt: String, logN: Double, r: Double, dkLen: Double, callback: CallbackFunc): Unit = js.native
    def apply(
      password: String,
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(
      password: String,
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: String,
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(password: String, salt: String, options: Options, callback: CallbackFunc): Unit = js.native
    def apply(
      password: String,
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: String,
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(
      password: String,
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: String,
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(password: String, salt: js.Array[Double], options: Options, callback: CallbackFunc): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: String,
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(password: js.Array[Double], salt: String, options: Options, callback: CallbackFunc): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc
    ): Unit = js.native
    def apply(
      password: js.Array[Double],
      salt: js.Array[Double],
      logN: Double,
      r: Double,
      dkLen: Double,
      interruptStep: Double,
      callback: CallbackFunc,
      encoding: String
    ): Unit = js.native
    def apply(password: js.Array[Double], salt: js.Array[Double], options: Options, callback: CallbackFunc): Unit = js.native
  }
  
  type _To = ScryptStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ScryptStatic = ^
}
