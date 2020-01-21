package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerSpec is the specification of a replication controller.
  */
trait ReplicationControllerSpec extends js.Object {
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its
    * container crashing, for it to be considered available. Defaults to 0 (pod will be
    * considered available as soon as it is ready)
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between
    * explicit zero and unspecified. Defaults to 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Selector is a label query over pods that should match the Replicas count. If Selector is
    * empty, it is defaulted to the labels present on the Pod template. Label keys and values
    * that must match in order to be controlled by this replication controller, if empty
    * defaulted to labels on Pod template. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas
    * are detected. This takes precedence over a TemplateRef. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: js.UndefOr[Input[PodTemplateSpec]] = js.undefined
}

object ReplicationControllerSpec {
  @scala.inline
  def apply(
    minReadySeconds: Input[Double] = null,
    replicas: Input[Double] = null,
    selector: Input[StringDictionary[Input[String]]] = null,
    template: Input[PodTemplateSpec] = null
  ): ReplicationControllerSpec = {
    val __obj = js.Dynamic.literal()
    if (minReadySeconds != null) __obj.updateDynamic("minReadySeconds")(minReadySeconds.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerSpec]
  }
}

