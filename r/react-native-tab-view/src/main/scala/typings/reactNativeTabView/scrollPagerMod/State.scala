package typings.reactNativeTabView.scrollPagerMod

import typings.reactNativeTabView.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var initialOffset: X
}

object State {
  @scala.inline
  def apply(initialOffset: X): State = {
    val __obj = js.Dynamic.literal(initialOffset = initialOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

