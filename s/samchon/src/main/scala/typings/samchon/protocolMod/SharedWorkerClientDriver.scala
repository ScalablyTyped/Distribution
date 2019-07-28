package typings.samchon.protocolMod

import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "SharedWorkerClientDriver")
@js.native
class SharedWorkerClientDriver protected ()
  extends typings.samchon.protocolCommunicatorClientUnderscoreDriverSharedWorkerClientDriverMod.SharedWorkerClientDriver {
  /**
    * Construct from a MessagePort object.
    */
  def this(port: MessagePort) = this()
}

