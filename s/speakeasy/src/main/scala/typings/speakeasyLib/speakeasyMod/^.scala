package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("speakeasy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val counter: speakeasyLib.speakeasyMod.Hotp = js.native
  val generate_key: speakeasyLib.Anon_Options = js.native
  val generate_key_ascii: js.Function2[
    /* length */ js.UndefOr[scala.Double], 
    /* symbols */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ] = js.native
  val hotp: speakeasyLib.speakeasyMod.Hotp = js.native
  val time: speakeasyLib.speakeasyMod.Totp = js.native
  val totp: speakeasyLib.speakeasyMod.Totp = js.native
  def digest(options: speakeasyLib.speakeasyMod.DigestOptions): nodeLib.Buffer = js.native
  def generateSecret(): speakeasyLib.speakeasyMod.GeneratedSecret = js.native
  def generateSecret(options: speakeasyLib.speakeasyMod.GenerateSecretOptions): speakeasyLib.speakeasyMod.GeneratedSecret = js.native
  def generateSecret(options: speakeasyLib.speakeasyMod.GenerateSecretWithOtpAuthUrlOptions): speakeasyLib.speakeasyMod.GeneratedSecretWithOtpAuthUrl = js.native
  def generateSecretASCII(): java.lang.String = js.native
  def generateSecretASCII(length: scala.Double): java.lang.String = js.native
  def generateSecretASCII(length: scala.Double, symbols: scala.Boolean): java.lang.String = js.native
  def otpauthURL(options: speakeasyLib.speakeasyMod.OtpauthURLOptions): java.lang.String = js.native
}

