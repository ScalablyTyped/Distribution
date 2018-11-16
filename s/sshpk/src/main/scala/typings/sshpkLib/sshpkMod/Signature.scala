package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Signature")
@js.native
class Signature protected ()
  extends sshpkLib.sshpkMod.SshPKNs.Signature {
  def this(opts: js.Any) = this()
  /* CompleteClass */
  override def toBuffer(format: java.lang.String): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def toString(format: java.lang.String): java.lang.String = js.native
}

@JSImport("sshpk", "Signature")
@js.native
object Signature extends js.Object {
  def isSignature(obj: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isSignature(obj: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, `type`: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Signature = js.native
  def parse(data: nodeLib.Buffer, `type`: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Signature = js.native
}

