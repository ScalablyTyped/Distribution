package typings.atPulumiAws.typesInputMod.appsync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceElasticsearchConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: Input[String]
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: js.UndefOr[Input[String]] = js.undefined
}

object DataSourceElasticsearchConfig {
  @scala.inline
  def apply(endpoint: Input[String], region: Input[String] = null): DataSourceElasticsearchConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceElasticsearchConfig]
  }
}

