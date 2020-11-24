package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerDynamodbTarget extends js.Object {
  
  /**
    * The name of the DynamoDB table to crawl.
    */
  var path: Input[String] = js.native
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table.  defaults to `true`.
    */
  var scanAll: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The percentage of the configured read capacity units to use by the AWS Glue crawler. The valid values are null or a value between 0.1 to 1.5.
    */
  var scanRate: js.UndefOr[Input[Double]] = js.native
}
object CrawlerDynamodbTarget {
  
  @scala.inline
  def apply(path: Input[String]): CrawlerDynamodbTarget = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerDynamodbTarget]
  }
  
  @scala.inline
  implicit class CrawlerDynamodbTargetOps[Self <: CrawlerDynamodbTarget] (val x: Self) extends AnyVal {
    
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
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAll(value: Input[Boolean]): Self = this.set("scanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanAll: Self = this.set("scanAll", js.undefined)
    
    @scala.inline
    def setScanRate(value: Input[Double]): Self = this.set("scanRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanRate: Self = this.set("scanRate", js.undefined)
  }
}
