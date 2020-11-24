package typings.reactInspector.mod

import typings.reactInspector.reactInspectorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactInspector.mod.ThemedComponentProps because Already inherited
- typings.reactInspector.mod.TreeViewProps because Already inherited
- typings.reactInspector.mod.DOMInspectorProps because var conflicts: data, expandLevel, expandPaths, name, nodeRenderer, theme. Inlined  */ @js.native
trait InspectorAsTreeProps
  extends ObjectInspectorProps
     with InspectorBaseProps
     with InspectorProps {
  
  @JSName("table")
  var table_InspectorAsTreeProps: js.UndefOr[`false`] = js.native
}
object InspectorAsTreeProps {
  
  @scala.inline
  def apply(): InspectorAsTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorAsTreeProps]
  }
  
  @scala.inline
  implicit class InspectorAsTreePropsOps[Self <: InspectorAsTreeProps] (val x: Self) extends AnyVal {
    
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
    def setTable(value: `false`): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
