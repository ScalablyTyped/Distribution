package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOfLogicalProcessors extends js.Object {
  var numberOfLogicalProcessors: js.UndefOr[Double] = js.undefined
  var unsupported: Boolean
}

object NumberOfLogicalProcessors {
  @scala.inline
  def apply(unsupported: Boolean, numberOfLogicalProcessors: js.UndefOr[Double] = js.undefined): NumberOfLogicalProcessors = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLogicalProcessors)) __obj.updateDynamic("numberOfLogicalProcessors")(numberOfLogicalProcessors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfLogicalProcessors]
  }
}

