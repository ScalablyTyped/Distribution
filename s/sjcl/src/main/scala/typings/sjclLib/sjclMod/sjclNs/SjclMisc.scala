package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclMisc extends js.Object {
  var hmac: SjclHmacStatic = js.native
  def cachedPbkdf2(password: java.lang.String): sjclLib.Anon_Key = js.native
  def cachedPbkdf2(password: java.lang.String, obj: Pbkdf2Params): sjclLib.Anon_Key = js.native
  def pbkdf2(password: java.lang.String, salt: java.lang.String): BitArray = js.native
  def pbkdf2(password: java.lang.String, salt: java.lang.String, count: scala.Double): BitArray = js.native
  def pbkdf2(password: java.lang.String, salt: java.lang.String, count: scala.Double, length: scala.Double): BitArray = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    count: scala.Double,
    length: scala.Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
  def pbkdf2(password: java.lang.String, salt: BitArray): BitArray = js.native
  def pbkdf2(password: java.lang.String, salt: BitArray, count: scala.Double): BitArray = js.native
  def pbkdf2(password: java.lang.String, salt: BitArray, count: scala.Double, length: scala.Double): BitArray = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: BitArray,
    count: scala.Double,
    length: scala.Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
  def pbkdf2(password: BitArray, salt: java.lang.String): BitArray = js.native
  def pbkdf2(password: BitArray, salt: java.lang.String, count: scala.Double): BitArray = js.native
  def pbkdf2(password: BitArray, salt: java.lang.String, count: scala.Double, length: scala.Double): BitArray = js.native
  def pbkdf2(
    password: BitArray,
    salt: java.lang.String,
    count: scala.Double,
    length: scala.Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
  def pbkdf2(password: BitArray, salt: BitArray): BitArray = js.native
  def pbkdf2(password: BitArray, salt: BitArray, count: scala.Double): BitArray = js.native
  def pbkdf2(password: BitArray, salt: BitArray, count: scala.Double, length: scala.Double): BitArray = js.native
  def pbkdf2(
    password: BitArray,
    salt: BitArray,
    count: scala.Double,
    length: scala.Double,
    Prff: SjclPseudorandomFunctionFamilyStatic
  ): BitArray = js.native
}

