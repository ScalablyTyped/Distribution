package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableInspectorProps
  extends StObject
     with ThemedComponentProps {
  
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
}
object TableInspectorProps {
  
  @scala.inline
  def apply(): TableInspectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableInspectorProps]
  }
  
  @scala.inline
  implicit class TableInspectorPropsMutableBuilder[Self <: TableInspectorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
