package typings.reactFloater.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-floater.react-floater.Styles> */
trait PartialStyles extends js.Object {
  var arrow: js.UndefOr[CSSPropertieslengthnumber] = js.undefined
  var close: js.UndefOr[CSSProperties] = js.undefined
  var container: js.UndefOr[CSSProperties] = js.undefined
  var content: js.UndefOr[CSSProperties] = js.undefined
  var floater: js.UndefOr[CSSProperties] = js.undefined
  var floaterCentered: js.UndefOr[CSSProperties] = js.undefined
  var floaterClosing: js.UndefOr[CSSProperties] = js.undefined
  var floaterOpening: js.UndefOr[CSSProperties] = js.undefined
  var floaterWithAnimation: js.UndefOr[CSSProperties] = js.undefined
  var floaterWithComponent: js.UndefOr[CSSProperties] = js.undefined
  var footer: js.UndefOr[CSSProperties] = js.undefined
  var options: js.UndefOr[ZIndex] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
  var wrapperPosition: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyles {
  @scala.inline
  def apply(
    arrow: CSSPropertieslengthnumber = null,
    close: CSSProperties = null,
    container: CSSProperties = null,
    content: CSSProperties = null,
    floater: CSSProperties = null,
    floaterCentered: CSSProperties = null,
    floaterClosing: CSSProperties = null,
    floaterOpening: CSSProperties = null,
    floaterWithAnimation: CSSProperties = null,
    floaterWithComponent: CSSProperties = null,
    footer: CSSProperties = null,
    options: ZIndex = null,
    title: CSSProperties = null,
    wrapper: CSSProperties = null,
    wrapperPosition: CSSProperties = null
  ): PartialStyles = {
    val __obj = js.Dynamic.literal()
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (floater != null) __obj.updateDynamic("floater")(floater.asInstanceOf[js.Any])
    if (floaterCentered != null) __obj.updateDynamic("floaterCentered")(floaterCentered.asInstanceOf[js.Any])
    if (floaterClosing != null) __obj.updateDynamic("floaterClosing")(floaterClosing.asInstanceOf[js.Any])
    if (floaterOpening != null) __obj.updateDynamic("floaterOpening")(floaterOpening.asInstanceOf[js.Any])
    if (floaterWithAnimation != null) __obj.updateDynamic("floaterWithAnimation")(floaterWithAnimation.asInstanceOf[js.Any])
    if (floaterWithComponent != null) __obj.updateDynamic("floaterWithComponent")(floaterWithComponent.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    if (wrapperPosition != null) __obj.updateDynamic("wrapperPosition")(wrapperPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyles]
  }
}

