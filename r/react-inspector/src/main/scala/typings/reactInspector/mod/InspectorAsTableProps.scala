package typings.reactInspector.mod

import typings.reactInspector.reactInspectorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorAsTableProps
  extends StObject
     with InspectorBaseProps
     with TableInspectorProps
     with InspectorProps {
  
  @JSName("table")
  var table_InspectorAsTableProps: `true`
}
object InspectorAsTableProps {
  
  inline def apply(): InspectorAsTableProps = {
    val __obj = js.Dynamic.literal(table = true)
    __obj.asInstanceOf[InspectorAsTableProps]
  }
  
  extension [Self <: InspectorAsTableProps](x: Self) {
    
    inline def setTable(value: `true`): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
