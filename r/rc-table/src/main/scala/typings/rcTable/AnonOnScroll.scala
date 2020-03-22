package typings.rcTable

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnScroll extends js.Object {
  var ref: Ref[AnonScrollLeft]
  var scrollbarSize: Double
  def onScroll(info: AnonCurrentTarget): Unit
}

object AnonOnScroll {
  @scala.inline
  def apply(onScroll: AnonCurrentTarget => Unit, scrollbarSize: Double, ref: Ref[AnonScrollLeft] = null): AnonOnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll), scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnScroll]
  }
}

