package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigId extends js.Object {
  var config: String
  var id: Double
  var sessionConfig: js.UndefOr[String] = js.undefined
  var suite: String
}

object AnonConfigId {
  @scala.inline
  def apply(config: String, id: Double, suite: String, sessionConfig: String = null): AnonConfigId = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    if (sessionConfig != null) __obj.updateDynamic("sessionConfig")(sessionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfigId]
  }
}

