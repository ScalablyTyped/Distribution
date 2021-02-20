package typings.srp

import typings.bignum.mod.^
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("srp", "computeVerifier")
  @js.native
  def computeVerifier(params: Params_, salt: Buffer, I: Buffer, P: Buffer): Buffer = js.native
  
  @JSImport("srp", "genKey")
  @js.native
  def genKey(bytes: Double, callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
  @JSImport("srp", "genKey")
  @js.native
  def genKey(callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
  
  @js.native
  trait Params_ extends StObject {
    
    var N: ^ = js.native
    
    var N_length_bits: Double = js.native
    
    var g: ^ = js.native
    
    var hash: String = js.native
  }
  object Params_ {
    
    @scala.inline
    def apply(N: ^, N_length_bits: Double, g: ^, hash: String): Params_ = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], N_length_bits = N_length_bits.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params_]
    }
    
    @scala.inline
    implicit class Params_MutableBuilder[Self <: Params_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setG(value: ^): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: ^): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN_length_bits(value: Double): Self = StObject.set(x, "N_length_bits", value.asInstanceOf[js.Any])
    }
  }
}
