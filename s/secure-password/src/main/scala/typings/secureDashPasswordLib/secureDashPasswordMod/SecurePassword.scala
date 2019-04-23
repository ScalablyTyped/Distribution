package typings
package secureDashPasswordLib.secureDashPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurePassword extends js.Object {
  var memlimit: scala.Double = js.native
  var opslimit: scala.Double = js.native
  /**
    * Create a hash of the password.
    * @param passwordBuf
    */
  def hash(passwordBuf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def hash(
    passwordBuf: nodeLib.Buffer,
    cb: js.Function2[/* err */ js.Any, /* hash */ js.UndefOr[nodeLib.Buffer], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Create a hash of the password buffer.
    * @param buff
    */
  def hashSync(buff: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Verify password and hash match.
    * @param passwordBuf
    * @param hashBuf
    */
  def verify(passwordBuf: nodeLib.Buffer, hashBuf: nodeLib.Buffer): js.Promise[js.Symbol] = js.native
  def verify(
    passwordBuf: nodeLib.Buffer,
    hashBuf: nodeLib.Buffer,
    cb: js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Symbol], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Verify password and hash match.
    * @param passwordBuf
    * @param hashBuf
    */
  def verifySync(passwordBuf: nodeLib.Buffer, hashBuf: nodeLib.Buffer): js.Symbol = js.native
}

