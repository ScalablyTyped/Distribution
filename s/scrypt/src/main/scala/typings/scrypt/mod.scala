package typings.scrypt

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scrypt", "hash")
  @js.native
  def hash(key: String, params: Params_, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(
    key: String,
    params: Params_,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(key: String, params: Params_, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(
    key: String,
    params: Params_,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(key: Buffer, params: Params_, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(
    key: Buffer,
    params: Params_,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(key: Buffer, params: Params_, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  @JSImport("scrypt", "hash")
  @js.native
  def hash(
    key: Buffer,
    params: Params_,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("scrypt", "hashSync")
  @js.native
  def hashSync(key: String, params: Params_, outputLength: Double, salt: String): Buffer = js.native
  @JSImport("scrypt", "hashSync")
  @js.native
  def hashSync(key: String, params: Params_, outputLength: Double, salt: Buffer): Buffer = js.native
  @JSImport("scrypt", "hashSync")
  @js.native
  def hashSync(key: Buffer, params: Params_, outputLength: Double, salt: String): Buffer = js.native
  @JSImport("scrypt", "hashSync")
  @js.native
  def hashSync(key: Buffer, params: Params_, outputLength: Double, salt: Buffer): Buffer = js.native
  
  @JSImport("scrypt", "kdf")
  @js.native
  def kdf(key: String, paramsObject: Params_): js.Promise[Buffer] = js.native
  @JSImport("scrypt", "kdf")
  @js.native
  def kdf(
    key: String,
    paramsObject: Params_,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("scrypt", "kdf")
  @js.native
  def kdf(key: Buffer, paramsObject: Params_): js.Promise[Buffer] = js.native
  @JSImport("scrypt", "kdf")
  @js.native
  def kdf(
    key: Buffer,
    paramsObject: Params_,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("scrypt", "kdfSync")
  @js.native
  def kdfSync(key: String, paramsObject: Params_): Buffer = js.native
  @JSImport("scrypt", "kdfSync")
  @js.native
  def kdfSync(key: Buffer, paramsObject: Params_): Buffer = js.native
  
  @JSImport("scrypt", "params")
  @js.native
  def params(maxtime: Double): js.Promise[Params_] = js.native
  @JSImport("scrypt", "params")
  @js.native
  def params(maxtime: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]): Unit = js.native
  @JSImport("scrypt", "params")
  @js.native
  def params(maxtime: Double, maxmem: js.UndefOr[scala.Nothing], maxmemfrac: Double): js.Promise[Params_] = js.native
  @JSImport("scrypt", "params")
  @js.native
  def params(maxtime: Double, maxmem: Double): js.Promise[Params_] = js.native
  @JSImport("scrypt", "params")
  @js.native
  def params(maxtime: Double, maxmem: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]): Unit = js.native
  @JSImport("scrypt", "params")
  @js.native
  def params(maxtime: Double, maxmem: Double, maxmemfrac: Double): js.Promise[Params_] = js.native
  @JSImport("scrypt", "params")
  @js.native
  def params(
    maxtime: Double,
    maxmem: Double,
    maxmemfrac: Double,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]
  ): Unit = js.native
  
  @JSImport("scrypt", "paramsSync")
  @js.native
  def paramsSync(maxtime: Double): Params_ = js.native
  @JSImport("scrypt", "paramsSync")
  @js.native
  def paramsSync(maxtime: Double, maxmem: js.UndefOr[scala.Nothing], maxmemfrac: Double): Params_ = js.native
  @JSImport("scrypt", "paramsSync")
  @js.native
  def paramsSync(maxtime: Double, maxmem: Double): Params_ = js.native
  @JSImport("scrypt", "paramsSync")
  @js.native
  def paramsSync(maxtime: Double, maxmem: Double, maxmemfrac: Double): Params_ = js.native
  
  @JSImport("scrypt", "verifyKdf")
  @js.native
  def verifyKdf(kdf: Buffer, key: String): js.Promise[Boolean] = js.native
  @JSImport("scrypt", "verifyKdf")
  @js.native
  def verifyKdf(kdf: Buffer, key: String, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
  @JSImport("scrypt", "verifyKdf")
  @js.native
  def verifyKdf(kdf: Buffer, key: Buffer): js.Promise[Boolean] = js.native
  @JSImport("scrypt", "verifyKdf")
  @js.native
  def verifyKdf(kdf: Buffer, key: Buffer, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
  
  @JSImport("scrypt", "verifyKdfSync")
  @js.native
  def verifyKdfSync(kdf: Buffer, key: String): Boolean = js.native
  @JSImport("scrypt", "verifyKdfSync")
  @js.native
  def verifyKdfSync(kdf: Buffer, key: Buffer): Boolean = js.native
  
  @js.native
  trait Params_ extends StObject {
    
    var N: Double = js.native
    
    var p: Double = js.native
    
    var r: Double = js.native
  }
  object Params_ {
    
    @scala.inline
    def apply(N: Double, p: Double, r: Double): Params_ = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params_]
    }
    
    @scala.inline
    implicit class Params_MutableBuilder[Self <: Params_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
