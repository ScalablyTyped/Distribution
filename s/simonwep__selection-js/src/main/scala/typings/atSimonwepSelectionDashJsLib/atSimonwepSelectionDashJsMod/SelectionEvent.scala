package typings
package atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionEvent extends js.Object {
  var areaElement: js.Array[stdLib.Element]
  var changedElements: atSimonwepSelectionDashJsLib.Anon_Added
  var eventName: java.lang.String
  var originalEvent: stdLib.MouseEvent | stdLib.TouchEvent
  var selectedElements: js.Array[stdLib.Element]
  var selection: Selection
}

object SelectionEvent {
  @scala.inline
  def apply(
    areaElement: js.Array[stdLib.Element],
    changedElements: atSimonwepSelectionDashJsLib.Anon_Added,
    eventName: java.lang.String,
    originalEvent: stdLib.MouseEvent | stdLib.TouchEvent,
    selectedElements: js.Array[stdLib.Element],
    selection: Selection
  ): SelectionEvent = {
    val __obj = js.Dynamic.literal(areaElement = areaElement, changedElements = changedElements, eventName = eventName, originalEvent = originalEvent.asInstanceOf[js.Any], selectedElements = selectedElements, selection = selection)
  
    __obj.asInstanceOf[SelectionEvent]
  }
}

