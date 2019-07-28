package typings.sjcl.sjclMod

import typings.sjcl.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclMisc extends js.Object {
  var hmac: SjclHmacStatic = js.native
  def cachedPbkdf2(password: String): Anon_Key = js.native
  def cachedPbkdf2(password: String, obj: Pbkdf2Params): Anon_Key = js.native
  def pbkdf2(password: String, salt: String): BitArray = js.native
  def pbkdf2(password: String, salt: String, count: Double): BitArray = js.native
  def pbkdf2(password: String, salt: String, count: Double, length: Double): BitArray = js.native
  def pbkdf2(
    password: String,
    salt: String,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
  def pbkdf2(password: String, salt: BitArray): BitArray = js.native
  def pbkdf2(password: String, salt: BitArray, count: Double): BitArray = js.native
  def pbkdf2(password: String, salt: BitArray, count: Double, length: Double): BitArray = js.native
  def pbkdf2(
    password: String,
    salt: BitArray,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
  def pbkdf2(password: BitArray, salt: String): BitArray = js.native
  def pbkdf2(password: BitArray, salt: String, count: Double): BitArray = js.native
  def pbkdf2(password: BitArray, salt: String, count: Double, length: Double): BitArray = js.native
  def pbkdf2(
    password: BitArray,
    salt: String,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
  def pbkdf2(password: BitArray, salt: BitArray): BitArray = js.native
  def pbkdf2(password: BitArray, salt: BitArray, count: Double): BitArray = js.native
  def pbkdf2(password: BitArray, salt: BitArray, count: Double, length: Double): BitArray = js.native
  def pbkdf2(
    password: BitArray,
    salt: BitArray,
    count: Double,
    length: Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
}

