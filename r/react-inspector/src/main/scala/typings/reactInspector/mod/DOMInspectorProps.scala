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
  
  inline def apply(data: js.Object): DOMInspectorProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMInspectorProps]
  }
  
  extension [Self <: DOMInspectorProps](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
