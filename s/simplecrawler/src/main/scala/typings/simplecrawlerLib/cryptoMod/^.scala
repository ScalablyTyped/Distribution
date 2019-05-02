package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DEFAULT_ENCODING: java.lang.String = js.native
  var fips: scala.Boolean = js.native
  def createCipher(algorithm: java.lang.String, password: js.Any): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: js.Any, iv: js.Any): Cipher = js.native
  def createCredentials(details: CredentialDetails): Credentials = js.native
  def createDecipher(algorithm: java.lang.String, password: js.Any): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: js.Any, iv: js.Any): Decipher = js.native
  def createDiffieHellman(prime_length: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: simplecrawlerLib.Buffer
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: simplecrawlerLib.Buffer): DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): ECDH = js.native
  def createHash(algorithm: java.lang.String): Hash = js.native
  def createHmac(algorithm: java.lang.String, key: java.lang.String): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: simplecrawlerLib.Buffer): Hmac = js.native
  def createSign(algorithm: java.lang.String): Signer = js.native
  def createVerify(algorith: java.lang.String): Verify = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
  def getCurves(): js.Array[java.lang.String] = js.native
  def getDiffieHellman(group_name: java.lang.String): DiffieHellman = js.native
  def getHashes(): js.Array[java.lang.String] = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* derivedKey */ simplecrawlerLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: simplecrawlerLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* derivedKey */ simplecrawlerLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: simplecrawlerLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* derivedKey */ simplecrawlerLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: simplecrawlerLib.Buffer,
    salt: simplecrawlerLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* derivedKey */ simplecrawlerLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): simplecrawlerLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: simplecrawlerLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): simplecrawlerLib.Buffer = js.native
  def pbkdf2Sync(
    password: simplecrawlerLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): simplecrawlerLib.Buffer = js.native
  def pbkdf2Sync(
    password: simplecrawlerLib.Buffer,
    salt: simplecrawlerLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): simplecrawlerLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): simplecrawlerLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ simplecrawlerLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def publicDecrypt(public_key: RsaPublicKey, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def publicEncrypt(public_key: RsaPublicKey, buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def randomBytes(size: scala.Double): simplecrawlerLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ simplecrawlerLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: simplecrawlerLib.Buffer,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ simplecrawlerLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ simplecrawlerLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: simplecrawlerLib.Buffer,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ simplecrawlerLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync(buffer: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def randomFillSync(buffer: simplecrawlerLib.Buffer, offset: scala.Double): simplecrawlerLib.Buffer = js.native
  def randomFillSync(buffer: simplecrawlerLib.Buffer, offset: scala.Double, size: scala.Double): simplecrawlerLib.Buffer = js.native
  def randomFillSync(buffer: stdLib.Uint8Array): simplecrawlerLib.Buffer = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double): simplecrawlerLib.Buffer = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double, size: scala.Double): simplecrawlerLib.Buffer = js.native
  def timingSafeEqual(a: simplecrawlerLib.Buffer, b: simplecrawlerLib.Buffer): scala.Boolean = js.native
}

