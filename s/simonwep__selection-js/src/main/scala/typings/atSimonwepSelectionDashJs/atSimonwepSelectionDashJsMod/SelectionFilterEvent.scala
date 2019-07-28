package typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsMod

import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.selectionFilter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionFilterEvent extends js.Object {
  var element: Element
  var eventName: selectionFilter
  var selection: Selection
}

object SelectionFilterEvent {
  @scala.inline
  def apply(element: Element, eventName: selectionFilter, selection: Selection): SelectionFilterEvent = {
    val __obj = js.Dynamic.literal(element = element, eventName = eventName, selection = selection)
  
    __obj.asInstanceOf[SelectionFilterEvent]
  }
}

