package typings.reactNativeNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReactTag extends js.Object {
  var reactTag: Double | Null
}

object AnonReactTag {
  @scala.inline
  def apply(reactTag: Int | Double = null): AnonReactTag = {
    val __obj = js.Dynamic.literal()
    if (reactTag != null) __obj.updateDynamic("reactTag")(reactTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReactTag]
  }
}

