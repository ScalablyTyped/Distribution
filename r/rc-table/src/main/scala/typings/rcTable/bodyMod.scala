package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.FnCall
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.react.mod.HTMLAttributes
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyMod extends Shortcut {
  
  @JSImport("rc-table/lib/Body", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[FnCall] = js.native
  
  @js.native
  trait BodyProps[RecordType] extends StObject {
    
    var childrenColumnName: String = js.native
    
    var data: js.Array[RecordType] = js.native
    
    var emptyNode: ReactNode = js.native
    
    var expandedKeys: Set[Key] = js.native
    
    var getRowKey: GetRowKey[RecordType] = js.native
    
    var measureColumnWidth: Boolean = js.native
    
    var onRow: GetComponentProps[RecordType] = js.native
    
    def rowExpandable(record: RecordType): Boolean = js.native
  }
  object BodyProps {
    
    @scala.inline
    def apply[RecordType](
      childrenColumnName: String,
      data: js.Array[RecordType],
      expandedKeys: Set[Key],
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
      measureColumnWidth: Boolean,
      onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
      rowExpandable: RecordType => Boolean
    ): BodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), rowExpandable = js.Any.fromFunction1(rowExpandable))
      __obj.asInstanceOf[BodyProps[RecordType]]
    }
    
    @scala.inline
    implicit class BodyPropsMutableBuilder[Self <: BodyProps[_], RecordType] (val x: Self with BodyProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEmptyNode(value: ReactNode): Self = StObject.set(x, "emptyNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyNodeUndefined: Self = StObject.set(x, "emptyNode", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMeasureColumnWidth(value: Boolean): Self = StObject.set(x, "measureColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowExpandable(value: RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
    }
  }
  
  type _To = MemoExoticComponent[FnCall]
  
  /* This means you don't have to write `default`, but can instead just say `bodyMod.foo` */
  override def _to: MemoExoticComponent[FnCall] = default
}
