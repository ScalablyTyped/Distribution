package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiStrings.bottom
import typings.reactDashOnsenui.reactDashOnsenuiStrings.center
import typings.reactDashOnsenui.reactDashOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenter extends js.Object {
  var verticalAlign: js.UndefOr[top | bottom | center] = js.undefined
}

object Anon_BottomCenter {
  @scala.inline
  def apply(verticalAlign: top | bottom | center = null): Anon_BottomCenter = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenter]
  }
}

