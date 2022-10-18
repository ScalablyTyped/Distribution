package typings.rcTable.libInterfaceMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandableConfig[RecordType] extends StObject {
  
  var childrenColumnName: js.UndefOr[String] = js.undefined
  
  var columnTitle: js.UndefOr[ReactNode] = js.undefined
  
  var columnWidth: js.UndefOr[Double | String] = js.undefined
  
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  
  /** @deprecated Please use `EXPAND_COLUMN` in `columns` directly */
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
  
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
  
  var fixed: js.UndefOr[FixedType] = js.undefined
  
  var indentSize: js.UndefOr[Double] = js.undefined
  
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
  
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
  
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
  
  var showExpandColumn: js.UndefOr[Boolean] = js.undefined
}
object ExpandableConfig {
  
  inline def apply[RecordType](): ExpandableConfig[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandableConfig[RecordType]]
  }
  
  extension [Self <: ExpandableConfig[?], RecordType](x: Self & ExpandableConfig[RecordType]) {
    
    inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
    
    inline def setColumnTitle(value: ReactNode): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
    
    inline def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
    
    inline def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value*))
    
    inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
    
    inline def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
    
    inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
    
    inline def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
    
    inline def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
    
    inline def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value*))
    
    inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
    
    inline def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
    
    inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    inline def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
    
    inline def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
    
    inline def setRowExpandable(value: /* record */ RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
    
    inline def setRowExpandableUndefined: Self = StObject.set(x, "rowExpandable", js.undefined)
    
    inline def setShowExpandColumn(value: Boolean): Self = StObject.set(x, "showExpandColumn", value.asInstanceOf[js.Any])
    
    inline def setShowExpandColumnUndefined: Self = StObject.set(x, "showExpandColumn", js.undefined)
  }
}
