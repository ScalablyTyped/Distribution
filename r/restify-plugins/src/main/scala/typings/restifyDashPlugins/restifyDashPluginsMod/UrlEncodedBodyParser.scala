package typings.restifyDashPlugins.restifyDashPluginsMod

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlEncodedBodyParser extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
}

object UrlEncodedBodyParser {
  @scala.inline
  def apply(mapParams: js.UndefOr[Boolean] = js.undefined, overrideParams: js.UndefOr[Boolean] = js.undefined): UrlEncodedBodyParser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlEncodedBodyParser]
  }
}

@JSImport("restify-plugins", "urlEncodedBodyParser")
@js.native
object urlEncodedBodyParser extends js.Object {
  def apply(): js.Array[RequestHandler] = js.native
  def apply(options: UrlEncodedBodyParser): js.Array[RequestHandler] = js.native
}

