package typings.reactSortablePane.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProperty extends js.Object {
  var key: PaneKey
  var ref: Element | Null
}

object PaneProperty {
  @scala.inline
  def apply(key: PaneKey = null, ref: Element = null): PaneProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneProperty]
  }
}

