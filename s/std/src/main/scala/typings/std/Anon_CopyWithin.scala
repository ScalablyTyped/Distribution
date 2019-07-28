package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyWithin extends js.Object {
  var copyWithin: scala.Boolean
  var entries: scala.Boolean
  var fill: scala.Boolean
  var find: scala.Boolean
  var findIndex: scala.Boolean
  var keys: scala.Boolean
  var values: scala.Boolean
}

object Anon_CopyWithin {
  @scala.inline
  def apply(
    copyWithin: scala.Boolean,
    entries: scala.Boolean,
    fill: scala.Boolean,
    find: scala.Boolean,
    findIndex: scala.Boolean,
    keys: scala.Boolean,
    values: scala.Boolean
  ): Anon_CopyWithin = {
    val __obj = js.Dynamic.literal(copyWithin = copyWithin, entries = entries, fill = fill, find = find, findIndex = findIndex, keys = keys, values = values)
  
    __obj.asInstanceOf[Anon_CopyWithin]
  }
}

