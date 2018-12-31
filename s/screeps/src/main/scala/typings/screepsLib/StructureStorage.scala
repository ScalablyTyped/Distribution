package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure that can store huge amount of resource units. Only one structure
  * per room is allowed that can be addressed by `Room.storage` property.
  */
trait StructureStorage extends OwnedStructure[STRUCTURE_STORAGE] {
  /**
    * An object with the storage contents.
    */
  var store: StoreDefinition
  /**
    * The total amount of resources the storage can contain.
    */
  var storeCapacity: scala.Double
}

