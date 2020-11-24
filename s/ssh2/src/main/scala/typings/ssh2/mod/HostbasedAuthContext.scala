package typings.ssh2.mod

import typings.node.Buffer
import typings.ssh2.ssh2Strings.hostbased
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostbasedAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The data used to verify the key, or `undefined` if the client is only checking the validity of the key. */
  var blob: Buffer = js.native
  
  /** The public key sent by the client. */
  var key: PublicKey = js.native
  
  /** The local hostname of the client. */
  var localHostname: String = js.native
  
  /** The local username of the client. */
  var localUsername: String = js.native
  
  /** The method of authentication. */
  @JSName("method")
  var method_HostbasedAuthContext: hostbased = js.native
  
  /** The signature algorithm, or `undefined` if the client is only checking the validity of the key. */
  var sigAlgo: String = js.native
  
  /** The signature to verify, or `undefined` if the client is only checking the validity of the key. */
  var signature: js.UndefOr[Buffer] = js.native
}
