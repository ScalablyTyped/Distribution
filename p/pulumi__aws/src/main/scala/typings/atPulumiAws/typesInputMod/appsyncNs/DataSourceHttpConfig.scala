package typings.atPulumiAws.typesInputMod.appsyncNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceHttpConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: Input[String]
}

object DataSourceHttpConfig {
  @scala.inline
  def apply(endpoint: Input[String]): DataSourceHttpConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceHttpConfig]
  }
}

