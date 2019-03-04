package typings
package reactDashDndLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragLayerMonitor extends js.Object {
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
    * Returns null if no item is being dragged.
    */
  def getClientOffset(): dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client
    * offset when current the drag operation has started. Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current
    * drag operation has started. Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null
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
  def getSourceClientOffset(): dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null
  /**
    * Returns true if a drag operation is in progress. Returns false otherwise.
    */
  def isDragging(): scala.Boolean
}

object DragLayerMonitor {
  @scala.inline
  def apply(
    getClientOffset: js.Function0[dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null],
    getDifferenceFromInitialOffset: js.Function0[dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null],
    getInitialClientOffset: js.Function0[dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null],
    getInitialSourceClientOffset: js.Function0[dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null],
    getItem: js.Function0[js.Any],
    getItemType: js.Function0[dndDashCoreLib.libInterfacesMod.Identifier | scala.Null],
    getSourceClientOffset: js.Function0[dndDashCoreLib.libInterfacesMod.XYCoord | scala.Null],
    isDragging: js.Function0[scala.Boolean]
  ): DragLayerMonitor = {
    val __obj = js.Dynamic.literal(getClientOffset = getClientOffset, getDifferenceFromInitialOffset = getDifferenceFromInitialOffset, getInitialClientOffset = getInitialClientOffset, getInitialSourceClientOffset = getInitialSourceClientOffset, getItem = getItem, getItemType = getItemType, getSourceClientOffset = getSourceClientOffset, isDragging = isDragging)
  
    __obj.asInstanceOf[DragLayerMonitor]
  }
}

