package typings.samchon.templatesDistributedMod

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed", "DistributedSystem")
@js.native
abstract class DistributedSystem protected ()
  extends typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem {
  /**
    * Construct from parent {@link DistributedSystemArray}.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    */
  def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  /**
    * Constrct from parent {@link DistributedSystemArray} and communicator.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    * @param communicator A communicator communicates with remote, the external system.
    */
  def this(
    systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem],
    communicator: IClientDriver
  ) = this()
}

