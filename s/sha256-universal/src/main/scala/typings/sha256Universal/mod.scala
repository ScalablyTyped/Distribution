package typings.sha256Universal

import org.scalablytyped.runtime.Instantiable1
import typings.sha256Universal.sha256UniversalInts.`32`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Sha256 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sha256]
  
  @JSImport("sha256-universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait HMAC extends StObject {
    
    def digest(enc: String): String = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf, offset: Double): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: Unit, offset: Double): TBuf = js.native
    
    def update(input: String): this.type = js.native
    def update(input: String, encoding: String): this.type = js.native
    def update(input: js.Array[Double]): this.type = js.native
    def update(input: js.typedarray.Uint8Array): this.type = js.native
  }
  @JSImport("sha256-universal", "HMAC")
  @js.native
  val HMAC: js.UndefOr[HMACCtor] = js.native
  
  @JSImport("sha256-universal", "SHA256_BYTES")
  @js.native
  val SHA256_BYTES: `32` = js.native
  
  @JSImport("sha256-universal", "WASM_LOADED")
  @js.native
  val WASM_LOADED: Boolean = js.native
  
  @JSImport("sha256-universal", "WASM_SUPPORTED")
  @js.native
  val WASM_SUPPORTED: Boolean = js.native
  
  inline def ready(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait HMACCtor
    extends StObject
       with Instantiable1[/* key */ js.typedarray.Uint8Array, typings.sha256Universal.mod.HMAC] {
    
    def apply(key: js.typedarray.Uint8Array): typings.sha256Universal.mod.HMAC = js.native
  }
  
  @js.native
  trait Sha256 extends StObject {
    
    def digest(enc: String): String = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf, offset: Double): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: Unit, offset: Double): TBuf = js.native
    
    def update(input: String): this.type = js.native
    def update(input: String, encoding: String): this.type = js.native
    def update(input: js.Array[Double]): this.type = js.native
    def update(input: js.typedarray.Uint8Array): this.type = js.native
  }
}
