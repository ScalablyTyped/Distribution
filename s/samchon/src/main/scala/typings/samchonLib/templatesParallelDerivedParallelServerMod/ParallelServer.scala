package typings
package samchonLib.templatesParallelDerivedParallelServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/derived/ParallelServer", "ParallelServer")
@js.native
abstract class ParallelServer protected ()
  extends samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer {
  /**
    * Construct from parent {@link ParallelSystemArray}.
    *
    * @param systemArray The parent {@link ParallelSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer]) = this()
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
    * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the slave server
    * follows:
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

