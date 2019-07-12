package typings
package reactDashDndLib.libInterfacesMonitorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragLayerMonitor extends js.Object {
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
    * Returns null if no item is being dragged.
    */
  def getClientOffset(): XYCoord | scala.Null
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client
    * offset when current the drag operation has started. Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): XYCoord | scala.Null
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): XYCoord | scala.Null
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current
    * drag operation has started. Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): XYCoord | scala.Null
  /**
    * Returns a plain object representing the currently dragged item.
    * Every drag source must specify it by returning an object from its beginDrag() method.
    * Returns null if no item is being dragged.
    */
  def getItem(): js.Any
  /**
    * Returns a string or an ES6 symbol identifying the type of the current dragged item.
    * Returns null if no item is being dragged.
    */
  def getItemType(): dndDashCoreLib.libInterfacesMod.Identifier | scala.Null
  /**
    * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its
    * position at the time when the current drag operation has started, and the movement difference.
    * Returns null if no item is being dragged.
    */
  def getSourceClientOffset(): XYCoord | scala.Null
  /**
    * Returns true if a drag operation is in progress. Returns false otherwise.
    */
  def isDragging(): scala.Boolean
}

object DragLayerMonitor {
  @scala.inline
  def apply(
    getClientOffset: () => XYCoord | scala.Null,
    getDifferenceFromInitialOffset: () => XYCoord | scala.Null,
    getInitialClientOffset: () => XYCoord | scala.Null,
    getInitialSourceClientOffset: () => XYCoord | scala.Null,
    getItem: () => js.Any,
    getItemType: () => dndDashCoreLib.libInterfacesMod.Identifier | scala.Null,
    getSourceClientOffset: () => XYCoord | scala.Null,
    isDragging: () => scala.Boolean
  ): DragLayerMonitor = {
    val __obj = js.Dynamic.literal(getClientOffset = js.Any.fromFunction0(getClientOffset), getDifferenceFromInitialOffset = js.Any.fromFunction0(getDifferenceFromInitialOffset), getInitialClientOffset = js.Any.fromFunction0(getInitialClientOffset), getInitialSourceClientOffset = js.Any.fromFunction0(getInitialSourceClientOffset), getItem = js.Any.fromFunction0(getItem), getItemType = js.Any.fromFunction0(getItemType), getSourceClientOffset = js.Any.fromFunction0(getSourceClientOffset), isDragging = js.Any.fromFunction0(isDragging))
  
    __obj.asInstanceOf[DragLayerMonitor]
  }
}

