package typings.simpleDiff.mod

import typings.simpleDiff.simpleDiffNumbers.`-1`
import typings.simpleDiff.simpleDiffStrings.`add-item`
import typings.simpleDiff.simpleDiffStrings.`move-item`
import typings.simpleDiff.simpleDiffStrings.`remove-item`
import typings.simpleDiff.simpleDiffStrings.add
import typings.simpleDiff.simpleDiffStrings.change
import typings.simpleDiff.simpleDiffStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.simpleDiff.mod.AddEvent
  - typings.simpleDiff.mod.RemoveEvent
  - typings.simpleDiff.mod.ChangeEvent
  - typings.simpleDiff.mod.AddItemEvent
  - typings.simpleDiff.mod.RemoveItemEvent
  - typings.simpleDiff.mod.MoveItemEvent
*/
trait Event extends js.Object
object Event {
  
  @scala.inline
  def ChangeEvent(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: js.Any, `type`: change): Event = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def RemoveEvent(newPath: Path, oldPath: Path, oldValue: js.Any, `type`: remove): Event = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AddEvent(newPath: Path, newValue: js.Any, oldPath: Path, `type`: add): Event = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def RemoveItemEvent(
    curIndex: Double,
    newIndex: `-1`,
    newPath: Path,
    oldIndex: Double,
    oldPath: Path,
    oldValue: js.Any,
    `type`: `remove-item`
  ): Event = {
    val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MoveItemEvent(
    curIndex: Double,
    newIndex: Double,
    newPath: Path,
    oldIndex: Double,
    oldPath: Path,
    `type`: `move-item`
  ): Event = {
    val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AddItemEvent(
    curIndex: `-1`,
    newIndex: Double,
    newPath: Path,
    newValue: js.Any,
    oldIndex: `-1`,
    oldPath: Path,
    `type`: `add-item`
  ): Event = {
    val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}
