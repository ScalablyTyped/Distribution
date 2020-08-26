package typings.splitpanes.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesMethods extends js.Object {
  def bindEvents(): Unit = js.native
  def calculatePanesSize(drag: js.Object): Boolean | Unit = js.native
  def doPushOtherPanes(sums: js.Object, dragPercentage: Double): js.Any = js.native
  def findNextExpandedPane(splitterIndex: Double): js.Object = js.native
  def findPrevExpandedPane(splitterIndex: Double): js.Object = js.native
  def getCurrentDragPercentage(drag: js.Object): Double = js.native
  def getCurrentMouseDrag(e: Event): positionTypes = js.native
  def onMouseDown(e: Event, splitterIndex: Double): Unit = js.native
  def onMouseMove(e: Event): Unit = js.native
  def onMouseUp(): Unit = js.native
  def onSplitterClick(e: Event, splitterIndex: Double): Unit = js.native
  def onSplitterDblClick(e: Event, splitterIndex: Double): Unit = js.native
  def sumNextPanesSize(splitterIndex: Double): js.Object = js.native
  def sumPrevPanesSize(splitterIndex: Double): js.Object = js.native
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
  @scala.inline
  implicit class splitPanesMethodsOps[Self <: splitPanesMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindEvents(value: () => Unit): Self = this.set("bindEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setCalculatePanesSize(value: js.Object => Boolean | Unit): Self = this.set("calculatePanesSize", js.Any.fromFunction1(value))
    @scala.inline
    def setDoPushOtherPanes(value: (js.Object, Double) => js.Any): Self = this.set("doPushOtherPanes", js.Any.fromFunction2(value))
    @scala.inline
    def setFindNextExpandedPane(value: Double => js.Object): Self = this.set("findNextExpandedPane", js.Any.fromFunction1(value))
    @scala.inline
    def setFindPrevExpandedPane(value: Double => js.Object): Self = this.set("findPrevExpandedPane", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentDragPercentage(value: js.Object => Double): Self = this.set("getCurrentDragPercentage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentMouseDrag(value: Event => positionTypes): Self = this.set("getCurrentMouseDrag", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseDown(value: (Event, Double) => Unit): Self = this.set("onMouseDown", js.Any.fromFunction2(value))
    @scala.inline
    def setOnMouseMove(value: Event => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseUp(value: () => Unit): Self = this.set("onMouseUp", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSplitterClick(value: (Event, Double) => Unit): Self = this.set("onSplitterClick", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSplitterDblClick(value: (Event, Double) => Unit): Self = this.set("onSplitterDblClick", js.Any.fromFunction2(value))
    @scala.inline
    def setSumNextPanesSize(value: Double => js.Object): Self = this.set("sumNextPanesSize", js.Any.fromFunction1(value))
    @scala.inline
    def setSumPrevPanesSize(value: Double => js.Object): Self = this.set("sumPrevPanesSize", js.Any.fromFunction1(value))
  }
  
}

