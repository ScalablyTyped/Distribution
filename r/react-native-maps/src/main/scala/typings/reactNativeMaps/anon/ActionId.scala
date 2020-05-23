package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-deselect`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionId extends js.Object {
  var action: `marker-deselect`
  var id: String
}

object ActionId {
  @scala.inline
  def apply(action: `marker-deselect`, id: String): ActionId = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionId]
  }
}

