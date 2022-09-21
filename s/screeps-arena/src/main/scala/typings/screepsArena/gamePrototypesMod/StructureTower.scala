package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.anon.StoreResourceConstant
import typings.screepsArena.constantsMod.AnyCreep
import typings.screepsArena.constantsMod.ScreepsReturnCode
import typings.screepsArena.constantsMod._BuildableStructure
import typings.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructureTower
  extends StObject
     with OwnedStructure[STRUCTURE_TOWER]
     with _BuildableStructure {
  
  /**
    * Remotely attack any creep or structure.
    * The target has to be within 50 squares range of the tower.
    * Attack effectiveness	600 hits at range ≤5 to 150 hits at range ≥20
    */
  def attack(target: AnyCreep): ScreepsReturnCode = js.native
  def attack(target: Structure[StructureConstant]): ScreepsReturnCode = js.native
  
  /**
    * 10-ticks cooldown for towers (Tower.cooldown). Exception: towers in CTF can shoot each tick.
    */
  var cooldown: Double = js.native
  
  /**
    * Remotely heal any creep.
    * The target has to be within 50 squares range of the tower.
    * Heal effectiveness	400 hits at range ≤5 to 100 hits at range ≥20
    */
  def heal(target: AnyCreep): ScreepsReturnCode = js.native
  
  /**
    * A Store object that contains a cargo of this structure. Towers can contain only energy.
    */
  var store: StoreResourceConstant = js.native
}
object StructureTower {
  
  inline def apply: StructureTowerConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureTower").asInstanceOf[StructureTowerConstructor]
}
