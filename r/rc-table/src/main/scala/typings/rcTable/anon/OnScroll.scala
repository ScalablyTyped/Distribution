package typings.rcTable.anon

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScroll extends js.Object {
  var ref: Ref[ScrollLeft]
  var scrollbarSize: Double
  def onScroll(info: CurrentTarget): Unit
}

object OnScroll {
  @scala.inline
  def apply(onScroll: CurrentTarget => Unit, scrollbarSize: Double, ref: Ref[ScrollLeft] = null): OnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll), scrollbarSize = scrollbarSize.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnScroll]
  }
}

