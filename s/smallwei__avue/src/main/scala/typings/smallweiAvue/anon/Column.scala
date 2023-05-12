package typings.smallweiAvue.anon

import typings.smallweiAvue.TableColumnCtx
import typings.smallweiAvue.smallweiAvueStrings.ascsending
import typings.smallweiAvue.smallweiAvueStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[T] extends StObject {
  
  var column: TableColumnCtx[T]
  
  var order: ascsending | descending
  
  var prop: String
}
object Column {
  
  inline def apply[T](column: TableColumnCtx[T], order: ascsending | descending, prop: String): Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column[?], T] (val x: Self & Column[T]) extends AnyVal {
    
    inline def setColumn(value: TableColumnCtx[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: ascsending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
  }
}
