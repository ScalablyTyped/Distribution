package typings.skyway

import typings.std.RTCDataChannelInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var dcInit: js.UndefOr[RTCDataChannelInit] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var serialization: js.UndefOr[String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    dcInit: RTCDataChannelInit = null,
    label: String = null,
    metadata: js.Any = null,
    serialization: String = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (dcInit != null) __obj.updateDynamic("dcInit")(dcInit.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

