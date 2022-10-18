package typings.samchon

import typings.samchon.protocolCommunicatorIserverconnectorMod.IServerConnector
import typings.samchon.templatesParallelInterfacesIparallelserverMod.IParallelServer
import typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesParallelDerivedParallelServerMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel/derived/ParallelServer", "ParallelServer")
  @js.native
  open class ParallelServer protected () extends IParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: ParallelSystemArray[IParallelServer]) = this()
    
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
    /* protected */ def createServerConnector(): IServerConnector = js.native
    
    /**
      * IP address of target external system to connect.
      */
    /* protected */ var ip: String = js.native
    
    /**
      * Port number of target external system to connect.
      */
    /* protected */ var port: Double = js.native
  }
}
