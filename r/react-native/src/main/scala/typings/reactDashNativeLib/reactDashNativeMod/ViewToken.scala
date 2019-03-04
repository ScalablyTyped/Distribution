package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewToken extends js.Object {
  var index: scala.Double | scala.Null
  var isViewable: scala.Boolean
  var item: js.Any
  var key: java.lang.String
  var section: js.UndefOr[js.Any] = js.undefined
}

object ViewToken {
  @scala.inline
  def apply(
    isViewable: scala.Boolean,
    item: js.Any,
    key: java.lang.String,
    index: scala.Int | scala.Double = null,
    section: js.Any = null
  ): ViewToken = {
    val __obj = js.Dynamic.literal(isViewable = isViewable, item = item, key = key)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section)
    __obj.asInstanceOf[ViewToken]
  }
}

