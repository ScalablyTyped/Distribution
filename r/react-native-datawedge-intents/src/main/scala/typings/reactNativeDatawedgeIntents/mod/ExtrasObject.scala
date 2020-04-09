package typings.reactNativeDatawedgeIntents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtrasObject extends js.Object {
  var action: String
  var extras: js.UndefOr[js.Object] = js.undefined
}

object ExtrasObject {
  @scala.inline
  def apply(action: String, extras: js.Object = null): ExtrasObject = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrasObject]
  }
}

