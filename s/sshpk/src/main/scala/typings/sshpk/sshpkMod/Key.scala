package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Key")
@js.native
class Key protected () extends js.Object {
  def this(opts: js.Any) = this()
  var comment: js.UndefOr[String] = js.native
  var curve: js.UndefOr[String] = js.native
  var part: String = js.native
  var parts: String = js.native
  var size: Double = js.native
  var source: js.UndefOr[String] = js.native
  var `type`: String = js.native
  def createDH(): DiffieHellman = js.native
  def createDiffieHellman(): DiffieHellman = js.native
  def createVerify(algo: String): Verify = js.native
  def defaultHashAlgorithm(): String = js.native
  def fingerprint(algo: String): Fingerprint = js.native
  def hash(algo: String): Buffer = js.native
  def toBuffer(format: String): Buffer = js.native
  def toBuffer(format: String, options: js.Any): Buffer = js.native
  def toString(format: String): String = js.native
  def toString(format: String, options: js.Any): String = js.native
}

/* static members */
@JSImport("sshpk", "Key")
@js.native
object Key extends js.Object {
  var formats: Formats = js.native
  def isKey(obj: String, ver: String): Boolean = js.native
  def isKey(obj: Buffer, ver: String): Boolean = js.native
  def parse(data: String, format: String, options: js.Any): Key = js.native
  def parse(data: Buffer, format: String, options: js.Any): Key = js.native
}

