package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerDynamodbTarget extends js.Object {
  /**
    * The name of the DynamoDB table to crawl.
    */
  var path: Input[String] = js.native
}

object CrawlerDynamodbTarget {
  @scala.inline
  def apply(path: Input[String]): CrawlerDynamodbTarget = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrawlerDynamodbTarget]
  }
}

