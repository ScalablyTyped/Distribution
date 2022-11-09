package typings.sha512Wasm

import typings.node.bufferMod.global.Buffer
import typings.sha512Wasm.sha512WasmBooleans.`false`
import typings.sha512Wasm.sha512WasmInts.`64`
import typings.std.WebAssembly.Memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new hash instance.
    */
  inline def apply(): Sha512 = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sha512]
  
  /**
    * Create a new hash instance.
    *
    * @example
    * import Sha512 = require('sha512-wasm')
    *
    * if (!Sha512.WASM_SUPPORTED) {
    *   console.log('WebAssembly not supported by your runtime')
    * }
    *
    * const hash = new Sha512()
    *   .update('hello')
    *   .update(' ')
    *   .update(Buffer.from('world'))
    *   .digest('hex')
    *
    * console.log('Sha512 hash of "hello world" is ', hash)
    * // 309ecc489c12d6eb4cc40f50c902f2b4d0ed77ee511a7c7a9bcd3ca86d4cd86f989dd35bc5ff499670da34255b45b0cfd830e81f605dcf7dc5542e93ae9cd76f
    */
  @JSImport("sha512-wasm", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Sha512
  @JSImport("sha512-wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sha512-wasm", "HMAC")
  @js.native
  open class HMAC protected () extends StObject {
    def this(key: js.typedarray.Uint8Array) = this()
    
    def digest(enc: String): String = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf, offset: Double): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: Unit, offset: Double): TBuf = js.native
    
    var inner: Sha512 = js.native
    
    var outer: Sha512 = js.native
    
    var pad: Buffer | js.typedarray.Uint8Array = js.native
    
    def update(input: String): this.type = js.native
    def update(input: String, encoding: String): this.type = js.native
    def update(input: js.Array[Double]): this.type = js.native
    def update(input: js.typedarray.Uint8Array): this.type = js.native
  }
  object HMAC {
    
    @JSImport("sha512-wasm", "HMAC")
    @js.native
    def apply(key: js.typedarray.Uint8Array): HMAC = js.native
  }
  
  /* static member */
  @JSImport("sha512-wasm", "SHA512_BYTES")
  @js.native
  val SHA512_BYTES: `64` = js.native
  
  /* static member */
  @JSImport("sha512-wasm", "WASM")
  @js.native
  val WASM_ : Wasm | `false` = js.native
  
  /* static member */
  @JSImport("sha512-wasm", "WASM_SUPPORTED")
  @js.native
  val WASM_SUPPORTED: Boolean = js.native
  
  /**
    * Wait for the WASM code to load.
    */
  /* static member */
  inline def ready(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[Unit]]
  inline def ready(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Create a new hash instance.
    *
    * @example
    * import Sha512 = require('sha512-wasm')
    *
    * if (!Sha512.WASM_SUPPORTED) {
    *   console.log('WebAssembly not supported by your runtime')
    * }
    *
    * const hash = new Sha512()
    *   .update('hello')
    *   .update(' ')
    *   .update(Buffer.from('world'))
    *   .digest('hex')
    *
    * console.log('Sha512 hash of "hello world" is ', hash)
    * // 309ecc489c12d6eb4cc40f50c902f2b4d0ed77ee511a7c7a9bcd3ca86d4cd86f989dd35bc5ff499670da34255b45b0cfd830e81f605dcf7dc5542e93ae9cd76f
    */
  @js.native
  trait Sha512 extends StObject {
    
    def digest(enc: String): String = js.native
    /**
      * Digest the hash.
      */
    def digest[TBuf /* <: js.typedarray.Uint8Array */](): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: TBuf, offset: Double): TBuf = js.native
    def digest[TBuf /* <: js.typedarray.Uint8Array */](enc: Unit, offset: Double): TBuf = js.native
    
    var digestLength: Double = js.native
    
    var finalized: Boolean = js.native
    
    var pointer: Double = js.native
    
    var pos: Double = js.native
    
    /**
      * Wait for the WASM code to load.
      */
    def ready(): js.Promise[Unit] = js.native
    def ready(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = js.native
    
    def update(data: String): this.type = js.native
    def update(data: String, encoding: String): this.type = js.native
    def update(data: js.Array[Double]): this.type = js.native
    /**
      * Update the hash with a new piece of data.
      *
      * @param data The data to update the hash with.
      * @param [encoding='utf-8'] The encoding of the data string.
      */
    def update(data: js.typedarray.Uint8Array): this.type = js.native
    
    var wasm: Wasm | `false` = js.native
  }
  
  trait Wasm extends StObject {
    
    var memory: Memory
    
    def sha512(ctx: Double, roi: Double, length: Double, `final`: Double): Unit
  }
  object Wasm {
    
    inline def apply(memory: Memory, sha512: (Double, Double, Double, Double) => Unit): Wasm = {
      val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], sha512 = js.Any.fromFunction4(sha512))
      __obj.asInstanceOf[Wasm]
    }
    
    extension [Self <: Wasm](x: Self) {
      
      inline def setMemory(value: Memory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setSha512(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "sha512", js.Any.fromFunction4(value))
    }
  }
}
