package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barrierMod {
  
  @JSImport("prex/out/lib/barrier", "Barrier")
  @js.native
  class Barrier protected () extends StObject {
    /**
      * Initializes a new instance of the Barrier class.
      *
      * @param participantCount The initial number of participants for the barrier.
      * @param postPhaseAction An action to execute between each phase.
      */
    def this(participantCount: Double) = this()
    def this(
      participantCount: Double,
      postPhaseAction: js.Function1[/* barrier */ Barrier, Unit | js.Thenable[Unit]]
    ) = this()
    
    var _finishPhase: js.Any = js.native
    
    var _isExecutingPostPhaseAction: js.Any = js.native
    
    var _nextPhase: js.Any = js.native
    
    var _participantCount: js.Any = js.native
    
    var _phaseNumber: js.Any = js.native
    
    var _postPhaseAction: js.Any = js.native
    
    var _rejectNextPhase: js.Any = js.native
    
    var _remainingParticipants: js.Any = js.native
    
    var _resolveNextPhase: js.Any = js.native
    
    var _waiters: js.Any = js.native
    
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
