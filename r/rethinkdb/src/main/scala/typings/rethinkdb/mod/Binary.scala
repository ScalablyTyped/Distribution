package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.BINARY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binary extends ReqlType {
  
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Binary: BINARY = js.native
  
  var data: String = js.native
}
object Binary {
  
  @scala.inline
  def apply(Dollarreql_typeDollar: BINARY, data: String): Binary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit class BinaryMutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarreql_typeDollar(value: BINARY): Self = StObject.set(x, "$reql_type$", value.asInstanceOf[js.Any])
  }
}
