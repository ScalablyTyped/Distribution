package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-press`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: `marker-press`
  var id: String
}

object Action {
  @scala.inline
  def apply(action: `marker-press`, id: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

