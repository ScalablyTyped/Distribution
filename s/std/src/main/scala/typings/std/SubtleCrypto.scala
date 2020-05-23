package typings.std

import typings.std.stdStrings.jwk
import typings.std.stdStrings.pkcs8
import typings.std.stdStrings.raw
import typings.std.stdStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto). */
@js.native
trait SubtleCrypto extends js.Object {
  def decrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def decrypt(
    algorithm: AlgorithmIdentifier,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def decrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: ConcatParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: DhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfCtrParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier | EcdhKeyDeriveParams | DhKeyDeriveParams | ConcatParams | HkdfCtrParams | Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String | AesDerivedKeyParams | HmacImportParams | ConcatParams | HkdfCtrParams | Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def digest(
    algorithm: AlgorithmIdentifier,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: AlgorithmIdentifier,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def exportKey(format: java.lang.String, key: CryptoKey): js.Thenable[JsonWebKey | ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: CryptoKey): js.Thenable[JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkcs8, key: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: raw, key: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: spki, key: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def generateKey(algorithm: AesKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKey] = js.native
  def generateKey(algorithm: AlgorithmIdentifier, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKeyPair | CryptoKey] = js.native
  def generateKey(algorithm: DhKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKeyPair] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKey] = js.native
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Thenable[CryptoKeyPair] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def sign(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def sign(
    algorithm: EcdsaParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def sign(
    algorithm: RsaPssParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
  def unwrapKey(
    format: raw | pkcs8 | spki | jwk | java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | DhImportKeyParams | AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Thenable[CryptoKey] = js.native
  def verify(
    algorithm: AesCmacParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: AlgorithmIdentifier,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: EcdsaParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: RsaPssParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk | java.lang.String,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams
  ): js.Thenable[ArrayBuffer] = js.native
}

