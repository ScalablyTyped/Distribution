package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatLoginAccepted(payload: soupbintcpLib.soupbintcpMod.LoginAcceptedPayload): nodeLib.Buffer = js.native
  def formatLoginRejected(payload: soupbintcpLib.soupbintcpMod.LoginRejectedPayload): nodeLib.Buffer = js.native
  def formatLoginRequest(payload: soupbintcpLib.soupbintcpMod.LoginRequestPayload): nodeLib.Buffer = js.native
  def parseLoginAccepted(payload: nodeLib.Buffer): soupbintcpLib.soupbintcpMod.LoginAcceptedPayload = js.native
  def parseLoginRejected(payload: nodeLib.Buffer): soupbintcpLib.soupbintcpMod.LoginRejectedPayload = js.native
  def parseLoginRequest(payload: nodeLib.Buffer): soupbintcpLib.soupbintcpMod.LoginRequestPayload = js.native
}

