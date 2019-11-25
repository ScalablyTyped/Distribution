package typings.signalrDashNoDashJquery.signalrDashNoDashJqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var logging: js.UndefOr[Boolean] = js.undefined
  var qs: js.UndefOr[String] = js.undefined
  var useDefaultPath: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    logging: js.UndefOr[Boolean] = js.undefined,
    qs: String = null,
    useDefaultPath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefaultPath)) __obj.updateDynamic("useDefaultPath")(useDefaultPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

