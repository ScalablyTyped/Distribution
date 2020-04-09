package typings.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumberOfLogicalProcessors extends js.Object {
  var numberOfLogicalProcessors: js.UndefOr[Double] = js.undefined
  var unsupported: Boolean
}

object AnonNumberOfLogicalProcessors {
  @scala.inline
  def apply(unsupported: Boolean, numberOfLogicalProcessors: Int | Double = null): AnonNumberOfLogicalProcessors = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    if (numberOfLogicalProcessors != null) __obj.updateDynamic("numberOfLogicalProcessors")(numberOfLogicalProcessors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumberOfLogicalProcessors]
  }
}

