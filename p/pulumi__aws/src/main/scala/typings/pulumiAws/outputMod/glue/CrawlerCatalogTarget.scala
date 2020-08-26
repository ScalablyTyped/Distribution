package typings.pulumiAws.outputMod.glue

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
  @scala.inline
  implicit class CrawlerCatalogTargetOps[Self <: CrawlerCatalogTarget] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTablesVarargs(value: String*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[String]): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
  
}

