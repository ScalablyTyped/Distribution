package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWithin extends js.Object {
  var copyWithin: Boolean = js.native
  var entries: Boolean = js.native
  var fill: Boolean = js.native
  var find: Boolean = js.native
  var findIndex: Boolean = js.native
  var keys: Boolean = js.native
  var values: Boolean = js.native
}

object CopyWithin {
  @scala.inline
  def apply(
    copyWithin: Boolean,
    entries: Boolean,
    fill: Boolean,
    find: Boolean,
    findIndex: Boolean,
    keys: Boolean,
    values: Boolean
  ): CopyWithin = {
    val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWithin]
  }
  @scala.inline
  implicit class CopyWithinOps[Self <: CopyWithin] (val x: Self) extends AnyVal {
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
    def setCopyWithin(value: Boolean): Self = this.set("copyWithin", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntries(value: Boolean): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: Boolean): Self = this.set("find", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindIndex(value: Boolean): Self = this.set("findIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: Boolean): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

