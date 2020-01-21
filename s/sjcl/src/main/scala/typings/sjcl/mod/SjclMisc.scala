package typings.sjcl.mod

import typings.sjcl.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclMisc extends js.Object {
  var hmac: SjclHmacStatic = js.native
  def cachedPbkdf2(password: String): AnonKey = js.native
  def cachedPbkdf2(password: String, obj: Pbkdf2Params): AnonKey = js.native
  def pbkdf2(password: String, salt: String): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(
    password: String,
    salt: String,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double): BitArray_ = js.native
  def pbkdf2(password: String, salt: BitArray_, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(
    password: String,
    salt: BitArray_,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: String, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(
    password: BitArray_,
    salt: String,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double): BitArray_ = js.native
  def pbkdf2(password: BitArray_, salt: BitArray_, count: Double, length: Double): BitArray_ = js.native
  def pbkdf2(
    password: BitArray_,
    salt: BitArray_,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray_ = js.native
}

