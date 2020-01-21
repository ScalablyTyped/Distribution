package typings.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShallowBoolean extends js.Object {
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object AnonShallowBoolean {
  @scala.inline
  def apply(shallow: js.UndefOr[Boolean] = js.undefined): AnonShallowBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShallowBoolean]
  }
}

