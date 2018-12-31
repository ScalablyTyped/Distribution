package typings
package prexLib.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", "Barrier")
@js.native
class Barrier protected ()
  extends prexLib.outLibBarrierMod.Barrier {
  /**
    * Initializes a new instance of the Barrier class.
    *
    * @param participantCount The initial number of participants for the barrier.
    * @param postPhaseAction An action to execute between each phase.
    */
  def this(participantCount: scala.Double) = this()
  def this(participantCount: scala.Double, postPhaseAction: js.Function1[
      /* barrier */ prexLib.outLibBarrierMod.Barrier, 
      scala.Unit | js.Thenable[scala.Unit]
    ]) = this()
}

