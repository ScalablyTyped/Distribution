package typings
package samchonLib.templatesExternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", "ExternalSystem")
@js.native
abstract class ExternalSystem protected ()
  extends samchonLib.templatesExternalExternalSystemMod.ExternalSystem {
  /**
    * Construct from parent {@link ExternalSystemArray}.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalExternalSystemMod.ExternalSystem]) = this()
  /**
    * Constrct from parent {@link ExternalSystemArray} and communicator.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    * @param communicator Communicator with the remote, external system.
    */
  def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalExternalSystemMod.ExternalSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
}

