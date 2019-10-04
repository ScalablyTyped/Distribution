package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerCatalogTarget extends js.Object {
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
    val __obj = js.Dynamic.literal(databaseName = databaseName, tables = tables)
  
    __obj.asInstanceOf[CrawlerCatalogTarget]
  }
}

