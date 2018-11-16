package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  def read(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def read(buf: nodeLib.Buffer, options: js.Any): nodeLib.Buffer = js.native
  def write(key: Key): nodeLib.Buffer = js.native
  def write(key: Key, options: js.Any): nodeLib.Buffer = js.native
}

