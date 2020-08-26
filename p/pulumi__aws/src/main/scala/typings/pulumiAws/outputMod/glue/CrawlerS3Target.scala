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
  def apply(path: String): CrawlerS3Target = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerS3Target]
  }
  @scala.inline
  implicit class CrawlerS3TargetOps[Self <: CrawlerS3Target] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusionsVarargs(value: String*): Self = this.set("exclusions", js.Array(value :_*))
    @scala.inline
    def setExclusions(value: js.Array[String]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
  }
  
}

