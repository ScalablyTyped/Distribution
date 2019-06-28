package typings
package atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionFilterEvent extends js.Object {
  var element: stdLib.Element
  var eventName: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectionFilter
  var selection: Selection
}

object SelectionFilterEvent {
  @scala.inline
  def apply(
    element: stdLib.Element,
    eventName: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectionFilter,
    selection: Selection
  ): SelectionFilterEvent = {
    val __obj = js.Dynamic.literal(element = element, eventName = eventName, selection = selection)
  
    __obj.asInstanceOf[SelectionFilterEvent]
  }
}

