package typings.samchon

import typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelMediatorSystemMod.MediatorSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDistributedSystemArrayMediatorMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/distributed/DistributedSystemArrayMediator", "DistributedSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedSystemArrayMediator[System /* <: DistributedSystem */] () extends DistributedSystemArray[System] {
    
    /**
      * Factory method creating a {@link MediatorSystem} object.
      *
      * The {@link createMediator createMediator()} is an abstract method creating the {@link MediatorSystem} object.
      *
      * You know what? this {@link DistributedSystemArrayMediator} class be a master for its slave systems, and be a
      * slave to its master system at the same time. The {@link MediatorSystem} object makes it possible; be a slave
      * system. This {@link createMediator} determines specific type of the {@link MediatorSystem}.
      *
      * Overrides the {@link createMediator createMediator()} method to create and return one of them following which
      * protocol and which type of remote connection (server or client) will be used:
      *
      * - A client slave connecting to master server:
      *   - {@link MediatorClient}
      *   - {@link MediatorWebClient}
      *   - {@link MediatorSharedWorkerClient}
      * - A server slave accepting master client:
      *   - {@link MediatorServer}
      *   - {@link MediatorWebServer}
      *   - {@link MediatorDedicatedWorkerServer}
      *   - {@link MediatorSharedWorkerServer}
      *
      * @return A newly created {@link MediatorSystem} object.
      */
    /* protected */ def createMediator(): MediatorSystem = js.native
    
    /**
      * Get {@link MediatorSystem} object.
      *
      * When you need to send an {@link Invoke} message to the master system of this
      * {@link DistributedSystemArrayMediator}, then send to the {@link MediatorSystem} through this
      * {@link getMediator}.
      *
      * ```typescript
      * this.getMediator().sendData(...);
      * ```
      *
      * @return The {@link MediatorSystem} object.
      */
    def getMediator(): MediatorSystem = js.native
    
    /**
      * @hidden
      */
    /* private */ var mediator_ : Any = js.native
    
    /**
      * Start mediator.
      *
      * If the {@link getMediator mediator} is a type of server, then opens the server accepting master client.
      * Otherwise, the {@link getMediator mediator} is a type of client, then connects the master server.
      */
    /* protected */ def startMediator(): Unit = js.native
  }
}
