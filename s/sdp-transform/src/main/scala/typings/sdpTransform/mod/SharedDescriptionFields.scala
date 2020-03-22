package typings.sdpTransform.mod

import typings.sdpTransform.AnonIp
import typings.sdpTransform.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDescriptionFields extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[AnonLimit] = js.undefined
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[AnonIp] = js.undefined
  // i=
  var description: js.UndefOr[String] = js.undefined
}

object SharedDescriptionFields {
  @scala.inline
  def apply(bandwidth: AnonLimit = null, connection: AnonIp = null, description: String = null): SharedDescriptionFields = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDescriptionFields]
  }
}

