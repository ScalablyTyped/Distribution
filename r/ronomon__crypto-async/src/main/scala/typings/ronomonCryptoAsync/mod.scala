package typings.ronomonCryptoAsync

import typings.node.Buffer
import typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`0`
import typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  @JSImport("@ronomon/crypto-async", "cipher")
  @js.native
  def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* ciphertext */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ronomon/crypto-async", "cipher")
  @js.native
  def cipher(
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
  ): Unit = js.native
  
  @JSImport("@ronomon/crypto-async", "hash")
  @js.native
  def hash(
    algorithm: String,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hash */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("@ronomon/crypto-async", "hash")
  @js.native
  def hash(
    algorithm: String,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("@ronomon/crypto-async", "hmac")
  @js.native
  def hmac(
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
  ): Unit = js.native
  @JSImport("@ronomon/crypto-async", "hmac")
  @js.native
  def hmac(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hmac */ Buffer, Unit]
  ): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`0`
    - typings.ronomonCryptoAsync.ronomonCryptoAsyncNumbers.`1`
  */
  trait CipherDirection extends StObject
  object CipherDirection {
    
    @scala.inline
    def Decrypt: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Encrypt: `1` = 1.asInstanceOf[`1`]
  }
}
