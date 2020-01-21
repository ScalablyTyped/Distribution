package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerS3Target extends js.Object {
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The path to the Amazon S3 target.
    */
  var path: Input[String] = js.native
}

object CrawlerS3Target {
  @scala.inline
  def apply(path: Input[String], exclusions: Input[js.Array[Input[String]]] = null): CrawlerS3Target = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerS3Target]
  }
}

