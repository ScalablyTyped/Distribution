package typings
package sshDashKeyDashDecryptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh-key-decrypt", JSImport.Namespace)
@js.native
object sshDashKeyDashDecryptMod extends js.Object {
  def apply(data: java.lang.String | nodeLib.Buffer, passphrase: java.lang.String): nodeLib.Buffer = js.native
  def apply(
    data: java.lang.String | nodeLib.Buffer,
    passphrase: java.lang.String,
    outEnc: nodeLib.BufferEncoding
  ): java.lang.String = js.native
  def apply(
    data: java.lang.String | nodeLib.Buffer,
    passphrase: java.lang.String,
    outEnc: sshDashKeyDashDecryptLib.sshDashKeyDashDecryptLibStrings.buffer
  ): nodeLib.Buffer = js.native
}

