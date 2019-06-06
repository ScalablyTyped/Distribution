package typings
package atStorybookComponentsLib.distTooltipTooltipMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipMessageProps extends js.Object {
  var desc: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var links: js.UndefOr[js.Array[atStorybookComponentsLib.Anon_Href]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object TooltipMessageProps {
  @scala.inline
  def apply(
    desc: reactLib.reactMod.ReactNode = null,
    links: js.Array[atStorybookComponentsLib.Anon_Href] = null,
    title: reactLib.reactMod.ReactNode = null
  ): TooltipMessageProps = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipMessageProps]
  }
}

