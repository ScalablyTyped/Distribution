package typings.pulumiKubernetes.outputMod.apps.v1beta2

import typings.pulumiKubernetes.outputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
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
  val minReadySeconds: Double
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between
    * explicit zero and unspecified. Defaults to 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  val replicas: Double
  /**
    * Selector is a label query over pods that should match the replica count. Label keys and
    * values that must match in order to be controlled by this replica set. It must match the pod
    * template's labels. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: LabelSelector
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas
    * are detected. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  val template: PodTemplateSpec
}

object ReplicaSetSpec {
  @scala.inline
  def apply(minReadySeconds: Double, replicas: Double, selector: LabelSelector, template: PodTemplateSpec): ReplicaSetSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetSpec]
  }
}

