package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPathOptions extends StObject {
  
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.undefined
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object SearchPathOptions {
  
  inline def apply(): SearchPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchPathOptions]
  }
  
  extension [Self <: SearchPathOptions](x: Self) {
    
    inline def setSearchPath(value: String): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
    
    inline def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
