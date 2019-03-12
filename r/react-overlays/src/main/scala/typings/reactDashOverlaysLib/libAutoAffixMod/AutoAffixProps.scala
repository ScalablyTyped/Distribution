package typings
package reactDashOverlaysLib.libAutoAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoAffixProps
  extends reactDashOverlaysLib.libAffixMod.AffixNs.AffixProps {
  /**
    * Automatically set width when affixed
    */
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The logical container node or component for determining offset from bottom
    * of viewport, or a function that returns it
    */
  var container: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance]
  ] = js.undefined
}

object AutoAffixProps {
  @scala.inline
  def apply(
    affixClassName: java.lang.String = null,
    affixStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    bottomClassName: java.lang.String = null,
    bottomStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    container: reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] = null,
    offsetBottom: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null,
    onAffix: () => scala.Unit = null,
    onAffixBottom: () => scala.Unit = null,
    onAffixTop: () => scala.Unit = null,
    onAffixed: () => scala.Unit = null,
    onAffixedBottom: () => scala.Unit = null,
    onAffixedTop: () => scala.Unit = null,
    topClassName: java.lang.String = null,
    topStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    viewportOffsetTop: scala.Int | scala.Double = null
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

