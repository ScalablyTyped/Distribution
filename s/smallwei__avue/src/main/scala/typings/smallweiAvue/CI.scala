package typings.smallweiAvue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CI[T] extends StObject {
  
  @JSName("$index")
  var $index: Double
  
  var column: TableColumnCtx[T]
}
object CI {
  
  inline def apply[T]($index: Double, column: TableColumnCtx[T]): CI[T] = {
    val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[CI[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CI[?], T] (val x: Self & CI[T]) extends AnyVal {
    
    inline def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: TableColumnCtx[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
