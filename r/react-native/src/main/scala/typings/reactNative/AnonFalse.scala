package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var `false`: String
  var `true`: String
}

object AnonFalse {
  @scala.inline
  def apply(`false`: String, `true`: String): AnonFalse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

