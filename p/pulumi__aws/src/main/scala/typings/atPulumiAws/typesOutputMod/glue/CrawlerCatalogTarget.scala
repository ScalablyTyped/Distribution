package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerCatalogTarget extends js.Object {
  /**
    * The name of the Glue database to be synchronized.
    */
  var databaseName: String = js.native
  /**
    * A list of catalog tables to be synchronized.
    */
  var tables: js.Array[String] = js.native
}

object CrawlerCatalogTarget {
  @scala.inline
  def apply(databaseName: String, tables: js.Array[String]): CrawlerCatalogTarget = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrawlerCatalogTarget]
  }
}

