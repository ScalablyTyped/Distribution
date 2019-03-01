package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SIGBREAK extends js.Object {
  var SIGBREAK: js.UndefOr[scala.Boolean] = js.undefined
  var SIGHUP: js.UndefOr[scala.Boolean] = js.undefined
  var SIGINT: js.UndefOr[scala.Boolean] = js.undefined
  var SIGTERM: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_SIGBREAK {
  @scala.inline
  def apply(
    SIGBREAK: js.UndefOr[scala.Boolean] = js.undefined,
    SIGHUP: js.UndefOr[scala.Boolean] = js.undefined,
    SIGINT: js.UndefOr[scala.Boolean] = js.undefined,
    SIGTERM: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_SIGBREAK = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SIGBREAK)) __obj.updateDynamic("SIGBREAK")(SIGBREAK)
    if (!js.isUndefined(SIGHUP)) __obj.updateDynamic("SIGHUP")(SIGHUP)
    if (!js.isUndefined(SIGINT)) __obj.updateDynamic("SIGINT")(SIGINT)
    if (!js.isUndefined(SIGTERM)) __obj.updateDynamic("SIGTERM")(SIGTERM)
    __obj.asInstanceOf[Anon_SIGBREAK]
  }
}

