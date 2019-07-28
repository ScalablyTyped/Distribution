package typings.reactDashAce.libDiffMod

import typings.react.reactMod.Component
import typings.reactDashAce.Anon_Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffComponent
  extends Component[IDiffEditorProps, IDiffEditorState, js.Any] {
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDiffComponent(): Unit = js.native
  def diff(): js.Array[js.Array[_]] = js.native
  def generateDiffedLines(diff: js.Any): Anon_Left = js.native
  def onChange(value: js.Any): Unit = js.native
  def setCodeMarkers(): js.Array[js.Array[_]] = js.native
  def setCodeMarkers(diffedLines: js.Any): js.Array[js.Array[_]] = js.native
}

