package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
  var offset: Double
}

object Offset {
  @scala.inline
  def apply(offset: Double, animated: js.UndefOr[Null | Boolean] = js.undefined): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

