package typings.reactDnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShallowBoolean extends js.Object {
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object ShallowBoolean {
  @scala.inline
  def apply(shallow: js.UndefOr[Boolean] = js.undefined): ShallowBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShallowBoolean]
  }
}

