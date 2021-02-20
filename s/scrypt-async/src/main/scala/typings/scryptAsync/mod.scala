package typings.scryptAsync

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("scrypt-async", JSImport.Namespace)
  @js.native
  val ^ : ScryptStatic = js.native
  
  @js.native
  trait CallbackFunc extends StObject {
    
    def apply(key: String): js.Any = js.native
    def apply(key: js.Array[Double]): js.Any = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var N: js.UndefOr[Double] = js.native
    
    var dkLen: Double = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var interruptStep: js.UndefOr[Double] = js.native
    
    var logN: js.UndefOr[Double] = js.native
    
    var p: Double = js.native
    
    var r: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(dkLen: Double, p: Double, r: Double): Options = {
      val __obj = js.Dynamic.literal(dkLen = dkLen.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setInterruptStep(value: Double): Self = StObject.set(x, "interruptStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterruptStepUndefined: Self = StObject.set(x, "interruptStep", js.undefined)
      
      @scala.inline
      def setLogN(value: Double): Self = StObject.set(x, "logN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogNUndefined: Self = StObject.set(x, "logN", js.undefined)
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
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
