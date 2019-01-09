package typings
package spdyLib.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "agent")
@js.native
object agentNs extends js.Object {
  @js.native
  class Agent ()
    extends nodeLib.httpsMod.Agent
  
  trait AgentOptions
    extends nodeLib.httpsMod.AgentOptions {
    var spdy: js.UndefOr[spdyLib.Anon_Plain] = js.undefined
  }
  
  @js.native
  class PlainAgent ()
    extends nodeLib.httpMod.Agent
  
  def create(base: js.Any, options: AgentOptions): Agent | PlainAgent = js.native
}

