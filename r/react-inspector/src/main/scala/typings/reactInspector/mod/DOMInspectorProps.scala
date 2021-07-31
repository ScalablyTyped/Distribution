package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMInspectorProps
  extends StObject
     with TreeViewProps
     with ThemedComponentProps {
  
  @JSName("data")
  var data_DOMInspectorProps: js.Object
}
object DOMInspectorProps {
  
  @scala.inline
  def apply(data: js.Object): DOMInspectorProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMInspectorProps]
  }
  
  @scala.inline
  implicit class DOMInspectorPropsMutableBuilder[Self <: DOMInspectorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
