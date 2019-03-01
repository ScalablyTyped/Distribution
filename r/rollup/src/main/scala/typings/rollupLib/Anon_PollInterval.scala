package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PollInterval extends js.Object {
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  var stabilityThreshold: js.UndefOr[scala.Double] = js.undefined
}

object Anon_PollInterval {
  @scala.inline
  def apply(pollInterval: scala.Int | scala.Double = null, stabilityThreshold: scala.Int | scala.Double = null): Anon_PollInterval = {
    val __obj = js.Dynamic.literal()
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (stabilityThreshold != null) __obj.updateDynamic("stabilityThreshold")(stabilityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PollInterval]
  }
}

