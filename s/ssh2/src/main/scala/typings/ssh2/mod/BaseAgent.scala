package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ssh2", "BaseAgent")
@js.native
open class BaseAgent[TPublicKey /* <: String | Buffer | ParsedKey */] () extends StObject {
  
  /**
    * Retrieves user identities, where `keys` is a possible array of public
    * keys for authentication.
    */
  def getIdentities(cb: IdentityCallback[TPublicKey]): Unit = js.native
  
  /**
    * Optional method that may be implemented to support agent forwarding. Callback
    * should be invoked with a Duplex stream to be used to communicate with your agent/
    * You will probably want to utilize `AgentProtocol` as agent forwarding is an
    * OpenSSH feature, so the `stream` needs to be able to
    * transmit/receive OpenSSH agent protocol packets.
    */
  var getStream: js.UndefOr[js.Function1[/* cb */ GetStreamCallback, Unit]] = js.native
  
  def sign(pubKey: TPublicKey, data: Buffer, cb: SignCallback): Unit = js.native
  /**
    * Signs the datawith the given public key, and calls back with its signature.
    * Note that, in the current implementation, "options" is always an empty object.
    */
  def sign(pubKey: TPublicKey, data: Buffer, options: SigningRequestOptions): Unit = js.native
  def sign(pubKey: TPublicKey, data: Buffer, options: SigningRequestOptions, cb: SignCallback): Unit = js.native
}
