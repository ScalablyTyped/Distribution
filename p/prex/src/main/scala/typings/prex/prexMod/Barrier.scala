package typings.prex.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "Barrier")
@js.native
class Barrier protected ()
  extends typings.prex.outLibBarrierMod.Barrier {
  /**
    * Initializes a new instance of the Barrier class.
    *
    * @param participantCount The initial number of participants for the barrier.
    * @param postPhaseAction An action to execute between each phase.
    */
  def this(participantCount: Double) = this()
  def this(
    participantCount: Double,
    postPhaseAction: js.Function1[/* barrier */ typings.prex.outLibBarrierMod.Barrier, Unit | js.Thenable[Unit]]
  ) = this()
}

