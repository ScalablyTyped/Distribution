package typings.rcTable

import typings.rcTable.anon.Children
import typings.rcTable.libInterfaceMod.CustomizeComponent
import typings.rcTable.libInterfaceMod.GetComponentProps
import typings.rcTable.libInterfaceMod.GetRowKey
import typings.rcTable.libInterfaceMod.Key
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyBodyRowMod {
  
  object default {
    
    inline def apply[RecordType /* <: Children[RecordType] */](props: BodyRowProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Body/BodyRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Body/BodyRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait BodyRowProps[RecordType] extends StObject {
    
    var cellComponent: CustomizeComponent
    
    var childrenColumnName: String
    
    var className: js.UndefOr[String] = js.undefined
    
    var expandedKeys: Set[Key]
    
    var getRowKey: GetRowKey[RecordType]
    
    var indent: js.UndefOr[Double] = js.undefined
    
    var index: Double
    
    var onRow: GetComponentProps[RecordType]
    
    var record: RecordType
    
    var recordKey: Key
    
    var renderIndex: Double
    
    var rowComponent: CustomizeComponent
    
    def rowExpandable(record: RecordType): Boolean
    
    var rowKey: typings.react.mod.Key
    
    var scopeCellComponent: CustomizeComponent
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BodyRowProps {
    
    inline def apply[RecordType](
      cellComponent: CustomizeComponent,
      childrenColumnName: String,
      expandedKeys: Set[Key],
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
      index: Double,
      onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      record: RecordType,
      recordKey: Key,
      renderIndex: Double,
      rowComponent: CustomizeComponent,
      rowExpandable: RecordType => Boolean,
      rowKey: typings.react.mod.Key,
      scopeCellComponent: CustomizeComponent
    ): BodyRowProps[RecordType] = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], renderIndex = renderIndex.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any], scopeCellComponent = scopeCellComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyRowProps[RecordType]]
    }
    
    extension [Self <: BodyRowProps[?], RecordType](x: Self & BodyRowProps[RecordType]) {
      
      inline def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordKey(value: Key): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
      
      inline def setRenderIndex(value: Double): Self = StObject.set(x, "renderIndex", value.asInstanceOf[js.Any])
      
      inline def setRowComponent(value: CustomizeComponent): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      inline def setRowExpandable(value: RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
      
      inline def setRowKey(value: typings.react.mod.Key): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setScopeCellComponent(value: CustomizeComponent): Self = StObject.set(x, "scopeCellComponent", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
