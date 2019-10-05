package typings.samchonDashFramework.samchonDashFrameworkMod.protocol

import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.SharedWorkerClientDriver")
@js.native
class SharedWorkerClientDriver protected ()
  extends typings.samchon.samchonMod.protocol.SharedWorkerClientDriver {
  /**
    * Construct from a MessagePort object.
    */
  def this(port: MessagePort) = this()
}

