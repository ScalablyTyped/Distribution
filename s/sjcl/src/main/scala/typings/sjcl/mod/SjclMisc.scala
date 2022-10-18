package typings.sjcl.mod

import typings.sjcl.anon.Salt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclMisc extends StObject {
  
  def cachedPbkdf2(password: String): Salt = js.native
  def cachedPbkdf2(password: String, obj: PBKDF2Params): Salt = js.native
  
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: String): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: String, Hash: SjclHashStatic): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: BitArray_): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: String, info: BitArray_, Hash: SjclHashStatic): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: String): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: String, Hash: SjclHashStatic): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: BitArray_): BitArray_ = js.native
  def hkdf(ikm: BitArray_, keyBitLength: Double, salt: BitArray_, info: BitArray_, Hash: SjclHashStatic): BitArray_ = js.native
  
  var hmac: SjclHMACStatic = js.native
  
  def pbkdf2(password: String, salt: String): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Unit, length: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Unit, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Unit, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Unit, length: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Unit, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Unit, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Unit, length: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Unit, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Unit, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Unit, length: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Unit, length: Double, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Unit, length: Unit, Prff: SjclPRFFamilyStatic): BitArray_ = js.native
  
  def scrypt(
    password: BitArray_ | String,
    salt: BitArray_ | String,
    N: js.UndefOr[Double],
    r: js.UndefOr[Double],
    p: js.UndefOr[Double],
    length: js.UndefOr[Double],
    Prff: js.UndefOr[SjclPRFFamilyStatic]
  ): BitArray_ = js.native
}
