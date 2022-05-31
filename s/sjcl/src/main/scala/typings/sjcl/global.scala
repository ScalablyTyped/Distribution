package typings.sjcl

import org.scalablytyped.runtime.Shortcut
import typings.sjcl.mod.BigNumber
import typings.sjcl.mod.BigNumberStatic
import typings.sjcl.mod.BitArrayStatic
import typings.sjcl.mod.BitArray_
import typings.sjcl.mod.SjclArrayBufferModes
import typings.sjcl.mod.SjclCipher
import typings.sjcl.mod.SjclCiphers
import typings.sjcl.mod.SjclCodecs
import typings.sjcl.mod.SjclConvenienceDecryptor
import typings.sjcl.mod.SjclConvenienceEncryptor
import typings.sjcl.mod.SjclEllipticCurveCryptography
import typings.sjcl.mod.SjclEllipticalCurve
import typings.sjcl.mod.SjclEllipticalPoint
import typings.sjcl.mod.SjclExceptions
import typings.sjcl.mod.SjclHMAC
import typings.sjcl.mod.SjclHash
import typings.sjcl.mod.SjclHashStatic
import typings.sjcl.mod.SjclHashes
import typings.sjcl.mod.SjclJson
import typings.sjcl.mod.SjclKeyExchange
import typings.sjcl.mod.SjclMisc
import typings.sjcl.mod.SjclModes
import typings.sjcl.mod.SjclPointJacobian
import typings.sjcl.mod.SjclRandom
import typings.sjcl.mod.SjclRandomStatic
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object sjcl {
    
    @JSGlobal("sjcl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("sjcl.SjclECCPublicKey")
    @js.native
    class SjclECCPublicKey ()
      extends typings.sjcl.mod.SjclECCPublicKey
    
    @JSGlobal("sjcl.SjclECCSecretKey")
    @js.native
    class SjclECCSecretKey ()
      extends typings.sjcl.mod.SjclECCSecretKey
    
    @JSGlobal("sjcl.SjclECDSAPublicKey")
    @js.native
    class SjclECDSAPublicKey ()
      extends typings.sjcl.mod.SjclECDSAPublicKey
    
    @JSGlobal("sjcl.SjclECDSASecretKey")
    @js.native
    class SjclECDSASecretKey ()
      extends typings.sjcl.mod.SjclECDSASecretKey
    
    @JSGlobal("sjcl.SjclElGamalPublicKey")
    @js.native
    class SjclElGamalPublicKey ()
      extends typings.sjcl.mod.SjclElGamalPublicKey
    
    @JSGlobal("sjcl.SjclElGamalSecretKey")
    @js.native
    class SjclElGamalSecretKey ()
      extends typings.sjcl.mod.SjclElGamalSecretKey
    
    @JSGlobal("sjcl.SjclPRFFamily")
    @js.native
    class SjclPRFFamily ()
      extends typings.sjcl.mod.SjclPRFFamily
    
    @JSGlobal("sjcl.arrayBuffer")
    @js.native
    def arrayBuffer: SjclArrayBufferModes = js.native
    inline def arrayBuffer_=(x: SjclArrayBufferModes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.bitArray")
    @js.native
    def bitArray: BitArrayStatic = js.native
    inline def bitArray_=(x: BitArrayStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitArray")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("sjcl.bn")
    @js.native
    class bn ()
      extends StObject
         with BigNumber {
      def this(n: String) = this()
      def this(n: Double) = this()
      def this(n: BigNumber) = this()
    }
    @JSGlobal("sjcl.bn")
    @js.native
    def bn: BigNumberStatic = js.native
    inline def bn_=(x: BigNumberStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bn")(x.asInstanceOf[js.Any])
    
    object cipher extends Shortcut {
      
      @JSGlobal("sjcl.cipher")
      @js.native
      val ^ : SjclCiphers = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.cipher.aes")
      @js.native
      class aes protected ()
        extends StObject
           with SjclCipher {
        def this(key: js.Array[Double]) = this()
        
        /* CompleteClass */
        override def decrypt(data: js.Array[Double]): js.Array[Double] = js.native
        
        /* CompleteClass */
        override def encrypt(data: js.Array[Double]): js.Array[Double] = js.native
      }
      
      type _To = SjclCiphers
      
      /* This means you don't have to write `^`, but can instead just say `cipher.foo` */
      override def _to: SjclCiphers = ^
    }
    
    @JSGlobal("sjcl.codec")
    @js.native
    def codec: SjclCodecs = js.native
    inline def codec_=(x: SjclCodecs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codec")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.decrypt")
    @js.native
    def decrypt: SjclConvenienceDecryptor = js.native
    inline def decrypt_=(x: SjclConvenienceDecryptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(x.asInstanceOf[js.Any])
    
    object ecc extends Shortcut {
      
      @JSGlobal("sjcl.ecc")
      @js.native
      val ^ : SjclEllipticCurveCryptography = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.ecc.curve")
      @js.native
      class curve protected ()
        extends StObject
           with SjclEllipticalCurve {
        def this(Field: BigNumber, r: BigNumber, a: BigNumber, b: BigNumber, x: BigNumber, y: BigNumber) = this()
        
        /* CompleteClass */
        override def fromBits(bits: BitArray_): SjclEllipticalPoint = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.ecc.point")
      @js.native
      class point protected ()
        extends StObject
           with SjclEllipticalPoint {
        def this(curve: SjclEllipticalCurve) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
        
        /* CompleteClass */
        override def isValid(): Boolean = js.native
        
        /* CompleteClass */
        override def mult(k: BigNumber): SjclEllipticalPoint = js.native
        
        /* CompleteClass */
        override def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint = js.native
        
        /* CompleteClass */
        override def multiples(): js.Array[SjclEllipticalPoint] = js.native
        
        /* CompleteClass */
        override def negate(): SjclEllipticalPoint = js.native
        
        /* CompleteClass */
        override def toBits(): BitArray_ = js.native
        
        /* CompleteClass */
        override def toJac(): SjclPointJacobian = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.ecc.pointJac")
      @js.native
      class pointJac protected ()
        extends StObject
           with SjclPointJacobian {
        def this(curve: SjclEllipticalCurve) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: Unit, z: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber, z: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: Unit, z: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber, z: BigNumber) = this()
        
        /* CompleteClass */
        override def add(T: SjclEllipticalPoint): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def doubl(): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def isValid(): Boolean = js.native
        
        /* CompleteClass */
        override def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def negate(): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def toAffine(): SjclEllipticalPoint = js.native
      }
      
      type _To = SjclEllipticCurveCryptography
      
      /* This means you don't have to write `^`, but can instead just say `ecc.foo` */
      override def _to: SjclEllipticCurveCryptography = ^
    }
    
    @JSGlobal("sjcl.encrypt")
    @js.native
    def encrypt: SjclConvenienceEncryptor = js.native
    inline def encrypt_=(x: SjclConvenienceEncryptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(x.asInstanceOf[js.Any])
    
    object exception extends Shortcut {
      
      @JSGlobal("sjcl.exception")
      @js.native
      val ^ : SjclExceptions = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.bug")
      @js.native
      class bug protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* CompleteClass */
        var message: String = js.native
        
        /* CompleteClass */
        var name: String = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.corrupt")
      @js.native
      class corrupt protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* CompleteClass */
        var message: String = js.native
        
        /* CompleteClass */
        var name: String = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.invalid")
      @js.native
      class invalid protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* CompleteClass */
        var message: String = js.native
        
        /* CompleteClass */
        var name: String = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.notReady")
      @js.native
      class notReady protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* CompleteClass */
        var message: String = js.native
        
        /* CompleteClass */
        var name: String = js.native
      }
      
      type _To = SjclExceptions
      
      /* This means you don't have to write `^`, but can instead just say `exception.foo` */
      override def _to: SjclExceptions = ^
    }
    
    object hash extends Shortcut {
      
      @JSGlobal("sjcl.hash")
      @js.native
      val ^ : SjclHashes = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.ripemd160")
      @js.native
      class ripemd160 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.sha1")
      @js.native
      class sha1 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.sha256")
      @js.native
      class sha256 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.sha512")
      @js.native
      class sha512 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      type _To = SjclHashes
      
      /* This means you don't have to write `^`, but can instead just say `hash.foo` */
      override def _to: SjclHashes = ^
    }
    
    @JSGlobal("sjcl.json")
    @js.native
    def json: SjclJson = js.native
    inline def json_=(x: SjclJson): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.keyexchange")
    @js.native
    def keyexchange: SjclKeyExchange = js.native
    inline def keyexchange_=(x: SjclKeyExchange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyexchange")(x.asInstanceOf[js.Any])
    
    object misc extends Shortcut {
      
      @JSGlobal("sjcl.misc")
      @js.native
      val ^ : SjclMisc = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.misc.hmac")
      @js.native
      class hmac protected () extends SjclHMAC {
        def this(key: BitArray_) = this()
        def this(key: BitArray_, Hash: SjclHashStatic) = this()
      }
      
      type _To = SjclMisc
      
      /* This means you don't have to write `^`, but can instead just say `misc.foo` */
      override def _to: SjclMisc = ^
    }
    
    @JSGlobal("sjcl.mode")
    @js.native
    def mode: SjclModes = js.native
    inline def mode_=(x: SjclModes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("sjcl.prng")
    @js.native
    class prng protected ()
      extends StObject
         with SjclRandom {
      def this(defaultParanoia: Double) = this()
    }
    @JSGlobal("sjcl.prng")
    @js.native
    def prng: SjclRandomStatic = js.native
    inline def prng_=(x: SjclRandomStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prng")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.random")
    @js.native
    def random: SjclRandom = js.native
    inline def random_=(x: SjclRandom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("random")(x.asInstanceOf[js.Any])
  }
}
