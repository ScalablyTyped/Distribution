package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyWithin extends js.Object {
  var copyWithin: Boolean
  var entries: Boolean
  var fill: Boolean
  var find: Boolean
  var findIndex: Boolean
  var keys: Boolean
  var values: Boolean
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
}

