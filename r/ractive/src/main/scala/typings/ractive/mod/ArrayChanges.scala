package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayChanges extends js.Object {
  /**
  	 * A list of any removed items.
  	 */
  var deleted: js.Array[_] = js.native
  /**
  	 * A list of any added items.
  	 */
  var inserted: js.Array[_] = js.native
  /**
  	 * The starting index for the changes.
  	 */
  var start: Double = js.native
}

object ArrayChanges {
  @scala.inline
  def apply(deleted: js.Array[_], inserted: js.Array[_], start: Double): ArrayChanges = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChanges]
  }
  @scala.inline
  implicit class ArrayChangesOps[Self <: ArrayChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeletedVarargs(value: js.Any*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[_]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertedVarargs(value: js.Any*): Self = this.set("inserted", js.Array(value :_*))
    @scala.inline
    def setInserted(value: js.Array[_]): Self = this.set("inserted", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

