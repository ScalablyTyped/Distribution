package typings.restifyDashPlugins.restifyDashPluginsMod

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLogger extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var serializers: js.UndefOr[js.Any] = js.undefined
}

object RequestLogger {
  @scala.inline
  def apply(headers: js.Any = null, log: js.Any = null, properties: js.Any = null, serializers: js.Any = null): RequestLogger = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLogger]
  }
}

@JSImport("restify-plugins", "requestLogger")
@js.native
object requestLogger extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: RequestLogger): RequestHandler = js.native
}

