package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("speakeasy", "generate_key")
@js.native
object generate_key extends js.Object {
  def apply(): GeneratedSecret = js.native
  def apply(options: GenerateSecretOptions): GeneratedSecret = js.native
  def apply(options: GenerateSecretWithOtpAuthUrlOptions): GeneratedSecretWithOtpAuthUrl = js.native
}

