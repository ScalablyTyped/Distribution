package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceElasticsearchConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: String
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: String
}

object DataSourceElasticsearchConfig {
  @scala.inline
  def apply(endpoint: String, region: String): DataSourceElasticsearchConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, region = region)
  
    __obj.asInstanceOf[DataSourceElasticsearchConfig]
  }
}

