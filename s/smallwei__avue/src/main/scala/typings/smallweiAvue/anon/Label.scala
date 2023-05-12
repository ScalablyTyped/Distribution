package typings.smallweiAvue.anon

import typings.smallweiAvue.crudMod.AvueCrudColumn
import typings.smallweiAvue.dicMod.DicItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label[T] extends StObject {
  
  var column: AvueCrudColumn[T]
  
  var dic: js.Array[DicItem]
  
  var disabled: Boolean
  
  var label: String
  
  var readonly: Boolean
  
  var row: T
  
  var size: typings.smallweiAvue.Size
  
  var value: Any
}
object Label {
  
  inline def apply[T](
    column: AvueCrudColumn[T],
    dic: js.Array[DicItem],
    disabled: Boolean,
    label: String,
    readonly: Boolean,
    row: T,
    size: typings.smallweiAvue.Size,
    value: Any
  ): Label[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dic = dic.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label[?], T] (val x: Self & Label[T]) extends AnyVal {
    
    inline def setColumn(value: AvueCrudColumn[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDic(value: js.Array[DicItem]): Self = StObject.set(x, "dic", value.asInstanceOf[js.Any])
    
    inline def setDicVarargs(value: DicItem*): Self = StObject.set(x, "dic", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
