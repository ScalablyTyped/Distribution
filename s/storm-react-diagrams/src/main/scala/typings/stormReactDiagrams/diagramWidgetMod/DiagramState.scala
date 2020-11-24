package typings.stormReactDiagrams.diagramWidgetMod

import typings.stormReactDiagrams.baseActionMod.BaseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramState extends js.Object {
  
  var action: BaseAction | Null = js.native
  
  var diagramEngineListener: js.Any = js.native
  
  var document: js.Any = js.native
  
  var renderedNodes: Boolean = js.native
  
  var wasMoved: Boolean = js.native
  
  var windowListener: js.Any = js.native
}
object DiagramState {
  
  @scala.inline
  def apply(
    diagramEngineListener: js.Any,
    document: js.Any,
    renderedNodes: Boolean,
    wasMoved: Boolean,
    windowListener: js.Any
  ): DiagramState = {
    val __obj = js.Dynamic.literal(diagramEngineListener = diagramEngineListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], renderedNodes = renderedNodes.asInstanceOf[js.Any], wasMoved = wasMoved.asInstanceOf[js.Any], windowListener = windowListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramState]
  }
  
  @scala.inline
  implicit class DiagramStateOps[Self <: DiagramState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiagramEngineListener(value: js.Any): Self = this.set("diagramEngineListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: js.Any): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedNodes(value: Boolean): Self = this.set("renderedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasMoved(value: Boolean): Self = this.set("wasMoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowListener(value: js.Any): Self = this.set("windowListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: BaseAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = this.set("action", null)
  }
}
