package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerDynamodbTarget extends js.Object {
  /**
    * The path to the Amazon S3 target.
    */
  var path: String
}

object CrawlerDynamodbTarget {
  @scala.inline
  def apply(path: String): CrawlerDynamodbTarget = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[CrawlerDynamodbTarget]
  }
}

