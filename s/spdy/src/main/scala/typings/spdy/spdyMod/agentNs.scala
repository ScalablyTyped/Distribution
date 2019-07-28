package typings.spdy.spdyMod

import typings.spdy.Anon_Plain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "agent")
@js.native
object agentNs extends js.Object {
  @js.native
  class Agent ()
    extends typings.node.httpsMod.Agent
  
  trait AgentOptions
    extends typings.node.httpsMod.AgentOptions {
    var spdy: js.UndefOr[Anon_Plain] = js.undefined
  }
  
  @js.native
  class PlainAgent ()
    extends typings.node.httpMod.Agent
  
  def create(base: js.Any, options: typings.spdy.spdyMod.agentNs.AgentOptions): typings.spdy.spdyMod.agentNs.Agent | typings.spdy.spdyMod.agentNs.PlainAgent = js.native
}

