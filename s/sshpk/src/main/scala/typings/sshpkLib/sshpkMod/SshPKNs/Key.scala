package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
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

