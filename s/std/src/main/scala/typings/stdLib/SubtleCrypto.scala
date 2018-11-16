package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubtleCrypto extends js.Object {
  def decrypt(
    algorithm: java.lang.String,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def decrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def deriveBits(algorithm: java.lang.String, baseKey: CryptoKey, length: scala.Double): PromiseLike[ArrayBuffer] = js.native
  def deriveBits(algorithm: ConcatParams, baseKey: CryptoKey, length: scala.Double): PromiseLike[ArrayBuffer] = js.native
  def deriveBits(algorithm: DhKeyDeriveParams, baseKey: CryptoKey, length: scala.Double): PromiseLike[ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: scala.Double): PromiseLike[ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfCtrParams, baseKey: CryptoKey, length: scala.Double): PromiseLike[ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: scala.Double): PromiseLike[ArrayBuffer] = js.native
  def deriveKey(
    algorithm: java.lang.String | EcdhKeyDeriveParams | DhKeyDeriveParams | ConcatParams | HkdfCtrParams | Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String | AesDerivedKeyParams | HmacImportParams | ConcatParams | HkdfCtrParams | Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def digest(
    algorithm: java.lang.String,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def digest(
    algorithm: Algorithm,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: java.lang.String,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def encrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def exportKey(format: java.lang.String, key: CryptoKey): PromiseLike[JsonWebKey | ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: stdLib.stdLibStrings.jwk, key: CryptoKey): PromiseLike[JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: stdLib.stdLibStrings.pkcs8, key: CryptoKey): PromiseLike[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: stdLib.stdLibStrings.raw, key: CryptoKey): PromiseLike[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: stdLib.stdLibStrings.spki, key: CryptoKey): PromiseLike[ArrayBuffer] = js.native
  def generateKey(algorithm: java.lang.String, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): PromiseLike[CryptoKeyPair | CryptoKey] = js.native
  def generateKey(algorithm: AesKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): PromiseLike[CryptoKey] = js.native
  def generateKey(algorithm: DhKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): PromiseLike[CryptoKeyPair] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): PromiseLike[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): PromiseLike[CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): PromiseLike[CryptoKey] = js.native
  def generateKey(
    algorithm: RsaHashedKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKeyPair] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: stdLib.stdLibStrings.jwk,
    keyData: JsonWebKey,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: stdLib.stdLibStrings.jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: stdLib.stdLibStrings.jwk,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: stdLib.stdLibStrings.jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: stdLib.stdLibStrings.jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: stdLib.stdLibStrings.jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: stdLib.stdLibStrings.pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: stdLib.stdLibStrings.pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: stdLib.stdLibStrings.pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: stdLib.stdLibStrings.pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: stdLib.stdLibStrings.pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: stdLib.stdLibStrings.pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: stdLib.stdLibStrings.raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: stdLib.stdLibStrings.raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: stdLib.stdLibStrings.raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: stdLib.stdLibStrings.raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: stdLib.stdLibStrings.raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: stdLib.stdLibStrings.raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: stdLib.stdLibStrings.spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: stdLib.stdLibStrings.spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: stdLib.stdLibStrings.spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: stdLib.stdLibStrings.spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: stdLib.stdLibStrings.spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: stdLib.stdLibStrings.spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def sign(
    algorithm: java.lang.String,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def sign(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def sign(
    algorithm: EcdsaParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def sign(
    algorithm: RsaPssParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[ArrayBuffer] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): PromiseLike[CryptoKey] = js.native
  def verify(
    algorithm: java.lang.String,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[scala.Boolean] = js.native
  def verify(
    algorithm: AesCmacParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[scala.Boolean] = js.native
  def verify(
    algorithm: EcdsaParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[scala.Boolean] = js.native
  def verify(
    algorithm: RsaPssParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): PromiseLike[scala.Boolean] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: java.lang.String): PromiseLike[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: Algorithm): PromiseLike[ArrayBuffer] = js.native
}

@JSGlobal("SubtleCrypto")
@js.native
object SubtleCrypto
  extends ScalablyTyped.runtime.Instantiable0[SubtleCrypto]

