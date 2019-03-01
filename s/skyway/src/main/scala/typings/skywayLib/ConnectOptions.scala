package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var dcInit: js.UndefOr[stdLib.RTCDataChannelInit] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var serialization: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    dcInit: stdLib.RTCDataChannelInit = null,
    label: java.lang.String = null,
    metadata: js.Any = null,
    serialization: java.lang.String = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (dcInit != null) __obj.updateDynamic("dcInit")(dcInit)
    if (label != null) __obj.updateDynamic("label")(label)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (serialization != null) __obj.updateDynamic("serialization")(serialization)
    __obj.asInstanceOf[ConnectOptions]
  }
}

