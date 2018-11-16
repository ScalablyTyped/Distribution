package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The base prototype for a structure that has an owner. Such structures can be
 * found using `FIND_MY_STRUCTURES` and `FIND_HOSTILE_STRUCTURES` constants.
 */

trait OwnedStructure[T /* <: StructureConstant */] extends Structure[T] {
  /**
       * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
       */
  var my: scala.Boolean
  /**
       * An object with the structure’s owner info (if present) containing the following properties: username
       */
  var owner: Owner
}

