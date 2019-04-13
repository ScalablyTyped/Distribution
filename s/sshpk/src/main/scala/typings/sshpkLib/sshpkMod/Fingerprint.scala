package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Fingerprint")
@js.native
class Fingerprint protected () extends js.Object {
  def this(opts: js.Any) = this()
  var algorithm: java.lang.String = js.native
  var hash: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def addColons(fp: java.lang.String): java.lang.String = js.native
  def base64Strip(fp: java.lang.String): java.lang.String = js.native
  def isFingerprint(obj: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isFingerprint(obj: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def matches(other: Fingerprint): scala.Boolean = js.native
  def sshBase64Format(alg: java.lang.String, h: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSImport("sshpk", "Fingerprint")
@js.native
object Fingerprint extends js.Object {
  def parse(fp: java.lang.String, options: js.Any): sshpkLib.sshpkMod.Fingerprint = js.native
}

