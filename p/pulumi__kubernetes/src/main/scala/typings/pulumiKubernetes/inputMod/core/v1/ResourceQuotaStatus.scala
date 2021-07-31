package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
trait ResourceQuotaStatus extends StObject {
  
  /**
    * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  var used: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}
object ResourceQuotaStatus {
  
  @scala.inline
  def apply(): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
  
  @scala.inline
  implicit class ResourceQuotaStatusMutableBuilder[Self <: ResourceQuotaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHard(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
    
    @scala.inline
    def setUsed(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
