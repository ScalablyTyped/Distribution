package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
  */
@js.native
trait RollingUpdateStatefulSetStrategy extends js.Object {
  
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
    */
  var partition: js.UndefOr[Input[Double]] = js.native
}
object RollingUpdateStatefulSetStrategy {
  
  @scala.inline
  def apply(): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
  
  @scala.inline
  implicit class RollingUpdateStatefulSetStrategyOps[Self <: RollingUpdateStatefulSetStrategy] (val x: Self) extends AnyVal {
    
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
    def setPartition(value: Input[Double]): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
  }
}
