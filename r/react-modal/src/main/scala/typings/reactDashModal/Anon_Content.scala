package typings.reactDashModal

import typings.std.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: HTMLDivElement
  var overlay: js.UndefOr[Element] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: HTMLDivElement, overlay: Element = null): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

