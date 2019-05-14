package typings
package reactDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _pose: js.UndefOr[reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var initialPose: js.UndefOr[reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose] = js.undefined
  var innerRef: js.UndefOr[Anon_Current | reactDashPoseLib.libComponentsPoseElementTypesMod.RefFunc] = js.undefined
  var onPoseComplete: js.UndefOr[
    js.Function1[/* pose */ reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose, _]
  ] = js.undefined
  var onValueChange: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.undefined
  var pose: js.UndefOr[reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose] = js.undefined
  var withParent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _pose: reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose = null,
    children: js.Any = null,
    initialPose: reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose = null,
    innerRef: Anon_Current | reactDashPoseLib.libComponentsPoseElementTypesMod.RefFunc = null,
    onPoseComplete: /* pose */ reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose => _ = null,
    onValueChange: org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, _]] = null,
    pose: reactDashPoseLib.libComponentsPoseElementTypesMod.CurrentPose = null,
    withParent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_pose != null) __obj.updateDynamic("_pose")(_pose.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onPoseComplete != null) __obj.updateDynamic("onPoseComplete")(js.Any.fromFunction1(onPoseComplete))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange)
    if (pose != null) __obj.updateDynamic("pose")(pose.asInstanceOf[js.Any])
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent)
    __obj.asInstanceOf[Anon_Children]
  }
}

