package typings.storybookComponents.tooltipMessageMod

import typings.react.mod.ReactNode
import typings.storybookComponents.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipMessageProps extends js.Object {
  var desc: js.UndefOr[ReactNode] = js.native
  var links: js.UndefOr[js.Array[Href]] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object TooltipMessageProps {
  @scala.inline
  def apply(desc: ReactNode = null, links: js.Array[Href] = null, title: ReactNode = null): TooltipMessageProps = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipMessageProps]
  }
}

