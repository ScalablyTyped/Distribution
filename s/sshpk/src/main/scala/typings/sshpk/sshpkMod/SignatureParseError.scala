package typings.sshpk.sshpkMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "SignatureParseError")
@js.native
class SignatureParseError protected () extends Error {
  def this(`type`: String, format: String, innerErr: js.Any) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

