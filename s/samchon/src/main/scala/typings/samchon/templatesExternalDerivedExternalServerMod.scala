package typings.samchon

import typings.samchon.protocolCommunicatorIServerConnectorMod.IServerConnector
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/derived/ExternalServer", JSImport.Namespace)
@js.native
object templatesExternalDerivedExternalServerMod extends js.Object {
  @js.native
  abstract class ExternalServer protected () extends IExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: ExternalSystemArray[IExternalServer]) = this()
    /**
      * IP address of target external system to connect.
      */
    var ip: String = js.native
    /**
      * Port number of target external system to connect.
      */
    var port: Double = js.native
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
    /* protected */ def createServerConnector(): IServerConnector = js.native
  }
  
}

