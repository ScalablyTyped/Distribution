package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "PrivateKey")
@js.native
class PrivateKey protected () extends js.Object {
  def this(opts: js.Any) = this()
  def createSign(hashAlgo: String): Signer = js.native
  def createVerify(hashAlgo: String): Key = js.native
  def derive(newType: String, newSize: Double): PrivateKey = js.native
  def hash(algo: String): Buffer = js.native
  def toBuffer(format: String, options: js.Any): Buffer = js.native
  def toPublic(): Key = js.native
}

/* static members */
@JSImport("sshpk", "PrivateKey")
@js.native
object PrivateKey extends js.Object {
  var formats: Formats = js.native
  def isPrivateKey(data: String, ver: String): Boolean = js.native
  def isPrivateKey(data: Buffer, ver: String): Boolean = js.native
  def parse(data: String, format: String, options: js.Any): PrivateKey = js.native
  def parse(data: Buffer, format: String, options: js.Any): PrivateKey = js.native
}

