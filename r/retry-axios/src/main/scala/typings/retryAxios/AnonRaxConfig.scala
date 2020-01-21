package typings.retryAxios

import typings.retryAxios.mod.RetryConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaxConfig extends js.Object {
  var raxConfig: RetryConfig
}

object AnonRaxConfig {
  @scala.inline
  def apply(raxConfig: RetryConfig): AnonRaxConfig = {
    val __obj = js.Dynamic.literal(raxConfig = raxConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRaxConfig]
  }
}

