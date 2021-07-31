package typings.reactInspector.mod

import typings.reactInspector.reactInspectorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactInspector.mod.ThemedComponentProps because Already inherited
- typings.reactInspector.mod.TreeViewProps because Already inherited
- typings.reactInspector.mod.DOMInspectorProps because var conflicts: data, expandLevel, expandPaths, name, nodeRenderer, theme. Inlined  */ trait InspectorAsTreeProps
  extends StObject
     with InspectorBaseProps
     with ObjectInspectorProps
     with InspectorProps {
  
  @JSName("table")
  var table_InspectorAsTreeProps: js.UndefOr[`false`] = js.undefined
}
object InspectorAsTreeProps {
  
  @scala.inline
  def apply(): InspectorAsTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorAsTreeProps]
  }
  
  @scala.inline
  implicit class InspectorAsTreePropsMutableBuilder[Self <: InspectorAsTreeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: `false`): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
