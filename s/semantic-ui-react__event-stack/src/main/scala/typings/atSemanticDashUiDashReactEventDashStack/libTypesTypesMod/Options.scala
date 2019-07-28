package typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pool: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[InputTargetElement] = js.undefined
}

object Options {
  @scala.inline
  def apply(pool: String = null, target: InputTargetElement = null): Options = {
    val __obj = js.Dynamic.literal()
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

