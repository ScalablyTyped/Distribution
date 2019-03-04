package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetSpec is the specification of a daemon set.
  */
trait DaemonSetSpec extends js.Object {
  /**
    * The minimum number of seconds for which a newly created DaemonSet pod should be ready
    * without any of its container crashing, for it to be considered available. Defaults to 0
    * (pod will be considered available as soon as it is ready).
    */
  val minReadySeconds: scala.Double
  /**
    * The number of old history to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. Defaults to 10.
    */
  val revisionHistoryLimit: scala.Double
  /**
    * A label query over pods that are managed by the daemon set. Must match in order to be
    * controlled. It must match the pod template's labels. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * An object that describes the pod that will be created. The DaemonSet will create exactly
    * one copy of this pod on every node that matches the template's node selector (or on every
    * node if no node selector is specified). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  val template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec
  /**
    * An update strategy to replace existing DaemonSet pods with new pods.
    */
  val updateStrategy: DaemonSetUpdateStrategy
}

object DaemonSetSpec {
  @scala.inline
  def apply(
    minReadySeconds: scala.Double,
    revisionHistoryLimit: scala.Double,
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector,
    template: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec,
    updateStrategy: DaemonSetUpdateStrategy
  ): DaemonSetSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds, revisionHistoryLimit = revisionHistoryLimit, selector = selector, template = template, updateStrategy = updateStrategy)
  
    __obj.asInstanceOf[DaemonSetSpec]
  }
}

