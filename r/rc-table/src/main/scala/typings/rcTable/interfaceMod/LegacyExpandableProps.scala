package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyExpandableProps[RecordType] extends StObject {
  
  /** @deprecated Use `expandable.childrenColumnName` instead */
  var childrenColumnName: js.UndefOr[String] = js.native
  
  /** @deprecated Use `expandable.defaultExpandAllRows` instead */
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Use `expandable.defaultExpandedRowKeys` instead */
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  /** @deprecated Use `expandable.expandIcon` instead */
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  
  /** @deprecated Use `expandable.expandIconColumnIndex` instead */
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  
  /** @deprecated Use `expandable.expandRowByClick` instead */
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Use `expandable.expandedRowClassName` instead */
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.native
  
  /** @deprecated Use `expandable.expandedRowKeys` instead */
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  /** @deprecated Use `expandable.expandedRowRender` instead */
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.native
  
  /** @deprecated Use `expandable.indentSize` instead */
  var indentSize: js.UndefOr[Double] = js.native
  
  /** @deprecated Use `expandable.onExpand` instead */
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.native
  
  /** @deprecated Use `expandable.onExpandedRowsChange` instead */
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
}
object LegacyExpandableProps {
  
  @scala.inline
  def apply[RecordType](): LegacyExpandableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyExpandableProps[RecordType]]
  }
  
  @scala.inline
  implicit class LegacyExpandablePropsMutableBuilder[Self <: LegacyExpandableProps[_], RecordType] (val x: Self with LegacyExpandableProps[RecordType]) extends AnyVal {
    
    @scala.inline
    def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
    
    @scala.inline
    def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
    
    @scala.inline
    def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
    
    @scala.inline
    def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
    
    @scala.inline
    def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    @scala.inline
    def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
    
    @scala.inline
    def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
    
    @scala.inline
    def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
    
    @scala.inline
    def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    @scala.inline
    def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    @scala.inline
    def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
  }
}
