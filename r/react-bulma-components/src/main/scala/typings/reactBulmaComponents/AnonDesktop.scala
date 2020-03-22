package typings.reactBulmaComponents

import typings.reactBulmaComponents.mod.ResponsiveSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesktop extends js.Object {
  var desktop: js.UndefOr[ResponsiveSizeProps] = js.undefined
  var fullhd: js.UndefOr[ResponsiveSizeProps] = js.undefined
  var mobile: js.UndefOr[ResponsiveSizeProps] = js.undefined
  var tablet: js.UndefOr[ResponsiveSizeProps] = js.undefined
  var touch: js.UndefOr[ResponsiveSizeProps] = js.undefined
  var widescreen: js.UndefOr[ResponsiveSizeProps] = js.undefined
}

object AnonDesktop {
  @scala.inline
  def apply(
    desktop: ResponsiveSizeProps = null,
    fullhd: ResponsiveSizeProps = null,
    mobile: ResponsiveSizeProps = null,
    tablet: ResponsiveSizeProps = null,
    touch: ResponsiveSizeProps = null,
    widescreen: ResponsiveSizeProps = null
  ): AnonDesktop = {
    val __obj = js.Dynamic.literal()
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesktop]
  }
}

