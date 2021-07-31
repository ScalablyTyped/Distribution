package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerDynamodbTarget extends StObject {
  
  /**
    * The name of the DynamoDB table to crawl.
    */
  var path: String
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table.  defaults to `true`.
    */
  var scanAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The percentage of the configured read capacity units to use by the AWS Glue crawler. The valid values are null or a value between 0.1 to 1.5.
    */
  var scanRate: js.UndefOr[Double] = js.undefined
}
object CrawlerDynamodbTarget {
  
  @scala.inline
  def apply(path: String): CrawlerDynamodbTarget = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerDynamodbTarget]
  }
  
  @scala.inline
  implicit class CrawlerDynamodbTargetMutableBuilder[Self <: CrawlerDynamodbTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAll(value: Boolean): Self = StObject.set(x, "scanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAllUndefined: Self = StObject.set(x, "scanAll", js.undefined)
    
    @scala.inline
    def setScanRate(value: Double): Self = StObject.set(x, "scanRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanRateUndefined: Self = StObject.set(x, "scanRate", js.undefined)
  }
}
