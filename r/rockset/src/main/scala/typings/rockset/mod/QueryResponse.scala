package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponse extends js.Object {
  
  // meta information about each column in the result set
  var column_fields: js.UndefOr[js.Array[QueryFieldType]] = js.native
  
  // list of fields returned by the query
  var fields: js.UndefOr[js.Array[QueryFieldType]] = js.native
  
  // list of objects returned by the query
  var results: js.UndefOr[js.Array[js.Object]] = js.native
  
  // meta information about the query
  var stats: js.UndefOr[QueryResponseStats] = js.native
}
object QueryResponse {
  
  @scala.inline
  def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit class QueryResponseOps[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
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
    def setColumn_fieldsVarargs(value: QueryFieldType*): Self = this.set("column_fields", js.Array(value :_*))
    
    @scala.inline
    def setColumn_fields(value: js.Array[QueryFieldType]): Self = this.set("column_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn_fields: Self = this.set("column_fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: QueryFieldType*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[QueryFieldType]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: js.Object*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[js.Object]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setStats(value: QueryResponseStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
