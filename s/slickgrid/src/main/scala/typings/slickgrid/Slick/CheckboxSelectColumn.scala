package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxSelectColumn[T /* <: SlickData */]
  extends StObject
     with Plugin[T] {
  
  def getColumnDefinition(): ColumnMetadata[T]
}
object CheckboxSelectColumn {
  
  inline def apply[T /* <: SlickData */](destroy: () => Unit, getColumnDefinition: () => ColumnMetadata[T], init: Grid[T] => Unit): CheckboxSelectColumn[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getColumnDefinition = js.Any.fromFunction0(getColumnDefinition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CheckboxSelectColumn[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxSelectColumn[?], T /* <: SlickData */] (val x: Self & CheckboxSelectColumn[T]) extends AnyVal {
    
    inline def setGetColumnDefinition(value: () => ColumnMetadata[T]): Self = StObject.set(x, "getColumnDefinition", js.Any.fromFunction0(value))
  }
}
