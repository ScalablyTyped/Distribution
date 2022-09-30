package typings.ronomonCryptoAsync

import typings.node.bufferMod.global.Buffer
import typings.ronomonCryptoAsync.ronomonCryptoAsyncInts.`0`
import typings.ronomonCryptoAsync.ronomonCryptoAsyncInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ronomon/crypto-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ronomon/crypto-async", "CIPHER_BLOCK_MAX")
  @js.native
  val CIPHER_BLOCK_MAX: Double = js.native
  
  @JSImport("@ronomon/crypto-async", "E_AAD")
  @js.native
  val E_AAD: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_AAD_INVALID")
  @js.native
  val E_AAD_INVALID: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_AAD_OFFSET")
  @js.native
  val E_AAD_OFFSET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_AAD_RANGE")
  @js.native
  val E_AAD_RANGE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_AAD_SIZE")
  @js.native
  val E_AAD_SIZE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_ALGORITHM")
  @js.native
  val E_ALGORITHM: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_ALGORITHM_DISABLED")
  @js.native
  val E_ALGORITHM_DISABLED: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_ALGORITHM_UNKNOWN")
  @js.native
  val E_ALGORITHM_UNKNOWN: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_ARGUMENTS")
  @js.native
  val E_ARGUMENTS: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_BUFFER_LENGTH")
  @js.native
  val E_BUFFER_LENGTH: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_CALLBACK")
  @js.native
  val E_CALLBACK: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_CANCELLED")
  @js.native
  val E_CANCELLED: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_CORRUPT")
  @js.native
  val E_CORRUPT: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_ENCRYPT")
  @js.native
  val E_ENCRYPT: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_IV")
  @js.native
  val E_IV: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_IV_INVALID")
  @js.native
  val E_IV_INVALID: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_IV_OFFSET")
  @js.native
  val E_IV_OFFSET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_IV_RANGE")
  @js.native
  val E_IV_RANGE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_IV_SIZE")
  @js.native
  val E_IV_SIZE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_KEY")
  @js.native
  val E_KEY: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_KEY_INVALID")
  @js.native
  val E_KEY_INVALID: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_KEY_OFFSET")
  @js.native
  val E_KEY_OFFSET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_KEY_RANGE")
  @js.native
  val E_KEY_RANGE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_KEY_SIZE")
  @js.native
  val E_KEY_SIZE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_OOM")
  @js.native
  val E_OOM: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_SOURCE")
  @js.native
  val E_SOURCE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_SOURCE_OFFSET")
  @js.native
  val E_SOURCE_OFFSET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_SOURCE_RANGE")
  @js.native
  val E_SOURCE_RANGE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_SOURCE_SIZE")
  @js.native
  val E_SOURCE_SIZE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TAG")
  @js.native
  val E_TAG: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TAG_INVALID")
  @js.native
  val E_TAG_INVALID: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TAG_OFFSET")
  @js.native
  val E_TAG_OFFSET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TAG_RANGE")
  @js.native
  val E_TAG_RANGE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TAG_SIZE")
  @js.native
  val E_TAG_SIZE: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TARGET")
  @js.native
  val E_TARGET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TARGET_OFFSET")
  @js.native
  val E_TARGET_OFFSET: String = js.native
  
  @JSImport("@ronomon/crypto-async", "E_TARGET_RANGE")
  @js.native
  val E_TARGET_RANGE: String = js.native
  
  inline def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    aad: Buffer,
    tag: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* ciphertext */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cipher")(algorithm.asInstanceOf[js.Any], cipherDirection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], plaintext.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* ciphertext */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cipher")(algorithm.asInstanceOf[js.Any], cipherDirection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], plaintext.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    iv: Buffer,
    ivOffset: Double,
    ivSize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    aad: Buffer,
    aadOffset: Double,
    aadSize: Double,
    tag: Buffer,
    tagOffset: Double,
    tagSize: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cipher")(algorithm.asInstanceOf[js.Any], cipherDirection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], ivOffset.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceOffset.asInstanceOf[js.Any], sourceSize.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetOffset.asInstanceOf[js.Any], aad.asInstanceOf[js.Any], aadOffset.asInstanceOf[js.Any], aadSize.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], tagOffset.asInstanceOf[js.Any], tagSize.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    iv: Buffer,
    ivOffset: Double,
    ivSize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cipher")(algorithm.asInstanceOf[js.Any], cipherDirection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], ivOffset.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceOffset.asInstanceOf[js.Any], sourceSize.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetOffset.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hash(
    algorithm: String,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* hash */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(algorithm.asInstanceOf[js.Any], source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(
    algorithm: String,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(algorithm.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceOffset.asInstanceOf[js.Any], sourceSize.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetOffset.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hmac(
    algorithm: String,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* targetSize */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceOffset.asInstanceOf[js.Any], sourceSize.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetOffset.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hmac(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* hmac */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CipherDirection = CipherDirectionDecrypt | CipherDirectionEncrypt
  
  type CipherDirectionDecrypt = `0`
  
  type CipherDirectionEncrypt = `1`
}
