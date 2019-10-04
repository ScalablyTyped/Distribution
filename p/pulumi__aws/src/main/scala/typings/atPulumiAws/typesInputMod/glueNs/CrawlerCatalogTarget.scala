package typings.atPulumiAws.typesInputMod.glueNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerCatalogTarget extends js.Object {
  /**
    * The name of the Glue database to be synchronized.
    */
  var databaseName: Input[String]
  /**
    * A list of catalog tables to be synchronized.
    */
  var tables: Input[js.Array[Input[String]]]
}

object CrawlerCatalogTarget {
  @scala.inline
  def apply(databaseName: Input[String], tables: Input[js.Array[Input[String]]]): CrawlerCatalogTarget = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrawlerCatalogTarget]
  }
}

