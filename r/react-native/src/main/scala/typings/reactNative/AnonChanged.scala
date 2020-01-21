package typings.reactNative

import typings.reactNative.mod.ViewToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChanged extends js.Object {
  var changed: js.Array[ViewToken]
  var viewableItems: js.Array[ViewToken]
}

object AnonChanged {
  @scala.inline
  def apply(changed: js.Array[ViewToken], viewableItems: js.Array[ViewToken]): AnonChanged = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], viewableItems = viewableItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChanged]
  }
}

