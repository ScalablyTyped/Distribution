package typings.rcTable

import typings.rcTable.anon.Children
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyRowMod {
  
  object default {
    
    @scala.inline
    def apply[RecordType /* <: Children[RecordType] */](props: BodyRowProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Body/BodyRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Body/BodyRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
    
    var rowComponent: CustomizeComponent
    
    def rowExpandable(record: RecordType): Boolean
    
    var rowKey: typings.react.mod.Key
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BodyRowProps {
    
    @scala.inline
    def apply[RecordType](
      cellComponent: CustomizeComponent,
      childrenColumnName: String,
      expandedKeys: Set[Key],
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
      index: Double,
      onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
      record: RecordType,
      recordKey: Key,
      rowComponent: CustomizeComponent,
      rowExpandable: RecordType => Boolean,
      rowKey: typings.react.mod.Key
    ): BodyRowProps[RecordType] = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyRowProps[RecordType]]
    }
    
    @scala.inline
    implicit class BodyRowPropsMutableBuilder[Self <: BodyRowProps[?], RecordType] (val x: Self & BodyRowProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordKey(value: Key): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowComponent(value: CustomizeComponent): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowExpandable(value: RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKey(value: typings.react.mod.Key): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
