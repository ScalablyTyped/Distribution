package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "PrivateKey")
@js.native
class PrivateKey protected () extends js.Object {
  def this(opts: js.Any) = this()
  def createSign(hashAlgo: java.lang.String): Signer = js.native
  def createVerify(hashAlgo: java.lang.String): Key = js.native
  def derive(newType: java.lang.String, newSize: scala.Double): PrivateKey = js.native
  def hash(algo: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(format: java.lang.String, options: js.Any): nodeLib.Buffer = js.native
  def toPublic(): Key = js.native
}

/* static members */
@JSImport("sshpk", "PrivateKey")
@js.native
object PrivateKey extends js.Object {
  var formats: sshpkLib.sshpkMod.Formats = js.native
  def isPrivateKey(data: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isPrivateKey(data: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.PrivateKey = js.native
  def parse(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.PrivateKey = js.native
}

