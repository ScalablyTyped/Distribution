package typings.ronomonCryptoAsync

import typings.node.Buffer
import typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`0`
import typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  @JSImport("@ronomon/crypto-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* ciphertext */ Buffer, Unit]
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
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cipher")(algorithm.asInstanceOf[js.Any], cipherDirection.asInstanceOf[js.Any], key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], ivOffset.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceOffset.asInstanceOf[js.Any], sourceSize.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetOffset.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hash(
    algorithm: String,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hash */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(algorithm.asInstanceOf[js.Any], source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(
    algorithm: String,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
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
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], keyOffset.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], source.asInstanceOf[js.Any], sourceOffset.asInstanceOf[js.Any], sourceSize.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetOffset.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hmac(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hmac */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`0`
    - typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`1`
  */
  trait CipherDirection extends StObject
  object CipherDirection {
    
    inline def Decrypt: `0` = 0.asInstanceOf[`0`]
    
    inline def Encrypt: `1` = 1.asInstanceOf[`1`]
  }
}
