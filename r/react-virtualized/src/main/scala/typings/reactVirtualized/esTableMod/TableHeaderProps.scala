package typings.reactVirtualized.esTableMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeaderProps extends StObject {
  
  var columnData: js.UndefOr[js.Any] = js.undefined
  
  var dataKey: String
  
  var disableSort: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var sortBy: js.UndefOr[String] = js.undefined
  
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}
object TableHeaderProps {
  
  @scala.inline
  def apply(dataKey: String): TableHeaderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
  
  @scala.inline
  implicit class TableHeaderPropsMutableBuilder[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnData(value: js.Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
    
    @scala.inline
    def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSort(value: Boolean): Self = StObject.set(x, "disableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSortUndefined: Self = StObject.set(x, "disableSort", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
  }
}
