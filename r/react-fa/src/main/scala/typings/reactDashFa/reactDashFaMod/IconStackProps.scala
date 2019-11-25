package typings.reactDashFa.reactDashFaMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconStackProps extends SizeOverrideHTMLProps[IconStack] {
  @JSName("children")
  var children_IconStackProps: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  @JSName("size")
  var size_IconStackProps: js.UndefOr[IconSize] = js.undefined
}

object IconStackProps {
  @scala.inline
  def apply(
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[IconStack] = null,
    children: ReactElement | js.Array[ReactElement] = null,
    size: IconSize = null
  ): IconStackProps = {
    val __obj = js.Dynamic.literal()
    if (SizeOverrideHTMLProps != null) js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconStackProps]
  }
}

