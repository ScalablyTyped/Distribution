package typings.sdpTransform.mod

import typings.sdpTransform.anon.Ip
import typings.sdpTransform.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDescriptionFields extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[js.Array[Limit]] = js.undefined
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[Ip] = js.undefined
  // i=
  var description: js.UndefOr[String] = js.undefined
}

object SharedDescriptionFields {
  @scala.inline
  def apply(bandwidth: js.Array[Limit] = null, connection: Ip = null, description: String = null): SharedDescriptionFields = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDescriptionFields]
  }
}

