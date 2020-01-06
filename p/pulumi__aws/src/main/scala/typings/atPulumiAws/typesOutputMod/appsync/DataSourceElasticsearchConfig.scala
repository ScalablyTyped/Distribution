package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceElasticsearchConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: String = js.native
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: String = js.native
}

object DataSourceElasticsearchConfig {
  @scala.inline
  def apply(endpoint: String, region: String): DataSourceElasticsearchConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceElasticsearchConfig]
  }
}

