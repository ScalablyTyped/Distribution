package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiKubernetes.inputMod.core.v1.PersistentVolumeClaim
import typings.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
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
  var podManagementPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * replicas is the desired number of replicas of the given Template. These are replicas in the
    * sense that they are instantiations of the same Template, but individual replicas also have
    * a consistent identity. If unspecified, defaults to 1.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
    * StatefulSet's revision history. The revision history consists of all revisions not
    * represented by a currently applied StatefulSetSpec version. The default value is 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * selector is a label query over pods that should match the replica count. It must match the
    * pod template's labels. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: Input[LabelSelector]
  /**
    * serviceName is the name of the service that governs this StatefulSet. This service must
    * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
    * get DNS/hostnames that follow the pattern:
    * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
    * managed by the StatefulSet controller.
    */
  var serviceName: Input[String]
  /**
    * template is the object that describes the pod that will be created if insufficient replicas
    * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
    * a unique identity from the rest of the StatefulSet.
    */
  var template: Input[PodTemplateSpec]
  /**
    * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
    * in the StatefulSet when a revision is made to Template.
    */
  var updateStrategy: js.UndefOr[Input[StatefulSetUpdateStrategy]] = js.undefined
  /**
    * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
    * StatefulSet controller is responsible for mapping network identities to claims in a way
    * that maintains the identity of a pod. Every claim in this list must have at least one
    * matching (by name) volumeMount in one container in the template. A claim in this list takes
    * precedence over any volumes in the template, with the same name.
    */
  var volumeClaimTemplates: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaim]]]] = js.undefined
}

object StatefulSetSpec {
  @scala.inline
  def apply(
    selector: Input[LabelSelector],
    serviceName: Input[String],
    template: Input[PodTemplateSpec],
    podManagementPolicy: Input[String] = null,
    replicas: Input[Double] = null,
    revisionHistoryLimit: Input[Double] = null,
    updateStrategy: Input[StatefulSetUpdateStrategy] = null,
    volumeClaimTemplates: Input[js.Array[Input[PersistentVolumeClaim]]] = null
  ): StatefulSetSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (podManagementPolicy != null) __obj.updateDynamic("podManagementPolicy")(podManagementPolicy.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (revisionHistoryLimit != null) __obj.updateDynamic("revisionHistoryLimit")(revisionHistoryLimit.asInstanceOf[js.Any])
    if (updateStrategy != null) __obj.updateDynamic("updateStrategy")(updateStrategy.asInstanceOf[js.Any])
    if (volumeClaimTemplates != null) __obj.updateDynamic("volumeClaimTemplates")(volumeClaimTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetSpec]
  }
}

