package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerJdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var connectionName: String
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The path to the Amazon S3 target.
    */
  var path: String
}

object CrawlerJdbcTarget {
  @scala.inline
  def apply(connectionName: String, path: String, exclusions: js.Array[String] = null): CrawlerJdbcTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName, path = path)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    __obj.asInstanceOf[CrawlerJdbcTarget]
  }
}

