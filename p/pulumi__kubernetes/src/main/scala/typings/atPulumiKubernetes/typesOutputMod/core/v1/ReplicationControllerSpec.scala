package typings.atPulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  val minReadySeconds: Double
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between
    * explicit zero and unspecified. Defaults to 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  val replicas: Double
  /**
    * Selector is a label query over pods that should match the Replicas count. If Selector is
    * empty, it is defaulted to the labels present on the Pod template. Label keys and values
    * that must match in order to be controlled by this replication controller, if empty
    * defaulted to labels on Pod template. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: StringDictionary[String]
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas
    * are detected. This takes precedence over a TemplateRef. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  val template: PodTemplateSpec
}

object ReplicationControllerSpec {
  @scala.inline
  def apply(
    minReadySeconds: Double,
    replicas: Double,
    selector: StringDictionary[String],
    template: PodTemplateSpec
  ): ReplicationControllerSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplicationControllerSpec]
  }
}

