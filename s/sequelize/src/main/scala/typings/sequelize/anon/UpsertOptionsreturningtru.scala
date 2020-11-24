package typings.sequelize.anon

import typings.sequelize.mod.Transaction
import typings.sequelize.sequelizeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sequelize.sequelize.UpsertOptions & {  returning :true} */
@js.native
trait UpsertOptionsreturningtru extends js.Object {
  
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.native
  
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean] with `true` = js.native
  
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.native
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[Boolean] = js.native
}
object UpsertOptionsreturningtru {
  
  @scala.inline
  def apply(returning: js.UndefOr[Boolean] with `true`): UpsertOptionsreturningtru = {
    val __obj = js.Dynamic.literal(returning = returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertOptionsreturningtru]
  }
  
  @scala.inline
  implicit class UpsertOptionsreturningtruOps[Self <: UpsertOptionsreturningtru] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReturning(value: js.UndefOr[Boolean] with `true`): Self = this.set("returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmark(value: Boolean): Self = this.set("benchmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenchmark: Self = this.set("benchmark", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setSearchPath(value: String): Self = this.set("searchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPath: Self = this.set("searchPath", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
