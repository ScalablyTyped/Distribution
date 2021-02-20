package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerMongodbTarget extends StObject {
  
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
  implicit class CrawlerMongodbTargetMutableBuilder[Self <: CrawlerMongodbTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAll(value: Boolean): Self = StObject.set(x, "scanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAllUndefined: Self = StObject.set(x, "scanAll", js.undefined)
  }
}
