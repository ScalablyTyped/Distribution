package typings.sshpk.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "createCertificate")
@js.native
object createCertificate extends js.Object {
  def apply(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey): Certificate = js.native
  def apply(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey, options: js.Any): Certificate = js.native
}

