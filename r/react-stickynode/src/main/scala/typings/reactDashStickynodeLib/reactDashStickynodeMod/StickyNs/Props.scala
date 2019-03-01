package typings
package reactDashStickynodeLib.reactDashStickynodeMod.StickyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Class name to be applied to the element when the sticky state is
    * active (active by default ).
    */
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset from the top of document which release state will be
    * triggered when the bottom of the element reaches at.If it is a
    * selector to a target(via `querySelector()`), the offset will be the
    * bottom of the target.
    */
  var bottomBoundary: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Enable the use of CSS3 transforms (true by default ). */
  var enableTransforms: js.UndefOr[scala.Boolean] = js.undefined
  /** The switch to enable or disable Sticky (true by default ). */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** z - index of the sticky */
  var innerZ: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Callback for when the sticky state changes.See below. */
  var onStateChange: js.UndefOr[js.Function1[/* status */ Status, scala.Unit]] = js.undefined
  /**
    * Class name to be applied to the element when the sticky state is
    * released (released by default ).
    */
  var releasedClass: js.UndefOr[java.lang.String] = js.undefined
  var shouldFreeze: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /**
    * The offset from the top of window where the top of the element will
    * be when sticky state is triggered(0 by default ).If it is a selector
    * to a target(via `querySelector()`), the offset will be the height of
    * the target.
    */
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    bottomBoundary: scala.Double | java.lang.String = null,
    enableTransforms: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    innerZ: scala.Double | java.lang.String = null,
    onStateChange: js.Function1[/* status */ Status, scala.Unit] = null,
    releasedClass: java.lang.String = null,
    shouldFreeze: js.Function0[scala.Boolean] = null,
    top: scala.Double | java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (bottomBoundary != null) __obj.updateDynamic("bottomBoundary")(bottomBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransforms)) __obj.updateDynamic("enableTransforms")(enableTransforms)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (innerZ != null) __obj.updateDynamic("innerZ")(innerZ.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    if (releasedClass != null) __obj.updateDynamic("releasedClass")(releasedClass)
    if (shouldFreeze != null) __obj.updateDynamic("shouldFreeze")(shouldFreeze)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

