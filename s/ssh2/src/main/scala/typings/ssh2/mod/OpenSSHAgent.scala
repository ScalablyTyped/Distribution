package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "OpenSSHAgent")
@js.native
open class OpenSSHAgent protected () extends BaseAgent[ParsedKey] {
  def this(socketPath: String) = this()
  
  /** @inheritdoc */
  @JSName("getStream")
  def getStream_MOpenSSHAgent(cb: GetStreamCallback): Unit = js.native
  
  def sign(pubKey: String, data: Buffer): Boolean = js.native
  def sign(pubKey: String, data: Buffer, cb: SignCallback): Boolean = js.native
  def sign(pubKey: String, data: Buffer, options: Unit, cb: SignCallback): Boolean = js.native
  def sign(pubKey: String, data: Buffer, options: SigningRequestOptions): Boolean = js.native
  def sign(pubKey: String, data: Buffer, options: SigningRequestOptions, cb: SignCallback): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, cb: SignCallback): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, options: Unit, cb: SignCallback): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, options: SigningRequestOptions): Boolean = js.native
  def sign(pubKey: Buffer, data: Buffer, options: SigningRequestOptions, cb: SignCallback): Boolean = js.native
  /** @inheritdoc */
  def sign(pubKey: ParsedKey, data: Buffer): Boolean = js.native
  def sign(pubKey: ParsedKey, data: Buffer, options: Unit, cb: SignCallback): Boolean = js.native
}
