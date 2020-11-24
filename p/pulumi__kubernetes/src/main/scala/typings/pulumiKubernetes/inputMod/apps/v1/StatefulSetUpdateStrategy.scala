package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
  */
@js.native
trait StatefulSetUpdateStrategy extends js.Object {
  
  /**
    * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateStatefulSetStrategy]] = js.native
  
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object StatefulSetUpdateStrategy {
  
  @scala.inline
  def apply(): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
  
  @scala.inline
  implicit class StatefulSetUpdateStrategyOps[Self <: StatefulSetUpdateStrategy] (val x: Self) extends AnyVal {
    
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
    def setRollingUpdate(value: Input[RollingUpdateStatefulSetStrategy]): Self = this.set("rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingUpdate: Self = this.set("rollingUpdate", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
