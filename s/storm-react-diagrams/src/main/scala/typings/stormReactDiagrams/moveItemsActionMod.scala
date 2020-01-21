package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.selectionModelMod.SelectionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/MoveItemsAction", JSImport.Namespace)
@js.native
object moveItemsActionMod extends js.Object {
  @js.native
  class MoveItemsAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double, diagramEngine: DiagramEngine) = this()
    var moved: Boolean = js.native
    var selectionModels: js.Array[SelectionModel] = js.native
  }
  
}

