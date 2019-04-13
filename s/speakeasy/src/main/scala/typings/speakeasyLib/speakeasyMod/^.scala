package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("speakeasy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val counter: Hotp = js.native
  val generate_key_ascii: js.Function2[
    /* length */ js.UndefOr[scala.Double], 
    /* symbols */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ] = js.native
  val hotp: Hotp = js.native
  val time: Totp = js.native
  val totp: Totp = js.native
  def digest(options: DigestOptions): nodeLib.Buffer = js.native
  def generateSecret(): GeneratedSecret = js.native
  def generateSecret(options: GenerateSecretOptions): GeneratedSecret = js.native
  def generateSecret(options: GenerateSecretWithOtpAuthUrlOptions): GeneratedSecretWithOtpAuthUrl = js.native
  def generateSecretASCII(): java.lang.String = js.native
  def generateSecretASCII(length: scala.Double): java.lang.String = js.native
  def generateSecretASCII(length: scala.Double, symbols: scala.Boolean): java.lang.String = js.native
  def otpauthURL(options: OtpauthURLOptions): java.lang.String = js.native
}

