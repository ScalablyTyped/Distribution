package typings.reactAsync

import typings.reactAsync.reactAsyncStrings.cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var `type`: cancel
}

object AnonCancel {
  @scala.inline
  def apply(`type`: cancel): AnonCancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

