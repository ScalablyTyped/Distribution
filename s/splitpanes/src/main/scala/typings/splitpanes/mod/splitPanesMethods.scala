package typings.splitpanes.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesMethods extends js.Object {
  def bindEvents(): Unit
  def calculatePanesSize(drag: js.Object): Boolean | Unit
  def doPushOtherPanes(sums: js.Object, dragPercentage: Double): js.Any
  def findNextExpandedPane(splitterIndex: Double): js.Object
  def findPrevExpandedPane(splitterIndex: Double): js.Object
  def getCurrentDragPercentage(drag: js.Object): Double
  def getCurrentMouseDrag(e: Event): positionTypes
  def onMouseDown(e: Event, splitterIndex: Double): Unit
  def onMouseMove(e: Event): Unit
  def onMouseUp(): Unit
  def onSplitterClick(e: Event, splitterIndex: Double): Unit
  def onSplitterDblClick(e: Event, splitterIndex: Double): Unit
  def sumNextPanesSize(splitterIndex: Double): js.Object
  def sumPrevPanesSize(splitterIndex: Double): js.Object
}

object splitPanesMethods {
  @scala.inline
  def apply(
    bindEvents: () => Unit,
    calculatePanesSize: js.Object => Boolean | Unit,
    doPushOtherPanes: (js.Object, Double) => js.Any,
    findNextExpandedPane: Double => js.Object,
    findPrevExpandedPane: Double => js.Object,
    getCurrentDragPercentage: js.Object => Double,
    getCurrentMouseDrag: Event => positionTypes,
    onMouseDown: (Event, Double) => Unit,
    onMouseMove: Event => Unit,
    onMouseUp: () => Unit,
    onSplitterClick: (Event, Double) => Unit,
    onSplitterDblClick: (Event, Double) => Unit,
    sumNextPanesSize: Double => js.Object,
    sumPrevPanesSize: Double => js.Object
  ): splitPanesMethods = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), calculatePanesSize = js.Any.fromFunction1(calculatePanesSize), doPushOtherPanes = js.Any.fromFunction2(doPushOtherPanes), findNextExpandedPane = js.Any.fromFunction1(findNextExpandedPane), findPrevExpandedPane = js.Any.fromFunction1(findPrevExpandedPane), getCurrentDragPercentage = js.Any.fromFunction1(getCurrentDragPercentage), getCurrentMouseDrag = js.Any.fromFunction1(getCurrentMouseDrag), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp), onSplitterClick = js.Any.fromFunction2(onSplitterClick), onSplitterDblClick = js.Any.fromFunction2(onSplitterDblClick), sumNextPanesSize = js.Any.fromFunction1(sumNextPanesSize), sumPrevPanesSize = js.Any.fromFunction1(sumPrevPanesSize))
    __obj.asInstanceOf[splitPanesMethods]
  }
}

