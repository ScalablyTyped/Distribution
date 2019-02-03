package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Fingerprint")
@js.native
class Fingerprint protected ()
  extends sshpkLib.sshpkMod.SshPKNs.Fingerprint {
  def this(opts: js.Any) = this()
}

/* static members */
@JSImport("sshpk", "Fingerprint")
@js.native
object Fingerprint extends js.Object {
  def parse(fp: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Fingerprint = js.native
}

