package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.Bottom
import typings.stormReactDiagrams.distSrcActionsBaseActionMod.BaseAction
import typings.stormReactDiagrams.distSrcModelsDiagramModelMod.DiagramModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcActionsSelectingActionMod {
  
  @JSImport("storm-react-diagrams/dist/src/actions/SelectingAction", "SelectingAction")
  @js.native
  open class SelectingAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double) = this()
    
    def containsElement(x: Double, y: Double, diagramModel: DiagramModel): Boolean = js.native
    
    def getBoxDimensions(): Bottom = js.native
    
    var mouseX2: Double = js.native
    
    var mouseY2: Double = js.native
  }
}
