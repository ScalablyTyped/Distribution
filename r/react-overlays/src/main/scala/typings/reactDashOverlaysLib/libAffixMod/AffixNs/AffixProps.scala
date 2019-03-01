package typings
package reactDashOverlaysLib.libAffixMod.AffixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// put AffixProps inside the exported namespace so it's importable in AutoAffix
trait AffixProps extends js.Object {
  /**
    * CSS class or classes to apply when affixed
    */
  var affixClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style to apply when affixed
    */
  var affixStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * CSS class or classes to apply when at bottom
    */
  var bottomClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style to apply when at bottom
    */
  var bottomStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Pixels to offset from bottom of screen when calculating position
    */
  var offsetBottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pixels to offset from top of screen when calculating position
    */
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback fired when the right before the `affixStyle` and `affixStyle` props are rendered
    */
  var onAffix: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired when the right before the `bottomStyle` and `bottomClassName` props are rendered
    */
  var onAffixBottom: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired when the right before the `topStyle` and `topClassName` props are rendered
    */
  var onAffixTop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired after the component `affixStyle` and `affixClassName` props have been rendered.
    */
  var onAffixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired after the component `bottomStyle` and `bottomClassName` props have been rendered.
    */
  var onAffixedBottom: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired after the component `topStyle` and `topClassName` props have been rendered.
    */
  var onAffixedTop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * CSS class or classes to apply when at top
    */
  var topClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style to apply when at top
    */
  var topStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * When affixed, pixels to offset from top of viewport
    */
  var viewportOffsetTop: js.UndefOr[scala.Double] = js.undefined
}

object AffixProps {
  @scala.inline
  def apply(
    affixClassName: java.lang.String = null,
    affixStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    bottomClassName: java.lang.String = null,
    bottomStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    offsetBottom: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null,
    onAffix: js.Function0[scala.Unit] = null,
    onAffixBottom: js.Function0[scala.Unit] = null,
    onAffixTop: js.Function0[scala.Unit] = null,
    onAffixed: js.Function0[scala.Unit] = null,
    onAffixedBottom: js.Function0[scala.Unit] = null,
    onAffixedTop: js.Function0[scala.Unit] = null,
    topClassName: java.lang.String = null,
    topStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    viewportOffsetTop: scala.Int | scala.Double = null
  ): AffixProps = {
    val __obj = js.Dynamic.literal()
    if (affixClassName != null) __obj.updateDynamic("affixClassName")(affixClassName)
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle)
    if (bottomClassName != null) __obj.updateDynamic("bottomClassName")(bottomClassName)
    if (bottomStyle != null) __obj.updateDynamic("bottomStyle")(bottomStyle)
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onAffix != null) __obj.updateDynamic("onAffix")(onAffix)
    if (onAffixBottom != null) __obj.updateDynamic("onAffixBottom")(onAffixBottom)
    if (onAffixTop != null) __obj.updateDynamic("onAffixTop")(onAffixTop)
    if (onAffixed != null) __obj.updateDynamic("onAffixed")(onAffixed)
    if (onAffixedBottom != null) __obj.updateDynamic("onAffixedBottom")(onAffixedBottom)
    if (onAffixedTop != null) __obj.updateDynamic("onAffixedTop")(onAffixedTop)
    if (topClassName != null) __obj.updateDynamic("topClassName")(topClassName)
    if (topStyle != null) __obj.updateDynamic("topStyle")(topStyle)
    if (viewportOffsetTop != null) __obj.updateDynamic("viewportOffsetTop")(viewportOffsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffixProps]
  }
}

