package typings.atPulumiKubernetes.typesInputMod.apps.v1beta2

import typings.atPulumiKubernetes.typesInputMod.core.v1.PodTemplateSpec
import typings.atPulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSetSpec is the specification of a ReplicaSet.
  */
trait ReplicaSetSpec extends js.Object {
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its
    * container crashing, for it to be considered available. Defaults to 0 (pod will be
    * considered available as soon as it is ready)
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between
    * explicit zero and unspecified. Defaults to 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Selector is a label query over pods that should match the replica count. Label keys and
    * values that must match in order to be controlled by this replica set. It must match the pod
    * template's labels. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: Input[LabelSelector]
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas
    * are detected. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: js.UndefOr[Input[PodTemplateSpec]] = js.undefined
}

object ReplicaSetSpec {
  @scala.inline
  def apply(
    selector: Input[LabelSelector],
    minReadySeconds: Input[Double] = null,
    replicas: Input[Double] = null,
    template: Input[PodTemplateSpec] = null
  ): ReplicaSetSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (minReadySeconds != null) __obj.updateDynamic("minReadySeconds")(minReadySeconds.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetSpec]
  }
}

