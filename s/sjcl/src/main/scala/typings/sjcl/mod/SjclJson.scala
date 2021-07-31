package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclJson extends StObject {
  
  def decode(obj: String): js.Object
  
  def decrypt(password: String, ciphertext: String): String
  def decrypt(password: String, ciphertext: String, params: Unit, rp: SjclCipherDecrypted): String
  def decrypt(password: String, ciphertext: String, params: SjclCipherDecryptParams): String
  def decrypt(password: String, ciphertext: String, params: SjclCipherDecryptParams, rp: SjclCipherDecrypted): String
  def decrypt(password: String, ciphertext: SjclCipherEncrypted): String
  def decrypt(password: String, ciphertext: SjclCipherEncrypted, params: Unit, rp: SjclCipherDecrypted): String
  def decrypt(password: String, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String
  def decrypt(
    password: String,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String
  def decrypt(password: BitArray_, ciphertext: String): String
  def decrypt(password: BitArray_, ciphertext: String, params: Unit, rp: SjclCipherDecrypted): String
  def decrypt(password: BitArray_, ciphertext: String, params: SjclCipherDecryptParams): String
  def decrypt(password: BitArray_, ciphertext: String, params: SjclCipherDecryptParams, rp: SjclCipherDecrypted): String
  def decrypt(password: BitArray_, ciphertext: SjclCipherEncrypted): String
  def decrypt(password: BitArray_, ciphertext: SjclCipherEncrypted, params: Unit, rp: SjclCipherDecrypted): String
  def decrypt(password: BitArray_, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String
  def decrypt(
    password: BitArray_,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String
  def decrypt(password: SjclElGamalSecretKey, ciphertext: String): String
  def decrypt(password: SjclElGamalSecretKey, ciphertext: String, params: Unit, rp: SjclCipherDecrypted): String
  def decrypt(password: SjclElGamalSecretKey, ciphertext: String, params: SjclCipherDecryptParams): String
  def decrypt(
    password: SjclElGamalSecretKey,
    ciphertext: String,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String
  def decrypt(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted): String
  def decrypt(
    password: SjclElGamalSecretKey,
    ciphertext: SjclCipherEncrypted,
    params: Unit,
    rp: SjclCipherDecrypted
  ): String
  def decrypt(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String
  def decrypt(
    password: SjclElGamalSecretKey,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String
  @JSName("decrypt")
  var decrypt_Original: SjclConvenienceDecryptor
  
  def encode(obj: js.Object): String
  
  def encrypt(password: String, plaintext: String): SjclCipherEncrypted
  def encrypt(password: String, plaintext: String, params: Unit, rp: SjclCipherEncrypted): SjclCipherEncrypted
  def encrypt(password: String, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted
  def encrypt(password: String, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted
  def encrypt(password: BitArray_, plaintext: String): SjclCipherEncrypted
  def encrypt(password: BitArray_, plaintext: String, params: Unit, rp: SjclCipherEncrypted): SjclCipherEncrypted
  def encrypt(password: BitArray_, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted
  def encrypt(password: BitArray_, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted
  def encrypt(password: SjclElGamalPublicKey, plaintext: String): SjclCipherEncrypted
  def encrypt(password: SjclElGamalPublicKey, plaintext: String, params: Unit, rp: SjclCipherEncrypted): SjclCipherEncrypted
  def encrypt(password: SjclElGamalPublicKey, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted
  def encrypt(
    password: SjclElGamalPublicKey,
    plaintext: String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted
  @JSName("encrypt")
  var encrypt_Original: SjclConvenienceEncryptor
}
object SjclJson {
  
  @scala.inline
  def apply(
    decode: String => js.Object,
    decrypt: (/* password */ SjclElGamalSecretKey | BitArray_ | String, /* ciphertext */ SjclCipherEncrypted | String, /* params */ js.UndefOr[SjclCipherDecryptParams], /* rp */ js.UndefOr[SjclCipherDecrypted]) => String,
    encode: js.Object => String,
    encrypt: (/* password */ SjclElGamalPublicKey | BitArray_ | String, /* plaintext */ String, /* params */ js.UndefOr[SjclCipherEncryptParams], /* rp */ js.UndefOr[SjclCipherEncrypted]) => SjclCipherEncrypted
  ): SjclJson = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decrypt = js.Any.fromFunction4(decrypt), encode = js.Any.fromFunction1(encode), encrypt = js.Any.fromFunction4(encrypt))
    __obj.asInstanceOf[SjclJson]
  }
  
  @scala.inline
  implicit class SjclJsonMutableBuilder[Self <: SjclJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecode(value: String => js.Object): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecrypt(
      value: (/* password */ SjclElGamalSecretKey | BitArray_ | String, /* ciphertext */ SjclCipherEncrypted | String, /* params */ js.UndefOr[SjclCipherDecryptParams], /* rp */ js.UndefOr[SjclCipherDecrypted]) => String
    ): Self = StObject.set(x, "decrypt", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEncode(value: js.Object => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncrypt(
      value: (/* password */ SjclElGamalPublicKey | BitArray_ | String, /* plaintext */ String, /* params */ js.UndefOr[SjclCipherEncryptParams], /* rp */ js.UndefOr[SjclCipherEncrypted]) => SjclCipherEncrypted
    ): Self = StObject.set(x, "encrypt", js.Any.fromFunction4(value))
  }
}
