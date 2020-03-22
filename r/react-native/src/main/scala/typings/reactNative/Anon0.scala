package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

