package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewToken extends js.Object {
  var index: Double | Null
  var isViewable: Boolean
  var item: js.Any
  var key: String
  var section: js.UndefOr[js.Any] = js.undefined
}

object ViewToken {
  @scala.inline
  def apply(isViewable: Boolean, item: js.Any, key: String, index: Int | Double = null, section: js.Any = null): ViewToken = {
    val __obj = js.Dynamic.literal(isViewable = isViewable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewToken]
  }
}

