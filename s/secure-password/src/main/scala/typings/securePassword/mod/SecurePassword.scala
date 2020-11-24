package typings.securePassword.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurePassword extends js.Object {
  
  /**
    * Create a hash of the password.
    * @param passwordBuf
    */
  def hash(passwordBuf: Buffer): js.Promise[Buffer] = js.native
  def hash(passwordBuf: Buffer, cb: js.Function2[/* err */ js.Any, /* hash */ js.UndefOr[Buffer], Unit]): Unit = js.native
  
  /**
    * Create a hash of the password buffer.
    * @param buff
    */
  def hashSync(buff: Buffer): Buffer = js.native
  
  var memlimit: Double = js.native
  
  var opslimit: Double = js.native
  
  /**
    * Verify password and hash match.
    * @param passwordBuf
    * @param hashBuf
    */
  def verify(passwordBuf: Buffer, hashBuf: Buffer): js.Promise[js.Symbol] = js.native
  def verify(
    passwordBuf: Buffer,
    hashBuf: Buffer,
    cb: js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Symbol], Unit]
  ): Unit = js.native
  
  /**
    * Verify password and hash match.
    * @param passwordBuf
    * @param hashBuf
    */
  def verifySync(passwordBuf: Buffer, hashBuf: Buffer): js.Symbol = js.native
}
