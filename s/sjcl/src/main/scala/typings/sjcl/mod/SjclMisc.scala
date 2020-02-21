package typings.sjcl.mod

import typings.sjcl.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclMisc extends js.Object {
  var hmac: SjclHMACStatic = js.native
  def cachedPbkdf2(password: String): AnonKey = js.native
  def cachedPbkdf2(password: String, obj: PBKDF2Params): AnonKey = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: String): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: String, Hash: SjclHashStatic): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: BitArray_): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: BitArray_, Hash: SjclHashStatic): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: String): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: String, Hash: SjclHashStatic): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: BitArray_): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: BitArray_, Hash: SjclHashStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: String): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def scrypt(password: String, salt: String): BitArray_ = js.native
  def scrypt(password: String, salt: String, N: Double): BitArray_ = js.native
  def scrypt(password: String, salt: String, N: Double, r: Double): BitArray_ = js.native
  def scrypt(password: String, salt: String, N: Double, r: Double, p: Double): BitArray_ = js.native
  def scrypt(password: String, salt: String, N: Double, r: Double, p: Double, length: Double): BitArray_ = js.native
  def scrypt(
    password: String,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    length: Double,
    Prff: SjclPRFFamilyStatic
  ): BitArray_ = js.native
  def scrypt(password: String, salt: BitArray_): BitArray_ = js.native
  def scrypt(password: String, salt: BitArray_, N: Double): BitArray_ = js.native
  def scrypt(password: String, salt: BitArray_, N: Double, r: Double): BitArray_ = js.native
  def scrypt(password: String, salt: BitArray_, N: Double, r: Double, p: Double): BitArray_ = js.native
  def scrypt(password: String, salt: BitArray_, N: Double, r: Double, p: Double, length: Double): BitArray_ = js.native
  def scrypt(
    password: String,
    salt: BitArray_,
    N: Double,
    r: Double,
    p: Double,
    length: Double,
    Prff: SjclPRFFamilyStatic
  ): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: String): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: String, N: Double): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: String, N: Double, r: Double): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: String, N: Double, r: Double, p: Double): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: String, N: Double, r: Double, p: Double, length: Double): BitArray_ = js.native
  def scrypt(
    password: BitArray_,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    length: Double,
    Prff: SjclPRFFamilyStatic
  ): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: BitArray_): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: BitArray_, N: Double): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: BitArray_, N: Double, r: Double): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: BitArray_, N: Double, r: Double, p: Double): BitArray_ = js.native
  def scrypt(password: BitArray_, salt: BitArray_, N: Double, r: Double, p: Double, length: Double): BitArray_ = js.native
  def scrypt(
    password: BitArray_,
    salt: BitArray_,
    N: Double,
    r: Double,
    p: Double,
    length: Double,
    Prff: SjclPRFFamilyStatic
  ): BitArray_ = js.native
}

