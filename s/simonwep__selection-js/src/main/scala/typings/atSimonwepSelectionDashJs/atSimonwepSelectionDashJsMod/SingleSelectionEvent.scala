package typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsMod

import typings.atSimonwepSelectionDashJs.Anon_Added
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleSelectionEvent extends SelectionEvent {
  var target: Element
}

object SingleSelectionEvent {
  @scala.inline
  def apply(
    areaElement: js.Array[Element],
    changedElements: Anon_Added,
    eventName: String,
    originalEvent: MouseEvent | TouchEvent,
    selectedElements: js.Array[Element],
    selection: Selection,
    target: Element
  ): SingleSelectionEvent = {
    val __obj = js.Dynamic.literal(areaElement = areaElement, changedElements = changedElements, eventName = eventName, originalEvent = originalEvent.asInstanceOf[js.Any], selectedElements = selectedElements, selection = selection, target = target)
  
    __obj.asInstanceOf[SingleSelectionEvent]
  }
}

