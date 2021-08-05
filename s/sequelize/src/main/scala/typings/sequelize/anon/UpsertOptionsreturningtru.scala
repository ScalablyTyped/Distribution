package typings.sequelize.anon

import typings.sequelize.mod.Transaction
import typings.sequelize.sequelizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sequelize.sequelize.UpsertOptions & {  returning :true} */
trait UpsertOptionsreturningtru extends StObject {
  
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean] & `true`
  
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.undefined
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object UpsertOptionsreturningtru {
  
  inline def apply(returning: js.UndefOr[Boolean] & `true`): UpsertOptionsreturningtru = {
    val __obj = js.Dynamic.literal(returning = returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertOptionsreturningtru]
  }
  
  extension [Self <: UpsertOptionsreturningtru](x: Self) {
    
    inline def setBenchmark(value: Boolean): Self = StObject.set(x, "benchmark", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkUndefined: Self = StObject.set(x, "benchmark", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setReturning(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    inline def setSearchPath(value: String): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
    
    inline def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
