package typings.atPulumiAws.typesInputMod.glueNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerDynamodbTarget extends js.Object {
  /**
    * The path to the Amazon S3 target.
    */
  var path: Input[String]
}

object CrawlerDynamodbTarget {
  @scala.inline
  def apply(path: Input[String]): CrawlerDynamodbTarget = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrawlerDynamodbTarget]
  }
}

