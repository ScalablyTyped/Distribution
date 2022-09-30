package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barrierMod {
  
  @JSImport("prex/out/lib/barrier", "Barrier")
  @js.native
  open class Barrier protected () extends StObject {
    /**
      * Initializes a new instance of the Barrier class.
      *
      * @param participantCount The initial number of participants for the barrier.
      * @param postPhaseAction An action to execute between each phase.
      */
    def this(participantCount: Double) = this()
    def this(
      participantCount: Double,
      postPhaseAction: js.Function1[/* barrier */ Barrier, Unit | PromiseLike[Unit]]
    ) = this()
    
    /* private */ var _finishPhase: Any = js.native
    
    /* private */ var _isExecutingPostPhaseAction: Any = js.native
    
    /* private */ var _nextPhase: Any = js.native
    
    /* private */ var _participantCount: Any = js.native
    
    /* private */ var _phaseNumber: Any = js.native
    
    /* private */ var _postPhaseAction: Any = js.native
    
    /* private */ var _rejectNextPhase: Any = js.native
    
    /* private */ var _remainingParticipants: Any = js.native
    
    /* private */ var _resolveNextPhase: Any = js.native
    
    /* private */ var _waiters: Any = js.native
    
    /**
      * Notifies the Barrier there will be additional participants.
      *
      * @param participantCount The number of additional participants.
      */
    def add(): Unit = js.native
    def add(participantCount: Double): Unit = js.native
    
    /**
      * Gets the number of the Barrier's current phase.
      */
    def currentPhaseNumber: Double = js.native
    
    /**
      * Gets the total number of participants in the barrier.
      */
    def participantCount: Double = js.native
    
    /**
      * Gets the number of participants in the barrier that haven't yet signaled in the current phase.
      */
    def remainingParticipants: Double = js.native
    
    /**
      * Notifies the Barrier there will be fewer participants.
      *
      * @param participantCount The number of participants to remove.
      */
    def remove(): Unit = js.native
    def remove(participantCount: Double): Unit = js.native
    
    /**
      * Signals that a participant has reached the barrier and waits for all other participants
      * to reach the barrier.
      *
      * @param token An optional CancellationToken used to cancel the request.
      */
    def signalAndWait(): js.Promise[Unit] = js.native
    def signalAndWait(token: Cancelable): js.Promise[Unit] = js.native
    def signalAndWait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
