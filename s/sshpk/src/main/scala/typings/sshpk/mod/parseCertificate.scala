package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "parseCertificate")
@js.native
object parseCertificate extends js.Object {
  def apply(data: String, format: String): Certificate = js.native
  def apply(data: String, format: String, options: js.Any): Certificate = js.native
  def apply(data: Buffer, format: String): Certificate = js.native
  def apply(data: Buffer, format: String, options: js.Any): Certificate = js.native
}

