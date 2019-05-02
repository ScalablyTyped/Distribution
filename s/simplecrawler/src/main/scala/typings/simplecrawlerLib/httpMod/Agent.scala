package typings
package simplecrawlerLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "Agent")
@js.native
class Agent () extends js.Object {
  def this(opts: AgentOptions) = this()
  var maxFreeSockets: scala.Double = js.native
  var maxSockets: scala.Double = js.native
  var requests: js.Any = js.native
  var sockets: js.Any = js.native
  /**
    * Destroy any sockets that are currently in use by the agent.
    * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
    * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
    * sockets may hang open for quite a long time before the server terminates them.
    */
  def destroy(): scala.Unit = js.native
}

