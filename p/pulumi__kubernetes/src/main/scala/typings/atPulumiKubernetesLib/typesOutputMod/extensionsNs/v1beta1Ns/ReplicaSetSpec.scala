package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

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
  val minReadySeconds: scala.Double
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between
    * explicit zero and unspecified. Defaults to 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  val replicas: scala.Double
  /**
    * Selector is a label query over pods that should match the replica count. If the selector is
    * empty, it is defaulted to the labels present on the pod template. Label keys and values
    * that must match in order to be controlled by this replica set. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas
    * are detected. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  val template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec
}

object ReplicaSetSpec {
  @scala.inline
  def apply(
    minReadySeconds: scala.Double,
    replicas: scala.Double,
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector,
    template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec
  ): ReplicaSetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("minReadySeconds")(minReadySeconds)
    __obj.updateDynamic("replicas")(replicas)
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ReplicaSetSpec]
  }
}

