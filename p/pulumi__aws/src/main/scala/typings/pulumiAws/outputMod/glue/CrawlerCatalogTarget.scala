package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerCatalogTarget extends StObject {
  
  /**
    * The name of the Glue database to be synchronized.
    */
  var databaseName: String
  
  /**
    * A list of catalog tables to be synchronized.
    */
  var tables: js.Array[String]
}
object CrawlerCatalogTarget {
  
  @scala.inline
  def apply(databaseName: String, tables: js.Array[String]): CrawlerCatalogTarget = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerCatalogTarget]
  }
  
  @scala.inline
  implicit class CrawlerCatalogTargetMutableBuilder[Self <: CrawlerCatalogTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTables(value: js.Array[String]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: String*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
