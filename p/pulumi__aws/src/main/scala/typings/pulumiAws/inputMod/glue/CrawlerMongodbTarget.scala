package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerMongodbTarget extends StObject {
  
  /**
    * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
    */
  var connectionName: Input[String]
  
  /**
    * The path of the Amazon DocumentDB or MongoDB target (database/collection).
    */
  var path: Input[String]
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. Default value is `true`.
    */
  var scanAll: js.UndefOr[Input[Boolean]] = js.undefined
}
object CrawlerMongodbTarget {
  
  inline def apply(connectionName: Input[String], path: Input[String]): CrawlerMongodbTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerMongodbTarget]
  }
  
  extension [Self <: CrawlerMongodbTarget](x: Self) {
    
    inline def setConnectionName(value: Input[String]): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScanAll(value: Input[Boolean]): Self = StObject.set(x, "scanAll", value.asInstanceOf[js.Any])
    
    inline def setScanAllUndefined: Self = StObject.set(x, "scanAll", js.undefined)
  }
}
