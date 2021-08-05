package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandColumnOptions extends StObject {
  
  /**
    * set the width of indicator column.
    */
  var columnWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * If both an indicator column and a selection column are displaying, this specifies whether the indicator column
    * should be shown first. Default is true, false will move the expand indicator column after selection column.
    */
  var expandColumnBeforeSelectColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a callback function to customize the appearance of the indicator column.
    */
  var expandColumnComponent: js.UndefOr[js.Function1[/* props */ ExpandColumnComponentProps, String | ReactElement]] = js.undefined
  
  /**
    * Will enable an indicator column at first column if true. Default is false.
    */
  var expandColumnVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a callback function to customise the header column
    */
  var expandedColumnHeaderComponent: js.UndefOr[js.Function1[/* props */ ExpandedColumnHeaderProps, String | ReactElement]] = js.undefined
}
object ExpandColumnOptions {
  
  inline def apply(): ExpandColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandColumnOptions]
  }
  
  extension [Self <: ExpandColumnOptions](x: Self) {
    
    inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setExpandColumnBeforeSelectColumn(value: Boolean): Self = StObject.set(x, "expandColumnBeforeSelectColumn", value.asInstanceOf[js.Any])
    
    inline def setExpandColumnBeforeSelectColumnUndefined: Self = StObject.set(x, "expandColumnBeforeSelectColumn", js.undefined)
    
    inline def setExpandColumnComponent(value: /* props */ ExpandColumnComponentProps => String | ReactElement): Self = StObject.set(x, "expandColumnComponent", js.Any.fromFunction1(value))
    
    inline def setExpandColumnComponentUndefined: Self = StObject.set(x, "expandColumnComponent", js.undefined)
    
    inline def setExpandColumnVisible(value: Boolean): Self = StObject.set(x, "expandColumnVisible", value.asInstanceOf[js.Any])
    
    inline def setExpandColumnVisibleUndefined: Self = StObject.set(x, "expandColumnVisible", js.undefined)
    
    inline def setExpandedColumnHeaderComponent(value: /* props */ ExpandedColumnHeaderProps => String | ReactElement): Self = StObject.set(x, "expandedColumnHeaderComponent", js.Any.fromFunction1(value))
    
    inline def setExpandedColumnHeaderComponentUndefined: Self = StObject.set(x, "expandedColumnHeaderComponent", js.undefined)
  }
}
