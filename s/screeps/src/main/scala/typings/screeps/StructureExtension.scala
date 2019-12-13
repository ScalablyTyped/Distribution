package typings.screeps

import org.scalablytyped.runtime.TopLevel
import typings.screeps.screepsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains energy which can be spent on spawning bigger creeps. Extensions can
  * be placed anywhere in the room, any spawns will be able to use them regardless
  * of distance.
  */
trait StructureExtension
  extends OwnedStructure[STRUCTURE_EXTENSION]
     with AnyOwnedStructure
     with AnyStoreStructure {
  /**
    * The amount of energy containing in the extension.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double
  /**
    * The total amount of energy the extension can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: Store[RESOURCE_ENERGY, `false`]
}

@JSGlobal("StructureExtension")
@js.native
object StructureExtension extends TopLevel[StructureExtensionConstructor]

