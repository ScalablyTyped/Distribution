package typings
package atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleSelectionEvent extends SelectionEvent {
  var target: stdLib.Element
}

object SingleSelectionEvent {
  @scala.inline
  def apply(
    areaElement: js.Array[stdLib.Element],
    changedElements: atSimonwepSelectionDashJsLib.Anon_Added,
    eventName: java.lang.String,
    originalEvent: stdLib.MouseEvent | stdLib.TouchEvent,
    selectedElements: js.Array[stdLib.Element],
    selection: Selection,
    target: stdLib.Element
  ): SingleSelectionEvent = {
    val __obj = js.Dynamic.literal(areaElement = areaElement, changedElements = changedElements, eventName = eventName, originalEvent = originalEvent.asInstanceOf[js.Any], selectedElements = selectedElements, selection = selection, target = target)
  
    __obj.asInstanceOf[SingleSelectionEvent]
  }
}

