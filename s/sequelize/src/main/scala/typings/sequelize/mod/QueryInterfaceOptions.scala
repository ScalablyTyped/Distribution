package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Query Interface
// ~~~~~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-interface.js
//
/**
  * Most of the methods accept options and use only the logger property of the options. That's why the most used
  * interface type for options in a method is separated here as another interface.
  */
trait QueryInterfaceOptions extends StObject {
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * An optional transaction to perform this query in
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object QueryInterfaceOptions {
  
  inline def apply(): QueryInterfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInterfaceOptions]
  }
  
  extension [Self <: QueryInterfaceOptions](x: Self) {
    
    inline def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
