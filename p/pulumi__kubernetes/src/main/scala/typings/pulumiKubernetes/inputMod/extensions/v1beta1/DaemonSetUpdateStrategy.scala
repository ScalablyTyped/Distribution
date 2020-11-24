package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DaemonSetUpdateStrategy extends js.Object {
  
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDaemonSet]] = js.native
  
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object DaemonSetUpdateStrategy {
  
  @scala.inline
  def apply(): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
  
  @scala.inline
  implicit class DaemonSetUpdateStrategyOps[Self <: DaemonSetUpdateStrategy] (val x: Self) extends AnyVal {
    
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
    def setRollingUpdate(value: Input[RollingUpdateDaemonSet]): Self = this.set("rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingUpdate: Self = this.set("rollingUpdate", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
