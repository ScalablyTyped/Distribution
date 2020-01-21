package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import typings.react.mod.Component
import typings.reactDataGrid.AdazzleReactDataGrid.EditorBaseProps
import typings.reactDataGrid.AnonWidth
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors")
@js.native
object editors extends js.Object {
  @js.native
  class EditorBase[P, S] ()
    extends Component[P with EditorBaseProps, S, js.Any] {
    def getInputNode(): Element | Null | Text = js.native
    def getStyle(): AnonWidth = js.native
    def getValue(): js.Any = js.native
    def inheritContainerStyles(): Boolean = js.native
  }
  
}

