package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesMethods extends js.Object {
  def bindEvents(): scala.Unit
  def calculatePanesSize(drag: js.Object): scala.Boolean | scala.Unit
  def doPushOtherPanes(sums: js.Object, dragPercentage: scala.Double): js.Any
  def findNextExpandedPane(splitterIndex: scala.Double): js.Object
  def findPrevExpandedPane(splitterIndex: scala.Double): js.Object
  def getCurrentDragPercentage(drag: js.Object): scala.Double
  def getCurrentMouseDrag(e: stdLib.Event): positionTypes
  def onMouseDown(e: stdLib.Event, splitterIndex: scala.Double): scala.Unit
  def onMouseMove(e: stdLib.Event): scala.Unit
  def onMouseUp(): scala.Unit
  def onSplitterClick(e: stdLib.Event, splitterIndex: scala.Double): scala.Unit
  def onSplitterDblClick(e: stdLib.Event, splitterIndex: scala.Double): scala.Unit
  def sumNextPanesSize(splitterIndex: scala.Double): js.Object
  def sumPrevPanesSize(splitterIndex: scala.Double): js.Object
}

object splitPanesMethods {
  @scala.inline
  def apply(
    bindEvents: () => scala.Unit,
    calculatePanesSize: js.Object => scala.Boolean | scala.Unit,
    doPushOtherPanes: (js.Object, scala.Double) => js.Any,
    findNextExpandedPane: scala.Double => js.Object,
    findPrevExpandedPane: scala.Double => js.Object,
    getCurrentDragPercentage: js.Object => scala.Double,
    getCurrentMouseDrag: stdLib.Event => positionTypes,
    onMouseDown: (stdLib.Event, scala.Double) => scala.Unit,
    onMouseMove: stdLib.Event => scala.Unit,
    onMouseUp: () => scala.Unit,
    onSplitterClick: (stdLib.Event, scala.Double) => scala.Unit,
    onSplitterDblClick: (stdLib.Event, scala.Double) => scala.Unit,
    sumNextPanesSize: scala.Double => js.Object,
    sumPrevPanesSize: scala.Double => js.Object
  ): splitPanesMethods = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), calculatePanesSize = js.Any.fromFunction1(calculatePanesSize), doPushOtherPanes = js.Any.fromFunction2(doPushOtherPanes), findNextExpandedPane = js.Any.fromFunction1(findNextExpandedPane), findPrevExpandedPane = js.Any.fromFunction1(findPrevExpandedPane), getCurrentDragPercentage = js.Any.fromFunction1(getCurrentDragPercentage), getCurrentMouseDrag = js.Any.fromFunction1(getCurrentMouseDrag), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp), onSplitterClick = js.Any.fromFunction2(onSplitterClick), onSplitterDblClick = js.Any.fromFunction2(onSplitterDblClick), sumNextPanesSize = js.Any.fromFunction1(sumNextPanesSize), sumPrevPanesSize = js.Any.fromFunction1(sumPrevPanesSize))
  
    __obj.asInstanceOf[splitPanesMethods]
  }
}

