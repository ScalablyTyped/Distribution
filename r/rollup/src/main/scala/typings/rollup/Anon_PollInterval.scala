package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PollInterval extends js.Object {
  var pollInterval: js.UndefOr[Double] = js.undefined
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}

object Anon_PollInterval {
  @scala.inline
  def apply(pollInterval: Int | Double = null, stabilityThreshold: Int | Double = null): Anon_PollInterval = {
    val __obj = js.Dynamic.literal()
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (stabilityThreshold != null) __obj.updateDynamic("stabilityThreshold")(stabilityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PollInterval]
  }
}

