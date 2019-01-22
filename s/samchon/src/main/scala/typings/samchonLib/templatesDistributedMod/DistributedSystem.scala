package typings
package samchonLib.templatesDistributedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed", "DistributedSystem")
@js.native
abstract class DistributedSystem protected ()
  extends samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem {
  /**
    * Construct from parent {@link DistributedSystemArray}.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  /**
    * Constrct from parent {@link DistributedSystemArray} and communicator.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    * @param communicator A communicator communicates with remote, the external system.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
}

