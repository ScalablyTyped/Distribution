package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceRedshift extends StObject {
  
  /**
    * name of the database in Redshift Cluster
    * @type {string}
    * @memberof SourceRedshift
    */
  var database: String
  
  /**
    * field in Redshift source table to monitor for updates
    * @type {string}
    * @memberof SourceRedshift
    */
  var incremental_field: js.UndefOr[String] = js.undefined
  
  /**
    * schema which contains the Redshift table
    * @type {string}
    * @memberof SourceRedshift
    */
  var schema: String
  
  /**
    * name of Redshift table containing data
    * @type {string}
    * @memberof SourceRedshift
    */
  var table_name: String
}
object SourceRedshift {
  
  inline def apply(database: String, schema: String, table_name: String): SourceRedshift = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRedshift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceRedshift] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setIncremental_field(value: String): Self = StObject.set(x, "incremental_field", value.asInstanceOf[js.Any])
    
    inline def setIncremental_fieldUndefined: Self = StObject.set(x, "incremental_field", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTable_name(value: String): Self = StObject.set(x, "table_name", value.asInstanceOf[js.Any])
  }
}
