package typings.soupbintcp.soupbintcpMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatLoginAccepted(payload: LoginAcceptedPayload): Buffer = js.native
  def formatLoginRejected(payload: LoginRejectedPayload): Buffer = js.native
  def formatLoginRequest(payload: LoginRequestPayload): Buffer = js.native
  def parseLoginAccepted(payload: Buffer): LoginAcceptedPayload = js.native
  def parseLoginRejected(payload: Buffer): LoginRejectedPayload = js.native
  def parseLoginRequest(payload: Buffer): LoginRequestPayload = js.native
}

