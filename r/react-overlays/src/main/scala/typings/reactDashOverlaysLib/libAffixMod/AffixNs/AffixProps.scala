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

