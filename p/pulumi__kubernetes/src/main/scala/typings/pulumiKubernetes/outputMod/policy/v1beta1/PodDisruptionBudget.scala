package typings.pulumiKubernetes.outputMod.policy.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
  */
@js.native
trait PodDisruptionBudget extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: policySlashv1beta1 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget = js.native
  
  var metadata: ObjectMeta = js.native
  
  /**
    * Specification of the desired behavior of the PodDisruptionBudget.
    */
  var spec: PodDisruptionBudgetSpec = js.native
  
  /**
    * Most recently observed status of the PodDisruptionBudget.
    */
  var status: PodDisruptionBudgetStatus = js.native
}
object PodDisruptionBudget {
  
  @scala.inline
  def apply(
    apiVersion: policySlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget,
    metadata: ObjectMeta,
    spec: PodDisruptionBudgetSpec,
    status: PodDisruptionBudgetStatus
  ): PodDisruptionBudget = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudget]
  }
  
  @scala.inline
  implicit class PodDisruptionBudgetMutableBuilder[Self <: PodDisruptionBudget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: policySlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: PodDisruptionBudgetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PodDisruptionBudgetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
