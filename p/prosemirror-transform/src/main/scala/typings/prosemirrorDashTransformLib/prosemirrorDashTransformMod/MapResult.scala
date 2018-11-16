package typings
package prosemirrorDashTransformLib.prosemirrorDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "MapResult")
@js.native
class MapResult () extends js.Object {
  /**
     * Tells you whether the position was deleted, that is,
     * whether the step removed its surroundings from the document.
     */
  var deleted: scala.Boolean = js.native
  /**
     * The mapped version of the position.
     */
  var pos: scala.Double = js.native
}

