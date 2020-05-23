package typings.reactNativeSortableList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[K] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[K] = js.undefined
}

object Key {
  @scala.inline
  def apply[K](animated: js.UndefOr[Boolean] = js.undefined, key: K = null): Key[K] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[K]]
  }
}

