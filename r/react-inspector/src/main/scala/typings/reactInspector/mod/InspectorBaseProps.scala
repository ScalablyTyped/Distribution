package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorBaseProps extends StObject {
  
  /**
    * Whether to inspect `data` in a table.
    */
  var table: js.UndefOr[Boolean] = js.undefined
}
object InspectorBaseProps {
  
  @scala.inline
  def apply(): InspectorBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorBaseProps]
  }
  
  @scala.inline
  implicit class InspectorBasePropsMutableBuilder[Self <: InspectorBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: Boolean): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
