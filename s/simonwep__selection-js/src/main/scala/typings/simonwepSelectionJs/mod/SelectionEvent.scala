package typings.simonwepSelectionJs.mod

import typings.simonwepSelectionJs.anon.Added
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionEvent extends js.Object {
  var area: Element
  var changed: Added
  var inst: Selection
  var oe: MouseEvent | TouchEvent
  var selected: js.Array[Element]
}

object SelectionEvent {
  @scala.inline
  def apply(
    area: Element,
    changed: Added,
    inst: Selection,
    oe: MouseEvent | TouchEvent,
    selected: js.Array[Element]
  ): SelectionEvent = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], inst = inst.asInstanceOf[js.Any], oe = oe.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionEvent]
  }
}

