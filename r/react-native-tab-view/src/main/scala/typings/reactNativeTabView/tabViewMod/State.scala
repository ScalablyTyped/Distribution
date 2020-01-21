package typings.reactNativeTabView.tabViewMod

import typings.reactNativeTabView.typesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var layout: Layout
}

object State {
  @scala.inline
  def apply(layout: Layout): State = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

