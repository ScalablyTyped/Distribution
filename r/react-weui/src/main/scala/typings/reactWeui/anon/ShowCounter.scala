package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowCounter extends js.Object {
  var defaultValue: js.Any
  var showCounter: Boolean
}

object ShowCounter {
  @scala.inline
  def apply(defaultValue: js.Any, showCounter: Boolean): ShowCounter = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], showCounter = showCounter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowCounter]
  }
}

