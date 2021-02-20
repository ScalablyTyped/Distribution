package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerCatalogTarget extends StObject {
  
  /**
    * The name of the Glue database to be synchronized.
    */
  var databaseName: Input[String] = js.native
  
  /**
    * A list of catalog tables to be synchronized.
    */
  var tables: Input[js.Array[Input[String]]] = js.native
}
object CrawlerCatalogTarget {
  
  @scala.inline
  def apply(databaseName: Input[String], tables: Input[js.Array[Input[String]]]): CrawlerCatalogTarget = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerCatalogTarget]
  }
  
  @scala.inline
  implicit class CrawlerCatalogTargetMutableBuilder[Self <: CrawlerCatalogTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTables(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: Input[String]*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
