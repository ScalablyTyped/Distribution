package typings.pulumiKubernetes.inputMod.policy.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
  */
@js.native
trait PodDisruptionBudgetSpec extends js.Object {
  
  /**
    * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
    */
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.native
  
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
    */
  var minAvailable: js.UndefOr[Input[Double | String]] = js.native
  
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
}
object PodDisruptionBudgetSpec {
  
  @scala.inline
  def apply(): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
  
  @scala.inline
  implicit class PodDisruptionBudgetSpecOps[Self <: PodDisruptionBudgetSpec] (val x: Self) extends AnyVal {
    
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
    def setMaxUnavailable(value: Input[Double | String]): Self = this.set("maxUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUnavailable: Self = this.set("maxUnavailable", js.undefined)
    
    @scala.inline
    def setMinAvailable(value: Input[Double | String]): Self = this.set("minAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAvailable: Self = this.set("minAvailable", js.undefined)
    
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
