package typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsMod

import typings.atSimonwepSelectionDashJs.Anon_Added
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionEvent extends js.Object {
  var areaElement: js.Array[Element]
  var changedElements: Anon_Added
  var eventName: String
  var originalEvent: MouseEvent | TouchEvent
  var selectedElements: js.Array[Element]
  var selection: Selection
}

object SelectionEvent {
  @scala.inline
  def apply(
    areaElement: js.Array[Element],
    changedElements: Anon_Added,
    eventName: String,
    originalEvent: MouseEvent | TouchEvent,
    selectedElements: js.Array[Element],
    selection: Selection
  ): SelectionEvent = {
    val __obj = js.Dynamic.literal(areaElement = areaElement, changedElements = changedElements, eventName = eventName, originalEvent = originalEvent.asInstanceOf[js.Any], selectedElements = selectedElements, selection = selection)
  
    __obj.asInstanceOf[SelectionEvent]
  }
}

