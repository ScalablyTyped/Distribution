package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Key")
@js.native
class Key protected ()
  extends sshpkLib.sshpkMod.SshPKNs.Key {
  def this(opts: js.Any) = this()
}

/* static members */
@JSImport("sshpk", "Key")
@js.native
object Key extends js.Object {
  var formats: sshpkLib.sshpkMod.SshPKNs.Formats = js.native
  def isKey(obj: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isKey(obj: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  def parse(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Key = js.native
}

