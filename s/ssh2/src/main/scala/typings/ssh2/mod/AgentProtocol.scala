package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import typings.ssh2.ssh2Strings.identities
import typings.ssh2.ssh2Strings.sign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "AgentProtocol")
@js.native
open class AgentProtocol protected () extends Duplex {
  /**
    * Creates and returns a new AgentProtocol instance. `isClient` determines
    * whether the instance operates in client or server mode.
    */
  def this(isClient: Boolean) = this()
  
  /**
    * (Server mode only)
    * Replies to the given `request` with a failure response.
    */
  def failureReply(request: AgentInboundRequest): Unit = js.native
  
  /**
    * (Client mode only)
    * Requests a list of public keys from the agent. `callback` is passed
    * `(err, keys)` where `keys` is a possible array of public keys for
    * authentication.
    */
  def getIdentities(
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error], 
      /* publicKeys */ js.UndefOr[js.Array[ParsedKey]], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * (Server mode only)
    * Responds to a identities list `request` with the given array of keys in `keys`.
    */
  def getIdentitiesReply(request: AgentInboundRequest, keys: js.Array[ParsedKey]): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * (Server mode only)
    * The client has requested a list of public keys stored in the agent.
    * Use `failureReply()` or `getIdentitiesReply()` to reply appropriately.
    */
  @JSName("on")
  def on_identities(event: identities, listener: js.Function1[/* req */ AgentInboundRequest, Unit]): this.type = js.native
  /**
    * (Server mode only)
    * The client has requested `data` to be signed using the key identified
    * by `pubKey`. Use `failureReply()` or `signReply()` to reply appropriately.
    */
  @JSName("on")
  def on_sign(
    event: sign,
    listener: js.Function4[
      /* req */ AgentInboundRequest, 
      /* pubKey */ ParsedKey, 
      /* data */ Buffer, 
      /* options */ SigningRequestOptions, 
      Unit
    ]
  ): this.type = js.native
  
  def sign(pubKey: String, data: Buffer): Boolean = js.native
  def sign(pubKey: String, data: Buffer, callback: SignCallback): Boolean = js.native
  def sign(pubKey: String, data: Buffer, options: Unit, callback: SignCallback): Boolean = js.native
  def sign(pubKey: String, data: Buffer, options: SigningRequestOptions): Boolean = js.native
  def sign(pubKey: String, data: Buffer, options: SigningRequestOptions, callback: SignCallback): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, callback: SignCallback): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, options: Unit, callback: SignCallback): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, options: SigningRequestOptions): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, options: SigningRequestOptions, callback: SignCallback): Boolean = js.native
  /**
    * (Client mode only)
    * Signs the datawith the given public key, and calls back with its signature.
    */
  def sign(pubKey: ParsedKey, data: Buffer): Boolean = js.native
  def sign(pubKey: ParsedKey, data: Buffer, callback: SignCallback): Boolean = js.native
  def sign(pubKey: ParsedKey, data: Buffer, options: Unit, callback: SignCallback): Boolean = js.native
  def sign(pubKey: ParsedKey, data: Buffer, options: SigningRequestOptions): Boolean = js.native
  def sign(pubKey: ParsedKey, data: Buffer, options: SigningRequestOptions, callback: SignCallback): Boolean = js.native
  
  /**
    * (Server mode only)
    * Responds to a sign `request` with the given signature in `signature`.
    */
  def signReply(request: AgentInboundRequest, signature: Buffer): Unit = js.native
}
