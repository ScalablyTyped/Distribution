package typings.reactPose.typesMod

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoseContextProps extends js.Object {
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.undefined
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.undefined
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.undefined
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.undefined
}

object PoseContextProps {
  @scala.inline
  def apply(
    getInitialPoseFromParent: () => CurrentPose | Unit = null,
    getParentPoseConfig: () => DomPopmotionConfig = null,
    onUnmount: /* child */ DomPopmotionPoser => _ = null,
    registerChild: /* props */ ChildRegistration => Unit = null
  ): PoseContextProps = {
    val __obj = js.Dynamic.literal()
    if (getInitialPoseFromParent != null) __obj.updateDynamic("getInitialPoseFromParent")(js.Any.fromFunction0(getInitialPoseFromParent))
    if (getParentPoseConfig != null) __obj.updateDynamic("getParentPoseConfig")(js.Any.fromFunction0(getParentPoseConfig))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction1(onUnmount))
    if (registerChild != null) __obj.updateDynamic("registerChild")(js.Any.fromFunction1(registerChild))
    __obj.asInstanceOf[PoseContextProps]
  }
}

