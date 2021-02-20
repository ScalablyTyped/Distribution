package typings.reactable

import typings.reactable.mod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Column extends StObject {
    
    var column: String = js.native
    
    var direction: SortDirection = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: String, direction: SortDirection): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: SortDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
}
