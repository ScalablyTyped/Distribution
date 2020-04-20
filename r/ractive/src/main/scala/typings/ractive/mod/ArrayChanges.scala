package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayChanges extends js.Object {
  /**
  	 * A list of any removed items.
  	 */
  var deleted: js.Array[_]
  /**
  	 * A list of any added items.
  	 */
  var inserted: js.Array[_]
  /**
  	 * The starting index for the changes.
  	 */
  var start: Double
}

object ArrayChanges {
  @scala.inline
  def apply(deleted: js.Array[_], inserted: js.Array[_], start: Double): ArrayChanges = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChanges]
  }
}

