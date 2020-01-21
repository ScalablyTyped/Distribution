package typings.reactCanvasDraw.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasDraw
  extends Component[CanvasDrawProps, js.Object, js.Any] {
  /**
    * Clears the canvas completely.
    */
  def clear(): Unit = js.native
  /**
    * Returns the drawing's save-data as a stringified object.
    */
  def getSaveData(): String = js.native
  /**
    * Loads a previously saved drawing using the saveData string, as well as an optional boolean
    * flag to load it immediately, instead of live-drawing it.
    */
  def loadSaveData(saveData: String): Unit = js.native
  def loadSaveData(saveData: String, immediate: Boolean): Unit = js.native
  /**
    * Removes the latest change to the drawing. This includes everything drawn since the last MouseDown event.
    */
  def undo(): Unit = js.native
}

