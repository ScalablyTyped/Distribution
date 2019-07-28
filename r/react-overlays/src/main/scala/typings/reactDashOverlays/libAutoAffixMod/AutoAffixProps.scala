package typings.reactDashOverlays.libAutoAffixMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactInstance
import typings.reactDashOverlays.libAffixMod.AffixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoAffixProps extends AffixProps {
  /**
    * Automatically set width when affixed
    */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * The logical container node or component for determining offset from bottom
    * of viewport, or a function that returns it
    */
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance]] = js.undefined
}

object AutoAffixProps {
  @scala.inline
  def apply(
    affixClassName: String = null,
    affixStyle: CSSProperties = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    bottomClassName: String = null,
    bottomStyle: CSSProperties = null,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onAffix: () => Unit = null,
    onAffixBottom: () => Unit = null,
    onAffixTop: () => Unit = null,
    onAffixed: () => Unit = null,
    onAffixedBottom: () => Unit = null,
    onAffixedTop: () => Unit = null,
    topClassName: String = null,
    topStyle: CSSProperties = null,
    viewportOffsetTop: Int | Double = null
  ): AutoAffixProps = {
    val __obj = js.Dynamic.literal()
    if (affixClassName != null) __obj.updateDynamic("affixClassName")(affixClassName)
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (bottomClassName != null) __obj.updateDynamic("bottomClassName")(bottomClassName)
    if (bottomStyle != null) __obj.updateDynamic("bottomStyle")(bottomStyle)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onAffix != null) __obj.updateDynamic("onAffix")(js.Any.fromFunction0(onAffix))
    if (onAffixBottom != null) __obj.updateDynamic("onAffixBottom")(js.Any.fromFunction0(onAffixBottom))
    if (onAffixTop != null) __obj.updateDynamic("onAffixTop")(js.Any.fromFunction0(onAffixTop))
    if (onAffixed != null) __obj.updateDynamic("onAffixed")(js.Any.fromFunction0(onAffixed))
    if (onAffixedBottom != null) __obj.updateDynamic("onAffixedBottom")(js.Any.fromFunction0(onAffixedBottom))
    if (onAffixedTop != null) __obj.updateDynamic("onAffixedTop")(js.Any.fromFunction0(onAffixedTop))
    if (topClassName != null) __obj.updateDynamic("topClassName")(topClassName)
    if (topStyle != null) __obj.updateDynamic("topStyle")(topStyle)
    if (viewportOffsetTop != null) __obj.updateDynamic("viewportOffsetTop")(viewportOffsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAffixProps]
  }
}

