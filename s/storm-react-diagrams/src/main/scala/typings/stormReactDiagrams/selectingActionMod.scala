package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.Bottom
import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.diagramModelMod.DiagramModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/actions/SelectingAction", JSImport.Namespace)
@js.native
object selectingActionMod extends js.Object {
  
  @js.native
  class SelectingAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double) = this()
    
    def containsElement(x: Double, y: Double, diagramModel: DiagramModel): Boolean = js.native
    
    def getBoxDimensions(): Bottom = js.native
    
    var mouseX2: Double = js.native
    
    var mouseY2: Double = js.native
  }
}
