package typings
package reactDashPoseLib.libComponentsTransitionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animateOnMount: js.UndefOr[scala.Boolean] = js.undefined
  var children: TransitionChildren[_]
  var enterAfterExit: js.UndefOr[scala.Boolean] = js.undefined
  var enterPose: js.UndefOr[java.lang.String] = js.undefined
  var exitPose: js.UndefOr[java.lang.String] = js.undefined
  var flipMove: js.UndefOr[scala.Boolean] = js.undefined
  var onRest: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preEnterPose: js.UndefOr[java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: TransitionChildren[_],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animateOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    enterAfterExit: js.UndefOr[scala.Boolean] = js.undefined,
    enterPose: java.lang.String = null,
    exitPose: java.lang.String = null,
    flipMove: js.UndefOr[scala.Boolean] = js.undefined,
    onRest: () => scala.Unit = null,
    preEnterPose: java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animateOnMount)) __obj.updateDynamic("animateOnMount")(animateOnMount)
    if (!js.isUndefined(enterAfterExit)) __obj.updateDynamic("enterAfterExit")(enterAfterExit)
    if (enterPose != null) __obj.updateDynamic("enterPose")(enterPose)
    if (exitPose != null) __obj.updateDynamic("exitPose")(exitPose)
    if (!js.isUndefined(flipMove)) __obj.updateDynamic("flipMove")(flipMove)
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (preEnterPose != null) __obj.updateDynamic("preEnterPose")(preEnterPose)
    __obj.asInstanceOf[Props]
  }
}

