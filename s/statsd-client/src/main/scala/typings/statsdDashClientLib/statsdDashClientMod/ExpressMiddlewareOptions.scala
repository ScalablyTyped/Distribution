package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMiddlewareOptions extends js.Object {
  /**
    * Metric name to use for reporting if a matching route is not
    * found (default "unknown_express_route").
    */
  var notFoundRouteName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback called after reporting metrics for an
    * express route.
    */
  var onResponseEnd: js.UndefOr[
    js.Function4[
      /* client */ StatsdClient, 
      /* startTime */ stdLib.Date, 
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Enables inclusion of per-URL response code and timing
    * metrics (default false).
    */
  var timeByUrl: js.UndefOr[scala.Boolean] = js.undefined
}

object ExpressMiddlewareOptions {
  @scala.inline
  def apply(
    notFoundRouteName: java.lang.String = null,
    onResponseEnd: (/* client */ StatsdClient, /* startTime */ stdLib.Date, /* req */ expressLib.expressMod.eNs.Request, /* res */ expressLib.expressMod.eNs.Response) => scala.Unit = null,
    timeByUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): ExpressMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (notFoundRouteName != null) __obj.updateDynamic("notFoundRouteName")(notFoundRouteName)
    if (onResponseEnd != null) __obj.updateDynamic("onResponseEnd")(js.Any.fromFunction4(onResponseEnd))
    if (!js.isUndefined(timeByUrl)) __obj.updateDynamic("timeByUrl")(timeByUrl)
    __obj.asInstanceOf[ExpressMiddlewareOptions]
  }
}

