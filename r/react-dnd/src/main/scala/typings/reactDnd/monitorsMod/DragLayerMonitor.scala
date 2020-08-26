package typings.reactDnd.monitorsMod

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragLayerMonitor extends js.Object {
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
    * Returns null if no item is being dragged.
    */
  def getClientOffset(): XYCoord | Null = js.native
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client
    * offset when current the drag operation has started. Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): XYCoord | Null = js.native
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): XYCoord | Null = js.native
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current
    * drag operation has started. Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): XYCoord | Null = js.native
  /**
    * Returns a plain object representing the currently dragged item.
    * Every drag source must specify it by returning an object from its beginDrag() method.
    * Returns null if no item is being dragged.
    */
  def getItem(): js.Any = js.native
  /**
    * Returns a string or an ES6 symbol identifying the type of the current dragged item.
    * Returns null if no item is being dragged.
    */
  def getItemType(): Identifier | Null = js.native
  /**
    * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its
    * position at the time when the current drag operation has started, and the movement difference.
    * Returns null if no item is being dragged.
    */
  def getSourceClientOffset(): XYCoord | Null = js.native
  /**
    * Returns true if a drag operation is in progress. Returns false otherwise.
    */
  def isDragging(): Boolean = js.native
}

object DragLayerMonitor {
  @scala.inline
  def apply(
    getClientOffset: () => XYCoord | Null,
    getDifferenceFromInitialOffset: () => XYCoord | Null,
    getInitialClientOffset: () => XYCoord | Null,
    getInitialSourceClientOffset: () => XYCoord | Null,
    getItem: () => js.Any,
    getItemType: () => Identifier | Null,
    getSourceClientOffset: () => XYCoord | Null,
    isDragging: () => Boolean
  ): DragLayerMonitor = {
    val __obj = js.Dynamic.literal(getClientOffset = js.Any.fromFunction0(getClientOffset), getDifferenceFromInitialOffset = js.Any.fromFunction0(getDifferenceFromInitialOffset), getInitialClientOffset = js.Any.fromFunction0(getInitialClientOffset), getInitialSourceClientOffset = js.Any.fromFunction0(getInitialSourceClientOffset), getItem = js.Any.fromFunction0(getItem), getItemType = js.Any.fromFunction0(getItemType), getSourceClientOffset = js.Any.fromFunction0(getSourceClientOffset), isDragging = js.Any.fromFunction0(isDragging))
    __obj.asInstanceOf[DragLayerMonitor]
  }
  @scala.inline
  implicit class DragLayerMonitorOps[Self <: DragLayerMonitor] (val x: Self) extends AnyVal {
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
    def setGetClientOffset(value: () => XYCoord | Null): Self = this.set("getClientOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDifferenceFromInitialOffset(value: () => XYCoord | Null): Self = this.set("getDifferenceFromInitialOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInitialClientOffset(value: () => XYCoord | Null): Self = this.set("getInitialClientOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInitialSourceClientOffset(value: () => XYCoord | Null): Self = this.set("getInitialSourceClientOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: () => js.Any): Self = this.set("getItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItemType(value: () => Identifier | Null): Self = this.set("getItemType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceClientOffset(value: () => XYCoord | Null): Self = this.set("getSourceClientOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDragging(value: () => Boolean): Self = this.set("isDragging", js.Any.fromFunction0(value))
  }
  
}

