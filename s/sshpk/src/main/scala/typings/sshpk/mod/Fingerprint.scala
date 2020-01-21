package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Fingerprint")
@js.native
class Fingerprint protected () extends js.Object {
  def this(opts: js.Any) = this()
  var algorithm: String = js.native
  var hash: String = js.native
  var `type`: String = js.native
  def addColons(fp: String): String = js.native
  def base64Strip(fp: String): String = js.native
  def isFingerprint(obj: String, ver: String): Boolean = js.native
  def isFingerprint(obj: Buffer, ver: String): Boolean = js.native
  def matches(other: Fingerprint): Boolean = js.native
  def sshBase64Format(alg: String, h: String): String = js.native
  def toString(format: String): String = js.native
}

/* static members */
@JSImport("sshpk", "Fingerprint")
@js.native
object Fingerprint extends js.Object {
  def parse(fp: String, options: js.Any): Fingerprint = js.native
}

