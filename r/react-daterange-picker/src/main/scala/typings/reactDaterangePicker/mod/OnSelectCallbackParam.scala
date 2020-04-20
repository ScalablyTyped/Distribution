package typings.reactDaterangePicker.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectCallbackParam extends js.Object {
  var end: Moment
  var start: Moment
}

object OnSelectCallbackParam {
  @scala.inline
  def apply(end: Moment, start: Moment): OnSelectCallbackParam = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectCallbackParam]
  }
}

