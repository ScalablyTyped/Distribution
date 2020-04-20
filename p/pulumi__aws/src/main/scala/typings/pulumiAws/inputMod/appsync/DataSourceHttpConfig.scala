package typings.pulumiAws.inputMod.appsync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceHttpConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: Input[String] = js.native
}

object DataSourceHttpConfig {
  @scala.inline
  def apply(endpoint: Input[String]): DataSourceHttpConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceHttpConfig]
  }
}

