package typings.sodiumNative

import typings.node.Buffer
import typings.sodiumNative.sodiumNativeNumbers.`-1`
import typings.sodiumNative.sodiumNativeNumbers.`0`
import typings.sodiumNative.sodiumNativeNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_ABYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfABYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(message: Buffer, nullValue: Null, ciphertext: Buffer, ad: Null, npub: Buffer, key: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_decrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecrypt(message: Buffer, nullValue: Null, ciphertext: Buffer, ad: Buffer, npub: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    message: Buffer,
    nullValue: Null,
    ciphertext: Buffer,
    mac: Buffer,
    ad: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_decrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    message: Buffer,
    nullValue: Null,
    ciphertext: Buffer,
    mac: Buffer,
    ad: Buffer,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(ciphertext: Buffer, message: Buffer, ad: Null, nullValue: Null, npub: Buffer, key: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_encrypt")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncrypt(ciphertext: Buffer, message: Buffer, ad: Buffer, nullValue: Null, npub: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    ad: Null,
    nullValue: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
  @js.native
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    ad: Buffer,
    nullValue: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_KEYBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_keygen")
  @js.native
  def cryptoAeadXchacha20poly1305IetfKeygen(key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_NPUBBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNPUBBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_NSECBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNSECBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_auth")
  @js.native
  def cryptoAuth(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_auth_BYTES")
  @js.native
  val cryptoAuthBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_auth_KEYBYTES")
  @js.native
  val cryptoAuthKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_auth_PRIMITIVE")
  @js.native
  val cryptoAuthPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_auth_verify")
  @js.native
  def cryptoAuthVerify(output: Buffer, input: Buffer, key: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_box_detached")
  @js.native
  def cryptoBoxDetached(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_box_easy")
  @js.native
  def cryptoBoxEasy(ciphertext: Buffer, message: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_box_keypair")
  @js.native
  def cryptoBoxKeypair(publicKey: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_box_MACBYTES")
  @js.native
  val cryptoBoxMACBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_NONCEBYTES")
  @js.native
  val cryptoBoxNONCEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_open_detached")
  @js.native
  def cryptoBoxOpenDetached(
    message: Buffer,
    ciphertext: Buffer,
    mac: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_box_open_easy")
  @js.native
  def cryptoBoxOpenEasy(message: Buffer, ciphertext: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_box_PRIMITIVE")
  @js.native
  val cryptoBoxPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_box_PUBLICKEYBYTES")
  @js.native
  val cryptoBoxPUBLICKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_SEALBYTES")
  @js.native
  val cryptoBoxSEALBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_SECRETKEYBYTES")
  @js.native
  val cryptoBoxSECRETKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_SEEDBYTES")
  @js.native
  val cryptoBoxSEEDBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_seal")
  @js.native
  def cryptoBoxSeal(ciphertext: Buffer, message: Buffer, publicKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_box_seal_open")
  @js.native
  def cryptoBoxSealOpen(message: Buffer, ciphertext: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_box_seed_keypair")
  @js.native
  def cryptoBoxSeedKeypair(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_add")
  @js.native
  def cryptoCoreEd25519Add(r: Buffer, p: Buffer, q: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_BYTES")
  @js.native
  val cryptoCoreEd25519BYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_from_uniform")
  @js.native
  def cryptoCoreEd25519FromUniform(p: Buffer, r: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_is_valid_point")
  @js.native
  def cryptoCoreEd25519IsValidPoint(p: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_NONREDUCEDSCALARBYTES")
  @js.native
  val cryptoCoreEd25519NONREDUCEDSCALARBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_SCALARBYTES")
  @js.native
  val cryptoCoreEd25519SCALARBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_add")
  @js.native
  def cryptoCoreEd25519ScalarAdd(z: Buffer, x: Buffer, y: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_complement")
  @js.native
  def cryptoCoreEd25519ScalarComplement(comp: Buffer, s: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_invert")
  @js.native
  def cryptoCoreEd25519ScalarInvert(recip: Buffer, s: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_negate")
  @js.native
  def cryptoCoreEd25519ScalarNegate(neg: Buffer, s: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_random")
  @js.native
  def cryptoCoreEd25519ScalarRandom(r: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_reduce")
  @js.native
  def cryptoCoreEd25519ScalarReduce(r: Buffer, s: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_scalar_sub")
  @js.native
  def cryptoCoreEd25519ScalarSub(z: Buffer, x: Buffer, y: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_sub")
  @js.native
  def cryptoCoreEd25519Sub(r: Buffer, p: Buffer, q: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_UNIFORMBYTES")
  @js.native
  val cryptoCoreEd25519UNIFORMBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash")
  @js.native
  def cryptoGenerichash(output: Buffer, input: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_generichash")
  @js.native
  def cryptoGenerichash(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_generichash_BYTES")
  @js.native
  val cryptoGenerichashBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_BYTES_MAX")
  @js.native
  val cryptoGenerichashBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_BYTES_MIN")
  @js.native
  val cryptoGenerichashBYTESMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_batch")
  @js.native
  def cryptoGenerichashBatch(output: Buffer, inputArray: js.Array[Buffer]): Unit = js.native
  @JSImport("sodium-native", "crypto_generichash_batch")
  @js.native
  def cryptoGenerichashBatch(output: Buffer, inputArray: js.Array[Buffer], key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_generichash_instance")
  @js.native
  def cryptoGenerichashInstance(): CryptoGenericHashWrap = js.native
  @JSImport("sodium-native", "crypto_generichash_instance")
  @js.native
  def cryptoGenerichashInstance(key: js.UndefOr[scala.Nothing], outputLength: Double): CryptoGenericHashWrap = js.native
  @JSImport("sodium-native", "crypto_generichash_instance")
  @js.native
  def cryptoGenerichashInstance(key: Buffer): CryptoGenericHashWrap = js.native
  @JSImport("sodium-native", "crypto_generichash_instance")
  @js.native
  def cryptoGenerichashInstance(key: Buffer, outputLength: Double): CryptoGenericHashWrap = js.native
  
  @JSImport("sodium-native", "crypto_generichash_KEYBYTES")
  @js.native
  val cryptoGenerichashKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_KEYBYTES_MAX")
  @js.native
  val cryptoGenerichashKEYBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_KEYBYTES_MIN")
  @js.native
  val cryptoGenerichashKEYBYTESMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_PRIMITIVE")
  @js.native
  val cryptoGenerichashPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_generichash_STATEBYTES")
  @js.native
  val cryptoGenerichashSTATEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_hash_BYTES")
  @js.native
  val cryptoHashBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_hash_PRIMITIVE")
  @js.native
  val cryptoHashPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha256")
  @js.native
  def cryptoHashSha256(output: Buffer, input: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha256_BYTES")
  @js.native
  val cryptoHashSha256BYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha256_instance")
  @js.native
  def cryptoHashSha256Instance(): CryptoHashSha256Wrap = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha256_STATEBYTES")
  @js.native
  val cryptoHashSha256STATEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha512")
  @js.native
  def cryptoHashSha512(output: Buffer, input: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha512_BYTES")
  @js.native
  val cryptoHashSha512BYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha512_instance")
  @js.native
  def cryptoHashSha512Instance(): CryptoHashSha512Wrap = js.native
  
  @JSImport("sodium-native", "crypto_hash_sha512_STATEBYTES")
  @js.native
  val cryptoHashSha512STATEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kdf_BYTES_MAX")
  @js.native
  val cryptoKdfBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_kdf_BYTES_MIN")
  @js.native
  val cryptoKdfBYTESMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_kdf_CONTEXTBYTES")
  @js.native
  val cryptoKdfCONTEXTBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kdf_derive_from_key")
  @js.native
  def cryptoKdfDeriveFromKey(subkey: Buffer, subkeyId: Double, context: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_kdf_KEYBYTES")
  @js.native
  val cryptoKdfKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kdf_keygen")
  @js.native
  def cryptoKdfKeygen(key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_kdf_PRIMITIVE")
  @js.native
  val cryptoKdfPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(rx: Null, tx: Null, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(rx: Null, tx: Buffer, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(rx: Buffer, tx: Null, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_kx_client_session_keys")
  @js.native
  def cryptoKxClientSessionKeys(rx: Buffer, tx: Buffer, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_kx_keypair")
  @js.native
  def cryptoKxKeypair(publicKey: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_kx_PRIMITIVE")
  @js.native
  val cryptoKxPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_kx_PUBLICKEYBYTES")
  @js.native
  val cryptoKxPUBLICKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kx_SECRETKEYBYTES")
  @js.native
  val cryptoKxSECRETKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kx_SEEDBYTES")
  @js.native
  val cryptoKxSEEDBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kx_SESSIONKEYBYTES")
  @js.native
  val cryptoKxSESSIONKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_kx_seed_keypair")
  @js.native
  def cryptoKxSeedKeypair(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(rx: Null, tx: Null, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(rx: Null, tx: Buffer, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(rx: Buffer, tx: Null, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_kx_server_session_keys")
  @js.native
  def cryptoKxServerSessionKeys(rx: Buffer, tx: Buffer, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth")
  @js.native
  def cryptoOnetimeauth(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_BYTES")
  @js.native
  val cryptoOnetimeauthBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_instance")
  @js.native
  def cryptoOnetimeauthInstance(key: Buffer): CryptoOneTimeAuthWrap = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_KEYBYTES")
  @js.native
  val cryptoOnetimeauthKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_PRIMITIVE")
  @js.native
  val cryptoOnetimeauthPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_STATEBYTES")
  @js.native
  val cryptoOnetimeauthSTATEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_verify")
  @js.native
  def cryptoOnetimeauthVerify(output: Buffer, input: Buffer, key: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_pwhash")
  @js.native
  def cryptoPwhash(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_ALG_ARGON2I13")
  @js.native
  val cryptoPwhashALGARGON2I13: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_ALG_ARGON2ID13")
  @js.native
  val cryptoPwhashALGARGON2ID13: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_ALG_DEFAULT")
  @js.native
  val cryptoPwhashALGDEFAULT: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_async")
  @js.native
  def cryptoPwhashAsync(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_BYTES_MAX")
  @js.native
  val cryptoPwhashBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_BYTES_MIN")
  @js.native
  val cryptoPwhashBYTESMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_MEMLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashMEMLIMITINTERACTIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_MEMLIMIT_MAX")
  @js.native
  val cryptoPwhashMEMLIMITMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_MEMLIMIT_MIN")
  @js.native
  val cryptoPwhashMEMLIMITMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_MEMLIMIT_MODERATE")
  @js.native
  val cryptoPwhashMEMLIMITMODERATE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_MEMLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashMEMLIMITSENSITIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_OPSLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashOPSLIMITINTERACTIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_OPSLIMIT_MAX")
  @js.native
  val cryptoPwhashOPSLIMITMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_OPSLIMIT_MIN")
  @js.native
  val cryptoPwhashOPSLIMITMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_OPSLIMIT_MODERATE")
  @js.native
  val cryptoPwhashOPSLIMITMODERATE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_OPSLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashOPSLIMITSENSITIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_PASSWD_MAX")
  @js.native
  val cryptoPwhashPASSWDMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_PASSWD_MIN")
  @js.native
  val cryptoPwhashPASSWDMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_PRIMITIVE")
  @js.native
  val cryptoPwhashPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_SALTBYTES")
  @js.native
  val cryptoPwhashSALTBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_STRBYTES")
  @js.native
  val cryptoPwhashSTRBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_STRPREFIX")
  @js.native
  val cryptoPwhashSTRPREFIX: String = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_BYTES_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256BYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_BYTES_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256BYTESMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITINTERACTIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_MEMLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256MEMLIMITSENSITIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_INTERACTIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITINTERACTIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_OPSLIMIT_SENSITIVE")
  @js.native
  val cryptoPwhashScryptsalsa208sha256OPSLIMITSENSITIVE: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_PASSWD_MAX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256PASSWDMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_PASSWD_MIN")
  @js.native
  val cryptoPwhashScryptsalsa208sha256PASSWDMIN: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_SALTBYTES")
  @js.native
  val cryptoPwhashScryptsalsa208sha256SALTBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_STRBYTES")
  @js.native
  val cryptoPwhashScryptsalsa208sha256STRBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_scryptsalsa208sha256_STRPREFIX")
  @js.native
  val cryptoPwhashScryptsalsa208sha256STRPREFIX: String = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_str")
  @js.native
  def cryptoPwhashStr(output: Buffer, password: Buffer, opslimit: Double, memlimit: Double): Unit = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_str_async")
  @js.native
  def cryptoPwhashStrAsync(
    output: Buffer,
    password: Buffer,
    opslimit: Double,
    memlimit: Double,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_str_needs_rehash")
  @js.native
  def cryptoPwhashStrNeedsRehash(hash: Buffer, opslimit: Double, memlimit: Double): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_str_verify")
  @js.native
  def cryptoPwhashStrVerify(str: Buffer, password: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_str_verify_async")
  @js.native
  def cryptoPwhashStrVerifyAsync(
    str: Buffer,
    password: Buffer,
    callback: js.Function2[/* err */ Error | Null, /* bool */ Boolean, Unit]
  ): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult")
  @js.native
  def cryptoScalarmult(sharedSecret: Buffer, secretKey: Buffer, remotePublicKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_BYTES")
  @js.native
  val cryptoScalarmultBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_base")
  @js.native
  def cryptoScalarmultBase(publicKey: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519")
  @js.native
  def cryptoScalarmultEd25519(q: Buffer, n: Buffer, p: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_BYTES")
  @js.native
  val cryptoScalarmultEd25519BYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_base")
  @js.native
  def cryptoScalarmultEd25519Base(q: Buffer, n: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_base_noclamp")
  @js.native
  def cryptoScalarmultEd25519BaseNoclamp(q: Buffer, n: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_noclamp")
  @js.native
  def cryptoScalarmultEd25519Noclamp(q: Buffer, n: Buffer, p: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_SCALARBYTES")
  @js.native
  val cryptoScalarmultEd25519SCALARBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_PRIMITIVE")
  @js.native
  val cryptoScalarmultPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_SCALARBYTES")
  @js.native
  val cryptoScalarmultSCALARBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_detached")
  @js.native
  def cryptoSecretboxDetached(ciphertext: Buffer, mac: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_easy")
  @js.native
  def cryptoSecretboxEasy(ciphertext: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_KEYBYTES")
  @js.native
  val cryptoSecretboxKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_MACBYTES")
  @js.native
  val cryptoSecretboxMACBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_NONCEBYTES")
  @js.native
  val cryptoSecretboxNONCEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_open_detached")
  @js.native
  def cryptoSecretboxOpenDetached(message: Buffer, ciphertext: Buffer, mac: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_open_easy")
  @js.native
  def cryptoSecretboxOpenEasy(message: Buffer, ciphertext: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_PRIMITIVE")
  @js.native
  val cryptoSecretboxPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_ABYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305ABYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_HEADERBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305HEADERBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_init_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305InitPull(state: Xchacha20poly1305State, header: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_init_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305InitPush(state: Xchacha20poly1305State, header: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_KEYBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305KEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state: Xchacha20poly1305State, message: Buffer, tag: Buffer, ciphertext: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_pull")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Pull(state: Xchacha20poly1305State, message: Buffer, tag: Buffer, ciphertext: Buffer, ad: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state: Xchacha20poly1305State, ciphertext: Buffer, message: Buffer, ad: Null, tag: Buffer): Unit = js.native
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_push")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Push(state: Xchacha20poly1305State, ciphertext: Buffer, message: Buffer, ad: Buffer, tag: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_rekey")
  @js.native
  def cryptoSecretstreamXchacha20poly1305Rekey(state: Xchacha20poly1305State): Unit = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_state_new")
  @js.native
  def cryptoSecretstreamXchacha20poly1305StateNew(): Xchacha20poly1305State = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_TAGBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_TAG_FINAL")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGFINAL: Buffer = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_TAG_MESSAGE")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGMESSAGE: Buffer = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_TAG_PUSH")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGPUSH: Buffer = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_TAG_REKEY")
  @js.native
  val cryptoSecretstreamXchacha20poly1305TAGREKEY: Buffer = js.native
  
  @JSImport("sodium-native", "crypto_shorthash")
  @js.native
  def cryptoShorthash(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_shorthash_BYTES")
  @js.native
  val cryptoShorthashBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_shorthash_KEYBYTES")
  @js.native
  val cryptoShorthashKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_shorthash_PRIMITIVE")
  @js.native
  val cryptoShorthashPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_sign")
  @js.native
  def cryptoSign(signedMessage: Buffer, message: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_BYTES")
  @js.native
  val cryptoSignBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_sign_detached")
  @js.native
  def cryptoSignDetached(signature: Buffer, message: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_ed25519_pk_to_curve25519")
  @js.native
  def cryptoSignEd25519PkToCurve25519(curve_pk: Buffer, ed_pk: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_ed25519_sk_to_curve25519")
  @js.native
  def cryptoSignEd25519SkToCurve25519(curve_sk: Buffer, ed_sk: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_ed25519_sk_to_pk")
  @js.native
  def cryptoSignEd25519SkToPk(pk: Buffer, sk: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_keypair")
  @js.native
  def cryptoSignKeypair(publicKey: Buffer, secretKey: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_open")
  @js.native
  def cryptoSignOpen(message: Buffer, signedMessage: Buffer, publicKey: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_sign_PUBLICKEYBYTES")
  @js.native
  val cryptoSignPUBLICKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_sign_SECRETKEYBYTES")
  @js.native
  val cryptoSignSECRETKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_sign_SEEDBYTES")
  @js.native
  val cryptoSignSEEDBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_sign_seed_keypair")
  @js.native
  def cryptoSignSeedKeypair(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_sign_verify_detached")
  @js.native
  def cryptoSignVerifyDetached(signature: Buffer, message: Buffer, publicKey: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "crypto_stream")
  @js.native
  def cryptoStream(ciphertext: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_stream_chacha20_KEYBYTES")
  @js.native
  val cryptoStreamChacha20KEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_stream_chacha20_NONCEBYTES")
  @js.native
  val cryptoStreamChacha20NONCEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_stream_chacha20_xor")
  @js.native
  def cryptoStreamChacha20Xor(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_stream_chacha20_xor_instance")
  @js.native
  def cryptoStreamChacha20XorInstance(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = js.native
  
  @JSImport("sodium-native", "crypto_stream_chacha20_xor_STATEBYTES")
  @js.native
  val cryptoStreamChacha20XorSTATEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_stream_KEYBYTES")
  @js.native
  val cryptoStreamKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_stream_NONCEBYTES")
  @js.native
  val cryptoStreamNONCEBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_stream_PRIMITIVE")
  @js.native
  val cryptoStreamPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_stream_xor")
  @js.native
  def cryptoStreamXor(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "crypto_stream_xor_instance")
  @js.native
  def cryptoStreamXorInstance(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = js.native
  
  @JSImport("sodium-native", "crypto_stream_xor_STATEBYTES")
  @js.native
  val cryptoStreamXorSTATEBYTES: Double = js.native
  
  @JSImport("sodium-native", "randombytes_buf")
  @js.native
  def randombytesBuf(buffer: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "randombytes_buf_deterministic")
  @js.native
  def randombytesBufDeterministic(buffer: Buffer, seed: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "randombytes_random")
  @js.native
  def randombytesRandom(): Double = js.native
  
  @JSImport("sodium-native", "randombytes_SEEDBYTES")
  @js.native
  val randombytesSEEDBYTES: Double = js.native
  
  @JSImport("sodium-native", "randombytes_uniform")
  @js.native
  def randombytesUniform(upper_bound: Double): Double = js.native
  
  @JSImport("sodium-native", "sodium_add")
  @js.native
  def sodiumAdd(a: Buffer, b: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_compare")
  @js.native
  def sodiumCompare(b1: Buffer, b2: Buffer): `1` | `0` | `-1` = js.native
  
  @JSImport("sodium-native", "sodium_increment")
  @js.native
  def sodiumIncrement(buf: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_is_zero")
  @js.native
  def sodiumIsZero(buf: Buffer, len: Double): Boolean = js.native
  
  @JSImport("sodium-native", "sodium_malloc")
  @js.native
  def sodiumMalloc(size: Double): SecureBuffer = js.native
  
  @JSImport("sodium-native", "sodium_memcmp")
  @js.native
  def sodiumMemcmp(b1: Buffer, b2: Buffer): Boolean = js.native
  
  @JSImport("sodium-native", "sodium_memzero")
  @js.native
  def sodiumMemzero(buffer: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_mlock")
  @js.native
  def sodiumMlock(buffer: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_mprotect_noaccess")
  @js.native
  def sodiumMprotectNoaccess(buffer: SecureBuffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_mprotect_readonly")
  @js.native
  def sodiumMprotectReadonly(buffer: SecureBuffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_mprotect_readwrite")
  @js.native
  def sodiumMprotectReadwrite(buffer: SecureBuffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_munlock")
  @js.native
  def sodiumMunlock(buffer: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_pad")
  @js.native
  def sodiumPad(buf: Buffer, unpaddedLength: Double, blocksize: Double): Double = js.native
  
  @JSImport("sodium-native", "sodium_sub")
  @js.native
  def sodiumSub(a: Buffer, b: Buffer): Unit = js.native
  
  @JSImport("sodium-native", "sodium_unpad")
  @js.native
  def sodiumUnpad(buf: Buffer, paddedLength: Double, blocksize: Double): Double = js.native
  
  @js.native
  trait CryptoGenericHashWrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer as above with the same length you gave when creating the instance.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit = js.native
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit = js.native
  }
  object CryptoGenericHashWrap {
    
    @scala.inline
    def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoGenericHashWrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoGenericHashWrap]
    }
    
    @scala.inline
    implicit class CryptoGenericHashWrapMutableBuilder[Self <: CryptoGenericHashWrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CryptoHashSha256Wrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer of length `crypto_hash_sha256_BYTES`.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit = js.native
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit = js.native
  }
  object CryptoHashSha256Wrap {
    
    @scala.inline
    def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoHashSha256Wrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoHashSha256Wrap]
    }
    
    @scala.inline
    implicit class CryptoHashSha256WrapMutableBuilder[Self <: CryptoHashSha256Wrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CryptoHashSha512Wrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer of length `crypto_hash_sha512_BYTES`.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit = js.native
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit = js.native
  }
  object CryptoHashSha512Wrap {
    
    @scala.inline
    def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoHashSha512Wrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoHashSha512Wrap]
    }
    
    @scala.inline
    implicit class CryptoHashSha512WrapMutableBuilder[Self <: CryptoHashSha512Wrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CryptoOneTimeAuthWrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer of length `crypto_onetimeauth_BYTES`.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit = js.native
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit = js.native
  }
  object CryptoOneTimeAuthWrap {
    
    @scala.inline
    def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoOneTimeAuthWrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoOneTimeAuthWrap]
    }
    
    @scala.inline
    implicit class CryptoOneTimeAuthWrapMutableBuilder[Self <: CryptoOneTimeAuthWrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CryptoStreamChacha20XorWrap extends StObject {
    
    /**
      * Finalize the stream. Zeros out internal state.
      */
    def `final`(): Unit = js.native
    
    /**
      * Encrypt the next message
      */
    def update(ciphertext: Buffer, message: Buffer): Unit = js.native
  }
  object CryptoStreamChacha20XorWrap {
    
    @scala.inline
    def apply(`final`: () => Unit, update: (Buffer, Buffer) => Unit): CryptoStreamChacha20XorWrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[CryptoStreamChacha20XorWrap]
    }
    
    @scala.inline
    implicit class CryptoStreamChacha20XorWrapMutableBuilder[Self <: CryptoStreamChacha20XorWrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: () => Unit): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: (Buffer, Buffer) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SecureBuffer extends Buffer {
    
    /**
      * To check if a `buffer` is a "secure" `buffer`, you can access the getter `buffer.secure` which will be `true`.
      */
    var secure: Boolean = js.native
  }
  
  @js.native
  trait Xchacha20poly1305State extends StObject {
    
    var _pad: Buffer = js.native
    
    var k: Buffer = js.native
    
    var nonce: Buffer = js.native
  }
  object Xchacha20poly1305State {
    
    @scala.inline
    def apply(_pad: Buffer, k: Buffer, nonce: Buffer): Xchacha20poly1305State = {
      val __obj = js.Dynamic.literal(_pad = _pad.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xchacha20poly1305State]
    }
    
    @scala.inline
    implicit class Xchacha20poly1305StateMutableBuilder[Self <: Xchacha20poly1305State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setK(value: Buffer): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pad(value: Buffer): Self = StObject.set(x, "_pad", value.asInstanceOf[js.Any])
    }
  }
}
