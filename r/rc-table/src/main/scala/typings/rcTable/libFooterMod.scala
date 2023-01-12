package typings.rcTable

import typings.rcTable.anon.Scrollbar
import typings.rcTable.libFooterSummaryMod.SummaryProps
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.StickyOffsets
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterMod {
  
  @JSImport("rc-table/lib/Footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](param0: FooterProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object FooterComponents {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    inline def apply(param0: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-table/lib/Footer", "FooterComponents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Cell")
    @js.native
    def Cell: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any = js.native
    inline def Cell_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Row")
    @js.native
    def Row: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any = js.native
    inline def Row_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  type FlattenColumns[RecordType] = js.Array[ColumnType[RecordType] & Scrollbar]
  
  trait FooterProps[RecordType] extends StObject {
    
    var children: ReactNode
    
    var flattenColumns: FlattenColumns[RecordType]
    
    var stickyOffsets: StickyOffsets
  }
  object FooterProps {
    
    inline def apply[RecordType](flattenColumns: FlattenColumns[RecordType], stickyOffsets: StickyOffsets): FooterProps[RecordType] = {
      val __obj = js.Dynamic.literal(flattenColumns = flattenColumns.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[FooterProps[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FooterProps[?], RecordType] (val x: Self & FooterProps[RecordType]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFlattenColumns(value: FlattenColumns[RecordType]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: (ColumnType[RecordType] & Scrollbar)*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
      
      inline def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
