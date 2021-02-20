package typings.reactInspector.mod

import typings.reactInspector.reactInspectorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorAsTableProps
  extends TableInspectorProps
     with InspectorBaseProps
     with InspectorProps {
  
  @JSName("table")
  var table_InspectorAsTableProps: `true` = js.native
}
object InspectorAsTableProps {
  
  @scala.inline
  def apply(table: `true`): InspectorAsTableProps = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorAsTableProps]
  }
  
  @scala.inline
  implicit class InspectorAsTablePropsMutableBuilder[Self <: InspectorAsTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: `true`): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
