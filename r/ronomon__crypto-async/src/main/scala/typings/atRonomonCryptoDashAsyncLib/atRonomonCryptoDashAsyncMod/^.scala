package typings
package atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ronomon/crypto-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cipher(
    algorithm: java.lang.String,
    cipherDirection: atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod.CipherDirection,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    plaintext: nodeLib.Buffer,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* ciphertext */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def cipher(
    algorithm: java.lang.String,
    cipherDirection: atRonomonCryptoDashAsyncLib.atRonomonCryptoDashAsyncMod.CipherDirection,
    key: nodeLib.Buffer,
    keyOffset: scala.Double,
    keySize: scala.Double,
    iv: nodeLib.Buffer,
    ivOffset: scala.Double,
    ivSize: scala.Double,
    source: nodeLib.Buffer,
    sourceOffset: scala.Double,
    sourceSize: scala.Double,
    target: nodeLib.Buffer,
    targetOffset: scala.Double,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* targetSize */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    algorithm: java.lang.String,
    source: nodeLib.Buffer,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* hash */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def hash(
    algorithm: java.lang.String,
    source: nodeLib.Buffer,
    sourceOffset: scala.Double,
    sourceSize: scala.Double,
    target: nodeLib.Buffer,
    targetOffset: scala.Double,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* targetSize */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hmac(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    keyOffset: scala.Double,
    keySize: scala.Double,
    source: nodeLib.Buffer,
    sourceOffset: scala.Double,
    sourceSize: scala.Double,
    target: nodeLib.Buffer,
    targetOffset: scala.Double,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* targetSize */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hmac(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    source: nodeLib.Buffer,
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* hmac */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

