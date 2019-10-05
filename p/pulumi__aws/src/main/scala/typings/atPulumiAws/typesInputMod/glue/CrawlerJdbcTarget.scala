package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerJdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var connectionName: Input[String]
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The path to the Amazon S3 target.
    */
  var path: Input[String]
}

object CrawlerJdbcTarget {
  @scala.inline
  def apply(
    connectionName: Input[String],
    path: Input[String],
    exclusions: Input[js.Array[Input[String]]] = null
  ): CrawlerJdbcTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerJdbcTarget]
  }
}

