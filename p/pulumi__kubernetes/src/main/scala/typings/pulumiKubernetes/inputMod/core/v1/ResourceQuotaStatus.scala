package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
@js.native
trait ResourceQuotaStatus extends js.Object {
  
  /**
    * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  var used: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ResourceQuotaStatus {
  
  @scala.inline
  def apply(): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
  
  @scala.inline
  implicit class ResourceQuotaStatusOps[Self <: ResourceQuotaStatus] (val x: Self) extends AnyVal {
    
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
    def setHard(value: Input[StringDictionary[Input[String]]]): Self = this.set("hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHard: Self = this.set("hard", js.undefined)
    
    @scala.inline
    def setUsed(value: Input[StringDictionary[Input[String]]]): Self = this.set("used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
  }
}
