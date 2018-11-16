package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyAuthContext extends AuthContextBase {
  /** The data used to verify the key, or `undefined` if the client is only checking the validity of the key. */
  var blob: nodeLib.Buffer = js.native
  /** The public key sent by the client. */
  var key: PublicKey = js.native
  /** The method of authentication. */
  @JSName("method")
  var method_PublicKeyAuthContext: ssh2Lib.ssh2LibStrings.publickey = js.native
  /** The signature algorithm, or `undefined` if the client is only checking the validity of the key. */
  var sigAlgo: java.lang.String = js.native
  /** The signature to verify, or `undefined` if the client is only checking the validity of the key. */
  var signature: js.UndefOr[nodeLib.Buffer] = js.native
}

