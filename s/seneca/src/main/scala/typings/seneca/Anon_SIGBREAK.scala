package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SIGBREAK extends js.Object {
  var SIGBREAK: js.UndefOr[Boolean] = js.undefined
  var SIGHUP: js.UndefOr[Boolean] = js.undefined
  var SIGINT: js.UndefOr[Boolean] = js.undefined
  var SIGTERM: js.UndefOr[Boolean] = js.undefined
}

object Anon_SIGBREAK {
  @scala.inline
  def apply(
    SIGBREAK: js.UndefOr[Boolean] = js.undefined,
    SIGHUP: js.UndefOr[Boolean] = js.undefined,
    SIGINT: js.UndefOr[Boolean] = js.undefined,
    SIGTERM: js.UndefOr[Boolean] = js.undefined
  ): Anon_SIGBREAK = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SIGBREAK)) __obj.updateDynamic("SIGBREAK")(SIGBREAK.asInstanceOf[js.Any])
    if (!js.isUndefined(SIGHUP)) __obj.updateDynamic("SIGHUP")(SIGHUP.asInstanceOf[js.Any])
    if (!js.isUndefined(SIGINT)) __obj.updateDynamic("SIGINT")(SIGINT.asInstanceOf[js.Any])
    if (!js.isUndefined(SIGTERM)) __obj.updateDynamic("SIGTERM")(SIGTERM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SIGBREAK]
  }
}

