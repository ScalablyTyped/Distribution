package typings.samchon.protocolMod

import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol", "SharedWorkerClientDriver")
@js.native
class SharedWorkerClientDriver protected ()
  extends typings.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver {
  /**
    * Construct from a MessagePort object.
    */
  def this(port: MessagePort) = this()
}
