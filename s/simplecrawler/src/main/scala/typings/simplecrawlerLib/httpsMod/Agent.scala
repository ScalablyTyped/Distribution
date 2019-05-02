package typings
package simplecrawlerLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent
  extends simplecrawlerLib.httpMod.Agent {
  var options: js.UndefOr[AgentOptions] = js.native
}

@JSImport("https", "Agent")
@js.native
class AgentCls () extends Agent {
  def this(options: AgentOptions) = this()
}

@JSImport("https", "Agent")
@js.native
object Agent
  extends org.scalablytyped.runtime.Instantiable0[Agent]
     with org.scalablytyped.runtime.Instantiable1[/* options */ AgentOptions, Agent]

