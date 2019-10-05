package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceHttpConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: String
}

object DataSourceHttpConfig {
  @scala.inline
  def apply(endpoint: String): DataSourceHttpConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
  
    __obj.asInstanceOf[DataSourceHttpConfig]
  }
}

