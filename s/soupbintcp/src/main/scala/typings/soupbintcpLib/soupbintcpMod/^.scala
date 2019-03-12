package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatLoginAccepted(payload: LoginAcceptedPayload): nodeLib.Buffer = js.native
  def formatLoginRejected(payload: LoginRejectedPayload): nodeLib.Buffer = js.native
  def formatLoginRequest(payload: LoginRequestPayload): nodeLib.Buffer = js.native
  def parseLoginAccepted(payload: nodeLib.Buffer): LoginAcceptedPayload = js.native
  def parseLoginRejected(payload: nodeLib.Buffer): LoginRejectedPayload = js.native
  def parseLoginRequest(payload: nodeLib.Buffer): LoginRequestPayload = js.native
}

