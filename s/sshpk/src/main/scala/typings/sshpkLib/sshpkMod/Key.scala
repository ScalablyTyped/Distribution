package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Key")
@js.native
class Key protected () extends js.Object {
  def this(opts: js.Any) = this()
  var comment: js.UndefOr[java.lang.String] = js.native
  var curve: js.UndefOr[java.lang.String] = js.native
  var part: java.lang.String = js.native
  var parts: java.lang.String = js.native
  var size: scala.Double = js.native
  var source: js.UndefOr[java.lang.String] = js.native
  var `type`: java.lang.String = js.native
  def createDH(): DiffieHellman = js.native
  def createDiffieHellman(): DiffieHellman = js.native
  def createVerify(algo: java.lang.String): Verify = js.native
  def defaultHashAlgorithm(): java.lang.String = js.native
  def fingerprint(algo: java.lang.String): Fingerprint = js.native
  def hash(algo: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(format: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(format: java.lang.String, options: js.Any): nodeLib.Buffer = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String, options: js.Any): java.lang.String = js.native
}

/* static members */
@JSImport("sshpk", "Key")
@js.native
object Key extends js.Object {
  var formats: sshpkLib.sshpkMod.Formats = js.native
  def isKey(obj: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isKey(obj: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.Key = js.native
  def parse(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.Key = js.native
}

