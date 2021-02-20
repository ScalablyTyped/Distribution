package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.diagramModelMod.DiagramModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveCanvasActionMod {
  
  @JSImport("storm-react-diagrams/dist/src/actions/MoveCanvasAction", "MoveCanvasAction")
  @js.native
  class MoveCanvasAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double, diagramModel: DiagramModel) = this()
    
    var initialOffsetX: Double = js.native
    
    var initialOffsetY: Double = js.native
  }
}
