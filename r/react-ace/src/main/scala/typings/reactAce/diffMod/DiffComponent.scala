package typings.reactAce.diffMod

import typings.react.mod.Component
import typings.reactAce.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffComponent
  extends Component[IDiffEditorProps, IDiffEditorState, js.Any] {
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDiffComponent(): Unit = js.native
  def diff(): js.Array[js.Array[_]] = js.native
  def generateDiffedLines(diff: js.Any): AnonLeft = js.native
  def onChange(value: js.Any): Unit = js.native
  def setCodeMarkers(): js.Array[js.Array[_]] = js.native
  def setCodeMarkers(diffedLines: js.Any): js.Array[js.Array[_]] = js.native
}

