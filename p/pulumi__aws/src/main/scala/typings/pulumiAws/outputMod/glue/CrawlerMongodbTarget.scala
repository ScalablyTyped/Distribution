package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerMongodbTarget extends js.Object {
  
  /**
    * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
    */
  var connectionName: String = js.native
  
  /**
    * The path of the Amazon DocumentDB or MongoDB target (database/collection).
    */
  var path: String = js.native
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. Default value is `true`.
    */
  var scanAll: js.UndefOr[Boolean] = js.native
}
object CrawlerMongodbTarget {
  
  @scala.inline
  def apply(connectionName: String, path: String): CrawlerMongodbTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerMongodbTarget]
  }
  
  @scala.inline
  implicit class CrawlerMongodbTargetOps[Self <: CrawlerMongodbTarget] (val x: Self) extends AnyVal {
    
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
    def setConnectionName(value: String): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAll(value: Boolean): Self = this.set("scanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanAll: Self = this.set("scanAll", js.undefined)
  }
}
