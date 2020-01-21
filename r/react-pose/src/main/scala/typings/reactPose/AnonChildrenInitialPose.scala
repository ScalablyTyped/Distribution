package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import typings.reactPose.typesMod.CurrentPose
import typings.reactPose.typesMod.RefFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenInitialPose
  extends /* key */ StringDictionary[js.Any] {
  var _pose: js.UndefOr[CurrentPose] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var initialPose: js.UndefOr[CurrentPose] = js.undefined
  var innerRef: js.UndefOr[AnonCurrent | RefFunc] = js.undefined
  var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.undefined
  var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.undefined
  var pose: js.UndefOr[CurrentPose] = js.undefined
  var withParent: js.UndefOr[Boolean] = js.undefined
}

object AnonChildrenInitialPose {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _pose: CurrentPose = null,
    children: js.Any = null,
    initialPose: CurrentPose = null,
    innerRef: AnonCurrent | RefFunc = null,
    onPoseComplete: /* pose */ CurrentPose => _ = null,
    onValueChange: StringDictionary[js.Function1[/* v */ js.Any, _]] = null,
    pose: CurrentPose = null,
    withParent: js.UndefOr[Boolean] = js.undefined
  ): AnonChildrenInitialPose = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_pose != null) __obj.updateDynamic("_pose")(_pose.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onPoseComplete != null) __obj.updateDynamic("onPoseComplete")(js.Any.fromFunction1(onPoseComplete))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange.asInstanceOf[js.Any])
    if (pose != null) __obj.updateDynamic("pose")(pose.asInstanceOf[js.Any])
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenInitialPose]
  }
}

