package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpenPauseOnConnect extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var pauseOnConnect: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowHalfOpenPauseOnConnect {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnConnect: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AllowHalfOpenPauseOnConnect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(pauseOnConnect)) __obj.updateDynamic("pauseOnConnect")(pauseOnConnect)
    __obj.asInstanceOf[Anon_AllowHalfOpenPauseOnConnect]
  }
}

