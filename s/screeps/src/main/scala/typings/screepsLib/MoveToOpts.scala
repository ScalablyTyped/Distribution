package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToOpts extends FindPathOpts {
  /**
    * If this option is set to true, `moveTo` method will return `ERR_NOT_FOUND` if there is no memorized path to reuse. This can
    * significantly save CPU time in some cases. The default value is false.
    */
  var noPathFinding: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This option enables reusing the path found along multiple game ticks. It allows to save CPU time, but can result in a slightly
    * slower creep reaction behavior. The path is stored into the creep's memory to the `_move` property. The `reusePath` value defines
    * the amount of ticks which the path should be reused for. The default value is 5. Increase the amount to save more CPU, decrease
    * to make the movement more consistent. Set to 0 if you want to disable path reusing.
    */
  var reusePath: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `reusePath` is enabled and this option is set to true, the path will be stored in memory in the short serialized form using
    * `Room.serializePath`. The default value is true.
    */
  var serializeMemory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Draw a line along the creep’s path using `RoomVisual.poly`. You can provide either an empty object or custom style parameters.
    */
  var visualizePathStyle: js.UndefOr[PolyStyle] = js.undefined
}

