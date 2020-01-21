package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerCatalogTarget extends js.Object {
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
}

