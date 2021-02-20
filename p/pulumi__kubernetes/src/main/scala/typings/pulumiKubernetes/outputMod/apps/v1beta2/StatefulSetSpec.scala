package typings.pulumiKubernetes.outputMod.apps.v1beta2

import typings.pulumiKubernetes.outputMod.core.v1.PersistentVolumeClaim
import typings.pulumiKubernetes.outputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StatefulSetSpec is the specification of a StatefulSet.
  */
@js.native
trait StatefulSetSpec extends StObject {
  
  /**
    * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
    */
  var podManagementPolicy: String = js.native
  
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
    */
  var replicas: Double = js.native
  
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  var revisionHistoryLimit: Double = js.native
  
  /**
    * selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: LabelSelector = js.native
  
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
    */
  var serviceName: String = js.native
  
  /**
    * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
    */
  var template: PodTemplateSpec = js.native
  
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
    */
  var updateStrategy: StatefulSetUpdateStrategy = js.native
  
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
    */
  var volumeClaimTemplates: js.Array[PersistentVolumeClaim] = js.native
}
object StatefulSetSpec {
  
  @scala.inline
  def apply(
    podManagementPolicy: String,
    replicas: Double,
    revisionHistoryLimit: Double,
    selector: LabelSelector,
    serviceName: String,
    template: PodTemplateSpec,
    updateStrategy: StatefulSetUpdateStrategy,
    volumeClaimTemplates: js.Array[PersistentVolumeClaim]
  ): StatefulSetSpec = {
    val __obj = js.Dynamic.literal(podManagementPolicy = podManagementPolicy.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], revisionHistoryLimit = revisionHistoryLimit.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], updateStrategy = updateStrategy.asInstanceOf[js.Any], volumeClaimTemplates = volumeClaimTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetSpec]
  }
  
  @scala.inline
  implicit class StatefulSetSpecMutableBuilder[Self <: StatefulSetSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPodManagementPolicy(value: String): Self = StObject.set(x, "podManagementPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionHistoryLimit(value: Double): Self = StObject.set(x, "revisionHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: PodTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStrategy(value: StatefulSetUpdateStrategy): Self = StObject.set(x, "updateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeClaimTemplates(value: js.Array[PersistentVolumeClaim]): Self = StObject.set(x, "volumeClaimTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeClaimTemplatesVarargs(value: PersistentVolumeClaim*): Self = StObject.set(x, "volumeClaimTemplates", js.Array(value :_*))
  }
}
