package typings.samchon

import typings.samchon.externalSystemArrayMod.ExternalSystemArray
import typings.samchon.iexternalserverMod.IExternalServer
import typings.samchon.iserverconnectorMod.IServerConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalServerMod {
  
  @JSImport("samchon/templates/external/derived/ExternalServer", "ExternalServer")
  @js.native
  abstract class ExternalServer protected () extends IExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: ExternalSystemArray[IExternalServer]) = this()
    
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
