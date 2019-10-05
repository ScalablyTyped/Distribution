package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerS3Target extends js.Object {
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The path to the Amazon S3 target.
    */
  var path: String
}

object CrawlerS3Target {
  @scala.inline
  def apply(path: String, exclusions: js.Array[String] = null): CrawlerS3Target = {
    val __obj = js.Dynamic.literal(path = path)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    __obj.asInstanceOf[CrawlerS3Target]
  }
}

