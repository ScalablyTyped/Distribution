package typings.smallweiAvue.anon

import typings.smallweiAvue.crudMod.AvueCrudColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnAvueCrudColumn[T] extends StObject {
  
  var column: AvueCrudColumn[T]
}
object ColumnAvueCrudColumn {
  
  inline def apply[T](column: AvueCrudColumn[T]): ColumnAvueCrudColumn[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnAvueCrudColumn[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnAvueCrudColumn[?], T] (val x: Self & ColumnAvueCrudColumn[T]) extends AnyVal {
    
    inline def setColumn(value: AvueCrudColumn[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
