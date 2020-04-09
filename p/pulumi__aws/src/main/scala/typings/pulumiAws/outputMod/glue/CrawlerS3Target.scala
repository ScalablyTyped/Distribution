package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerS3Target extends js.Object {
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the DynamoDB table to crawl.
    */
  var path: String = js.native
}

object CrawlerS3Target {
  @scala.inline
  def apply(path: String, exclusions: js.Array[String] = null): CrawlerS3Target = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerS3Target]
  }
}

