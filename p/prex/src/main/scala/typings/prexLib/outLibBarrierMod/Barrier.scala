package typings
package prexLib.outLibBarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/barrier", "Barrier")
@js.native
class Barrier protected () extends js.Object {
  /**
       * Initializes a new instance of the Barrier class.
       *
       * @param participantCount The initial number of participants for the barrier.
       * @param postPhaseAction An action to execute between each phase.
       */
  def this(participantCount: scala.Double) = this()
  /**
       * Initializes a new instance of the Barrier class.
       *
       * @param participantCount The initial number of participants for the barrier.
       * @param postPhaseAction An action to execute between each phase.
       */
  def this(participantCount: scala.Double, postPhaseAction: js.Function1[/* barrier */ Barrier, scala.Unit | stdLib.PromiseLike[scala.Unit]]) = this()
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
       * Gets the number of the Barrier's current phase.
       */
  val currentPhaseNumber: scala.Double = js.native
  /**
       * Gets the total number of participants in the barrier.
       */
  val participantCount: scala.Double = js.native
  /**
       * Gets the number of participants in the barrier that haven't yet signaled in the current phase.
       */
  val remainingParticipants: scala.Double = js.native
  /**
       * Notifies the Barrier there will be additional participants.
       *
       * @param participantCount The number of additional participants.
       */
  def add(): scala.Unit = js.native
  /**
       * Notifies the Barrier there will be additional participants.
       *
       * @param participantCount The number of additional participants.
       */
  def add(participantCount: scala.Double): scala.Unit = js.native
  /**
       * Notifies the Barrier there will be fewer participants.
       *
       * @param participantCount The number of participants to remove.
       */
  def remove(): scala.Unit = js.native
  /**
       * Notifies the Barrier there will be fewer participants.
       *
       * @param participantCount The number of participants to remove.
       */
  def remove(participantCount: scala.Double): scala.Unit = js.native
  /**
       * Signals that a participant has reached the barrier and waits for all other participants
       * to reach the barrier.
       *
       * @param token An optional CancellationToken used to cancel the request.
       */
  def signalAndWait(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Signals that a participant has reached the barrier and waits for all other participants
       * to reach the barrier.
       *
       * @param token An optional CancellationToken used to cancel the request.
       */
  def signalAndWait(token: prexLib.outLibCancellationMod.CancellationToken): stdLib.Promise[scala.Unit] = js.native
}

