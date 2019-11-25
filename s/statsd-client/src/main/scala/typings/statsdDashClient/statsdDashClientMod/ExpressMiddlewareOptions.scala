package typings.statsdDashClient.statsdDashClientMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMiddlewareOptions extends js.Object {
  /**
    * Metric name to use for reporting if a matching route is not
    * found (default "unknown_express_route").
    */
  var notFoundRouteName: js.UndefOr[String] = js.undefined
  /**
    * Optional callback called after reporting metrics for an
    * express route.
    */
  var onResponseEnd: js.UndefOr[
    js.Function4[
      /* client */ StatsdClient, 
      /* startTime */ Date, 
      /* req */ Request[ParamsDictionary], 
      /* res */ Response, 
      Unit
    ]
  ] = js.undefined
  /**
    * Enables inclusion of per-URL response code and timing
    * metrics (default false).
    */
  var timeByUrl: js.UndefOr[Boolean] = js.undefined
}

object ExpressMiddlewareOptions {
  @scala.inline
  def apply(
    notFoundRouteName: String = null,
    onResponseEnd: (/* client */ StatsdClient, /* startTime */ Date, /* req */ Request[ParamsDictionary], /* res */ Response) => Unit = null,
    timeByUrl: js.UndefOr[Boolean] = js.undefined
  ): ExpressMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (notFoundRouteName != null) __obj.updateDynamic("notFoundRouteName")(notFoundRouteName.asInstanceOf[js.Any])
    if (onResponseEnd != null) __obj.updateDynamic("onResponseEnd")(js.Any.fromFunction4(onResponseEnd))
    if (!js.isUndefined(timeByUrl)) __obj.updateDynamic("timeByUrl")(timeByUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressMiddlewareOptions]
  }
}

