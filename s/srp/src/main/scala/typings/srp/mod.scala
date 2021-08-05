package typings.srp

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("srp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("srp", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(params: Params_, salt: Buffer, identity: Buffer, password: Buffer, secret1: Buffer) = this()
    
    def checkM2(M2: Buffer): Unit = js.native
    
    def computeA(): Buffer = js.native
    
    def computeK(): Buffer = js.native
    
    def computeM1(): Buffer = js.native
    
    def setB(B: Buffer): Unit = js.native
  }
  
  @JSImport("srp", "Server")
  @js.native
  class Server protected () extends StObject {
    def this(params: Params_, verifier: Buffer, secret2: Buffer) = this()
    
    def checkM1(M1: Buffer): Buffer = js.native
    
    def computeB(): Buffer = js.native
    
    def computeK(): Buffer = js.native
    
    def setA(A: Buffer): Unit = js.native
  }
  
  inline def computeVerifier(params: Params_, salt: Buffer, I: Buffer, P: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("computeVerifier")(params.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], I.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def genKey(bytes: Double, callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("genKey")(bytes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def genKey(callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("genKey")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Params_ extends StObject {
    
    var N: typings.bignum.mod.^
    
    var N_length_bits: Double
    
    var g: typings.bignum.mod.^
    
    var hash: String
  }
  object Params_ {
    
    inline def apply(N: typings.bignum.mod.^, N_length_bits: Double, g: typings.bignum.mod.^, hash: String): Params_ = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], N_length_bits = N_length_bits.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params_]
    }
    
    extension [Self <: Params_](x: Self) {
      
      inline def setG(value: typings.bignum.mod.^): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setN(value: typings.bignum.mod.^): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setN_length_bits(value: Double): Self = StObject.set(x, "N_length_bits", value.asInstanceOf[js.Any])
    }
  }
}
