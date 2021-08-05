package typings.scrypt

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash(key: String, params: Params_, outputLength: Double, salt: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def hash(
    key: String,
    params: Params_,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(key: String, params: Params_, outputLength: Double, salt: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def hash(
    key: String,
    params: Params_,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(key: Buffer, params: Params_, outputLength: Double, salt: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def hash(
    key: Buffer,
    params: Params_,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(key: Buffer, params: Params_, outputLength: Double, salt: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def hash(
    key: Buffer,
    params: Params_,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hashSync(key: String, params: Params_, outputLength: Double, salt: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def hashSync(key: String, params: Params_, outputLength: Double, salt: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def hashSync(key: Buffer, params: Params_, outputLength: Double, salt: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def hashSync(key: Buffer, params: Params_, outputLength: Double, salt: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(key.asInstanceOf[js.Any], params.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def kdf(key: String, paramsObject: Params_): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(key.asInstanceOf[js.Any], paramsObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def kdf(
    key: String,
    paramsObject: Params_,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(key.asInstanceOf[js.Any], paramsObject.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kdf(key: Buffer, paramsObject: Params_): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(key.asInstanceOf[js.Any], paramsObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def kdf(
    key: Buffer,
    paramsObject: Params_,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(key.asInstanceOf[js.Any], paramsObject.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def kdfSync(key: String, paramsObject: Params_): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("kdfSync")(key.asInstanceOf[js.Any], paramsObject.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def kdfSync(key: Buffer, paramsObject: Params_): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("kdfSync")(key.asInstanceOf[js.Any], paramsObject.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def params(maxtime: Double): js.Promise[Params_] = ^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Params_]]
  inline def params(maxtime: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def params(maxtime: Double, maxmem: Double): js.Promise[Params_] = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Params_]]
  inline def params(maxtime: Double, maxmem: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def params(maxtime: Double, maxmem: Double, maxmemfrac: Double): js.Promise[Params_] = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any], maxmemfrac.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Params_]]
  inline def params(
    maxtime: Double,
    maxmem: Double,
    maxmemfrac: Double,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any], maxmemfrac.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def params(maxtime: Double, maxmem: Unit, maxmemfrac: Double): js.Promise[Params_] = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any], maxmemfrac.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Params_]]
  
  inline def paramsSync(maxtime: Double): Params_ = ^.asInstanceOf[js.Dynamic].applyDynamic("paramsSync")(maxtime.asInstanceOf[js.Any]).asInstanceOf[Params_]
  inline def paramsSync(maxtime: Double, maxmem: Double): Params_ = (^.asInstanceOf[js.Dynamic].applyDynamic("paramsSync")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any])).asInstanceOf[Params_]
  inline def paramsSync(maxtime: Double, maxmem: Double, maxmemfrac: Double): Params_ = (^.asInstanceOf[js.Dynamic].applyDynamic("paramsSync")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any], maxmemfrac.asInstanceOf[js.Any])).asInstanceOf[Params_]
  inline def paramsSync(maxtime: Double, maxmem: Unit, maxmemfrac: Double): Params_ = (^.asInstanceOf[js.Dynamic].applyDynamic("paramsSync")(maxtime.asInstanceOf[js.Any], maxmem.asInstanceOf[js.Any], maxmemfrac.asInstanceOf[js.Any])).asInstanceOf[Params_]
  
  inline def verifyKdf(kdf: Buffer, key: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKdf")(kdf.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyKdf(kdf: Buffer, key: String, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKdf")(kdf.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verifyKdf(kdf: Buffer, key: Buffer): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKdf")(kdf.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyKdf(kdf: Buffer, key: Buffer, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKdf")(kdf.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def verifyKdfSync(kdf: Buffer, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKdfSync")(kdf.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verifyKdfSync(kdf: Buffer, key: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKdfSync")(kdf.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Params_ extends StObject {
    
    var N: Double
    
    var p: Double
    
    var r: Double
  }
  object Params_ {
    
    inline def apply(N: Double, p: Double, r: Double): Params_ = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params_]
    }
    
    extension [Self <: Params_](x: Self) {
      
      inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
