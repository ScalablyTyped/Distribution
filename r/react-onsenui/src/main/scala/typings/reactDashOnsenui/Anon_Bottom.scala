package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiStrings.bottom
import typings.reactDashOnsenui.reactDashOnsenuiStrings.center
import typings.reactDashOnsenui.reactDashOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var verticalAlign: js.UndefOr[top | bottom | center] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(verticalAlign: top | bottom | center = null, width: String = null): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Bottom]
  }
}

