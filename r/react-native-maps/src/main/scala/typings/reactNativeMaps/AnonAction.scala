package typings.reactNativeMaps

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-press`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: `marker-press`
  var id: String
}

object AnonAction {
  @scala.inline
  def apply(action: `marker-press`, id: String): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

