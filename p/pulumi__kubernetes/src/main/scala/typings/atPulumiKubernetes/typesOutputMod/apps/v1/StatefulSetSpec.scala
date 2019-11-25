package typings.atPulumiKubernetes.typesOutputMod.apps.v1

import typings.atPulumiKubernetes.typesOutputMod.core.v1.PersistentVolumeClaim
import typings.atPulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpec
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StatefulSetSpec is the specification of a StatefulSet.
  */
trait StatefulSetSpec extends js.Object {
  /**
    * podManagementPolicy controls how pods are created during initial scale up, when replacing
    * pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are
    * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until
    * each pod is ready before continuing. When scaling down, the pods are removed in the
    * opposite order. The alternative policy is `Parallel` which will create pods in parallel to
    * match the desired scale without waiting, and on scale down will delete all pods at once.
    */
  val podManagementPolicy: String
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the
    * sense that they are instantiations of the same Template, but individual replicas also have
    * a consistent identity. If unspecified, defaults to 1.
    */
  val replicas: Double
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
    * StatefulSet's revision history. The revision history consists of all revisions not
    * represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  val revisionHistoryLimit: Double
  /**
    * selector is a label query over pods that should match the replica count. It must match the
    * pod template's labels. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: LabelSelector
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must
    * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
    * get DNS/hostnames that follow the pattern:
    * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
    * managed by the StatefulSet controller.
    */
  val serviceName: String
  /**
    * template is the object that describes the pod that will be created if insufficient replicas
    * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
    * a unique identity from the rest of the StatefulSet.
    */
  val template: PodTemplateSpec
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
    * in the StatefulSet when a revision is made to Template.
    */
  val updateStrategy: StatefulSetUpdateStrategy
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
    * StatefulSet controller is responsible for mapping network identities to claims in a way
    * that maintains the identity of a pod. Every claim in this list must have at least one
    * matching (by name) volumeMount in one container in the template. A claim in this list takes
    * precedence over any volumes in the template, with the same name.
    */
  val volumeClaimTemplates: js.Array[PersistentVolumeClaim]
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
}

