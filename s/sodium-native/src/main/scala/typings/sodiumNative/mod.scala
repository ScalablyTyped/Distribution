package typings.sodiumNative

import typings.node.Buffer
import typings.sodiumNative.sodiumNativeNumbers.`-1`
import typings.sodiumNative.sodiumNativeNumbers.`0`
import typings.sodiumNative.sodiumNativeNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sodium-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_ABYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfABYTES: Double = js.native
  
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(message: Buffer, nullValue: Null, ciphertext: Buffer, ad: Null, npub: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(message.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoAeadXchacha20poly1305IetfDecrypt(message: Buffer, nullValue: Null, ciphertext: Buffer, ad: Buffer, npub: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(message.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    message: Buffer,
    nullValue: Null,
    ciphertext: Buffer,
    mac: Buffer,
    ad: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(message.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    message: Buffer,
    nullValue: Null,
    ciphertext: Buffer,
    mac: Buffer,
    ad: Buffer,
    npub: Buffer,
    key: Buffer
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(message.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(ciphertext: Buffer, message: Buffer, ad: Null, nullValue: Null, npub: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoAeadXchacha20poly1305IetfEncrypt(ciphertext: Buffer, message: Buffer, ad: Buffer, nullValue: Null, npub: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    ad: Null,
    nullValue: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    ad: Buffer,
    nullValue: Null,
    npub: Buffer,
    key: Buffer
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any], npub.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_KEYBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfKEYBYTES: Double = js.native
  
  inline def cryptoAeadXchacha20poly1305IetfKeygen(key: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX")
  @js.native
  val cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_NPUBBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNPUBBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_aead_xchacha20poly1305_ietf_NSECBYTES")
  @js.native
  val cryptoAeadXchacha20poly1305IetfNSECBYTES: Double = js.native
  
  inline def cryptoAuth(output: Buffer, input: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_auth_BYTES")
  @js.native
  val cryptoAuthBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_auth_KEYBYTES")
  @js.native
  val cryptoAuthKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_auth_PRIMITIVE")
  @js.native
  val cryptoAuthPRIMITIVE: String = js.native
  
  inline def cryptoAuthVerify(output: Buffer, input: Buffer, key: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoBoxDetached(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoBoxEasy(ciphertext: Buffer, message: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoBoxKeypair(publicKey: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_box_MACBYTES")
  @js.native
  val cryptoBoxMACBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_box_NONCEBYTES")
  @js.native
  val cryptoBoxNONCEBYTES: Double = js.native
  
  inline def cryptoBoxOpenDetached(
    message: Buffer,
    ciphertext: Buffer,
    mac: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(message.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoBoxOpenEasy(message: Buffer, ciphertext: Buffer, nonce: Buffer, publicKey: Buffer, secretKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(message.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  
  inline def cryptoBoxSeal(ciphertext: Buffer, message: Buffer, publicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoBoxSealOpen(message: Buffer, ciphertext: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(message.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoBoxSeedKeypair(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519Add(r: Buffer, p: Buffer, q: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_add")(r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_core_ed25519_BYTES")
  @js.native
  val cryptoCoreEd25519BYTES: Double = js.native
  
  inline def cryptoCoreEd25519FromUniform(p: Buffer, r: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_from_uniform")(p.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519IsValidPoint(p: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_is_valid_point")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("sodium-native", "crypto_core_ed25519_NONREDUCEDSCALARBYTES")
  @js.native
  val cryptoCoreEd25519NONREDUCEDSCALARBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_core_ed25519_SCALARBYTES")
  @js.native
  val cryptoCoreEd25519SCALARBYTES: Double = js.native
  
  inline def cryptoCoreEd25519ScalarAdd(z: Buffer, x: Buffer, y: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_add")(z.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519ScalarComplement(comp: Buffer, s: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_complement")(comp.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519ScalarInvert(recip: Buffer, s: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_invert")(recip.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519ScalarNegate(neg: Buffer, s: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_negate")(neg.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519ScalarRandom(r: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_random")(r.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519ScalarReduce(r: Buffer, s: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_reduce")(r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519ScalarSub(z: Buffer, x: Buffer, y: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_scalar_sub")(z.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoCoreEd25519Sub(r: Buffer, p: Buffer, q: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_core_ed25519_sub")(r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_core_ed25519_UNIFORMBYTES")
  @js.native
  val cryptoCoreEd25519UNIFORMBYTES: Double = js.native
  
  inline def cryptoGenerichash(output: Buffer, input: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoGenerichash(output: Buffer, input: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_generichash_BYTES")
  @js.native
  val cryptoGenerichashBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_BYTES_MAX")
  @js.native
  val cryptoGenerichashBYTESMAX: Double = js.native
  
  @JSImport("sodium-native", "crypto_generichash_BYTES_MIN")
  @js.native
  val cryptoGenerichashBYTESMIN: Double = js.native
  
  inline def cryptoGenerichashBatch(output: Buffer, inputArray: js.Array[Buffer]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_batch")(output.asInstanceOf[js.Any], inputArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoGenerichashBatch(output: Buffer, inputArray: js.Array[Buffer], key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_batch")(output.asInstanceOf[js.Any], inputArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoGenerichashInstance(): CryptoGenericHashWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_instance")().asInstanceOf[CryptoGenericHashWrap]
  inline def cryptoGenerichashInstance(key: Unit, outputLength: Double): CryptoGenericHashWrap = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_instance")(key.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any])).asInstanceOf[CryptoGenericHashWrap]
  inline def cryptoGenerichashInstance(key: Buffer): CryptoGenericHashWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_instance")(key.asInstanceOf[js.Any]).asInstanceOf[CryptoGenericHashWrap]
  inline def cryptoGenerichashInstance(key: Buffer, outputLength: Double): CryptoGenericHashWrap = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_instance")(key.asInstanceOf[js.Any], outputLength.asInstanceOf[js.Any])).asInstanceOf[CryptoGenericHashWrap]
  
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
  
  inline def cryptoHashSha256(output: Buffer, input: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_hash_sha256_BYTES")
  @js.native
  val cryptoHashSha256BYTES: Double = js.native
  
  inline def cryptoHashSha256Instance(): CryptoHashSha256Wrap = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha256_instance")().asInstanceOf[CryptoHashSha256Wrap]
  
  @JSImport("sodium-native", "crypto_hash_sha256_STATEBYTES")
  @js.native
  val cryptoHashSha256STATEBYTES: Double = js.native
  
  inline def cryptoHashSha512(output: Buffer, input: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_hash_sha512_BYTES")
  @js.native
  val cryptoHashSha512BYTES: Double = js.native
  
  inline def cryptoHashSha512Instance(): CryptoHashSha512Wrap = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash_sha512_instance")().asInstanceOf[CryptoHashSha512Wrap]
  
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
  
  inline def cryptoKdfDeriveFromKey(subkey: Buffer, subkeyId: Double, context: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey.asInstanceOf[js.Any], subkeyId.asInstanceOf[js.Any], context.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_kdf_KEYBYTES")
  @js.native
  val cryptoKdfKEYBYTES: Double = js.native
  
  inline def cryptoKdfKeygen(key: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_kdf_PRIMITIVE")
  @js.native
  val cryptoKdfPRIMITIVE: String = js.native
  
  inline def cryptoKxClientSessionKeys(rx: Null, tx: Null, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoKxClientSessionKeys(rx: Null, tx: Buffer, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoKxClientSessionKeys(rx: Buffer, tx: Null, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoKxClientSessionKeys(rx: Buffer, tx: Buffer, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoKxKeypair(publicKey: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def cryptoKxSeedKeypair(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoKxServerSessionKeys(rx: Null, tx: Null, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoKxServerSessionKeys(rx: Null, tx: Buffer, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoKxServerSessionKeys(rx: Buffer, tx: Null, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoKxServerSessionKeys(rx: Buffer, tx: Buffer, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(rx.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoOnetimeauth(output: Buffer, input: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_onetimeauth_BYTES")
  @js.native
  val cryptoOnetimeauthBYTES: Double = js.native
  
  inline def cryptoOnetimeauthInstance(key: Buffer): CryptoOneTimeAuthWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_instance")(key.asInstanceOf[js.Any]).asInstanceOf[CryptoOneTimeAuthWrap]
  
  @JSImport("sodium-native", "crypto_onetimeauth_KEYBYTES")
  @js.native
  val cryptoOnetimeauthKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_PRIMITIVE")
  @js.native
  val cryptoOnetimeauthPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_onetimeauth_STATEBYTES")
  @js.native
  val cryptoOnetimeauthSTATEBYTES: Double = js.native
  
  inline def cryptoOnetimeauthVerify(output: Buffer, input: Buffer, key: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_onetimeauth_verify")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoPwhash(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(output.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opslimit.asInstanceOf[js.Any], memlimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_pwhash_ALG_ARGON2I13")
  @js.native
  val cryptoPwhashALGARGON2I13: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_ALG_ARGON2ID13")
  @js.native
  val cryptoPwhashALGARGON2ID13: Double = js.native
  
  @JSImport("sodium-native", "crypto_pwhash_ALG_DEFAULT")
  @js.native
  val cryptoPwhashALGDEFAULT: Double = js.native
  
  inline def cryptoPwhashAsync(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_async")(output.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opslimit.asInstanceOf[js.Any], memlimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def cryptoPwhashStr(output: Buffer, password: Buffer, opslimit: Double, memlimit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(output.asInstanceOf[js.Any], password.asInstanceOf[js.Any], opslimit.asInstanceOf[js.Any], memlimit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoPwhashStrAsync(
    output: Buffer,
    password: Buffer,
    opslimit: Double,
    memlimit: Double,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_async")(output.asInstanceOf[js.Any], password.asInstanceOf[js.Any], opslimit.asInstanceOf[js.Any], memlimit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoPwhashStrNeedsRehash(hash: Buffer, opslimit: Double, memlimit: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_needs_rehash")(hash.asInstanceOf[js.Any], opslimit.asInstanceOf[js.Any], memlimit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoPwhashStrVerify(str: Buffer, password: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(str.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoPwhashStrVerifyAsync(
    str: Buffer,
    password: Buffer,
    callback: js.Function2[/* err */ Error | Null, /* bool */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify_async")(str.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoScalarmult(sharedSecret: Buffer, secretKey: Buffer, remotePublicKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(sharedSecret.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], remotePublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_scalarmult_BYTES")
  @js.native
  val cryptoScalarmultBYTES: Double = js.native
  
  inline def cryptoScalarmultBase(publicKey: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoScalarmultEd25519(q: Buffer, n: Buffer, p: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519")(q.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_BYTES")
  @js.native
  val cryptoScalarmultEd25519BYTES: Double = js.native
  
  inline def cryptoScalarmultEd25519Base(q: Buffer, n: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base")(q.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoScalarmultEd25519BaseNoclamp(q: Buffer, n: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_base_noclamp")(q.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoScalarmultEd25519Noclamp(q: Buffer, n: Buffer, p: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_ed25519_noclamp")(q.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_scalarmult_ed25519_SCALARBYTES")
  @js.native
  val cryptoScalarmultEd25519SCALARBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_PRIMITIVE")
  @js.native
  val cryptoScalarmultPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_scalarmult_SCALARBYTES")
  @js.native
  val cryptoScalarmultSCALARBYTES: Double = js.native
  
  inline def cryptoSecretboxDetached(ciphertext: Buffer, mac: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSecretboxEasy(ciphertext: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_secretbox_KEYBYTES")
  @js.native
  val cryptoSecretboxKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_MACBYTES")
  @js.native
  val cryptoSecretboxMACBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretbox_NONCEBYTES")
  @js.native
  val cryptoSecretboxNONCEBYTES: Double = js.native
  
  inline def cryptoSecretboxOpenDetached(message: Buffer, ciphertext: Buffer, mac: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(message.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoSecretboxOpenEasy(message: Buffer, ciphertext: Buffer, nonce: Buffer, secretKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(message.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("sodium-native", "crypto_secretbox_PRIMITIVE")
  @js.native
  val cryptoSecretboxPRIMITIVE: String = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_ABYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305ABYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_HEADERBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305HEADERBYTES: Double = js.native
  
  inline def cryptoSecretstreamXchacha20poly1305InitPull(state: Xchacha20poly1305State, header: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_pull")(state.asInstanceOf[js.Any], header.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSecretstreamXchacha20poly1305InitPush(state: Xchacha20poly1305State, header: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(state.asInstanceOf[js.Any], header.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_KEYBYTES")
  @js.native
  val cryptoSecretstreamXchacha20poly1305KEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX")
  @js.native
  val cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: Double = js.native
  
  inline def cryptoSecretstreamXchacha20poly1305Pull(state: Xchacha20poly1305State, message: Buffer, tag: Buffer, ciphertext: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoSecretstreamXchacha20poly1305Pull(state: Xchacha20poly1305State, message: Buffer, tag: Buffer, ciphertext: Buffer, ad: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSecretstreamXchacha20poly1305Push(state: Xchacha20poly1305State, ciphertext: Buffer, message: Buffer, ad: Null, tag: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cryptoSecretstreamXchacha20poly1305Push(state: Xchacha20poly1305State, ciphertext: Buffer, message: Buffer, ad: Buffer, tag: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSecretstreamXchacha20poly1305Rekey(state: Xchacha20poly1305State): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_rekey")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cryptoSecretstreamXchacha20poly1305StateNew(): Xchacha20poly1305State = ^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_state_new")().asInstanceOf[Xchacha20poly1305State]
  
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
  
  inline def cryptoShorthash(output: Buffer, input: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(output.asInstanceOf[js.Any], input.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_shorthash_BYTES")
  @js.native
  val cryptoShorthashBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_shorthash_KEYBYTES")
  @js.native
  val cryptoShorthashKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_shorthash_PRIMITIVE")
  @js.native
  val cryptoShorthashPRIMITIVE: String = js.native
  
  inline def cryptoSign(signedMessage: Buffer, message: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(signedMessage.asInstanceOf[js.Any], message.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_sign_BYTES")
  @js.native
  val cryptoSignBYTES: Double = js.native
  
  inline def cryptoSignDetached(signature: Buffer, message: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignEd25519PkToCurve25519(curve_pk: Buffer, ed_pk: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(curve_pk.asInstanceOf[js.Any], ed_pk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignEd25519SkToCurve25519(curve_sk: Buffer, ed_sk: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(curve_sk.asInstanceOf[js.Any], ed_sk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignEd25519SkToPk(pk: Buffer, sk: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_pk")(pk.asInstanceOf[js.Any], sk.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignKeypair(publicKey: Buffer, secretKey: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignOpen(message: Buffer, signedMessage: Buffer, publicKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(message.asInstanceOf[js.Any], signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("sodium-native", "crypto_sign_PUBLICKEYBYTES")
  @js.native
  val cryptoSignPUBLICKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_sign_SECRETKEYBYTES")
  @js.native
  val cryptoSignSECRETKEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_sign_SEEDBYTES")
  @js.native
  val cryptoSignSEEDBYTES: Double = js.native
  
  inline def cryptoSignSeedKeypair(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(publicKey.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoSignVerifyDetached(signature: Buffer, message: Buffer, publicKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cryptoStream(ciphertext: Buffer, nonce: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sodium-native", "crypto_stream_chacha20_KEYBYTES")
  @js.native
  val cryptoStreamChacha20KEYBYTES: Double = js.native
  
  @JSImport("sodium-native", "crypto_stream_chacha20_NONCEBYTES")
  @js.native
  val cryptoStreamChacha20NONCEBYTES: Double = js.native
  
  inline def cryptoStreamChacha20Xor(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoStreamChacha20XorInstance(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_chacha20_xor_instance")(nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CryptoStreamChacha20XorWrap]
  
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
  
  inline def cryptoStreamXor(ciphertext: Buffer, message: Buffer, nonce: Buffer, key: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xor")(ciphertext.asInstanceOf[js.Any], message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cryptoStreamXorInstance(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = (^.asInstanceOf[js.Dynamic].applyDynamic("crypto_stream_xor_instance")(nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CryptoStreamChacha20XorWrap]
  
  @JSImport("sodium-native", "crypto_stream_xor_STATEBYTES")
  @js.native
  val cryptoStreamXorSTATEBYTES: Double = js.native
  
  inline def randombytesBuf(buffer: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def randombytesBufDeterministic(buffer: Buffer, seed: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(buffer.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def randombytesRandom(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_random")().asInstanceOf[Double]
  
  @JSImport("sodium-native", "randombytes_SEEDBYTES")
  @js.native
  val randombytesSEEDBYTES: Double = js.native
  
  inline def randombytesUniform(upper_bound: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_uniform")(upper_bound.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sodiumAdd(a: Buffer, b: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sodiumCompare(b1: Buffer, b2: Buffer): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_compare")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def sodiumIncrement(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_increment")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumIsZero(buf: Buffer, len: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_is_zero")(buf.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sodiumMalloc(size: Double): SecureBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_malloc")(size.asInstanceOf[js.Any]).asInstanceOf[SecureBuffer]
  
  inline def sodiumMemcmp(b1: Buffer, b2: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_memcmp")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sodiumMemzero(buffer: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_memzero")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumMlock(buffer: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_mlock")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumMprotectNoaccess(buffer: SecureBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_mprotect_noaccess")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumMprotectReadonly(buffer: SecureBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_mprotect_readonly")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumMprotectReadwrite(buffer: SecureBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_mprotect_readwrite")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumMunlock(buffer: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sodium_munlock")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sodiumPad(buf: Buffer, unpaddedLength: Double, blocksize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_pad")(buf.asInstanceOf[js.Any], unpaddedLength.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sodiumSub(a: Buffer, b: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sodiumUnpad(buf: Buffer, paddedLength: Double, blocksize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sodium_unpad")(buf.asInstanceOf[js.Any], paddedLength.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait CryptoGenericHashWrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer as above with the same length you gave when creating the instance.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit
  }
  object CryptoGenericHashWrap {
    
    inline def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoGenericHashWrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoGenericHashWrap]
    }
    
    extension [Self <: CryptoGenericHashWrap](x: Self) {
      
      inline def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait CryptoHashSha256Wrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer of length `crypto_hash_sha256_BYTES`.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit
  }
  object CryptoHashSha256Wrap {
    
    inline def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoHashSha256Wrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoHashSha256Wrap]
    }
    
    extension [Self <: CryptoHashSha256Wrap](x: Self) {
      
      inline def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait CryptoHashSha512Wrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer of length `crypto_hash_sha512_BYTES`.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit
  }
  object CryptoHashSha512Wrap {
    
    inline def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoHashSha512Wrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoHashSha512Wrap]
    }
    
    extension [Self <: CryptoHashSha512Wrap](x: Self) {
      
      inline def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait CryptoOneTimeAuthWrap extends StObject {
    
    /**
      * Finalize the instance.
      *
      * * `output` should be a buffer of length `crypto_onetimeauth_BYTES`.
      *
      * The generated hash is stored in `output`.
      */
    def `final`(output: Buffer): Unit
    
    /**
      * Update the instance with a new piece of data.
      *
      * * `input` should be a buffer of any size.
      */
    def update(input: Buffer): Unit
  }
  object CryptoOneTimeAuthWrap {
    
    inline def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoOneTimeAuthWrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[CryptoOneTimeAuthWrap]
    }
    
    extension [Self <: CryptoOneTimeAuthWrap](x: Self) {
      
      inline def setFinal(value: Buffer => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Buffer => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait CryptoStreamChacha20XorWrap extends StObject {
    
    /**
      * Finalize the stream. Zeros out internal state.
      */
    def `final`(): Unit
    
    /**
      * Encrypt the next message
      */
    def update(ciphertext: Buffer, message: Buffer): Unit
  }
  object CryptoStreamChacha20XorWrap {
    
    inline def apply(`final`: () => Unit, update: (Buffer, Buffer) => Unit): CryptoStreamChacha20XorWrap = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[CryptoStreamChacha20XorWrap]
    }
    
    extension [Self <: CryptoStreamChacha20XorWrap](x: Self) {
      
      inline def setFinal(value: () => Unit): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: (Buffer, Buffer) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SecureBuffer
    extends StObject
       with Buffer {
    
    /**
      * To check if a `buffer` is a "secure" `buffer`, you can access the getter `buffer.secure` which will be `true`.
      */
    var secure: Boolean = js.native
  }
  
  trait Xchacha20poly1305State extends StObject {
    
    var _pad: Buffer
    
    var k: Buffer
    
    var nonce: Buffer
  }
  object Xchacha20poly1305State {
    
    inline def apply(_pad: Buffer, k: Buffer, nonce: Buffer): Xchacha20poly1305State = {
      val __obj = js.Dynamic.literal(_pad = _pad.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xchacha20poly1305State]
    }
    
    extension [Self <: Xchacha20poly1305State](x: Self) {
      
      inline def setK(value: Buffer): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def set_pad(value: Buffer): Self = StObject.set(x, "_pad", value.asInstanceOf[js.Any])
    }
  }
}
