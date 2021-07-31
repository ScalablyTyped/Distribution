package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Spec to control the desired behavior of rolling update.
  */
trait RollingUpdateDeployment extends StObject {
  
  /**
    * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
    */
  var maxSurge: js.UndefOr[Input[Double | String]] = js.undefined
  
  /**
    * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
    */
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
}
object RollingUpdateDeployment {
  
  @scala.inline
  def apply(): RollingUpdateDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollingUpdateDeployment]
  }
  
  @scala.inline
  implicit class RollingUpdateDeploymentMutableBuilder[Self <: RollingUpdateDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSurge(value: Input[Double | String]): Self = StObject.set(x, "maxSurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSurgeUndefined: Self = StObject.set(x, "maxSurge", js.undefined)
    
    @scala.inline
    def setMaxUnavailable(value: Input[Double | String]): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
  }
}
