package typings.reactDashDataDashGrid.AdazzleReactDataGridNs.ReactDataGridNs.editorsNs

import typings.react.reactMod.Component
import typings.reactDashDataDashGrid.AdazzleReactDataGridNs.EditorBaseProps
import typings.reactDashDataDashGrid.Anon_Width
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase")
@js.native
class EditorBase[P, S] ()
  extends Component[P with EditorBaseProps, S, js.Any] {
  def getInputNode(): Element | Null | Text = js.native
  def getStyle(): Anon_Width = js.native
  def getValue(): js.Any = js.native
  def inheritContainerStyles(): Boolean = js.native
}

