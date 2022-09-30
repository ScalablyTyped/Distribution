package typings.sha3

import org.scalablytyped.runtime.Instantiable0
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.sha3.sha3Ints.`128`
import typings.sha3.sha3Ints.`224`
import typings.sha3.sha3Ints.`256`
import typings.sha3.sha3Ints.`384`
import typings.sha3.sha3Ints.`512`
import typings.sha3.sha3Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha3", JSImport.Default)
  @js.native
  open class default[S /* <: `224` | `256` | `384` | `512` */] () extends SHA3[S]
  /* static members */
  object default {
    
    @JSImport("sha3", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For backwards-compatibility, sprinkle SHA3Hash into the default export.
      *
      * @deprecated
      */
    @JSImport("sha3", "default.SHA3Hash")
    @js.native
    def SHA3Hash: Instantiable0[Keccak[`224` | `256` | `384` | `512`]] = js.native
    inline def SHA3Hash_=(x: Instantiable0[Keccak[`224` | `256` | `384` | `512`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA3Hash")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sha3", "Keccak")
  @js.native
  open class Keccak[S /* <: `224` | `256` | `384` | `512` */] ()
    extends StObject
       with Hasher[S]
  
  @JSImport("sha3", "SHA3")
  @js.native
  open class SHA3[S /* <: `224` | `256` | `384` | `512` */] ()
    extends StObject
       with Hasher[S]
  /* static members */
  object SHA3 {
    
    @JSImport("sha3", "SHA3")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For backwards-compatibility, sprinkle SHA3Hash into the default export.
      *
      * @deprecated
      */
    @JSImport("sha3", "SHA3.SHA3Hash")
    @js.native
    def SHA3Hash: Instantiable0[Keccak[`224` | `256` | `384` | `512`]] = js.native
    inline def SHA3Hash_=(x: Instantiable0[Keccak[`224` | `256` | `384` | `512`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA3Hash")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha3", "SHA3Hash")
  @js.native
  open class SHA3Hash[S /* <: `224` | `256` | `384` | `512` */] () extends Keccak[S]
  @JSImport("sha3", "SHA3Hash")
  @js.native
  val SHA3Hash: Instantiable0[Keccak[`224` | `256` | `384` | `512`]] = js.native
  
  @JSImport("sha3", "SHAKE")
  @js.native
  open class SHAKE[S /* <: `128` | `256` */] ()
    extends StObject
       with Hasher[S]
  
  trait DigestOptions[T] extends StObject {
    
    var buffer: js.UndefOr[Buffer] = js.undefined
    
    var format: T
    
    var padding: js.UndefOr[Double] = js.undefined
  }
  object DigestOptions {
    
    inline def apply[T](format: T): DigestOptions[T] = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigestOptions[T]]
    }
    
    extension [Self <: DigestOptions[?], T](x: Self & DigestOptions[T]) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setFormat(value: T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  @js.native
  trait Hasher[S] extends StObject {
    
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    def digest(options: DigestOptions[BufferEncoding]): String = js.native
    @JSName("digest")
    def digest_binary(encoding: binary): Buffer = js.native
    @JSName("digest")
    def digest_binary(options: DigestOptions[binary]): Buffer = js.native
    
    def reset(): this.type = js.native
    
    def update(data: String): this.type = js.native
    def update(data: String, encoding: BufferEncoding): this.type = js.native
    def update(data: Buffer): this.type = js.native
  }
}
