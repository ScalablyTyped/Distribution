package typings.sequelize.anon

import typings.sequelize.mod.Transaction
import typings.sequelize.sequelizeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sequelize.sequelize.UpsertOptions & {  returning :false | undefined} */
trait UpsertOptionsreturningfal extends StObject {
  
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
  var returning: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
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
object UpsertOptionsreturningfal {
  
  @scala.inline
  def apply(returning: js.UndefOr[Boolean] & js.UndefOr[`false`]): UpsertOptionsreturningfal = {
    val __obj = js.Dynamic.literal(returning = returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertOptionsreturningfal]
  }
  
  @scala.inline
  implicit class UpsertOptionsreturningfalMutableBuilder[Self <: UpsertOptionsreturningfal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenchmark(value: Boolean): Self = StObject.set(x, "benchmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkUndefined: Self = StObject.set(x, "benchmark", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setReturning(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPath(value: String): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
