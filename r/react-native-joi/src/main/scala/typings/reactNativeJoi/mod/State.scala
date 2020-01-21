package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var reference: js.UndefOr[js.Any] = js.undefined
}

object State {
  @scala.inline
  def apply(key: String = null, parent: js.Any = null, path: String = null, reference: js.Any = null): State = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

