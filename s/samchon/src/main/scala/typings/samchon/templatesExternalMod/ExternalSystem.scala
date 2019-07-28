package typings.samchon.templatesExternalMod

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", "ExternalSystem")
@js.native
abstract class ExternalSystem protected ()
  extends typings.samchon.templatesExternalExternalSystemMod.ExternalSystem {
  /**
    * Construct from parent {@link ExternalSystemArray}.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    */
  def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typings.samchon.templatesExternalExternalSystemMod.ExternalSystem]) = this()
  /**
    * Constrct from parent {@link ExternalSystemArray} and communicator.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    * @param communicator Communicator with the remote, external system.
    */
  def this(
    systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typings.samchon.templatesExternalExternalSystemMod.ExternalSystem],
    communicator: IClientDriver
  ) = this()
}

