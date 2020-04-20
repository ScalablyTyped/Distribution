package typings.reactNative

import typings.reactNative.mod.LayoutRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayout extends js.Object {
  var layout: LayoutRectangle
}

object AnonLayout {
  @scala.inline
  def apply(layout: LayoutRectangle): AnonLayout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayout]
  }
}

