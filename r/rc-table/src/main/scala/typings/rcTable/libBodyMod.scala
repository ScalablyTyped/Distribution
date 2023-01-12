package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.FnCall
import typings.rcTable.libInterfaceMod.GetComponentProps
import typings.rcTable.libInterfaceMod.GetRowKey
import typings.rcTable.libInterfaceMod.Key
import typings.react.mod.HTMLAttributes
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMod extends Shortcut {
  
  @JSImport("rc-table/lib/Body", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[FnCall] = js.native
  
  trait BodyProps[RecordType] extends StObject {
    
    var childrenColumnName: String
    
    var data: js.Array[RecordType]
    
    var emptyNode: ReactNode
    
    var expandedKeys: Set[Key]
    
    var getRowKey: GetRowKey[RecordType]
    
    var measureColumnWidth: Boolean
    
    var onRow: GetComponentProps[RecordType]
    
    def rowExpandable(record: RecordType): Boolean
  }
  object BodyProps {
    
    inline def apply[RecordType](
      childrenColumnName: String,
      data: js.Array[RecordType],
      expandedKeys: Set[Key],
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
      measureColumnWidth: Boolean,
      onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      rowExpandable: RecordType => Boolean
    ): BodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), rowExpandable = js.Any.fromFunction1(rowExpandable))
      __obj.asInstanceOf[BodyProps[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyProps[?], RecordType] (val x: Self & BodyProps[RecordType]) extends AnyVal {
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEmptyNode(value: ReactNode): Self = StObject.set(x, "emptyNode", value.asInstanceOf[js.Any])
      
      inline def setEmptyNodeUndefined: Self = StObject.set(x, "emptyNode", js.undefined)
      
      inline def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      inline def setMeasureColumnWidth(value: Boolean): Self = StObject.set(x, "measureColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      inline def setRowExpandable(value: RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
    }
  }
  
  type _To = MemoExoticComponent[FnCall]
  
  /* This means you don't have to write `default`, but can instead just say `libBodyMod.foo` */
  override def _to: MemoExoticComponent[FnCall] = default
}
