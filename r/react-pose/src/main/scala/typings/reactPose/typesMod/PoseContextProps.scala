package typings.reactPose.typesMod

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoseContextProps extends js.Object {
  
  var getInitialPoseFromParent: js.UndefOr[js.Function0[CurrentPose | Unit]] = js.native
  
  var getParentPoseConfig: js.UndefOr[js.Function0[DomPopmotionConfig]] = js.native
  
  var onUnmount: js.UndefOr[js.Function1[/* child */ DomPopmotionPoser, _]] = js.native
  
  var registerChild: js.UndefOr[js.Function1[/* props */ ChildRegistration, Unit]] = js.native
}
object PoseContextProps {
  
  @scala.inline
  def apply(): PoseContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoseContextProps]
  }
  
  @scala.inline
  implicit class PoseContextPropsOps[Self <: PoseContextProps] (val x: Self) extends AnyVal {
    
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
    def setGetInitialPoseFromParent(value: () => CurrentPose | Unit): Self = this.set("getInitialPoseFromParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInitialPoseFromParent: Self = this.set("getInitialPoseFromParent", js.undefined)
    
    @scala.inline
    def setGetParentPoseConfig(value: () => DomPopmotionConfig): Self = this.set("getParentPoseConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParentPoseConfig: Self = this.set("getParentPoseConfig", js.undefined)
    
    @scala.inline
    def setOnUnmount(value: /* child */ DomPopmotionPoser => _): Self = this.set("onUnmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
    
    @scala.inline
    def setRegisterChild(value: /* props */ ChildRegistration => Unit): Self = this.set("registerChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterChild: Self = this.set("registerChild", js.undefined)
  }
}
