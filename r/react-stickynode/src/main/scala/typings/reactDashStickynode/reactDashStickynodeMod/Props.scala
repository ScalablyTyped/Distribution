package typings.reactDashStickynode.reactDashStickynodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Class name to be applied to the element when the sticky state is
    * active (active by default ).
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * The offset from the top of document which release state will be
    * triggered when the bottom of the element reaches at.If it is a
    * selector to a target(via `querySelector()`), the offset will be the
    * bottom of the target.
    */
  var bottomBoundary: js.UndefOr[Double | String] = js.undefined
  /** Enable the use of CSS3 transforms (true by default ). */
  var enableTransforms: js.UndefOr[Boolean] = js.undefined
  /** The switch to enable or disable Sticky (true by default ). */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** z - index of the sticky */
  var innerZ: js.UndefOr[Double | String] = js.undefined
  /** Callback for when the sticky state changes.See below. */
  var onStateChange: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.undefined
  /**
    * Class name to be applied to the element when the sticky state is
    * released (released by default ).
    */
  var releasedClass: js.UndefOr[String] = js.undefined
  var shouldFreeze: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The offset from the top of window where the top of the element will
    * be when sticky state is triggered(0 by default ).If it is a selector
    * to a target(via `querySelector()`), the offset will be the height of
    * the target.
    */
  var top: js.UndefOr[Double | String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    activeClass: String = null,
    bottomBoundary: Double | String = null,
    enableTransforms: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    innerZ: Double | String = null,
    onStateChange: /* status */ Status => Unit = null,
    releasedClass: String = null,
    shouldFreeze: () => Boolean = null,
    top: Double | String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (bottomBoundary != null) __obj.updateDynamic("bottomBoundary")(bottomBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransforms)) __obj.updateDynamic("enableTransforms")(enableTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (innerZ != null) __obj.updateDynamic("innerZ")(innerZ.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (releasedClass != null) __obj.updateDynamic("releasedClass")(releasedClass.asInstanceOf[js.Any])
    if (shouldFreeze != null) __obj.updateDynamic("shouldFreeze")(js.Any.fromFunction0(shouldFreeze))
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

