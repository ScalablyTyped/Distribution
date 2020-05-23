package typings.reactPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.reactPose.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children ? :any,   pose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   _pose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   initialPose ? :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose,   withParent ? :boolean, onPoseComplete ? (pose : react-pose.react-pose/lib/components/PoseElement/types.CurrentPose): any,   onValueChange ? :{[key: string] : (v : any): any},   innerRef ? :{  current  :any} | react-pose.react-pose/lib/components/PoseElement/types.RefFunc, [key: string] : any} & react-pose.react-pose/lib/components/PoseElement/types.PoseContextProps */
trait PoseElementProps
  extends /* key */ StringDictionary[js.Any] {
  var _pose: js.UndefOr[CurrentPose] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.undefined
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.undefined
  var initialPose: js.UndefOr[CurrentPose] = js.undefined
  var innerRef: js.UndefOr[Current | RefFunc] = js.undefined
  var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.undefined
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.undefined
  var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.undefined
  var pose: js.UndefOr[CurrentPose] = js.undefined
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.undefined
  var withParent: js.UndefOr[Boolean] = js.undefined
}

object PoseElementProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    _pose: CurrentPose = null,
    children: js.Any = null,
    getInitialPoseFromParent: () => CurrentPose | Unit = null,
    getParentPoseConfig: () => DomPopmotionConfig = null,
    initialPose: CurrentPose = null,
    innerRef: Current | RefFunc = null,
    onPoseComplete: /* pose */ CurrentPose => _ = null,
    onUnmount: /* child */ DomPopmotionPoser => _ = null,
    onValueChange: StringDictionary[js.Function1[/* v */ js.Any, _]] = null,
    pose: CurrentPose = null,
    registerChild: /* props */ ChildRegistration => Unit = null,
    withParent: js.UndefOr[Boolean] = js.undefined
  ): PoseElementProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_pose != null) __obj.updateDynamic("_pose")(_pose.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (getInitialPoseFromParent != null) __obj.updateDynamic("getInitialPoseFromParent")(js.Any.fromFunction0(getInitialPoseFromParent))
    if (getParentPoseConfig != null) __obj.updateDynamic("getParentPoseConfig")(js.Any.fromFunction0(getParentPoseConfig))
    if (initialPose != null) __obj.updateDynamic("initialPose")(initialPose.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onPoseComplete != null) __obj.updateDynamic("onPoseComplete")(js.Any.fromFunction1(onPoseComplete))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction1(onUnmount))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange.asInstanceOf[js.Any])
    if (pose != null) __obj.updateDynamic("pose")(pose.asInstanceOf[js.Any])
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1(registerChild))
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoseElementProps]
  }
}

