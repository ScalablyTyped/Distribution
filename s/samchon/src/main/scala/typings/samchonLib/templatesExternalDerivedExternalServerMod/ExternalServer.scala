package typings
package samchonLib.templatesExternalDerivedExternalServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/derived/ExternalServer", "ExternalServer")
@js.native
abstract class ExternalServer protected ()
  extends samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer {
  /**
    * Construct from parent {@link ExternalSystemArray}.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer]) = this()
  /**
    * IP address of target external system to connect.
    */
  var ip: java.lang.String = js.native
  /**
    * Port number of target external system to connect.
    */
  var port: scala.Double = js.native
  /**
    * Factory method creating {@link IServerConnector} object.
    *
    * The {@link createServerConnector createServerConnector()} is an abstract method creating
    * {@link IServerConnector} object. Overrides and returns one of them, considering which templates the external
    * system follows:
    *
    * - {@link ServerConnector}
    * - {@link WebServerConnector}
    * - {@link DedicatedWorkerServerConnector}
    * - {@link SharedWorkerServerConnector}
    *
    * @return A newly created {@link IServerConnector} object.
    */
  /* protected */ def createServerConnector(): samchonLib.protocolCommunicatorIServerConnectorMod.IServerConnector = js.native
}

