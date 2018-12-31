package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains up to 2,000 resource units. Can be constructed in neutral rooms. Decays for 5,000 hits per 100 ticks.
  */
trait StructureContainer extends Structure[STRUCTURE_CONTAINER] {
  /**
    * An object with the structure contents. Each object key is one of the RESOURCE_* constants, values are resources
    * amounts. Use _.sum(structure.store) to get the total amount of contents
    */
  var store: StoreDefinition
  /**
    * The total amount of resources the structure can contain.
    */
  var storeCapacity: scala.Double
  /**
    * The amount of game ticks when this container will lose some hit points.
    */
  var ticksToDecay: scala.Double
}

