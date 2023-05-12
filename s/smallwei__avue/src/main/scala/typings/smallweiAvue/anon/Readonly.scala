package typings.smallweiAvue.anon

import typings.smallweiAvue.FormType
import typings.smallweiAvue.crudMod.AvueCrudColumn
import typings.smallweiAvue.dicMod.DicItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Readonly[T] extends StObject {
  
  var column: AvueCrudColumn[T]
  
  var dic: js.Array[DicItem]
  
  var disabled: Boolean
  
  var index: Double
  
  var label: String
  
  var readonly: Boolean
  
  var row: T
  
  var search: T
  
  var size: typings.smallweiAvue.Size
  
  var `type`: FormType
  
  var value: Any
}
object Readonly {
  
  inline def apply[T](
    column: AvueCrudColumn[T],
    dic: js.Array[DicItem],
    disabled: Boolean,
    index: Double,
    label: String,
    readonly: Boolean,
    row: T,
    search: T,
    size: typings.smallweiAvue.Size,
    `type`: FormType,
    value: Any
  ): Readonly[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dic = dic.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonly[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonly[?], T] (val x: Self & Readonly[T]) extends AnyVal {
    
    inline def setColumn(value: AvueCrudColumn[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDic(value: js.Array[DicItem]): Self = StObject.set(x, "dic", value.asInstanceOf[js.Any])
    
    inline def setDicVarargs(value: DicItem*): Self = StObject.set(x, "dic", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: T): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: FormType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
