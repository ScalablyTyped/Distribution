package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.BINARY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary
  extends StObject
     with ReqlType {
  
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Binary: BINARY
  
  var data: String
}
object Binary {
  
  inline def apply(data: String): Binary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")("BINARY")
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDollarreql_typeDollar(value: BINARY): Self = StObject.set(x, "$reql_type$", value.asInstanceOf[js.Any])
  }
}
