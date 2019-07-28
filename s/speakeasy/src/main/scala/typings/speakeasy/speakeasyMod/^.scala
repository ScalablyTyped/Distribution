package typings.speakeasy.speakeasyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("speakeasy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val counter: Hotp = js.native
  val generate_key_ascii: js.Function2[/* length */ js.UndefOr[Double], /* symbols */ js.UndefOr[Boolean], String] = js.native
  val hotp: Hotp = js.native
  val time: Totp = js.native
  val totp: Totp = js.native
  def digest(options: DigestOptions): Buffer = js.native
  def generateSecret(): GeneratedSecret = js.native
  def generateSecret(options: GenerateSecretOptions): GeneratedSecret = js.native
  def generateSecret(options: GenerateSecretWithOtpAuthUrlOptions): GeneratedSecretWithOtpAuthUrl = js.native
  def generateSecretASCII(): String = js.native
  def generateSecretASCII(length: Double): String = js.native
  def generateSecretASCII(length: Double, symbols: Boolean): String = js.native
  def otpauthURL(options: OtpauthURLOptions): String = js.native
}

