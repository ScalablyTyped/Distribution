package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure which is a control center of NPC Strongholds, and also rules all invaders in the sector.
  */
trait StructureInvaderCore
  extends OwnedStructure[STRUCTURE_INVADER_CORE]
     with AnyOwnedStructure {
  /**
    * The level of the stronghold. The amount and quality of the loot depends on the level.
    */
  var level: Double
  /**
    * Shows the timer for a not yet deployed stronghold, undefined otherwise.
    */
  var ticksToDeploy: Double
}

@JSGlobal("StructureInvaderCore")
@js.native
object StructureInvaderCore extends TopLevel[StructureInvaderCoreConstructor]

