package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyWithin")(copyWithin)
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("findIndex")(findIndex)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_CopyWithin]
  }
}

