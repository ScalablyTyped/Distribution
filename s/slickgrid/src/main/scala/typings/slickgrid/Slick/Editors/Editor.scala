package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Editors.Editor")
@js.native
class Editor[T /* <: SlickData */] protected () extends js.Object {
  def this(args: EditorOptions[T]) = this()
  def applyValue(item: T, state: String): Unit = js.native
  def destroy(): Unit = js.native
  def focus(): Unit = js.native
  def init(): Unit = js.native
  def isValueChanged(): Boolean = js.native
  def loadValue(item: T): Unit = js.native
  def serializeValue(): js.Any = js.native
  def validate(): ValidateResults = js.native
}

