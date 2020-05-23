package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
}

object `0` {
  @scala.inline
  def apply(animated: js.UndefOr[Null | Boolean] = js.undefined): `0` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

