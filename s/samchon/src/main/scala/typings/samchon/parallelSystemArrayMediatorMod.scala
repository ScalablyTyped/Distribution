package typings.samchon

import typings.samchon.mediatorSystemMod.MediatorSystem
import typings.samchon.parallelSystemArrayMod.ParallelSystemArray
import typings.samchon.parallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelSystemArrayMediatorMod {
  
  @JSImport("samchon/templates/parallel/ParallelSystemArrayMediator", "ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: ParallelSystem */] () extends ParallelSystemArray[System] {
    
    /**
      * Factory method creating a {@link MediatorSystem} object.
      *
      * The {@link createMediator createMediator()} is an abstract method creating the {@link MediatorSystem} object.
      *
      * You know what? this {@link ParallelSystemArrayMediator} class be a **master** for its slave systems, and be a
      * **slave** to its master system at the same time. The {@link MediatorSystem} object makes it possible; be a
      * **slave** system. This {@link createMediator} determines specific type of the {@link MediatorSystem}.
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
      * {@link ParallelSystemArrayMediator}, then send to the {@link MediatorSystem} through this {@link getMediator}.
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
    /* private */ var mediator_ : js.Any = js.native
    
    /**
      * Start mediator.
      *
      * If the {@link getMediator mediator} is a type of server, then opens the server accepting master client.
      * Otherwise, the {@link getMediator mediator} is a type of client, then connects the master server.
      */
    /* protected */ def startMediator(): Unit = js.native
  }
}
