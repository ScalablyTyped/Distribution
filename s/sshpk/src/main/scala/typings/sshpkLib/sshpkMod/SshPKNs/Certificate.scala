package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  var issuer: java.lang.String = js.native
  var issuerKey: java.lang.String = js.native
  var serial: java.lang.String = js.native
  var signatures: java.lang.String = js.native
  var subjectKey: java.lang.String = js.native
  var subjects: js.Array[Identity] = js.native
  var validFrom: java.lang.String = js.native
  var validUntil: java.lang.String = js.native
  def fingerprint(algo: java.lang.String): Fingerprint = js.native
  def hash(algo: java.lang.String): java.lang.String = js.native
  def isExpired(when: stdLib.Date): scala.Boolean = js.native
  def isSignedBy(issuerCert: Certificate): scala.Boolean = js.native
  def isSignedByKey(issuerKey: Key): scala.Boolean = js.native
  def signWith(key: Key): scala.Unit = js.native
  def toBuffer(format: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(format: java.lang.String, options: js.Any): nodeLib.Buffer = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String, options: js.Any): java.lang.String = js.native
}

