package typings.atStorybookAddonDashNotes.distGiphyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var src: String | Null
}

object State {
  @scala.inline
  def apply(src: String = null): State = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

