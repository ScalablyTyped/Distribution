package typings.sqlstring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ToSqlString extends StObject {
    
    def toSqlString(): String = js.native
  }
  object ToSqlString {
    
    @scala.inline
    def apply(toSqlString: () => String): ToSqlString = {
      val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
      __obj.asInstanceOf[ToSqlString]
    }
    
    @scala.inline
    implicit class ToSqlStringMutableBuilder[Self <: ToSqlString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToSqlString(value: () => String): Self = StObject.set(x, "toSqlString", js.Any.fromFunction0(value))
    }
  }
}
