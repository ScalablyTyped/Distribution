package typings.reactNative.anon

import typings.reactNative.mod.LayoutRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var layout: LayoutRectangle
}

object Layout {
  @scala.inline
  def apply(layout: LayoutRectangle): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

