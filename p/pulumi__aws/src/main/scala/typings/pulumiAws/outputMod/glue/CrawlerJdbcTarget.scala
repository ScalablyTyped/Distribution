package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerJdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var connectionName: String = js.native
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The path of the JDBC target.
    */
  var path: String = js.native
}

object CrawlerJdbcTarget {
  @scala.inline
  def apply(connectionName: String, path: String, exclusions: js.Array[String] = null): CrawlerJdbcTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerJdbcTarget]
  }
}

