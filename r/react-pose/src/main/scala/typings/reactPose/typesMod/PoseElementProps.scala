package typings.reactPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.reactPose.anon.Current
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children :any | undefined,   pose :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose | undefined,   _pose :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose | undefined,   initialPose :react-pose.react-pose/lib/components/PoseElement/types.CurrentPose | undefined,   withParent :boolean | undefined,   onPoseComplete :(pose : react-pose.react-pose/lib/components/PoseElement/types.CurrentPose): any | undefined,   onValueChange :{[key: string] : (v : any): any} | undefined,   innerRef :{  current :any} | react-pose.react-pose/lib/components/PoseElement/types.RefFunc | undefined, [key: string] : any} & react-pose.react-pose/lib/components/PoseElement/types.PoseContextProps */
@js.native
trait PoseElementProps
  extends /* key */ StringDictionary[js.Any] {
  var _pose: js.UndefOr[CurrentPose] = js.native
  var children: js.UndefOr[js.Any] = js.native
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
  var initialPose: js.UndefOr[CurrentPose] = js.native
  var innerRef: js.UndefOr[Current | RefFunc] = js.native
  var onPoseComplete: js.UndefOr[js.Function1[/* pose */ CurrentPose, _]] = js.native
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
  var onValueChange: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
  var pose: js.UndefOr[CurrentPose] = js.native
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
  var withParent: js.UndefOr[Boolean] = js.native
}

object PoseElementProps {
  @scala.inline
  def apply(): PoseElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoseElementProps]
  }
  @scala.inline
  implicit class PoseElementPropsOps[Self <: PoseElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_poseVarargs(value: String*): Self = this.set("_pose", js.Array(value :_*))
    @scala.inline
    def set_pose(value: CurrentPose): Self = this.set("_pose", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_pose: Self = this.set("_pose", js.undefined)
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = this.set("getInitialPoseFromParent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInitialPoseFromParent: Self = this.set("getInitialPoseFromParent", js.undefined)
    @scala.inline
    def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = this.set("getParentPoseConfig", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetParentPoseConfig: Self = this.set("getParentPoseConfig", js.undefined)
    @scala.inline
    def setInitialPoseVarargs(value: String*): Self = this.set("initialPose", js.Array(value :_*))
    @scala.inline
    def setInitialPose(value: CurrentPose): Self = this.set("initialPose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPose: Self = this.set("initialPose", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* el */ Element => js.Any): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Current | RefFunc): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setOnPoseComplete(value: /* pose */ CurrentPose => _): Self = this.set("onPoseComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPoseComplete: Self = this.set("onPoseComplete", js.undefined)
    @scala.inline
    def setOnUnmount(value: /* child */ DomPopmotionPoser => _): Self = this.set("onUnmount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
    @scala.inline
    def setOnValueChange(value: StringDictionary[js.Function1[/* v */ js.Any, _]]): Self = this.set("onValueChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setPoseVarargs(value: String*): Self = this.set("pose", js.Array(value :_*))
    @scala.inline
    def setPose(value: CurrentPose): Self = this.set("pose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePose: Self = this.set("pose", js.undefined)
    @scala.inline
    def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = this.set("registerChild", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterChild: Self = this.set("registerChild", js.undefined)
    @scala.inline
    def setWithParent(value: Boolean): Self = this.set("withParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithParent: Self = this.set("withParent", js.undefined)
  }
  
}

