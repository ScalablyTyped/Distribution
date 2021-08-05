package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReqlType extends StObject {
  
  @JSName("$reql_type$")
  var Dollarreql_typeDollar: String
}
object ReqlType {
  
  inline def apply(Dollarreql_typeDollar: String): ReqlType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqlType]
  }
  
  extension [Self <: ReqlType](x: Self) {
    
    inline def setDollarreql_typeDollar(value: String): Self = StObject.set(x, "$reql_type$", value.asInstanceOf[js.Any])
  }
}
