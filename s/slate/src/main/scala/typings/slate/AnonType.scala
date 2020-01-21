package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: String | (js.Function1[/* type */ String, Boolean])
}

object AnonType {
  @scala.inline
  def apply(`type`: String | (js.Function1[/* type */ String, Boolean])): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

