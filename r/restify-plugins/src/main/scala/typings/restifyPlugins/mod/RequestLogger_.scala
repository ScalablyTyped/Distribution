package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLogger_ extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var serializers: js.UndefOr[js.Any] = js.undefined
}

object RequestLogger_ {
  @scala.inline
  def apply(headers: js.Any = null, log: js.Any = null, properties: js.Any = null, serializers: js.Any = null): RequestLogger_ = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLogger_]
  }
}

