package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerDynamodbTarget extends js.Object {
  /**
    * The name of the DynamoDB table to crawl.
    */
  var path: String = js.native
}

object CrawlerDynamodbTarget {
  @scala.inline
  def apply(path: String): CrawlerDynamodbTarget = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrawlerDynamodbTarget]
  }
}

