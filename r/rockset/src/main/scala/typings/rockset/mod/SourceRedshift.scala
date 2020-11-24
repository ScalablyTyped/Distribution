package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRedshift extends js.Object {
  
  // name of the database in Redshift Cluster
  var database: String = js.native
  
  // field in Redshift source table to monitor for updates
  var incremental_field: js.UndefOr[String] = js.native
  
  // schema which contains the Redshift table
  var schema: String = js.native
  
  // name of Redshift table containing data
  var table_name: String = js.native
}
object SourceRedshift {
  
  @scala.inline
  def apply(database: String, schema: String, table_name: String): SourceRedshift = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRedshift]
  }
  
  @scala.inline
  implicit class SourceRedshiftOps[Self <: SourceRedshift] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_name(value: String): Self = this.set("table_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncremental_field(value: String): Self = this.set("incremental_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncremental_field: Self = this.set("incremental_field", js.undefined)
  }
}
